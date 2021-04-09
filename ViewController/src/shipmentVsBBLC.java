import java.math.BigDecimal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

import javax.faces.event.ActionEvent;

import javax.faces.event.ValueChangeEvent;

import oracle.adf.view.rich.component.rich.data.RichColumn;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.output.RichOutputText;
import mnj.ont.model.managedbean;
import mnj.ont.model.service.MainAMImpl;

import oracle.adf.model.AttributeBinding;
import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCDataControl;

import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.binding.BindingContainer;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.ViewObject;

public class shipmentVsBBLC {
    private RichInputText shipmentNumber;
    private RichOutputText bbLCnumber;
    private RichOutputText proposalNumber;
    private RichOutputText invoiceNumber;
    FacesContext context ;
    FacesMessage message ;
    private RichColumn bblcBeneficiary;

    public shipmentVsBBLC() {
    }
    managedbean managedBean = new managedbean();
    
    MainAMImpl appM = getAppModuleImpl();

    public void setShipmentNumber(RichInputText shipmentNumber) {
        this.shipmentNumber = shipmentNumber;
    }

    public RichInputText getShipmentNumber() {
        return shipmentNumber;
    }

    public void setBbLCnumber(RichOutputText bbLCnumber) {
        this.bbLCnumber = bbLCnumber;
    }

    public RichOutputText getBbLCnumber() {
        return bbLCnumber;
    }

    public void getBBLCforShipmentNo(ActionEvent actionEvent)  {
          
        String shipmentNumber ;  
        String proposalNum =  "";
        String BbLCCnum =     "";
        String invoiceNum =  "";
        
         ViewObject vo = appM.getproposal_BBLC_Inv_ShipmentVO1();
     try{
        shipmentNumber = getShipmentNumber().getValue().toString();
         vo.setWhereClause("SHIPMENT_NO="+shipmentNumber);
         vo.executeQuery();
     }
     catch(Exception e){
         context = FacesContext.getCurrentInstance();
         message = new FacesMessage("Incorrect Shipment Number");
         context.addMessage(null, message);
         return ;
     }
    
     
     Row[] rows = vo.getAllRowsInRange();
     
     System.out.println("================== row count in proposal_BBLC_Inv_ShipmentVO1 :"+ rows.length + "======   for shipment number : "+shipmentNumber );
     if(rows.length>0){
         try {
             for(Row row : rows){
                 
                 proposalNum = row.getAttribute("ProposalNumber").toString();
                 BbLCCnum= row.getAttribute("BblcNo").toString();
                 invoiceNum = row.getAttribute("InvoiceNo").toString();
                 
                 proposalNumber.setValue(proposalNum);
                 bbLCnumber.setValue(BbLCCnum);
                 invoiceNumber.setValue(invoiceNum);
        
                 return ;
                      
              }
             
         }
         catch(NullPointerException e){
             context = FacesContext.getCurrentInstance();
             message = new FacesMessage("No Proposal Number found for this Shipment Number");
             context.addMessage(null, message);
             return ;
             
         }
         
     }
     else {
           context = FacesContext.getCurrentInstance();
           message = new FacesMessage("No Proposal Number found for this Shipment Number");
           context.addMessage(null, message);
         
     }
     
     
     
     
     }
    
    
    

    public MainAMImpl getAppModuleImpl() {
        DCBindingContainer bindingContainer =
            (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        //BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContainer.findDataControl("MainAMDataControl"); // Name of application module in datacontrolBinding.cpx
        MainAMImpl appM = (MainAMImpl)dc.getDataProvider();
        return appM;
    }

    public void setProposalNumber(RichOutputText proposalNumber) {
        this.proposalNumber = proposalNumber;
    }

    public RichOutputText getProposalNumber() {
        return proposalNumber;
    }

    public void setInvoiceNumber(RichOutputText invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public RichOutputText getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setBblcBeneficiary(RichColumn bblcBeneficiary) {
        this.bblcBeneficiary = bblcBeneficiary;
    }

    public RichColumn getBblcBeneficiary() {
        return bblcBeneficiary;
    }

    public void backToCurrentShipmentRow(ActionEvent actionEvent) {
        // Add event code here...
    }
}
