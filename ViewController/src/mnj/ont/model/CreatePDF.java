package mnj.ont.model;
import mnj.ont.model.customexceptions.*;
import com.sun.org.apache.xerces.internal.dom.DocumentImpl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.imageio.metadata.IIOMetadataNode;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamSource;

import mnj.ont.model.service.MainAMImpl;

import mnj.ont.model.views.BankHeadBranchesVORowImpl;

import mnj.ont.model.views.OrganizationAddressVORowImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.jbo.Key;
import oracle.jbo.RowSet;
import oracle.jbo.ViewObject;
import oracle.jbo.XMLInterface;

import oracle.xml.parser.v2.XMLDocument;
import oracle.xml.parser.v2.XMLElement;
import oracle.xml.parser.v2.XMLNode;
import oracle.xml.pipeline.controller.Input;
import org.apache.fop.apps.FOUserAgent;
import org.apache.fop.apps.Fop;
import org.apache.fop.apps.FopFactory;
import org.apache.fop.apps.MimeConstants;
import org.apache.myfaces.trinidad.model.RowKeySet;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class CreatePDF {    
    private static String TEMPLATE_PDF_DEMO = "stylesheets/demofo.xsl";
    private static String TEMPLATE_PDF_ReceivingAcceptance  = "stylesheets/receivingAcceptance.xsl";
    private static String TEMPLATE_PDF_shippingGuaranteeForwarding  = "stylesheets/shipping_guarantee_forwarding.xsl";
    private static String TEMPLATE_PDF_TT_FDD_Invoice_Certify_Letter = "stylesheets/TT_FDD_Invoice_Certify_Letter.xsl";
    private static FopFactory fopFactory = FopFactory.newInstance();   
    private static TransformerFactory tFactory = TransformerFactory.newInstance();
    private static String VO_ITERATOR = "DemoHeaderTVO1Iterator" ;    

    public CreatePDF() {
    }    
//===//   
        MainAMImpl appM = getAppModuleImpl();

    public MainAMImpl getAppModuleImpl() {
        DCBindingContainer bindingContainer =
            (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        //BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContainer.findDataControl("MainAMDataControl"); // Name of application module in datacontrolBinding.cpx
        MainAMImpl appM = (MainAMImpl)dc.getDataProvider();
        return appM;
    }
    
    
    private InputStream getTemplate(String template) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        return facesContext.getExternalContext().getResourceAsStream(template);
    }
//===//
    private void convertDOM2PDF(XMLElement xml, InputStream template, OutputStream out) {
        //NEW ADDED////////////////////////////////////////////////////////////////////
        String base_url = ""; 
        FacesContext facesCtx      = FacesContext.getCurrentInstance();
        ExternalContext externalCtx= facesCtx.getExternalContext();
        //ServletRequest request     = (ServletRequest) externalCtx.getRequest(); 
        
        //GET REQUEST URL FROM HttpServletRequest CLASS
        HttpServletRequest httprequest     = (HttpServletRequest) externalCtx.getRequest();        
        String requestURL = httprequest.getRequestURL().toString();
        base_url = requestURL.substring(0, requestURL.lastIndexOf("/"));
        
        //////////////////////////////////////////////////////////////////////
        try {
            FOUserAgent foUserAgent = fopFactory.newFOUserAgent();            
            //NEW ADDED////////////////////////////////////////////////////////////////////
            foUserAgent.setBaseURL( base_url  ); //NEW ADDED
            
            //System.out.println("DEBUG LINE 105 --------------------");
            //System.out.println( foUserAgent.getBaseURL() ) ;
            
            //foUserAgent.setBaseURL( request.getRealPath("/")  ); 
            //////////////////////////////////////////////////////////////////////    
            try {
                Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, foUserAgent, out);                                                
                TransformerFactory factory = new org.apache.xalan.processor.TransformerFactoryImpl();                
                Transformer transformer = factory.newTransformer(new StreamSource(template));
                Source src = new DOMSource(xml);
                Result res = new SAXResult(fop.getDefaultHandler());                
                transformer.transform(src, res);
                    
                
            } finally {
                out.close();
            }
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
//===//    
    public void exportAllRowsToPDF(FacesContext facesContext, OutputStream outputStream) {
        DCIteratorBinding dcIteratorBindings = ADFUtils.findIterator( VO_ITERATOR );
        ViewObject vo = dcIteratorBindings.getViewObject();
        try {
            //printXML( vo.writeXML(0, XMLInterface.XML_OPT_ALL_ROWS) ) ;            
          //  convertDOM2PDF(vo.writeXML(0, XMLInterface.XML_OPT_ALL_ROWS), getTemplate(TEMPLATE_PDF_DEMO), outputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//===//
//===//    
    public void exportAllRowsToPDFOne(FacesContext facesContext, OutputStream outputStream) throws BankInfoNotFoundException,
                                                                        OrgAddressInfoNotFoundException {

        XMLElement node  = null ;
        node =  getBBLCDetailsNode();
        
        
        try {
            //printXML( vo.writeXML(0, XMLInterface.XML_OPT_ALL_ROWS) ) ;    
            convertDOM2PDF(node, getTemplate(TEMPLATE_PDF_ReceivingAcceptance), outputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
      
        
    }

    //===//    
    public void exportPDFshippingGuaranteeForwarding(FacesContext facesContext, OutputStream outputStream) throws BankInfoNotFoundException,
                                                                                          OrgAddressInfoNotFoundException {

           XMLElement node  = null ;
           node =  getBBLCDetailsNode();
        
        
        try {
            //printXML( vo.writeXML(0, XMLInterface.XML_OPT_ALL_ROWS) ) ;    
            convertDOM2PDF(node, getTemplate(TEMPLATE_PDF_shippingGuaranteeForwarding), outputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
//===//    
//===//    
       public void exportPDFTT_FDD_Invoice_Certify_Letter(FacesContext facesContext, OutputStream outputStream) throws BankInfoNotFoundException,
                                                                                         OrgAddressInfoNotFoundException {

        XMLElement node  = null ;
        node =  getBBLCDetailsNode();


        
        
        try {
            //printXML( vo.writeXML(0, XMLInterface.XML_OPT_ALL_ROWS) ) ;    
            convertDOM2PDF(node, getTemplate(TEMPLATE_PDF_TT_FDD_Invoice_Certify_Letter), outputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
//===//
         
    private static void printXML(Node n) throws IOException {
      ((XMLNode)n).print(System.out);
    }

    private void updateBblcDetailsNode(XMLElement node) throws BankInfoNotFoundException,
                                                                OrgAddressInfoNotFoundException {
        
        
    //  System.out.println("------------------------  appM.getBankHeadBranchesVO1().getAllRowsInRange().length "+appM.getBankHeadBranchesVO1().getAllRowsInRange().length);    
           
           XMLDocument doc = node.getDocument();
           BankHeadBranchesVORowImpl bankHeadBranchVoRow = (BankHeadBranchesVORowImpl)appM.getBankHeadBranchesVO1().first();
           OrganizationAddressVORowImpl oraganizationAddressRow = (OrganizationAddressVORowImpl)appM.getOrganizationAddressVO1().first();
           
           if( bankHeadBranchVoRow == null )  {
               throw new BankInfoNotFoundException("Bank information is Not found!");                                                                     
           }
         
           
        if( oraganizationAddressRow == null )  {
               throw new BankInfoNotFoundException("Bank information is Not found!");
           }
        
           
           
           String bankName = null , shortBankName = null, addressLine1 = null,  addressLine2 = null,  addressLine3 = null,  addressLine4 = null , orgName = null, orgShortName = null;
            String factoryAddress = null,  corporateAddress = null;
  
//           System.out.println(" ==========  bankHeadBranchVoRow.getBankName() "+ bankHeadBranchVoRow.getBankName());
//           System.out.println(" ==========  bankHeadBranchVoRow.getShortBankName()"+ bankHeadBranchVoRow.getShortBankName());
//           System.out.println(" ==========  bankHeadBranchVoRow.getAddressLine1()"+ bankHeadBranchVoRow.getAddressLine1());
//           System.out.println(" ========== bankHeadBranchVoRow.getAddressLine2()"+ bankHeadBranchVoRow.getAddressLine2());
//           System.out.println(" ========== bankHeadBranchVoRow.getAddressLine3()"+ bankHeadBranchVoRow.getAddressLine3());
//            System.out.println(" ========== bankHeadBranchVoRow.getAddressLine4()"+ bankHeadBranchVoRow.getAddressLine4());
//        System.out.println(" ==========  appM.getBBLCHeader1().getCurrentRow().getAttribute(\"OrgShortName\").toString()"+  appM.getBBLCHeader1().getCurrentRow().getAttribute("OrgShortName").toString()); 
       
           Element personRootElement ; 
           
          bankName = bankHeadBranchVoRow.getBankName() ;
            
          if( bankName != null){
              personRootElement = doc.createElement( "BankName" );
              node.insertBefore(personRootElement, node.getFirstChild());
              personRootElement.appendChild( doc.createTextNode(   bankName ) );
          }
           
        
         shortBankName  =  bankHeadBranchVoRow.getShortBankName();
        if( shortBankName != null){   
            
        personRootElement = doc.createElement( "ShortBankName" );
        node.insertBefore(personRootElement, node.getFirstChild());
        personRootElement.appendChild( doc.createTextNode(  shortBankName  ) );
        }
        
        addressLine1  =  bankHeadBranchVoRow.getAddressLine1();
        if( addressLine1 != null){
        personRootElement = doc.createElement( "AddressLine1" );
        node.insertBefore(personRootElement, node.getFirstChild());
        personRootElement.appendChild( doc.createTextNode( addressLine1 ) );
        }
        
        
        addressLine2  =  bankHeadBranchVoRow.getAddressLine2();
        if( addressLine2 != null){
        personRootElement = doc.createElement( "AddressLine2" );
        node.insertBefore(personRootElement, node.getFirstChild());
        personRootElement.appendChild( doc.createTextNode(   addressLine2 ) );
        }
        
        
        addressLine3  =  bankHeadBranchVoRow.getAddressLine3();
        if( addressLine3  != null){
        personRootElement = doc.createElement( "AddressLine3" );
        node.insertBefore(personRootElement, node.getFirstChild());
        personRootElement.appendChild( doc.createTextNode(  addressLine3  ) );
        }
        
        
         addressLine4  =  bankHeadBranchVoRow.getAddressLine4();
        if( addressLine4  != null){
        personRootElement = doc.createElement( "AddressLine4" );
        node.insertBefore(personRootElement, node.getFirstChild());
        personRootElement.appendChild( doc.createTextNode( addressLine4 ) );
        }
        
        
        
        try {
            orgShortName  = appM.getBBLCHeader1().getCurrentRow().getAttribute("OrgShortName").toString();
        } catch (Exception e) {
            // TODO: Add catch code
            orgShortName = null;
        }
        
        if( orgShortName != null){
            personRootElement = doc.createElement( "OrgShortName" );
            node.insertBefore(personRootElement, node.getFirstChild());
            personRootElement.appendChild( doc.createTextNode( orgShortName ) );
        }
        
        
            try {
                orgName = appM.getBBLCHeader1().getCurrentRow().getAttribute("OrgName").toString();
            } catch (Exception e) {
                // TODO: Add catch code
                orgShortName = null;
            }
        
       if( orgName != null){
        personRootElement = doc.createElement( "OrgName" );
        node.insertBefore(personRootElement, node.getFirstChild());
        personRootElement.appendChild( doc.createTextNode( appM.getBBLCHeader1().getCurrentRow().getAttribute("OrgName").toString() ) );
        }
        
        
        
         factoryAddress =  oraganizationAddressRow.getFactoryAddress();  
        
        if(factoryAddress != null){
         personRootElement = doc.createElement( "FactoryAddress" );
         node.insertBefore(personRootElement, node.getFirstChild());
         personRootElement.appendChild( doc.createTextNode(factoryAddress ) );
         }
        
        
        corporateAddress = oraganizationAddressRow.getCorporateOfficeAddress();
        if(corporateAddress != null){
         personRootElement = doc.createElement( "CorporateAddress" );
         node.insertBefore(personRootElement, node.getFirstChild());
         personRootElement.appendChild( doc.createTextNode(  corporateAddress ) );
         }
        



//        try {
//            this.printXML(node);
//        } catch (Exception e) {
//            // TODO: Add catch code
//            e.printStackTrace();
//        }
//        
        
    }

    private XMLElement getBBLCDetailsNode() throws BankInfoNotFoundException,
                                                      OrgAddressInfoNotFoundException {
        
        ViewObject vo ;
        vo= appM.getBBLCDetails1();
        //     Document xmlDoc = new DocumentImpl();
        
        XMLElement node = (XMLElement)vo.getCurrentRow().writeXML(1, XMLInterface.XML_OPT_ALL_ROWS);
        //   XMLDocument doc = node.getDocument();
        
        
        updateBblcDetailsNode(node);
        
        try {
          printXML( node ) ;
        } catch (Exception e) {
            e.printStackTrace();
        }
 
        
        return node;
    }
}//==END OF EmployeesBean class
