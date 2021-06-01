package mnj.ont.model;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

import java.sql.Timestamp;

import javax.faces.component.UIComponent;
import javax.faces.event.ActionEvent;

import javax.faces.event.PhaseEvent;
import javax.faces.event.ValueChangeEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.view.rich.component.rich.data.RichColumn;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputFile;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelTabbed;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailItem;
import oracle.adf.view.rich.component.rich.nav.RichCommandToolbarButton;
import oracle.adf.view.rich.component.rich.output.RichOutputText;
import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.PopupCanceledEvent;
import oracle.adf.view.rich.event.PopupFetchEvent;

//import oracle.adfinternal.view.faces.model.binding.FacesCtrlHierNodeBinding;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
import oracle.jbo.ViewObject;



import java.text.SimpleDateFormat;

import java.lang.Object;

import java.net.InetAddress;

import java.net.UnknownHostException;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.text.DateFormat;

import java.text.DecimalFormat;

import java.text.ParseException;

import java.util.Calendar;


import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.servlet.http.HttpSession;

import mnj.ont.model.service.MainAMImpl;

import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.input.RichInputListOfValues;

import oracle.adfinternal.view.faces.model.binding.FacesCtrlHierNodeBinding;

import oracle.jbo.JboException;
import oracle.jbo.Key;
import oracle.jbo.RowSet;

//import oracle.jbo.domain.Date;
import java.util.Date;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import mnj.ont.model.views.BBLCDetailsVORowImpl;

import oracle.adf.model.binding.DCIteratorBinding;

import oracle.dss.dataView.ViewController;

import oracle.jbo.NavigatableRowIterator;
import oracle.jbo.ViewCriteria;
import oracle.jbo.server.ViewObjectImpl;

import oracle.jbo.uicli.binding.JUCtrlHierBinding;

import oracle.jdbc.OracleTypes;

import oracle.sqlj.runtime.Oracle;

import org.apache.myfaces.trinidad.model.CollectionModel;
import org.apache.myfaces.trinidad.model.RowKeyIndex;
import org.apache.myfaces.trinidad.model.UploadedFile;
import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;

import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;

import org.python.parser.ast.For;
import org.python.parser.ast.While;


public class managedbean {
    private RichTable contractTable;
    private RichTable countryTable;
    private RichTable newPiTable;
    private RichColumn shipmentLineId;
    private RichTable shipmentTable;
    private RichInputText totalContractValue;
    private RichTable itemsTablePopUp;
    private RichInputDate lastShipmentDate;
    private RichInputText negotiationDays;
    private RichInputDate expiryDate;
    private RichTable bblcTable;
    private RichInputText bblcValue;
    private RichInputText headerID;
    private RichInputText entileBtbOpenValue;
    private RichInputText availableBtbOpenValue;
    private RichInputText btbLcLiability;
    private RichInputText btbAcceptedLiability;
    private RichInputText btbShippingGurantee;
    private RichInputText itemQuantity;
    private RichInputText itemInvoiceQuantity;
    private RichInputText itemBalanceQuantity;
    private RichOutputText documentNumber;
    private RichInputText conversionAmount;
    private RichInputText bblcNumber;
    private RichInputText INVOICENUMBER;
    private RichInputText billReferenceNumber;
    private RichOutputText autoProposalNo;
    private RichInputDate proposalDate;
    private RichInputListOfValues orgName;
    private RichInputText b_BBLC_No;
    private RichInputText b_INVOICE_NO;
    private RichInputText b_CONTRACT_NO;
    private RichInputText b_ACCEPTANCE_NO;
    private RichInputText b_BBLC_NO;
    private RichInputText biND_CONTRACT_NO;
    private RichInputText biND_INVOICE_NO;
    private RichInputText biND_ACCEPTANCE_NUMBER;
    private RichInputText biND_PROPOSAL_NO;
    private RichInputText bbLCDETAIL_ID;
    private RichOutputText balanceQty_Bind;
        private RichInputListOfValues freightCostFlag_Bind;
     private RichSelectOneChoice freigthcostflag_binding;
    
    private RichTable chargInterfTable;
    private RichInputText chargesIDNew;
    private RichInputFile pi_Item_Upload;
    private RichInputText proposalNumber;
    private RichTable piTables;
    private RichTable itemWithGRNtable;
    private RichSelectOneChoice freigthcostflag_bind;
    private RichCommandToolbarButton addCharge;
    private RichCommandToolbarButton deleteCharge;
    private RichCommandToolbarButton processCharge;
    private RichTable bblcAcceptInvDetTable;
    private RichTable invoiceForAcceptanceTable;
    private RichInputText btbOriginalLiability;
    private RichTable bblcAcceptanceTable;
    private RichPanelFormLayout headerForm;
    private RichInputText totalInItemInfoPopUp;
    private RichInputText totalInSelectItemsWithGrn;
    private RichTable fabricRollTable;
    private RichInputFile fabricRollFileUpload;
    private RichInputText biND_P_LC_REF_NO;
    private RichInputFile fabricRollFileUpload2;
    private RichOutputText bblcBeneficiaryName;
 
    private RichColumn beneficiaryCurrency;
    private RichColumn beneficiaryId;
    private RichOutputText bblcCurrency;
    private RichOutputText bblcBeneficiaryId;
    private RichColumn bbLCbeneficiaryName;
    private RichOutputText aaa;
    private RichInputText shipmentImportValue;
    private RichInputDate maturityDateBind;
    private RichPanelTabbed bblcShipAccepTab;
    private RichShowDetailItem shipmentTab;
    private RichOutputText totalLcVal;
    private RichOutputText bblcPercentageOfContract;
    private RichInputText bblcIncreaseAmount;
    private RichPanelFormLayout bblcPercentOfContrForm;
    private RichInputText freightCostBind;


    public void editDialogListenerPi(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome().name().equals("ok")) {
            
            if(appM.getBBLCLines1().getCurrentRow() == null){
              
                Message.showMessage("No BBLC row is selected!", "error");
                return;
            }
            
            FillPi();
            AdfFacesContext.getCurrentInstance().addPartialTarget(newPiTable);
        } else if (dialogEvent.getOutcome().name().equals("cancel")) {
            ;
        }
    }

    public void FillPi() {
        OperationBinding operationBinding = executeOperation("callPiFetch");
        operationBinding.execute();
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public OperationBinding executeOperation(String operation) {
        OperationBinding createParam =
            getBindingsCont().getOperationBinding(operation);
        return createParam;

    }

    /*****Generic Method to Get BindingContainer**/
    public BindingContainer getBindingsCont() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }


    public void editPopupCancelListenerPi(PopupCanceledEvent popupCanceledEvent) {

    }

    /** End Bean Coding For FILL BPO Tab **/
    private RichInputText orgId;


    private RichTable piTable;

    public void setPiTable(RichTable piTable) {
        this.piTable = piTable;
    }

    public RichTable getPiTable() {
        return piTable;
    }

    public void setOrgId(RichInputText orgId) {
        this.orgId = orgId;
    }

    public RichInputText getOrgId() {
        return orgId;
    }

    /** Bean Coding For FILL Contracts Tab **/

    public void editPopupFetchListenerContract(PopupFetchEvent popupFetchEvent) {

        System.out.println("sabih Error First");
        setWhereClauseContract();

        if (popupFetchEvent.getLaunchSourceClientId().contains("cbInsert")) {

            BindingContainer bindings = getBindings();
            OperationBinding operationBinding =
                bindings.getOperationBinding("CreateInsert");
            operationBinding.execute();
        }
    }

    public void setWhereClauseContract() {

        System.out.println("sabih Error Here");
        OperationBinding operationBinding =
            executeOperation("populateContractLines1");
        System.out.println("sabih Error 1   " + getOrgId().getValue());
        operationBinding.getParamsMap().put("OrgId", getOrgId().getValue());
        System.out.println("sabih Error 2   " + getOrgId().getValue());
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            System.out.println("if errors-->");
            //            List errors = operationBinding.getErrors();
            //            System.out.println(@);
        }
    }

    public void editDialogListenerContract(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome().name().equals("ok")) {
            FillContract();
            AdfFacesContext.getCurrentInstance().addPartialTarget(contractTable);
        } else if (dialogEvent.getOutcome().name().equals("cancel")) {
            ;
        }
    }

    public void FillContract() {
        OperationBinding operationBinding =
            executeOperation("callContractFetch");
        operationBinding.execute();
    }


    public void editPopupCancelListenerContract(PopupCanceledEvent popupCanceledEvent) {

    }


    /** End Bean Coding For FILL Contracts Tab **/

    public void setContractTable(RichTable contractTable) {
        this.contractTable = contractTable;
    }

    public RichTable getContractTable() {
        return contractTable;
    }


    public void setCountryTable(RichTable countryTable) {
        this.countryTable = countryTable;
    }

    public RichTable getCountryTable() {
        return countryTable;
    }


    /** Bean Coding For FILL Country Tab **/

    public void editPopupFetchListenerCountry(PopupFetchEvent popupFetchEvent) {

        System.out.println("sabih Error First");

        if (popupFetchEvent.getLaunchSourceClientId().contains("cbInsert")) {

            BindingContainer bindings = getBindings();
            OperationBinding operationBinding =
                bindings.getOperationBinding("CreateInsert");
            operationBinding.execute();
        }
    }

    public void editDialogListenerCountry(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome().name().equals("ok")) {
            FillCountry();
            AdfFacesContext.getCurrentInstance().addPartialTarget(countryTable);
        } else if (dialogEvent.getOutcome().name().equals("cancel")) {
            ;
        }
    }

    public void FillCountry() {
        OperationBinding operationBinding =
            executeOperation("callCountryFetch");
        operationBinding.execute();
    }

    public void editPopupCancelListenerCountry(PopupCanceledEvent popupCanceledEvent) {

    }

    /** End Bean Coding For FILL Country Tab **/
    public void setNewPiTable(RichTable newPiTable) {
        this.newPiTable = newPiTable;
    }

    public RichTable getNewPiTable() {
        return newPiTable;
    }

    /** Bean Coding For FILL Items Tab **/

    public void editPopupFetchListenerItem(PopupFetchEvent popupFetchEvent) {

        System.out.println("sabih Error First");
        setWhereClauseItem();

        if (popupFetchEvent.getLaunchSourceClientId().contains("cbInsert")) {

            BindingContainer bindings = getBindings();
           
            OperationBinding operationBinding =
                bindings.getOperationBinding("CreateInsert");
            operationBinding.execute();
        }
    }

    public void setWhereClauseItem() {

        System.out.println("sabih Error Here");
        OperationBinding operationBinding =
            executeOperation("populateItemLines1");
        //   System.out.println("sabih Error 1   "+getOrgId().getValue());
        //   operationBinding.getParamsMap().put("OrgId", getOrgId().getValue());
        //   System.out.println("sabih Error 2   "+getOrgId().getValue());
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            System.out.println("if errors-->");
            //            List errors = operationBinding.getErrors();
            //            System.out.println(@);
        }
    }

    public void editDialogListenerItem(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome().name().equals("ok")) {
            FillItem();
            AdfFacesContext.getCurrentInstance().addPartialTarget(piTable);
            populateItemAndImportValue();
        } else if (dialogEvent.getOutcome().name().equals("cancel")) {
            ;
        }
    }

    public void FillItem() {
        OperationBinding operationBinding = executeOperation("callItemFetch");
        operationBinding.execute();
    }


    /** End Bean Coding For FILL Items Tab **/


    /* Copy Shipment Line Button Coding */

    public String copy() {

        System.out.println("copy line 1");
       
        System.out.println("copy line 2");
        BindingContext bctx = BindingContext.getCurrent();
        BindingContainer bindings = bctx.getCurrentBindingsEntry();
        OperationBinding operationBinding =
            bindings.getOperationBinding("copy");
        System.out.println("copy line 3");
        // operationBinding.getParamsMap().put("shipmentLineId", "1");


        //invoke method
        operationBinding.execute();
        AdfFacesContext.getCurrentInstance().addPartialTarget(shipmentTable);
        //        if (!operationBinding.getErrors().isEmpty()) {
        //            System.out.println("if errors-->");
        //            // List errors = operationBinding.getErrors();
        //        }
        //        //optional
        //        Object methodReturnValue = operationBinding.getResult();
        //
        //        FacesMessage fm = new FacesMessage("copied...");
        //        fm.setSeverity(FacesMessage.SEVERITY_INFO);
        //        FacesContext context = FacesContext.getCurrentInstance();
        //        context.addMessage(null, fm);
        return null;
    }


    /* End Copy Shipment Line Button */


    public void setShipmentLineId(RichColumn shipmentLineId) {
        this.shipmentLineId = shipmentLineId;
    }

    public RichColumn getShipmentLineId() {
        return shipmentLineId;
    }

    public void setShipmentTable(RichTable shipmentTable) {
        this.shipmentTable = shipmentTable;
    }

    public RichTable getShipmentTable() {
        return shipmentTable;
    }

  

    public String CopyLineButton() {
        // Add event code here...

        copy();
        AdfFacesContext.getCurrentInstance().addPartialTarget(shipmentTable);

        return null;
    }


    /* Coding to Get Totals */

    /************** Code To Get Total for Total Contract Value ***********************/

    public double getContractTotalValue() {

        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("MainAMDataControl"); //
        ApplicationModule am = dc.getApplicationModule();
        ViewObject findViewObject =
            am.findViewObject("BBLCContract1"); //ImpSaleContractDetailEOView1

        RowSetIterator it = findViewObject.createRowSetIterator("tt");
        double val = 0.00, total = 0.00;
        while (it.hasNext()) {

            Row r = it.next();
            try {
                val =
Double.parseDouble(r.getAttribute("ContractValue").toString());
            } catch (Exception e) {
                ;
            }

            total = total + val;
        } //end of while loop
        it.closeRowSetIterator();
        return roundTo2(total);
    }


    public double roundTo2(double val) {

        DecimalFormat format = new DecimalFormat("#");
        double rounded = 0.00;
        try {
            format.setMinimumFractionDigits(2);
            rounded = Double.parseDouble(format.format(val));
        } catch (Exception e) {
            ;
        }
        return rounded;
    }


    /************** Code to Set Total *********************************/


    /************** Code To Get Total for Total Contract Value ***********************/
    public void setTotalContractValue(RichInputText totalContractValue) {
        this.totalContractValue = totalContractValue;
    }

    public RichInputText getTotalContractValue() {
        return totalContractValue;
    }

    /* Code For Select / De-Select Items Pop-Up */

    public void SelectAll(ActionEvent actionEvent) {
        // Add event code here...
        OperationBinding operationBinding = executeOperation("selectAllLines");
        operationBinding.getParamsMap().put("flag", "true");
        operationBinding.execute();
        AdfFacesContext.getCurrentInstance().addPartialTarget(itemsTablePopUp);
    }


    public void DeSelectAll(ActionEvent actionEvent) {
        // Add event code here...
        OperationBinding operationBinding = executeOperation("selectAllLines");
        operationBinding.getParamsMap().put("flag", "N");
        operationBinding.execute();
        AdfFacesContext.getCurrentInstance().addPartialTarget(itemsTablePopUp);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////

    public void SelectAllNew(ActionEvent actionEvent) {
        // Add event code here..
        System.out.println("ENTER SelectAllNew");
        OperationBinding operationBinding =
            executeOperation("selectAllLinesNew");
        operationBinding.getParamsMap().put("flag", "true");
        operationBinding.execute();
        AdfFacesContext.getCurrentInstance().addPartialTarget(piTables);
    }


    public void DeSelectAllNew(ActionEvent actionEvent) {
        // Add event code here...
        System.out.println("ENTER DE SelectAllNew");
        OperationBinding operationBinding =
            executeOperation("selectAllLinesNew");
        operationBinding.getParamsMap().put("flag", "N");
        operationBinding.execute();
        AdfFacesContext.getCurrentInstance().addPartialTarget(piTables);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////


    /* End For Select / De-Select Items Pop-Up */


    public void setItemsTablePopUp(RichTable itemsTablePopUp) {
        this.itemsTablePopUp = itemsTablePopUp;
    }

    public RichTable getItemsTablePopUp() {
        return itemsTablePopUp;
    }

    public void setLastShipmentDate(RichInputDate lastShipmentDate) {
        this.lastShipmentDate = lastShipmentDate;
    }

    public RichInputDate getLastShipmentDate() {
        return lastShipmentDate;
    }

    public void setNegotiationDays(RichInputText negotiationDays) {
        this.negotiationDays = negotiationDays;
    }

    public RichInputText getNegotiationDays() {
        return negotiationDays;
    }

    /* Expiry Date Calculation*/

    public void ExpiryDateCalculation(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        System.out.println(valueChangeEvent.getNewValue());
        Object a = getNegotiationDays().getValue();
        System.out.println("after get negotiation days");
        int noOfDays = 0;
        try {
            noOfDays = Integer.parseInt(a.toString());
        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }
        expiryDate.setValue(printDate(valueChangeEvent.getNewValue().toString(),
                                      noOfDays));
        AdfFacesContext.getCurrentInstance().addPartialTarget(expiryDate);

    }

    public String printDate(String date, int days) {

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date1 = new java.util.Date();

        try {
            date1 = df.parse(date);
        } catch (Exception e) {
            System.out.println("error  " + e);
            try {
                date1 = df.parse(getLastShipmentDate().getValue().toString());
            } catch (Exception f) {
            }
            ;
        }
        DateFormat dateFormat =
            new SimpleDateFormat("MM/dd/yyyy"); //dd/MM/yyyy
        Calendar c = Calendar.getInstance();
        System.out.println("date1 " + date1);
        System.out.println("days " + days);
        c.setTime(date1);
        System.out.println("calendar.date " + Calendar.DATE);
        c.add(Calendar.DATE, days);
        System.out.println(dateFormat.format(c.getTime()));

        return dateFormat.format(c.getTime());


    }

    public void setExpiryDate(RichInputDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public RichInputDate getExpiryDate() {
        return expiryDate;
    }

    /* End Code for Expiry Date */

    /* Code for total of BBLC */

    /************** Code To Get Total ***********************/

    public double getBBLCTotalValue() {

        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("MainAMDataControl"); //
        ApplicationModule am = dc.getApplicationModule();
        ViewObject findViewObject =
            am.findViewObject("BBLCPiDetails1"); //ImpSaleContractDetailEOView1

        RowSetIterator it = findViewObject.createRowSetIterator("tt");
        double val = 0.0, total = 0.0;
        while (it.hasNext()) {

            Row r = it.next();
            try {
                val = Double.parseDouble(r.getAttribute("PiValue").toString());
            } catch (Exception e) {
                ;
            }

            total = total + val;
        } //end of while loop
        it.closeRowSetIterator();
        return total;
    }

    /************** Code to Set Total *********************************/
    public void setBBLCTotalValue(double val) {

        oracle.adf.view.rich.component.UIXTable table = getBblcTable();
        // Get the Selected Row detailRowKey set iterator
        java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
        double ply = 0.0;
        while (selectionIt.hasNext()) {
            Object rowKey = selectionIt.next();
            table.setRowKey(rowKey);
            int index = table.getRowIndex();
            FacesCtrlHierNodeBinding row =
                (FacesCtrlHierNodeBinding)table.getRowData(index);
            Row selectedRow = row.getRow();


            selectedRow.setAttribute("TotalBblcValue", val);

        }

    }


    /* End Code for total of BBLC */

    public void setBblcTable(RichTable bblcTable) {
        this.bblcTable = bblcTable;
    }

    public RichTable getBblcTable() {
        return bblcTable;
    }

    public void setBblcValue(RichInputText bblcValue) {
        this.bblcValue = bblcValue;
    }

    public RichInputText getBblcValue() {
        return bblcValue;
    }


    public void CalculateForrmulas(ActionEvent actionEvent) {
        // Add event code here...
        
        calculateBblcHeaderFormulas();
        AdfFacesContext.getCurrentInstance().addPartialTarget(headerForm);
     
        
//        BindingContainer bindings = getBindings();
//        
//        OperationBinding operationBinding =
//            bindings.getOperationBinding("Commit");
//        Object result = operationBinding.execute();
        

    }

    public void setHeaderID(RichInputText headerID) {
        this.headerID = headerID;
    }

    public RichInputText getHeaderID() {
        return headerID;
    }

    public void setEntileBtbOpenValue(RichInputText entileBtbOpenValue) {
        this.entileBtbOpenValue = entileBtbOpenValue;
    }

    public RichInputText getEntileBtbOpenValue() {
        return entileBtbOpenValue;
    }

    public void setAvailableBtbOpenValue(RichInputText availableBtbOpenValue) {
        this.availableBtbOpenValue = availableBtbOpenValue;
    }

    public RichInputText getAvailableBtbOpenValue() {
        return availableBtbOpenValue;
    }

    public void setBtbLcLiability(RichInputText btbLcLiability) {
        this.btbLcLiability = btbLcLiability;
    }

    public RichInputText getBtbLcLiability() {
        return btbLcLiability;
    }

    public void setBtbAcceptedLiability(RichInputText btbAcceptedLiability) {
        this.btbAcceptedLiability = btbAcceptedLiability;
    }

    public RichInputText getBtbAcceptedLiability() {
        return btbAcceptedLiability;
    }

    public void setBtbShippingGurantee(RichInputText btbShippingGurantee) {
        this.btbShippingGurantee = btbShippingGurantee;
    }

    public RichInputText getBtbShippingGurantee() {
        return btbShippingGurantee;
    }

    public void BalanceQuantityCalculation(ValueChangeEvent valueChangeEvent) {
        // Add event code here...


        System.out.println(" In Value Change Listener ");
        double itemquantity1 = 0.0, invoicequantity1 = 0.0, balancequantity1 =
            0.0;
        System.out.println("Value Change Event  " +
                           valueChangeEvent.getNewValue());
        try {
            itemquantity1 =
                    Double.parseDouble(getItemQuantity().getValue().toString());

        } catch (Exception nfe) {
            // TODO: Add catch code
            System.out.println(" In Exception  itemquantity ");
            itemquantity1 = getQuantityFromPopUp();
        }
        try {
            invoicequantity1 =
                    Double.parseDouble(getItemInvoiceQuantity().getValue().toString());
        } catch (Exception nfe) {
            // TODO: Add catch code
            invoicequantity1 = 0.0;
            System.out.println(" In Exception  invoicequantity ");
        }
        System.out.println(itemquantity1);
        System.out.println(invoicequantity1);
        balancequantity1 = itemquantity1 - invoicequantity1;
        System.out.println(balancequantity1);

        // Rounding Off
        //        DecimalFormat df=new DecimalFormat("0.00");
        //        String formate = df.format(balancequantity1);
        //        double finalValue = 0.0 ;
        //        try {
        //            finalValue = (Double)df.parse(formate);
        //        } catch (ParseException e) {
        //        }
        //        System.out.println(finalValue);
        // End Rounding Off
        itemBalanceQuantity.setValue(balancequantity1);
        AdfFacesContext.getCurrentInstance().addPartialTarget(itemBalanceQuantity);


        double totalItemValue = 0;
        double totalImportValue = 0;
        double freightCost = 0;

        //        totalItemValue = calculateTotalItemValue();
        //        freightCost = calculateFreightCost();
        //        totalImportValue = totalItemValue + freightCost;
        //        updateitemAndImportValue(totalItemValue, totalImportValue);


    }

    public void setItemQuantity(RichInputText itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public RichInputText getItemQuantity() {
        return itemQuantity;
    }

    public void setItemInvoiceQuantity(RichInputText itemInvoiceQuantity) {
        this.itemInvoiceQuantity = itemInvoiceQuantity;
    }

    public RichInputText getItemInvoiceQuantity() {
        return itemInvoiceQuantity;
    }

    public void setItemBalanceQuantity(RichInputText itemBalanceQuantity) {
        this.itemBalanceQuantity = itemBalanceQuantity;
    }

    public RichInputText getItemBalanceQuantity() {
        return itemBalanceQuantity;
    }

    public double getQuantityFromPopUp() {

        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("MainAMDataControl"); //
        ApplicationModule am = dc.getApplicationModule();
        ViewObject findViewObject =
            am.findViewObject("BBLCDetailsPi1"); //ImpSaleContractDetailEOView1

        double total = 0.0;

        total =
                Double.parseDouble(findViewObject.getCurrentRow().getAttribute("Quantity").toString());

        return total;
    }


    /* BEAN CODING FOR COPY BUTTON */

    /* Copy Button Coding */

    public String Version() {

        BindingContext bctx = BindingContext.getCurrent();
        BindingContainer bindings = bctx.getCurrentBindingsEntry();
        OperationBinding operationBinding =
            bindings.getOperationBinding("version");

        //invoke method
        operationBinding.execute();
        //        if (!operationBinding.getErrors().isEmpty()) {
        //            System.out.println("if errors-->");
        //            // List errors = operationBinding.getErrors();
        //        }
        //        //optional
        //        Object methodReturnValue = operationBinding.getResult();
        //
        //        FacesMessage fm = new FacesMessage("copied...");
        //        fm.setSeverity(FacesMessage.SEVERITY_INFO);
        //        FacesContext context = FacesContext.getCurrentInstance();
        //        context.addMessage(null, fm);
        return null;
    }


    /* End Copy Button */


    /* END BEAN CODING */


    public String BbblcReport() {
        OperationBinding ob = executeOperation("callBBLCReport");
        ob.execute();

        Object methodReturnValue = ob.getResult();
        String message = null;
        if (methodReturnValue != null) {
            message = methodReturnValue.toString();
        } else {
            message = "Failed!";
        }
        FacesMessage fm = new FacesMessage(message);
        fm.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, fm);
        return null;
    }

    public void setDocumentNumber(RichOutputText documentNumber) {
        this.documentNumber = documentNumber;
    }

    public RichOutputText getDocumentNumber() {
        return documentNumber;
    }


    /* Attach Document Code */

    public void AttachDocument(ActionEvent actionEvent) throws UnknownHostException {
        
        
        
        boolean isVerifiedUser;
        isVerifiedUser= checkVerifiedUser();
        
        String currentUserName ;
        
                      
         if(!isVerifiedUser){
             
            showWrongUserMessage();
            
            return;            
        }
        
        
        
        
        System.out.println("Level 1");
        //*Getting UD Header Current Row ID*/
        // System.out.println("UD Header ID-------->" );
        oracle.adf.view.rich.component.UIXTable table = getBblcTable();
        java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
            while (selectionIt.hasNext()) {
                Object rowKey = selectionIt.next();
                table.setRowKey(rowKey);
                int index = table.getRowIndex();

                FacesCtrlHierNodeBinding row =
                    (FacesCtrlHierNodeBinding)table.getRowData(index);
                Row selectedRow = row.getRow();
            System.out.println("Current BBLC No-------------->" +
                               selectedRow.getAttribute("BblcNo").toString());
            String currBBLCNo = selectedRow.getAttribute("BblcNo").toString();
            System.out.println("Level 2---->" + currBBLCNo + "`" +
                               getDocumentNumber().getValue().toString());
            String ConcatStr =
                currBBLCNo + "`" + getDocumentNumber().getValue().toString();
                
                
            String newPage =  getFileUploadPage();
                
            newPage += "?doc=BBLC&docNo="+ConcatStr;
              
            //getDocumentNumber().getValue();
            // String newPage = "http://localhost:7101/PurchaseMemo-ViewController-context-root/faces/SearchPG?headerId="+getBomId().getValue();
            FacesContext ctx = FacesContext.getCurrentInstance();
            ExtendedRenderKitService erks =
                Service.getService(ctx.getRenderKit(),
                                   ExtendedRenderKitService.class);
            String url = "window.open('" + newPage + "','_blank','toolbar=no,location=no,menubar=no,alwaysRaised=yes,height=500,width=1100');";
            erks.addScript(FacesContext.getCurrentInstance(), url);
        }
    }
    /* Attach Document Code End */

    /* Converted Amount Code */

    public void getConvertedAmount() {

        // System.out.println("  Save Level 123   ");

        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("MainAMDataControl"); //
        ApplicationModule am = dc.getApplicationModule();
        ViewObject findViewObject =
            am.findViewObject("BBLCLines1"); //ImpSaleContractDetailEOView1

       

        RowSetIterator it = findViewObject.createRowSetIterator("tt");
        double bblcvalue = 0.0, conversionrate = 0.0, convertedamount = 0.0;
      

        while (it.hasNext()) {

            Row r = it.next();
            try {
                bblcvalue =
                        Double.parseDouble(r.getAttribute("TotalBblcValue").toString());
            } catch (Exception e) {
                System.out.println("in bblcvalue exception");
                //e.printStackTrace();
                bblcvalue = 0.0;
                ;
            }

            try {
                conversionrate =
                        Double.parseDouble(r.getAttribute("ConversionRate").toString());
            } catch (Exception e) {
               // System.out.println("in conversionrate exception " + conversionrate);
                //e.printStackTrace();
                conversionrate = 1.0;
            }

            convertedamount = bblcvalue * conversionrate;

            r.setAttribute("ConvertedAmount", convertedamount);

        } //end of while loop
       

        it.closeRowSetIterator();
    }

    public void setConversionAmount(RichInputText conversionAmount) {
        this.conversionAmount = conversionAmount;
    }

    public RichInputText getConversionAmount() {
        return conversionAmount;
    }

    public void BblcNumberValidation(ValueChangeEvent valueChangeEvent) {

         
            String newBblcNo = (String)valueChangeEvent.getNewValue();
            String lcStatus = (String)appM.getBBLCLines1().getCurrentRow().getAttribute("Attribute15");
            String bblcLineId =  appM.getBBLCLines1().getCurrentRow().getAttribute("ImpBblcLineId").toString();
            
            String message ;
            
             boolean duplicateBblcNo ; 
                duplicateBblcNo =  checkBblcNoDuplicacy(newBblcNo ,  bblcLineId );
                
                
                if(duplicateBblcNo){
                    message = "Duplicate record found for BBLC NO :  " +newBblcNo+ "  Status :  "+ lcStatus  +  ".  \n   Enter a Unique BBLC Number."  ;                
                    
                    Message.showMessage(message , "info");                    
                    
//                    appM.getBBLCLines1().getCurrentRow().setAttribute("BblcNo",null );
//                    bblcNumber.setValue(null);
                    
                    appM.getBBLCLines1().getCurrentRow().setAttribute("BblcNo",valueChangeEvent.getOldValue() );
                    bblcNumber.setValue(valueChangeEvent.getOldValue());
                    
                //   bblcNumber.setRequired(true);
                    
                    AdfFacesContext.getCurrentInstance().addPartialTarget(bblcNumber);
                    
                    
                }
             
    }

    public void setBblcNumber(RichInputText bblcNumber) {
        this.bblcNumber = bblcNumber;
    }

    public RichInputText getBblcNumber() {
        return bblcNumber;
    }

    public void setINVOICENUMBER(RichInputText INVOICENUMBER) {
        this.INVOICENUMBER = INVOICENUMBER;
    }

    public RichInputText getINVOICENUMBER() {
        return INVOICENUMBER;
    }



    public void BillReferenceNoValidation(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        System.out.println(valueChangeEvent.getNewValue());
        OperationBinding operationBinding =
            executeOperation("billrefnovalidation");
        operationBinding.getParamsMap().put("billrefno",
                                            valueChangeEvent.getNewValue());
        operationBinding.execute();

        if (!operationBinding.getErrors().isEmpty()) {
            System.out.println("if errors-->");
            // List errors = operationBinding.getErrors();
        }
        //optional
        Object methodReturnValue = operationBinding.getResult();
        int value = Integer.parseInt(methodReturnValue.toString());
        //     return value;

        if (value == 1) {

            /* Message Printing */

            FacesContext context = FacesContext.getCurrentInstance();
            FacesMessage message =
                new FacesMessage("Duplicate Record Found , Enter a Unique Bill Reference Number ");
            context.addMessage(null, message);


            /* End Message */
        }

    }

    public void setBillReferenceNumber(RichInputText billReferenceNumber) {
        this.billReferenceNumber = billReferenceNumber;
    }

    public RichInputText getBillReferenceNumber() {
        return billReferenceNumber;
    }

    public void BillOfEntryNoValidation(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        System.out.println(valueChangeEvent.getNewValue());
        OperationBinding operationBinding =
            executeOperation("billofentrynovalidation");
        operationBinding.getParamsMap().put("billofentryno",
                                            valueChangeEvent.getNewValue());
        operationBinding.execute();

        if (!operationBinding.getErrors().isEmpty()) {
            System.out.println("if errors-->");
            // List errors = operationBinding.getErrors();
        }
        //optional
        Object methodReturnValue = operationBinding.getResult();
        int value = Integer.parseInt(methodReturnValue.toString());
        //     return value;

        if (value == 1) {

            /* Message Printing */

            FacesContext context = FacesContext.getCurrentInstance();
            FacesMessage message =
                new FacesMessage("Duplicate Record Found , Enter a Unique Bill of Entry Number ");
            context.addMessage(null, message);


            /* End Message */
        }
    }


    /* Copy BBLC Line Button Coding */

    public String copybblc() {

        System.out.println("copy bblc line 1");
        System.out.println("copy bblc line 2");
        BindingContext bctx = BindingContext.getCurrent();
        BindingContainer bindings = bctx.getCurrentBindingsEntry();
        OperationBinding operationBinding =
            bindings.getOperationBinding("copybblc");
        System.out.println("copy bblc line 3");
        operationBinding.getParamsMap().put("shipmentLineId", "1");


        //invoke method
        operationBinding.execute();
        AdfFacesContext.getCurrentInstance().addPartialTarget(bblcTable);
        //        if (!operationBinding.getErrors().isEmpty()) {
        //            System.out.println("if errors-->");
        //            // List errors = operationBinding.getErrors();
        //        }
        //        //optional
        //        Object methodReturnValue = operationBinding.getResult();
        //
        //        FacesMessage fm = new FacesMessage("copied...");
        //        fm.setSeverity(FacesMessage.SEVERITY_INFO);
        //        FacesContext context = FacesContext.getCurrentInstance();
        //        context.addMessage(null, fm);
        return null;
    }


    /* End Copy BBLC Line Button */


    public String CopyBblc() {
        // Add event code here...
        copybblc();
        return null;
    }

    /* Code for Ammend Value Converted Amount Code */

    public void getAmendAmount() {

      
        ViewObject findViewObject = appM.getBBLCLines1();  //ImpSaleContractDetailEOView1
        

        RowSetIterator it = findViewObject.createRowSetIterator("tt");
        double bblcvalue = 0.0, bblcoriginalval = 0.0, convertedamount = 0.0;
        while (it.hasNext()) {

            Row r = it.next();
            try {
                bblcvalue =
                        Double.parseDouble(r.getAttribute("TotalBblcValue").toString());
            } catch (Exception e) {
                System.out.println("in bblcvalue exception");
                e.printStackTrace();
                bblcvalue = 0.0;
                ;
            }

            try {
                bblcoriginalval =
                        Double.parseDouble(r.getAttribute("Attribute19").toString());
            } catch (Exception e) {
               // System.out.println("in BBLB Original exception");
                //  e.printStackTrace();
                try {
                    bblcoriginalval =
                            Double.parseDouble(r.getAttribute("TotalBblcValue").toString());
                } catch (Exception nfe) {
                    // TODO: Add catch code
                    nfe.printStackTrace();
                    bblcoriginalval = 0.0;
                }
            }
           
            convertedamount = bblcvalue - bblcoriginalval;

            //r.setAttribute("Attribute18", convertedamount);
            r.setAttribute("AmendedValue", convertedamount);
           // System.out.println("converted amount " + convertedamount);
        } //end of while loop
        it.closeRowSetIterator();
    }

    /* End Code for Amend Value */

    /*
 public void setorg(RichInputListOfValues id){

         FacesContext fctx = FacesContext.getCurrentInstance();
         ExternalContext ectx = fctx.getExternalContext();
         HttpSession userSession = (HttpSession) ectx.getSession(false);
         userSession.setAttribute("orgId", id.getValue());
     }
 */

    public void XYZ(ActionEvent actionEvent) {
        // Add event code here...
    }

    public void setAutoProposalNo(RichOutputText autoProposalNo) {
        this.autoProposalNo = autoProposalNo;
    }

    public RichOutputText getAutoProposalNo() {
        return autoProposalNo;
    }

    public void setProposalDate(RichInputDate proposalDate) {
        this.proposalDate = proposalDate;
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession)ectx.getSession(false);
        userSession.setAttribute("ProposalDate", proposalDate.getValue());


    }

    public RichInputDate getProposalDate() {
        return proposalDate;
    }

    public void setOrgName(RichInputListOfValues orgName) {
        this.orgName = orgName;
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession)ectx.getSession(false);
        userSession.setAttribute("OrgName", orgName.getValue());
    }

    public RichInputListOfValues getOrgName() {
        return orgName;
    }


    public void SearchBBLCBTN(ActionEvent actionEvent) {
        // Add event code here...
        //System.out.println("Get value ----" + getB_BBLC_NO().getValue());
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession)ectx.getSession(false);
        userSession.setAttribute("P_BBLC_NO", getB_BBLC_NO().getValue());
        userSession.setAttribute("P_CONTRACT_NO",
                                 getBiND_CONTRACT_NO().getValue());
        userSession.setAttribute("P_INVOICE_NO",
                                 getBiND_INVOICE_NO().getValue());
        userSession.setAttribute("P_ACCEPTANCE_NO",
                                 getBiND_ACCEPTANCE_NUMBER().getValue());
        userSession.setAttribute("P_PROPOSAL_NO",
                                 getBiND_PROPOSAL_NO().getValue());
        
        userSession.setAttribute("P_LC_REF_NO",
                                 getBiND_P_LC_REF_NO().getValue());                                
        BindingContext bctx = BindingContext.getCurrent();
        BindingContainer bindings = bctx.getCurrentBindingsEntry();
        OperationBinding operationBinding =
            bindings.getOperationBinding("BBLCHeaderDynamWhere");


        // operationBinding.getParamsMap().put("a", getB_BBLC_NO().getValue());


        //invoke method
        operationBinding.execute();
    }


    public void setB_BBLC_NO(RichInputText b_BBLC_NO) {
        this.b_BBLC_NO = b_BBLC_NO;
    }

    public RichInputText getB_BBLC_NO() {
        return b_BBLC_NO;
    }

    public void setBiND_CONTRACT_NO(RichInputText biND_CONTRACT_NO) {
        this.biND_CONTRACT_NO = biND_CONTRACT_NO;
    }

    public RichInputText getBiND_CONTRACT_NO() {
        return biND_CONTRACT_NO;
    }

    public void setBiND_INVOICE_NO(RichInputText biND_INVOICE_NO) {
        this.biND_INVOICE_NO = biND_INVOICE_NO;
    }

    public RichInputText getBiND_INVOICE_NO() {
        return biND_INVOICE_NO;
    }

    public void setBiND_ACCEPTANCE_NUMBER(RichInputText biND_ACCEPTANCE_NUMBER) {
        this.biND_ACCEPTANCE_NUMBER = biND_ACCEPTANCE_NUMBER;
    }

    public RichInputText getBiND_ACCEPTANCE_NUMBER() {
        return biND_ACCEPTANCE_NUMBER;
    }

    public void setBiND_PROPOSAL_NO(RichInputText biND_PROPOSAL_NO) {
        this.biND_PROPOSAL_NO = biND_PROPOSAL_NO;
    }

    public RichInputText getBiND_PROPOSAL_NO() {
        return biND_PROPOSAL_NO;
    }


    /*************
     * File Uploading Method
     *
     * ***************/

    public void fileUpload(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        //System.out.println("Roll Upload");


        //  System.out.println("Buyer Description --->" + getBuyerDescription(2112));


        UploadedFile file = (UploadedFile)valueChangeEvent.getNewValue();
       // System.out.println("======================  file upload "+valueChangeEvent.getNewValue());
        try {

            parseFile(file.getInputStream());
            AdfFacesContext.getCurrentInstance().addPartialTarget(shipmentTable);

            System.out.println("Level 1>");

        } catch (IOException e) {
            // TODO add more
            System.out.println("if errors-->" + e.getMessage());

        }

        //System.out.println("Level 2> "+getBbLCDETAIL_ID().getValue());

        BindingContainer bindings = getBindings();
        //System.out.println("Level 3> "+getBbLCDETAIL_ID().getValue());

       commit();

       

        //System.out.println("Level 5> "+getBbLCDETAIL_ID().getValue());

        OperationBinding operationBinding =
            executeOperation("UploadFabrincRoll");
        operationBinding.getParamsMap().put("InvoiceNo",
                                            getINVOICENUMBER().getValue());
        operationBinding.getParamsMap().put("ContractNo",
                                            getBbLCDETAIL_ID().getValue());
        operationBinding.execute();
        //System.out.println("Level 6> "+getBbLCDETAIL_ID().getValue());


        if (!operationBinding.getErrors().isEmpty()) {
            System.out.println("if errors-->");
        }
        
        filterFabricRollVO();
        
       
    }

    public void parseFile(java.io.InputStream file) {


        System.out.println("Parse File --->" + file);

        BufferedReader reader =
            new BufferedReader(new InputStreamReader(file));
        String strLine = "";
        StringTokenizer st = null;
        int lineNumber = 0, tokenNumber = 0;
        Row hrw = null, lineRow = null;

        HashMap map = new HashMap();
        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc = bindingContext.findDataControl("MainAMDataControl");
        ApplicationModule am = dc.getApplicationModule();

        ViewObject lineVo = am.findViewObject("MnjMfgFabinsDetailTemp1");


        try {
            while ((strLine = reader.readLine()) != null) {
                lineNumber++;
                st = new StringTokenizer(strLine, ",");
                System.out.println("Line No --->" + lineNumber);
                if (lineNumber > 1) {
                    hrw = lineVo.createRow();
                    hrw.setNewRowState(Row.STATUS_INITIALIZED);
                    lineVo.insertRow(hrw);
                }
                /*  */

                while (st.hasMoreTokens()) {
                    //display csv values
                    tokenNumber++;


                    String theToken = st.nextToken();


                    if (lineNumber > 1) {


                        System.out.println("Line No Case --->" + theToken);

                        switch (tokenNumber) {
                        case 1:
                                hrw.setAttribute("SupplierSerialNo", theToken);
                                System.out.println("SupplierSerialNo 123 --->" +
                                                   tokenNumber + theToken);
                                break;
                        case 2:
                            hrw.setAttribute("RollNo", theToken);
                            System.out.println("RollNo 123 --->" +
                                               tokenNumber + theToken);
                            break;

                            /*
                            System.out.println("Line No Case --->" + theToken);
                            hrw.setAttribute("RollSrNo", theToken);
                            System.out.println("Line No Case 123 --->" +
                                               theToken);
                            break;
                            */

                        case 3:
                        
                            hrw.setAttribute("RollLength", theToken);
                            System.out.println("RollLength 123--->" +
                                               tokenNumber + theToken);

                            break;

                        /*
                            hrw.setAttribute("RollNo", theToken);
                            System.out.println("RollNo 123 --->" +
                                               tokenNumber + theToken);
                            break;
                        */

                        case 4:
                            hrw.setAttribute("RollLength2", theToken);
                            System.out.println("RollLength2 --->" +
                                               tokenNumber + theToken);

                            break;
                            
                           /*
                            hrw.setAttribute("RollLength", theToken);
                            System.out.println("RollLength 123--->" +
                                               tokenNumber + theToken);

                            break;
                          */
                        case 5:
                            hrw.setAttribute("Uom", theToken);
                            System.out.println("Uom --->" + tokenNumber +
                                               theToken);
                            break;
                            
                            /*
                            hrw.setAttribute("RollLength2", theToken);
                            System.out.println("RollLength2 --->" +
                                               tokenNumber + theToken);

                            break;
                            */
                        case 6:
                            hrw.setAttribute("RollWidth", theToken);
                            System.out.println("RollWidth --->" + tokenNumber +
                                               theToken);

                            break;
                            
                            /*
                            hrw.setAttribute("Uom", theToken);
                            System.out.println("Uom --->" + tokenNumber +
                                               theToken);
                            break;
                            */
                        case 7:
                            hrw.setAttribute("ShrinkLength", theToken);
                            System.out.println("ShrinkLength --->" +
                                               tokenNumber + theToken);
                            break;
                            
                            /*
                            hrw.setAttribute("RollWidth", theToken);
                            System.out.println("RollWidth --->" + tokenNumber +
                                               theToken);

                            break;
                            */
                        case 8:
                            hrw.setAttribute("ShrinkWidth", theToken);
                            System.out.println("ShrinkWidth --->" +
                                               tokenNumber + theToken);
                            break;
                            /*
                            hrw.setAttribute("ShrinkLength", theToken);
                            System.out.println("ShrinkLength --->" +
                                               tokenNumber + theToken);
                            break;
                            */
                        case 9:
                           
                            hrw.setAttribute("Shade", theToken);
                            System.out.println("Shade --->" +
                                               tokenNumber + theToken);
                            break;
                            
                        case 10:
                               
                            hrw.setAttribute("Remarks", theToken);
                            System.out.println("Remarks --->" +
                                               tokenNumber + theToken);
                                break;
                            
                        
                        }

                    }
                }

                tokenNumber = 0;
            }
            map = null;
            reader = null;

        } catch (Exception e) {
            FacesContext fctx = FacesContext.getCurrentInstance();
            fctx.addMessage(null,
                            new FacesMessage(FacesMessage.SEVERITY_ERROR, "Data Error in Uploaded file",
                                             e.getMessage()));

        }

    }


    /*****************
     * File uploading Code
     * *****************************/
    public void setBbLCDETAIL_ID(RichInputText bbLCDETAIL_ID) {
        this.bbLCDETAIL_ID = bbLCDETAIL_ID;
    }

    public RichInputText getBbLCDETAIL_ID() {
        return bbLCDETAIL_ID;
    }

    public void editPopupFetchListener_ShipmentNo(PopupFetchEvent popupFetchEvent) {
        // Add event code here...

        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession)ectx.getSession(false);
        userSession.setAttribute("OrganizationId", getOrgId().getValue());

    }

    public void editPopupFetchCancelListener_ShipmentNo(PopupCanceledEvent popupCanceledEvent) {
        // Add event code here...
    }

    /*************************************
     **
    Getting Value from AM View Object
    01-May-2016
     **
     ***************************************/

    public String getSetValueBBLCDetailable(String type, String name,
                                            double val) {
        oracle.adf.view.rich.component.UIXTable table = getShipmentTable();
        // Get the Selected Row key set iterator
        java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
        String value = null;
        while (selectionIt.hasNext()) {
            Object rowKey = selectionIt.next();
            table.setRowKey(rowKey);
            int index = table.getRowIndex();
            FacesCtrlHierNodeBinding row =
                (FacesCtrlHierNodeBinding)table.getRowData(index);
            Row selectedRow = row.getRow();

            try {
                if (type.equals("GET"))
                    value = selectedRow.getAttribute(name).toString();
                else {
                    selectedRow.setAttribute(name, val);
                }

            } catch (Exception e) {
                ;
            }
        }
        return value;
    }

    /*************************************
     **
     Getting Value from AM View Object Method
     01-May-2016
     **
     ***************************************/

    /*************************************
     **
     Generating Item Block passing Detail ID and Shipment No
     01-May-2016
     **
     ***************************************/

    public void PopulateDetailItem() {

        
        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("MainAMDataControl"); //
        ApplicationModule am = dc.getApplicationModule();
        ViewObject findViewObject = am.findViewObject("Dummy1");
     
        RowSetIterator it = findViewObject.createRowSetIterator("tt");

       

        while (it.hasNext()) {
            Row r = it.next();

            OperationBinding operationBinding =
                executeOperation("MnjDetItemsPopulate");
            operationBinding.getParamsMap().put("ShipmentNo",  r.getAttribute("ShipmentNO"));
            operationBinding.getParamsMap().put("DetailLine_Id",getSetValueBBLCDetailable("GET", "ImpBblcDetailId",  0.0));       
          
            operationBinding.execute();

        }
        it.closeRowSetIterator();
        
        


    }

    public void editDialogueListener_ShipmentNo(DialogEvent dialogEvent) {
      
        if (dialogEvent.getOutcome().name().equals("ok")) {
           
            PopulateDetailItem(); 
            
            ViewObject  bblcDetailsVo = appM.getBBLCDetails1() ;
            Row detailsRow = bblcDetailsVo.getCurrentRow();
            double totalItemValue = 0.0 , totalImportValue=0.0;
            
            String  vYesNo;
            double freightCost=0.0 , otherCharge=0.0;
             
            try{
                freightCost  =Double.parseDouble( detailsRow.getAttribute("FreightCost").toString());
            }
            catch(Exception e){            
                freightCost = 0.0 ;
            }
            
            try {
                otherCharge =Double.parseDouble( detailsRow.getAttribute("OtherCharge").toString());
            } catch (Exception e) {            
                otherCharge=0.0;
            }
            
                   
            try {
                vYesNo = detailsRow.getAttribute("FreightCostFlag").toString();  
            } catch (Exception e) {
                // TODO: Add catch code
                vYesNo = "No";
                //e.printStackTrace();
            }
            
            totalItemValue = calculateImportValue(vYesNo, freightCost, otherCharge, bblcDetailsVo);
                
            //updateitemAndImportValue(totalItemValue, totalImportValue);
            
            detailsRow.setAttribute("ItemsValue", totalItemValue); 
            detailsRow.setAttribute("ImportValue", totalImportValue);
            
             
            AdfFacesContext.getCurrentInstance().addPartialTarget(shipmentTable);
            AdfFacesContext.getCurrentInstance().addPartialTarget(shipmentImportValue);  
           
           
        } else if (dialogEvent.getOutcome().name().equals("cancel")) {
            ;
        }


    }

    public void setBalanceQty_Bind(RichOutputText balanceQty_Bind) {
        this.balanceQty_Bind = balanceQty_Bind;
    }

    public RichOutputText getBalanceQty_Bind() {
        return balanceQty_Bind;
    }


    public boolean getPiRowCount(int P_LINE_ID) {
        int cnt;

        //  System.out.println("Level 5");
        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("MainAMDataControl"); //
        ApplicationModule am = dc.getApplicationModule();
        ViewObject findViewObject = am.findViewObject("BBLCPiDetails1");
        findViewObject.setWhereClause("IMP_BBLC_LINE_ID =" + P_LINE_ID);
        RowSetIterator it = findViewObject.createRowSetIterator("a");
        cnt = it.getRangeSize();

        System.out.println("Level 6 " + cnt);
        /*double total = 0.0;
                     while (it.hasNext()) {
                         Row r = it.next();
                         total = total + 1;
             }
             it.closeRowSetIterator();
            */
        if (cnt > 1) {
            it.closeRowSetIterator();

            return true;
        } else {
            it.closeRowSetIterator();

            return false;
        }
    }


    public String CheckBBLCPiCounts() {
        String vBblcNo = null, vBblcList = null;
        boolean x;
        int Line_id;
        // System.out.println("Level 1");

        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("MainAMDataControl"); //
        ApplicationModule am = dc.getApplicationModule();
        ViewObject findViewObject = am.findViewObject("BBLCLines1");
        RowSetIterator it = findViewObject.createRowSetIterator("b");
        System.out.println("Level 2");

        while (it.hasNext()) {
            Row r = it.next();

            vBblcNo = r.getAttribute("BblcNo").toString();
            Line_id =
                    Integer.parseInt(r.getAttribute("ImpBblcHeaderId").toString());
            x = getPiRowCount(Line_id);

            System.out.println("Level 3 Loop 1 " +
                               r.getAttribute("BblcNo").toString());

            if (getPiRowCount(Line_id)) {
                vBblcList = "asdkasjdaslkjdakjdas";
            } else {
                vBblcList = vBblcList + vBblcNo;
            }
            //     System.out.println("Level 3 Loop 2");

        }
        it.closeRowSetIterator();
        //   System.out.println("Level 4");

        return vBblcList;
    }

    public String GET_BBLC_PI_CNT(int Header_Id) {

        OperationBinding operationBinding = executeOperation("GetBBLCPiCount");

        operationBinding.getParamsMap().put("Header_Id", Header_Id);

        //invoke method
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            System.out.println("if errors-->");
            // List errors = operationBinding.getErrors();
        }
        //optional
        Object methodReturnValue = operationBinding.getResult();
        String value = methodReturnValue.toString();
        return value;
    }


    public String GET_BBLC_INVOICE_ITEM_CNT(int Header_Id) {

        OperationBinding operationBinding =
            executeOperation("GetBBLCInvoiceItemCount");

        operationBinding.getParamsMap().put("Header_Id", Header_Id);

        //invoke method
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            System.out.println("if errors-->");
            // List errors = operationBinding.getErrors();
        }
        //optional
      

        Object methodReturnValue = operationBinding.getResult();
        String value = methodReturnValue.toString();
        //     System.out.println("  Save Level3333   ");

        return value;
    }


    /* Code to get Inco Term */

    public String getIncoTermNew() {

        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("MainAMDataControl"); //
        ApplicationModule am = dc.getApplicationModule();
        ViewObject findViewObject =
            am.findViewObject("BBLCLines1"); //ImpSaleContractDetailEOView1

        Row selectedRow = findViewObject.getCurrentRow();

        String IncoTerm;
        try {
            IncoTerm = selectedRow.getAttribute("IncoTerm").toString();


        } catch (Exception e) {
            IncoTerm = "xyz";
        }
        return IncoTerm;
    }

    /* End Code to get Inco Term */


    /* Code to set Import Value */

    public void setImportValue(double val, double value) {

        oracle.adf.view.rich.component.UIXTable table = getShipmentTable();
        // Get the Selected Row key set iterator
        java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
        double ply = 0.0;
        while (selectionIt.hasNext()) {
            Object rowKey = selectionIt.next();
            table.setRowKey(rowKey);
            int index = table.getRowIndex();
            FacesCtrlHierNodeBinding row =
                (FacesCtrlHierNodeBinding)table.getRowData(index);
            Row selectedRow = row.getRow();


            selectedRow.setAttribute("ImportValue", val);
            selectedRow.setAttribute("ItemsValue", value);
            }

    }

    /* End Code to set Import Value */

    public void freightCostChangeListener(ValueChangeEvent valueChangeEvent) throws Exception {
        
       
        ViewObject bblcDetailsVo = appM.getBBLCDetails1();
        Row detailsRow = bblcDetailsVo.getCurrentRow();
        
        String  vYesNo;
        double freightCost, otherCharge, totalImportValue=0.0;
        try{
            freightCost = Double.parseDouble(valueChangeEvent.getNewValue().toString());
        }
        catch(Exception e){
            
            freightCost = 0.0 ;
        }
        
        try {
            otherCharge =Double.parseDouble( detailsRow.getAttribute("OtherCharge").toString());
        } catch (Exception e) {
            // TODO: Add catch code
            otherCharge=0.0;
        }
             
        vYesNo = detailsRow.getAttribute("FreightCostFlag").toString();  
              
        totalImportValue=  calculateImportValue(vYesNo, freightCost , otherCharge ,  bblcDetailsVo);
        detailsRow.setAttribute("ImportValue", totalImportValue);
        AdfFacesContext.getCurrentInstance().addPartialTarget(shipmentImportValue); 
                 
    }


    /* Code for total of ITEM Total Value */

    /************** Code To Get ITEM Total Value ***********************/

    public double getItemTotalValue() {

        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("MainAMDataControl"); //
        ApplicationModule am = dc.getApplicationModule();
        ViewObject findViewObject =
            am.findViewObject("BBLCDetailsPi1"); //ImpSaleContractDetailEOView1

        RowSetIterator it = findViewObject.createRowSetIterator("tt");
        double val = 0.0, total = 0.0, UnitPrice = 0.0, Quantity = 0.0;
        while (it.hasNext()) {

            Row r = it.next();
            try {
                Quantity =
                        Double.parseDouble(r.getAttribute("InvoiceQuantity").toString());
                //Double.parseDouble(r.getAttribute("Quantity").toString());
            } catch (Exception e) {
                Quantity = 0.0;
            }

            try {
                UnitPrice =
                        Double.parseDouble(r.getAttribute("UnitPrice").toString());
            } catch (Exception e) {
                UnitPrice = 0.0;
            }

            val = UnitPrice * Quantity;

            total = total + val;
        } //end of while loop
        it.closeRowSetIterator();
        return total;
    }

    /* End Code for total of ITEM Total Value */

    /*
    public void setFreightCostFlag_Bind(RichInputListOfValues freightCostFlag_Bind) {
        this.freightCostFlag_Bind = freightCostFlag_Bind;
    }

    public RichInputListOfValues getFreightCostFlag_Bind() {
        return freightCostFlag_Bind;

    }

    public void setFreigthcostflag_binding(RichSelectOneChoice freigthcostflag_binding) {
        this.freigthcostflag_binding = freigthcostflag_binding;
    }

    public RichSelectOneChoice getFreigthcostflag_binding() {
        return freigthcostflag_binding;
    }
*/

    

    public void CopyCharge_Line(ActionEvent actionEvent) {
        // Add event code here...

        System.out.println("Copy Level 1");

        // saveChanges();

        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("MainAMDataControl"); //
        ApplicationModule am = dc.getApplicationModule();
        //  ViewObject findViewObject =am.findViewObject("MnjChargesInterfaceVO1"); //ImpSaleContractDetailEOView1
        ViewObject findViewObject =
            am.findViewObject("BBLCShipmentChargesVO1"); //ImpSaleContractDetailEOView1


        //  System.out.println("Copy Level 3");

        int vInterfaceId = 0;

        vInterfaceId =
                Integer.parseInt(findViewObject.getCurrentRow().getAttribute("ImpBblcDetChargeId").toString());

        // System.out.println("Interface ID "+vInterfaceId);
        OperationBinding operationBinding =
            executeOperation("CopyLine_ChargeInterface");

        operationBinding.getParamsMap().put("Interface_Id", vInterfaceId);

        //invoke method
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            //  System.out.println("if errors-->");
            // List errors = operationBinding.getErrors();
        }


        AdfFacesContext.getCurrentInstance().addPartialTarget(chargInterfTable);


    }

    public void setChargInterfTable(RichTable chargInterfTable) {
        this.chargInterfTable = chargInterfTable;
    }

    public RichTable getChargInterfTable() {
        return chargInterfTable;
    }

    public void GenerateInterface_Lines(ActionEvent actionEvent) {
        
        
        boolean isVerifiedUser;
        isVerifiedUser= checkVerifiedUser();
               
         
         if(!isVerifiedUser){
             
            showWrongUserMessage();
            
            return;            
        }
        
                
 
         int headerId , detailId ; 
                 
        headerId =Integer.parseInt(appM.getBBLCHeader1().getCurrentRow().getAttribute("ImpBblcHeaderId").toString()) ;
        detailId = Integer.parseInt (appM.getBBLCDetails1().getCurrentRow().getAttribute("ImpBblcDetailId").toString());
        
        
     appM.GenerateCharge_Lines(headerId, detailId, 1110);
        

    }

   


    public void ProcessLines_ActionEvent(ActionEvent actionEvent) {
        // Add event code here...
        
        boolean isVerifiedUser;
        isVerifiedUser= checkVerifiedUser();
               
         
         if(!isVerifiedUser){
             
            showWrongUserMessage();
            
            return;            
        }
        
        
        ProcessLines_MB();
        
//         if(isProcessed()){
//                 addCharge.setDisabled(true); 
//                 deleteCharge.setDisabled(true); 
//                 processCharge.setDisabled(true);
//                  
//             }else{
//                 addCharge.setDisabled(false); 
//                 deleteCharge.setDisabled(false);
//                 processCharge.setDisabled(false);
//             }
//             AdfFacesContext.getCurrentInstance().addPartialTarget(addCharge);
//             AdfFacesContext.getCurrentInstance().addPartialTarget(deleteCharge);
//             AdfFacesContext.getCurrentInstance().addPartialTarget(processCharge);
             
         }
         
         public boolean isProcessed() {
            BindingContext bindingContext = BindingContext.getCurrent();
            DCDataControl dc =
                bindingContext.findDataControl("MainAMDataControl"); //
            ApplicationModule am = dc.getApplicationModule();
            ViewObject chargeH = appM.getMnjChargesInterfaceVO1();
            String flag="";
            try{
                 flag = chargeH.getCurrentRow().getAttribute("ProcessFlag").toString();
            }catch(Exception e){
                flag = "";
             }
            if(flag.equals("P"))
                return true;
            else if(flag.equals("N"))
                return false;
            return false;
        }
    public void disableCharge(PhaseEvent phaseEvent) {   
             // Add event code here...
             System.out.println(isProcessed());
             if(isProcessed()){
                 addCharge.setDisabled(true); 
                 deleteCharge.setDisabled(true); 
                 processCharge.setDisabled(true);
             }else{
                 addCharge.setDisabled(false); 
                 deleteCharge.setDisabled(false);
                 processCharge.setDisabled(false);
             }
             AdfFacesContext.getCurrentInstance().addPartialTarget(addCharge);
             AdfFacesContext.getCurrentInstance().addPartialTarget(deleteCharge);
             AdfFacesContext.getCurrentInstance().addPartialTarget(processCharge);
         }


    public void ProcessLines_MB() {


        OperationBinding operationBinding = executeOperation("ProcessLines");


  //      operationBinding.getParamsMap().put("ChrgDetId", 557);
     
        operationBinding.execute();
        
        
        //  System.out.println("Level 23-------->"+getChargesDetailID_Bind().getValue());

        if (!operationBinding.getErrors().isEmpty()) {
            System.out.println("if errors-->");
        }

    }

    public void setChargesIDNew(RichInputText chargesIDNew) {
        this.chargesIDNew = chargesIDNew;
    }

    public RichInputText getChargesIDNew() {
        return chargesIDNew;
    }

    public void saveChanges() {
      
       commit();
    }

    /*
    public void exeQry_ShipmentCharges(){
            System.out.println("exeQry_ShipmentCharges 1-------->");

            OperationBinding operationBinding = executeOperation("executeQuery_ShipmentChrg");
             operationBinding.execute();
            System.out.println("exeQry_ShipmentCharges 2-------->");



        }


  
*/

    public void setPi_Item_Upload(RichInputFile pi_Item_Upload) {
        this.pi_Item_Upload = pi_Item_Upload;
    }

    public RichInputFile getPi_Item_Upload() {
        return pi_Item_Upload;
    }

    public void FileUpload_PI(ValueChangeEvent valueChangeEvent) {
        
        
        boolean isVerifiedUser;
        isVerifiedUser= checkVerifiedUser();
        
        String currentUserName ;
        
                      
         if(!isVerifiedUser){
             
            showWrongUserMessage();
            
            getFabricRollFileUpload().setValue(null);
            
            return;            
        }
        
        
        
        
        UploadedFile file = (UploadedFile)valueChangeEvent.getNewValue();
        try {

            parseFile(file.getInputStream());
            AdfFacesContext.getCurrentInstance().addPartialTarget(shipmentTable);

           

        } catch (IOException e) {
            // TODO add more
            System.out.println("================== error in    parseFile(file.getInputStream());" + e.getMessage());
            
          //  Message.showMessage(e.getMessage());
            
            getFabricRollFileUpload().setValue(null);
            getFabricRollFileUpload2().setValue(null);
            return;
        }

        BindingContainer bindings = getBindings();

         commit();

       


        OperationBinding operationBinding = executeOperation("UploadFabrincRoll");
        //operationBinding.getParamsMap().put("InvoiceNo", getINVOICENUMBER().getValue());
        //operationBinding.getParamsMap().put("ContractNo",getBbLCDETAIL_ID().getValue());
        operationBinding.execute();

        if (!operationBinding.getErrors().isEmpty()) {
            
            
            System.out.println("================== error in   executeOperation(\"UploadFabrincRoll\")" + operationBinding.getErrors().toString());
            
            
          //  Message.showMessage(operationBinding.getErrors().toString());
            getFabricRollFileUpload2().setValue(null);
            getFabricRollFileUpload().setValue(null);
            return;
        }
        
        filterFabricRollVO();       
        getFabricRollFileUpload().setValue(null);
        getFabricRollFileUpload2().setValue(null);
      
        AdfFacesContext.getCurrentInstance().addPartialTarget(fabricRollTable);
        
    }

    public void CopyBBLCLines_MB(ActionEvent actionEvent) {
        // Add event code here...
        OperationBinding operationBinding =
            executeOperation("CopyBBLCLinesAM");
        operationBinding.execute();

        if (!operationBinding.getErrors().isEmpty()) {
        }
        Object methodReturnValue = operationBinding.getResult();
        String vMessage = methodReturnValue.toString();


        FacesContext context = FacesContext.getCurrentInstance();
        FacesMessage message = new FacesMessage(vMessage);
        context.addMessage(null, message);

    }

    public void AttachInvoiceDoc(ActionEvent actionEvent) throws UnknownHostException {
        // Add event code here...
        
        
        
        
        boolean isVerifiedUser;
        isVerifiedUser= checkVerifiedUser();
        
        String currentUserName ;
        
                      
         if(!isVerifiedUser){
             
            showWrongUserMessage();
            
            return;            
        }
        
        
        
        
        
        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("MainAMDataControl"); //
        ApplicationModule am = dc.getApplicationModule();
        ViewObject findViewObject1 =
            am.findViewObject("BBLCLines1"); //ImpSaleContractDetailEOView1
        String vBBLCNo =
            findViewObject1.getCurrentRow().getAttribute("BblcNo").toString();

        /****/
        ViewObject findViewObject2 =
            am.findViewObject("BBLCDetails1"); //ImpSaleContractDetailEOView1
        String vInvoiceNo =
            findViewObject2.getCurrentRow().getAttribute("InvoiceNo").toString();
        vInvoiceNo = vInvoiceNo.replace("/", "-");
        String vshipmentlineNo =
            findViewObject2.getCurrentRow().getAttribute("ImpBblcDetailId").toString();

        //     System.out.println("AttachInvoiceDoc......."+"BBLC:"+getDocumentNumber().getValue().toString()+"~LC:"+vBBLCNo+"~INVOICE:"+vInvoiceNo+ ">"+vshipmentlineNo);


        String ConcatStr =
            getDocumentNumber().getValue().toString() + "~LC:" + vBBLCNo +
            "~INVOICE:" + vInvoiceNo + ">" +
            vshipmentlineNo; //currBBLCNo+"`"+getDocumentNumber().getValue().toString();
        
        System.out.println("=========================== "+ConcatStr );
        
        String newPage = this.getFileUploadPage();
        newPage += "?doc=BBLC&docNo="+ConcatStr;
        
        //"http://localhost:7101/FileUploading-ViewController-context-root/faces/view1?doc=BBLC&docNo=" +ConcatStr;
        //getDocumentNumber().getValue();
        // String newPage = "http://localhost:7101/PurchaseMemo-ViewController-context-root/faces/SearchPG?headerId="+getBomId().getValue();
        FacesContext ctx = FacesContext.getCurrentInstance();
        ExtendedRenderKitService erks =
            Service.getService(ctx.getRenderKit(), ExtendedRenderKitService.class);
        String url = "window.open('" + newPage + "','_blank','toolbar=no,location=no,menubar=no,alwaysRaised=yes,height=500,width=1100');";
        erks.addScript(FacesContext.getCurrentInstance(), url);
    }


    public void AttachLCDoc(ActionEvent actionEvent) throws UnknownHostException {
        // Add event code here...
        
        
        boolean isVerifiedUser;
        isVerifiedUser= checkVerifiedUser();
        
        String currentUserName ;
        
                      
         if(!isVerifiedUser){
             
            showWrongUserMessage();
            
            return;            
        }
        
        
        
        
        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("MainAMDataControl"); //
        ApplicationModule am = dc.getApplicationModule();
        ViewObject findViewObject =
            am.findViewObject("BBLCLines1"); //ImpSaleContractDetailEOView1
        String vBBLCNo =
            findViewObject.getCurrentRow().getAttribute("BblcNo").toString();
        String vBBLClineid =
            findViewObject.getCurrentRow().getAttribute("ImpBblcLineId").toString();


        //    System.out.println("AttachLCDoc......."+"BBLC:"+getDocumentNumber().getValue().toString()+"~LC:"+vBBLCNo +">" +vBBLClineid);

        String ConcatStr =
            getDocumentNumber().getValue().toString() + "~LC:" + vBBLCNo +
            ">" +
            vBBLClineid; //currBBLCNo+"`"+getDocumentNumber().getValue().toString();
        
            String newPage = this.getFileUploadPage();
            newPage += "?doc=BBLC&docNo="+ConcatStr;
        //getDocumentNumber().getValue();
        // String newPage = "http://localhost:7101/PurchaseMemo-ViewController-context-root/faces/SearchPG?headerId="+getBomId().getValue();
        FacesContext ctx = FacesContext.getCurrentInstance();
        ExtendedRenderKitService erks =
            Service.getService(ctx.getRenderKit(), ExtendedRenderKitService.class);
        String url ="window.open('" + newPage + "','_blank','toolbar=no,location=no,menubar=no,alwaysRaised=yes,height=500,width=1100');";
        erks.addScript(FacesContext.getCurrentInstance(), url);


    }

    public void AttachContractDoc(ActionEvent actionEvent) throws UnknownHostException {
        // Add event code here...
        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("MainAMDataControl"); //
        ApplicationModule am = dc.getApplicationModule();
        ViewObject findViewObject =
            am.findViewObject("BBLCContract1"); //ImpSaleContractDetailEOView1
        String vContractNo =
            findViewObject.getCurrentRow().getAttribute("BblcContractNo").toString();
        String BBLCContractLine =
            findViewObject.getCurrentRow().getAttribute("ImpBblcContrId").toString();


        //   System.out.println("AttachContractDoc......."+"BBLC:"+getDocumentNumber().getValue().toString()+"~CONTRACT:"+vContractNo+ ">"+BBLCContractLine);

        String ConcatStr =
            getDocumentNumber().getValue().toString() + "~CONTRACT:" +
            vContractNo + ">" + BBLCContractLine + "1";
      
      
        String newPage = this.getFileUploadPage();
        newPage += "?doc=BBLC&docNo="+ConcatStr;
      
      
        //"http://localhost:7101/FileUploading-ViewController-context-root/faces/view1" +ConcatStr;
        //getDocumentNumber().getValue();
        // String newPage = "http://localhost:7101/PurchaseMemo-ViewController-context-root/faces/SearchPG?headerId="+getBomId().getValue();
        FacesContext ctx = FacesContext.getCurrentInstance();
        ExtendedRenderKitService erks =
            Service.getService(ctx.getRenderKit(), ExtendedRenderKitService.class);
        String url = "window.open('" + newPage + "','_blank','toolbar=no,location=no,menubar=no,alwaysRaised=yes,height=500,width=1100');";
        erks.addScript(FacesContext.getCurrentInstance(), url);

    }

    public void setProposalNumber(RichInputText proposalNumber) {
        this.proposalNumber = proposalNumber;
    }

    public RichInputText getProposalNumber() {
        return proposalNumber;
    }

    public void setPiTables(RichTable piTables) {
        this.piTables = piTables;
    }

    public RichTable getPiTables() {
        return piTables;
    }

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


    private double calculateAdjustmentCharges(Row row) {
        
        
         String piNoTemp = row.getAttribute("PiNo").toString();
            
            // this line is to eliminate "  '  " character from pi value
            String piNo = piNoTemp.replace("'", "''");
          
            double adjustmentCharge = 0.0;
            double bankCharge = 0.0, handlingCharge = 0.0, discount = 0.0, other =0.0;
            String s1;
            Double d1;
            ViewObject adjustmentVo = appM.getPI_ADJUSTMENT_CHARGE_VO2();
            adjustmentVo.setWhereClause("PI_NO = '"+piNo+"'");
            adjustmentVo.executeQuery();
            if(adjustmentVo.getRowCount()>0){
              
                Row r  = adjustmentVo.first();
                try {
                    s1 = r.getAttribute("AdjustmentCharge").toString();
                    adjustmentCharge = Double.parseDouble(s1);               
                   
                } catch (Exception e) {
                    System.out.println("============= exception while calculating bank charge");
                }                                
               // System.out.println("============================   adjustmentCharge " +adjustmentCharge);
                adjustmentVo.setWhereClause(null);
                adjustmentVo.executeQuery();
                return adjustmentCharge;
                
            }
            else return 0;
        
  }

    private double calculateItemValue(Row row) {

        double val = 0.0, total = 0.0, UnitPrice = 0.0, invoiceQuantity = 0.0 , grnQuantity=0.0;
       
        try{
            invoiceQuantity = Double.parseDouble(row.getAttribute("InvoiceQuantity").toString());
        }catch (Exception e){
            
            invoiceQuantity=0;
        }
       
       
        try{
            grnQuantity =
                    Double.parseDouble(row.getAttribute("GrnQuantity").toString());
        }catch(Exception e){
            grnQuantity=0.0;
        }
       
               
        UnitPrice =
                Double.parseDouble(row.getAttribute("UnitPrice").toString());
        if(grnQuantity>0.0){
            val = UnitPrice * grnQuantity;
        }
        else{
            val = UnitPrice * invoiceQuantity;
        }
        
        
        return val;
    }


    private double calculateTotalItemValue(ViewObject bblcDetailsVo) {
       
        double totalItemValue = 0;
        double adjustmentCharges = 0.0, itemValue = 0.0;
        String bblsDetailsPiNo = null;
        boolean piInPreviousInvoices;

        Row CurrentDdetailsRows = bblcDetailsVo.getCurrentRow();
      //  bblcDetailsVo.executeQuery();
        
        RowSet detailsPiRowSet =(RowSet)CurrentDdetailsRows.getAttribute("BBLCDetailsPi");
        detailsPiRowSet.executeQuery();
    
        while (detailsPiRowSet.hasNext()) {
            Row detailsPiRow = detailsPiRowSet.next();
            try {
                bblsDetailsPiNo = detailsPiRow.getAttribute("PiNo").toString();
            } catch (Exception e) {

             
                return totalItemValue;
            }
           
             itemValue = calculateItemValue(detailsPiRow);
                   
              
            totalItemValue += itemValue;
           
        }
        
        
        return totalItemValue;
    }
        
        
    

    private double calculateFreightCost(Row row) {

        double freightCost = 0.0;
        if (row.getAttribute("FreightCostFlag").toString() == "Yes") {
            freightCost =
                    Double.parseDouble(row.getAttribute("FreightCost").toString());

        }
        return freightCost;
    }


    private void updateitemAndImportValue(double totalItemValue , double totalImportValue) {
        
           ViewObject bblcDEtailVo = appM.getBBLCDetails1();
        
            Row selectedRow = bblcDEtailVo.getCurrentRow();
       
           
            selectedRow.setAttribute("ItemsValue", totalItemValue);
           
            selectedRow.setAttribute("ImportValue", totalImportValue);
            
            AdfFacesContext.getCurrentInstance().addPartialTarget(shipmentTable);


        }
   


    


    public void saveItemAndImportValue(ActionEvent actionEvent) {

        double totalItemValue = 0;
        double totalImportValue = 0;
        double freightCost = 0;
        //
        //        totalItemValue = calculateTotalItemValue();
        //     //   freightCost = calculateFreightCost();
        //        totalImportValue = totalItemValue + freightCost;
        //        updateitemAndImportValue(totalItemValue, totalImportValue);

    }

    private boolean checkPiInPreviousInvoices(ViewObject bblcDetailsVo,
                                              String bblcDetailsPiNo , Row detailsPiRow) {
       // System.out.println("=================  in checkPiInPreviousInvoices    method");
        boolean flag;
        String thisPiNo;
        double thisdetailRowKey, detailRowKey , thisdetailPiRowKey ,detailPiRowKey ;
        
        //  row key for which pi in all other invoices is being checked 
        
        detailPiRowKey = Double.parseDouble(detailsPiRow.getAttribute("ImpBblcPiDetailId").toString());
        
        Row[] bblcDetailsRowSet = bblcDetailsVo.getAllRowsInRange();
        Row bblcDetailscurrentRow = bblcDetailsVo.getCurrentRow();
        
        // row key for the current detail view object row
        detailRowKey = Double.parseDouble(bblcDetailscurrentRow.getAttribute("ImpBblcDetailId").toString());
       // System.out.printf("================== current details row detailRowKey value  " +detailRowKey);
        
        for (Row detailsRow : bblcDetailsRowSet) {
            
            // row key for the iterated  detail view object row
            
            thisdetailRowKey = Double.parseDouble(detailsRow.getAttribute("ImpBblcDetailId").toString());
          //  System.out.printf("================== checking row detailRowKey value  " +thisdetailRowKey);
            if (thisdetailRowKey == detailRowKey) {
            
             //   System.out.printf("================== checking invoice row  " + detailsRow +
             //                     "================== current invoice row  " +bblcDetailscurrentRow);
                RowSet detailsPiRowSet = (RowSet)detailsRow.getAttribute("BBLCDetailsPi");
                
             //   System.out.println("  ==================" +
             //                      detailsPiRowSet.getRowCount() +
             //                      "==============all rows  in bblcDetailsPiVo for each bblcDetailsVo");

                while (detailsPiRowSet.hasNext()) {
                   Row thisDetailsPiRow = detailsPiRowSet.next();
                  //   row key for iterated details pi view object row 
                   thisdetailPiRowKey =  Double.parseDouble(thisDetailsPiRow.getAttribute("ImpBblcPiDetailId").toString());
                    
                    if( thisdetailPiRowKey < detailPiRowKey ){
                        
                        thisPiNo = thisDetailsPiRow.getAttribute("PiNo").toString();
                         if (thisPiNo.equals(bblcDetailsPiNo)) {

//                            System.out.println("  ============================= " +
//                                               bblcDetailsPiNo +
//                                               "==============current pi no is found details pi vo");
//                            System.out.println("==============  bblcDetailsPiNo  :" +
//                                               bblcDetailsPiNo +
//                                               "\n==============  thisPiNo  :" +
//                                               thisPiNo);
                            detailsPiRowSet.closeRowSet();
                            return true;

                        }
                        
                        
                    }
                        
                    
                }
            }
            
            else if (thisdetailRowKey < detailRowKey){
//                System.out.printf("================== checking invoice row  " + detailsRow +
//                                  "================== current invoice row  " +bblcDetailscurrentRow);
                RowSet detailsPiRowSet = (RowSet)detailsRow.getAttribute("BBLCDetailsPi");

//                System.out.println("  ==================" +
//                                   detailsPiRowSet.getRowCount() +
//                                   "==============all rows  in bblcDetailsPiVo for each bblcDetailsVo");

                while (detailsPiRowSet.hasNext()) {

                    Row thisDetailsPiRow = detailsPiRowSet.next();
                    thisPiNo = thisDetailsPiRow.getAttribute("PiNo").toString();

                    if (thisPiNo.equals(bblcDetailsPiNo)) {

                        System.out.println("  ============================= " +
                                           bblcDetailsPiNo +
                                           "==============current pi no is found details pi vo");
                        System.out.println("==============  bblcDetailsPiNo  :" +
                                           bblcDetailsPiNo +
                                           "\n==============  thisPiNo  :" +
                                           thisPiNo);
                        detailsPiRowSet.closeRowSet();
                        return true;

                    }
                }
                
            }
        }
       
        return false;
    }

  

    public void editDialogListenerItemInformation (DialogEvent dialogEvent) throws Exception{
        
      
        if (dialogEvent.getOutcome().name().equals("ok")) {
            
            populateItemAndImportValue();
            
        } 
    }

    public void SelectItemWithGRNfetchListener(PopupFetchEvent popupFetchEvent) {
        
        
        AdfFacesContext.getCurrentInstance().addPartialTarget(piTable);
        ViewObject populatevo = appM.getFillGRN1();
        
        String piNo = null;
      /** to filter GRN view object's query with  current BBLC's PI's (GRNs saved pi's against current bblc will be shown)  */
         ViewObject lineVo = appM.getBBLCLines1();
         StringBuilder bblcPiDetailsPIs ;
          bblcPiDetailsPIs = new StringBuilder("('dummy Pi')");
       
         RowSet pi_detail = (RowSet)lineVo.getCurrentRow().getAttribute("BBLCPiDetails");
        System.out.println("=====================  row count in  pi_detail row set"+ pi_detail.getRowCount());
        System.out.println("=====================  range size in  pi_detail row set"+ pi_detail.getRangeSize());
         if (pi_detail.getRowCount()>0){
             bblcPiDetailsPIs = new StringBuilder();
              bblcPiDetailsPIs.append("(");
             while (pi_detail.hasNext()){
                 Row row = pi_detail.next();
                 bblcPiDetailsPIs.append("'");
                 bblcPiDetailsPIs.append(row.getAttribute("PiNo").toString());
                 bblcPiDetailsPIs.append("'");
               bblcPiDetailsPIs.append(",");
             }
             bblcPiDetailsPIs.deleteCharAt(bblcPiDetailsPIs.length()-1);
             bblcPiDetailsPIs.append(")");
            
         } 
         else{
             
                
             }
        populatevo.setWhereClause("  PI_NO IN " + bblcPiDetailsPIs );
         
        /** to filter GRN view object's query with Pi numbers not in BBLCDetailsPi 
        *  view object (  pi number already in details pi vo (item information table in create page) )  */
         
        ViewObject bblcDetailsVo = appM.getBBLCDetails1();
        Row bblcDetailsCurrentRow =    bblcDetailsVo.getCurrentRow();
        RowSet detailsPiRowSet ;
        try{
            detailsPiRowSet = (RowSet)bblcDetailsCurrentRow.getAttribute("BBLCDetailsPi"); 
        }catch(Exception e){
            return;
        }
      
        if (detailsPiRowSet.getRowCount()>0){
            StringBuilder grns = new StringBuilder();
             grns.append("(");
            while (detailsPiRowSet.hasNext()){
                Row row = detailsPiRowSet.next();
                grns.append("'");
                try{
                    grns.append(row.getAttribute("Grn").toString());
                }catch(Exception e){
                    grns.append("dummy Grn");
                }
              
                grns.append("'");
               grns.append(",");
            }
            grns.deleteCharAt(grns.length()-1);
            grns.append(")");
            populatevo.setWhereClause( "PI_NO IN " + bblcPiDetailsPIs + " AND GRN NOT IN " + grns );
        }  
        
        
        
        System.out.println(" fill grn query after adding set where clause  " + populatevo.getQuery().toString() );
        
         populatevo.executeQuery();
         
       

         if (popupFetchEvent.getLaunchSourceClientId().contains("cbInsert")) {

            BindingContainer bindings = getBindings();
           
            OperationBinding operationBinding =
                bindings.getOperationBinding("CreateInsert");
            operationBinding.execute();
        }
        pi_detail.closeRowSet();
        
        
        try{
            populatevo.setRangeSize(500);
        Row[] populatevoRows  =    populatevo.getAllRowsInRange();
        double totalItemValue= 0.0,unitPrice=0.0,grnQty=0.0;
         for(Row populatevoRow : populatevoRows){
            unitPrice= Double.valueOf(populatevoRow.getAttribute("UnitPrice").toString());
            grnQty = Double.valueOf(populatevoRow.getAttribute("GrnQuantity").toString());
            totalItemValue+= (unitPrice*grnQty);
        }
         totalInSelectItemsWithGrn.setValue(totalItemValue);
        AdfFacesContext.getCurrentInstance().addPartialTarget(totalInSelectItemsWithGrn);
        }catch(Exception e){
            ;
        }
        
    }

    public void selectAllItemWithGRN(ActionEvent actionEvent) {
    
        boolean flag = true;
        
        ViewObject populatevo = appM.getFillGRN1();
        
        RowSetIterator it = populatevo.createRowSetIterator("yy");
        while (it.hasNext()) {
            Row row = it.next();

            row.setAttribute("ItemCheckBox", flag);
        }
        it.closeRowSetIterator();
        AdfFacesContext.getCurrentInstance().addPartialTarget(itemWithGRNtable);
        
    }

    public void deselectAllItemWithGRN(ActionEvent actionEvent) {
        boolean flag = false;
        
        ViewObject populatevo = appM.getFillGRN1();
        
        RowSetIterator it = populatevo.createRowSetIterator("yy");
        while (it.hasNext()) {
            Row row = it.next();

            row.setAttribute("ItemCheckBox", flag);
        }
        it.closeRowSetIterator();
        AdfFacesContext.getCurrentInstance().addPartialTarget(itemWithGRNtable);
        
        }

    public void editDialogListenerItemWithGRN(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome().name().equals("ok")) {
            FillItemWithGRN();
            AdfFacesContext.getCurrentInstance().addPartialTarget(piTable);
            

            populateItemAndImportValue();
            
        } else if (dialogEvent.getOutcome().name().equals("cancel")) {
            ;
        }
    }

    private void FillItemWithGRN() {
        OperationBinding operationBinding = executeOperation("callItemWithGRNFetch");
        operationBinding.execute();
    }



    public void setItemWithGRNtable(RichTable itemWithGRNtable) {
        this.itemWithGRNtable = itemWithGRNtable;
    }

    public RichTable getItemWithGRNtable() {
        return itemWithGRNtable;
    }

    public void setFreigthcostflag_bind(RichSelectOneChoice freigthcostflag_bind) {
        this.freigthcostflag_bind = freigthcostflag_bind;
    }

    public RichSelectOneChoice getFreigthcostflag_bind() {
        return freigthcostflag_bind;
    }


    public void setAddCharge(RichCommandToolbarButton addCharge) {
        this.addCharge = addCharge;
    }

    public RichCommandToolbarButton getAddCharge() {
        return addCharge;
    }

    public void setDeleteCharge(RichCommandToolbarButton deleteCharge) {
        this.deleteCharge = deleteCharge;
    }

    public RichCommandToolbarButton getDeleteCharge() {
        return deleteCharge;
    }

    public void setProcessCharge(RichCommandToolbarButton processCharge) {
        this.processCharge = processCharge;
    }

    public RichCommandToolbarButton getProcessCharge() {
        return processCharge;
    }

    public void selectAll_InvoiceForAcceptance(ActionEvent actionEvent) {
        boolean flag = true;
        
        ViewObject populatevo = appM.getInvoicesForAcceptance1();
        
        RowSetIterator it = populatevo.createRowSetIterator("yy");
        while (it.hasNext()) {
            Row row = it.next();

            row.setAttribute("SelectInvoice", flag);
        }
        it.closeRowSetIterator();
        AdfFacesContext.getCurrentInstance().addPartialTarget(invoiceForAcceptanceTable);
    }

    public void DeselectAll_InvoiceForAcceptance(ActionEvent actionEvent) {
        boolean flag = false;
        
        ViewObject populatevo = appM.getInvoicesForAcceptance1();
        
        RowSetIterator it = populatevo.createRowSetIterator("yy");
        while (it.hasNext()) {
            Row row = it.next();

            row.setAttribute("SelectInvoice", flag);
        }
        it.closeRowSetIterator();
        AdfFacesContext.getCurrentInstance().addPartialTarget(invoiceForAcceptanceTable);
    }

    public void editDialogListener_InvoiceForAcceptance(DialogEvent dialogEvent) {
        
          fillInvoiceForAcceptance(); 
        AdfFacesContext.getCurrentInstance().addPartialTarget(bblcAcceptInvDetTable);
       
    }
   
    private void fillInvoiceForAcceptance() {
        ViewObject vo = appM.getInvoicesForAcceptance1();
        Row[] invoiceForAcceptanceRowSet =  vo.getAllRowsInRange();
        int count = 1;
        for(Row row : invoiceForAcceptanceRowSet){
            
            try {
                String flag = row.getAttribute("SelectInvoice").toString();
                
                if (flag.equals("true"))
                    System.out.println("  =-=-=-=-=-=-=-=-=-=-"+ count++);
                    populateAcceptInvDetTable(row);
                    vo.setCurrentRow(row);
                    vo.removeCurrentRow();

            } catch (Exception e) {
                ;
            }
            
        }
        
    }

    private void populateAcceptInvDetTable(Row row) {
       // ViewObject vo = appM.getBBLC_Acceptance_Inv_det_1();
       //  System.out.println("      invoice for acceptance =-=-=-=- "+row.getAttribute("ImpBblcDetailId").toString());
       Row acceptInvDetRow = createAcceptInvDetRow();
        
         String bullReferenceNo = "";
         try{
             bullReferenceNo = appM.getBBLCAcceptance1().getCurrentRow().getAttribute("BillReferenceNo").toString();
         }
         catch( Exception e){
              bullReferenceNo = "";
          }
        
         
         acceptInvDetRow.setAttribute("BillReferenceNo", bullReferenceNo);  
        acceptInvDetRow.setAttribute("ImpBblcDetailId", row.getAttribute("ImpBblcDetailId").toString());
        acceptInvDetRow.setAttribute("InvoiceNo",row.getAttribute("InvoiceNo").toString());   
        acceptInvDetRow.setAttribute("ItemsValue", row.getAttribute("ItemsValue").toString());
        acceptInvDetRow.setAttribute("ImportValue", row.getAttribute("ImportValue").toString());
         acceptInvDetRow.setAttribute("Currency", row.getAttribute("Currency").toString());
        
       
     }

    private Row createAcceptInvDetRow() {
        ViewObject bblcAcceptVsInvDetVo = appM.getBBLC_Acceptance_Inv_det_1();
        Row row = bblcAcceptVsInvDetVo.createRow();
       bblcAcceptVsInvDetVo.insertRow(row);
        row.setNewRowState(Row.STATUS_INITIALIZED);
        return row;
        
    }

    public void setBblcAcceptInvDetTable(RichTable bblcAcceptInvDetTable) {
        this.bblcAcceptInvDetTable = bblcAcceptInvDetTable;
    }

    public RichTable getBblcAcceptInvDetTable() {
        return bblcAcceptInvDetTable;
    }

    public void setInvoiceForAcceptanceTable(RichTable invoiceForAcceptanceTable) {
        this.invoiceForAcceptanceTable = invoiceForAcceptanceTable;
    }

    public RichTable getInvoiceForAcceptanceTable() {
        return invoiceForAcceptanceTable;
    }

    public void editPopUpFetchListener_inv_for_accept(PopupFetchEvent popupFetchEvent) {


        ViewObject invoiceForAcceptanceVO = appM.getInvoicesForAcceptance1();

        // this condition is for sohwing invoices of current bblc only
        ViewObject bblcLineVO = appM.getBBLCLines1();
        String bblcLiniId =
            bblcLineVO.getCurrentRow().getAttribute("ImpBblcLineId").toString();

      
        String whereClause;
        whereClause = "IMP_BBLC_LINE_ID = " + bblcLiniId;

        invoiceForAcceptanceVO.setWhereClause(whereClause);
        invoiceForAcceptanceVO.executeQuery();


        AdfFacesContext.getCurrentInstance().addPartialTarget(bblcAcceptInvDetTable);


    }

    public void editPopUpFetchListenerAddInvoiceForAcceptance(PopupFetchEvent popupFetchEvent) {
        
        AdfFacesContext.getCurrentInstance().addPartialTarget(bblcAcceptInvDetTable);
       
    }

    public void setBtbOriginalLiability(RichInputText btbOriginalLiability) {
        this.btbOriginalLiability = btbOriginalLiability;
    }

    public RichInputText getBtbOriginalLiability() {
        return btbOriginalLiability;
    }

    private void setShippingGuranteeLiability() {
        
        
        Double shippungGuranteeLiability = 0.0;

        String query =
            " SELECT sum ( IIBD.IMPORT_VALUE ) AS IMPORT_VALUE " + 
            " FROM IEDOC_IMP_BBLC_HEADERS IIBH, IEDOC_IMP_BBLC_LINES IIBL, IEDOC_IMP_BBLC_DETAILS IIBD " +
            " WHERE  IIBH.IMP_BBLC_HEADER_ID = IIBL.IMP_BBLC_HEADER_ID " +
            " AND IIBL.IMP_BBLC_LINE_ID = IIBD.IMP_BBLC_LINE_ID" +
            " AND IIBD.ENDORSEMENT LIKE  '%Shiping%' " +
            " AND IIBH.IMP_BBLC_HEADER_ID = '" +
            getHeaderID().getValue().toString() + "' ";

        ResultSet rs;

        try {
            rs =  appM.getDBTransaction().createStatement(0).executeQuery(query);
            if (rs.next()) {
                shippungGuranteeLiability = rs.getDouble("IMPORT_VALUE");
            }

            rs.close();
        } catch (SQLException e) {
            throw new JboException(e);
        }
        
     //   System.out.println(" =+=+=+=+=+=+=+=+=+=+=+=+  in setShippingGuranteeLiability() ");
      //  System.out.println(" =+=+=+=+=+=+=+=+=+=+=+=+  shippungGuranteeLiability "+ shippungGuranteeLiability);
        
        appM.getBBLCHeader1().getCurrentRow().setAttribute("Attribute3", shippungGuranteeLiability);
     //   btbShippingGurantee.setValue(shippungGuranteeLiability);
        
        
    }

    private void setOriginalLiability() {
        
        Double originalLiability = 0.0;

        String query =
            " SELECT sum ( IIBD.IMPORT_VALUE ) AS IMPORT_VALUE " + 
            " FROM IEDOC_IMP_BBLC_HEADERS IIBH, IEDOC_IMP_BBLC_LINES IIBL, IEDOC_IMP_BBLC_DETAILS IIBD " +
            " WHERE  IIBH.IMP_BBLC_HEADER_ID = IIBL.IMP_BBLC_HEADER_ID " +
            " AND IIBL.IMP_BBLC_LINE_ID = IIBD.IMP_BBLC_LINE_ID" +
            " AND IIBD.ENDORSEMENT = 'Original' " +
            " AND IIBD.IMP_BBLC_DETAIL_ID NOT IN (SELECT IMP_BBLC_DETAIL_ID FROM IEDOC_IMP_BBLC_ACCEPT_INV_DET)"+
            " AND IIBH.IMP_BBLC_HEADER_ID = '" +
            getHeaderID().getValue().toString() + " '";

        ResultSet rs;

        try {
            rs =  appM.getDBTransaction().createStatement(0).executeQuery(query);
            if (rs.next()) {
                originalLiability = rs.getDouble("IMPORT_VALUE");
            }

            rs.close();
        } catch (SQLException e) {
            throw new JboException(e);
        }
        
        
        System.out.println(" =+=+=+=+=+=+=+=+=+=+=+=+  in setOriginalLiability() ");
        System.out.println(" =+=+=+=+=+=+=+=+=+=+=+=+  originalLiability "+ originalLiability);
        
        appM.getBBLCHeader1().getCurrentRow().setAttribute("Attribute6", originalLiability);
        
      //  btbOriginalLiability.setValue(originalLiability);
        
        
        
    }

    private void setAcceptedLiability() {
        
        Double acceptedLiability = 0.0;
        Double paid_amount = 0.0 ;

        String query =  "SELECT sum ( IIBA.BILL_VALUE-IIBA.PAYMENT_AMOUNT ) AS TOTAL_PAID_BILL_VALUE ,sum ( IIBA.BILL_VALUE) AS TOTAL_BILL_VALUE , " +
               "               sum ( IIBA.PAYMENT_AMOUNT) AS TOTAL_PAID_AMOUNT \n" + 
               "             FROM IEDOC_IMP_BBLC_HEADERS IIBH, IEDOC_IMP_BBLC_LINES IIBL, IEDOC_IMP_BBLC_ACCEPTANCE IIBA\n" + 
               "             WHERE  IIBH.IMP_BBLC_HEADER_ID = IIBL.IMP_BBLC_HEADER_ID \n" + 
               "             AND IIBL.IMP_BBLC_LINE_ID = IIBA.IMP_BBLC_LINE_ID\n" + 
               "              AND IIBH.IMP_BBLC_HEADER_ID = '"+
                             appM.getBBLCHeader1().getCurrentRow().getAttribute("ImpBblcHeaderId").toString()+ "' "+
                 "AND IIBL.IMP_BBLC_LINE_ID = (SELECT MAX (IIBL2.IMP_BBLC_LINE_ID)\n" + 
                                             " FROM IEDOC_IMP_BBLC_LINES IIBL2\n" + 
                                            " WHERE IIBL2.BBLC_NO = IIBL.BBLC_NO)\n" ; 

        ResultSet rs;

        try {
            rs =  appM.getDBTransaction().createStatement(0).executeQuery(query);
            if (rs.next()) {
                acceptedLiability = rs.getDouble("TOTAL_PAID_BILL_VALUE");
                paid_amount = rs.getDouble("TOTAL_PAID_AMOUNT");
            } 

            rs.close();
        } catch (SQLException e) {
            throw new JboException(e);
        }
        
        System.out.println(" =+=+=+=+=+=+=+=+=+=+=+=+  in setAcceptedLiability() ");
       
        
        
      
        appM.getBBLCHeader1().getCurrentRow().setAttribute("Attribute2", acceptedLiability);      //set accepted liability
      
        appM.getBBLCHeader1().getCurrentRow().setAttribute("PaidAmountForProposal", paid_amount); //set total paid amount
    
        
        //update BTB LC liability  
        double lcLiability ;
        
        System.out.println(" =+=+=+=+=+=+=+=+=+=+=+=+   acceptedLiability  "+  acceptedLiability );
        
       // lcLiability = Double.valueOf(btbLcLiability.getValue().toString());
        lcLiability =Double.valueOf( appM.getBBLCHeader1().getCurrentRow().getAttribute("Attribute1").toString());
        System.out.println(" =+=+=+=+=+=+=+=+=+=+=+=+   lcLiability  "+  lcLiability );
       
        
        
      //  btbLcLiability.setValue(lcLiability-acceptedLiability-paid_amount);
      appM.getBBLCHeader1().getCurrentRow().setAttribute("Attribute1", lcLiability-acceptedLiability-paid_amount);
        AdfFacesContext.getCurrentInstance().addPartialTarget(btbLcLiability);
        
        System.out.println(" =+=+=+=+=+=+=+=+=+=+=+=+   lcLiability-acceptedLiability-paid_amount  "+  (lcLiability-acceptedLiability-paid_amount) );
       
    }

    public void editDialogListener_AddInvoiceFoeAccept(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome().name().equals("ok")) {
          calculateBillValue();
           
        }
    }

    public void setBblcAcceptanceTable(RichTable bblcAcceptanceTable) {
        this.bblcAcceptanceTable = bblcAcceptanceTable;
    }

    public RichTable getBblcAcceptanceTable() {
        return bblcAcceptanceTable;
    }

    private void calculateBblcHeaderFormulas() {
        
    
        //commented on 18 april 18 and contract value taken from header formula procedure
     //   totalContractValue.setValue(getContractTotalValue());  

        OperationBinding operationBinding =
            executeOperation("HeaderFormulaCalculation");
        System.out.println("sabih Error 1   " + getHeaderID().getValue());
        operationBinding.getParamsMap().put("HeaderId",
                                            getHeaderID().getValue());
         operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
           
        }
        
              
       // setShippingGuranteeLiability();  // commented on 27 nov 18 by fatin , this value brought from procedure now
       // setOriginalLiability(); // commented on 27 nov 18 by fatin , this value brought from procedure now
      // setAcceptedLiability();   // commented on 27 nov 18 by fatin , this value brought from procedure now
         

        AdfFacesContext.getCurrentInstance().addPartialTarget(headerForm);
         
     
    }

    public void save(ActionEvent actionEvent) {
       
        
        boolean isVerifiedUser;
        isVerifiedUser= checkVerifiedUser();
                
        String currentUserName ;
                
         if(!isVerifiedUser){                          
             showWrongUserMessage();             
            // return without executing the rest of the method if not verified user  
            return;            
        }                
        // Below Code is to get Total of BBLC from PI Block
        // //this method calculates all bblc row values according to tagged pi     
         
         
        setAllBblcTotalValues();
         
         // this method calculates only current bblc value  accourding to tagged pi 
       //  setBBLCTotalValue(getBBLCTotalValue());
        
        getConvertedAmount(); // Method to calculate converted Amount

        getAmendAmount();
                                               
        commit();
        
        
        showBblcAndItemMessage();
   
    //    ViewObject  lineVo =  appM.getBBLCLines1();        
      //  refreshQueryKeepingCurrentRow(lineVo);
        
        //bblc header formula calculation added on save button in 4 may 18
       
       
       calculateBblcHeaderFormulas();
       
       AdfFacesContext.getCurrentInstance().addPartialTarget(headerForm);
                        
      commit();
        
     //   refreshQueryKeepingCurrentRow(appM.getBBLCHeader1())  ;   
                                   
    }

    public void detachAllFromPiInformationTable(ActionEvent actionEvent) {
      ViewObject piDetailsVo = appM.getBBLCPiDetails1();
      // this method detaches all the rows in the view object in the parameter
      detachAllRow(piDetailsVo);
      AdfFacesContext.getCurrentInstance().addPartialTarget(newPiTable);
    }
    

    private void detachAllRow(ViewObject viewObj) {
        
        Row[] rowSet = viewObj.getAllRowsInRange();
        for(Row row :rowSet){
           row.remove();
        }
        
        
    }

    public void DetachAllFromBBLCDetailsPiTable(ActionEvent actionEvent) {
        ViewObject BBLCDetailsPiVo = appM.getBBLCDetailsPi1();
        // this method detaches all the rows in the view object in the parameter
        detachAllRow(BBLCDetailsPiVo);
        AdfFacesContext.getCurrentInstance().addPartialTarget(piTable);

    }

   
    public void DeleteAllFromAccept_inv_det_table(ActionEvent actionEvent) {
        
            
        ViewObject BBLC_Accept_Inv_DetVo = appM.getBBLC_Acceptance_Inv_det_1();
        // this method detaches all the rows in the view object in the parameter
        detachAllRow(BBLC_Accept_Inv_DetVo);
        AdfFacesContext.getCurrentInstance().addPartialTarget(bblcAcceptInvDetTable);
    }

    public void editPopUpFetchListenerSelectPiForBBLC(PopupFetchEvent popupFetchEvent) {
        
        ViewObject PidetailsVo =  appM.getFillPI1();
        
        String currentOrgId =  appM.getBBLCHeader1().getCurrentRow().getAttribute("OrgId").toString();
        
        
        
        String lcFirtsBenificeryId ;
        try {
            lcFirtsBenificeryId  = appM.getBBLCLines1().getCurrentRow().getAttribute("BeneficiaryId").toString();
        }
        
        catch(Exception e ){
            lcFirtsBenificeryId = "-1";
        }
        
        String whereClauseString ;
        
        RowSet contracts = (RowSet)appM.getBBLCHeader1().getCurrentRow().getAttribute("BBLCContract");
        String contractBuyer =  "";
        try{
            contractBuyer = contracts.first().getAttribute("Attribute5").toString();
            System.out.println("=8=8=8=8=  contract buyer "+ contractBuyer);
        }catch(Exception e){
            contractBuyer = "";
        }
        
         StringBuilder contractSeasons ;
         contractSeasons = new StringBuilder("()");
        
       contracts.reset();
        if (contracts.getRowCount()>0){
            
            contractSeasons = new StringBuilder();
             contractSeasons.append("(");
            while (contracts.hasNext()){
                System.out.println("=8=8=8=8=  while loop ");
                Row row = contracts.next();
                contractSeasons.append("'");
                try{
                    contractSeasons.append(row.getAttribute("Attribute6").toString());
                }catch(Exception e){
                    contractSeasons.append(" ");
                }
               
                contractSeasons.append("'");
               contractSeasons.append(",");
            }
            contractSeasons.deleteCharAt(contractSeasons.length()-1);
            contractSeasons.append(")");
            
            System.out.println("ORG_ID = '"+currentOrgId + "' AND BUYER_NAME  = '" + contractBuyer + "'  AND SEASON IN " + contractSeasons);
          //  PidetailsVo.setWhereClause("ORG_ID = '"+currentOrgId + "' AND BUYER_NAME  = '" + contractBuyer + "'  AND SEASON IN " + contractSeasons );
            whereClauseString = "ORG_ID = '"+currentOrgId + "' AND BUYER_NAME  = '" + contractBuyer + "'  AND SEASON IN " + contractSeasons;
        } 
        else{
           whereClauseString= "ORG_ID = ' "+currentOrgId + "'" ;
        }
        
        
        if (!lcFirtsBenificeryId.equals("-1")){
        
            whereClauseString+=" AND SUPPLIER_ID = '"+lcFirtsBenificeryId+"'";
        }
       
        PidetailsVo.setWhereClause(whereClauseString);
        
        PidetailsVo.executeQuery();  
        
 
      
    }

    public void createAcceptanceRow(ActionEvent actionEvent) {
        ViewObject acceptanceVo = appM.getBBLCAcceptance1();
        Row row = acceptanceVo.createRow();
        acceptanceVo.insertRow(row);
        row.setNewRowState(Row.STATUS_INITIALIZED);
        String currency;
        try{
            currency = appM.getBBLCLines1().getCurrentRow().getAttribute("Currency").toString();
        }
        catch(Exception e){
            currency="";
        }
        
       row.setAttribute("Currency",currency);
        row.setAttribute("PaymentAmount",0);
       AdfFacesContext.getCurrentInstance().addPartialTarget(bblcAcceptanceTable);
    }

    public void saveInvoicesForAcceptance(ActionEvent actionEvent) {
        calculateBillValue();
        
       commit();
        
    }

    private void calculateBillValue() {
        
        if(appM.getBBLCAcceptance1().getAllRowsInRange().length==0){
            System.out.println("no row selected in acceptance table");
             return ;
        }
        
        ViewObject Vo =appM.getBBLC_Acceptance_Inv_det_1();
        Row[] rowSet = Vo.getAllRowsInRange();
         double totalImportValue = 0.0;
         double importValue =0.0;
         
        for (Row row : rowSet){
            try{
                importValue = Double.valueOf(row.getAttribute("ImportValue").toString()); 
            }
            catch(Exception e){
                importValue = 0;
            }
          
            totalImportValue+=importValue;
        }
        ViewObject vo2 = appM.getBBLCAcceptance1();
        
        vo2.getCurrentRow().setAttribute("BillValue",totalImportValue);
        AdfFacesContext.getCurrentInstance().addPartialTarget(bblcAcceptanceTable);
    }

    public void updatePayments(ActionEvent actionEvent) {
       
        boolean isVerifiedUser;
        isVerifiedUser= checkVerifiedUser();
                
        String currentUserName ;
                
         if(!isVerifiedUser){                          
             showWrongUserMessage();             
            // return without executing the rest of the method if not verified user  
            return;            
        }          
       
       
        updatePaymentsForProposalNo();
    }

    private void updatePaymentsForProposalNo() {
        
        
        ViewObject headerVo =  appM.getBBLCHeader1();
        String headerId = headerVo.getCurrentRow().getAttribute("ImpBblcHeaderId").toString();
        
        /** this procedure updates all acceptance table row under current proposal with adding payment number and 
         payment amount value if payment number exists for each bill reference number in acceptance table  */
        
        String statement = "BEGIN APPS.IEDOC_DOC_NO_PKG.UPDATE_PAYMENT_NUM_IN_ACCPT(:1); END;";
        CallableStatement cs =  appM.getDBTransaction().createCallableStatement(statement, 1);
        
        
        try {
            cs.setInt(1, Integer.parseInt(headerId));
            cs.execute();
        }
        catch(Exception e){
            ;
        }               
 
     
        
    }

    public void setHeaderForm(RichPanelFormLayout headerForm) {
        this.headerForm = headerForm;
    }

    public RichPanelFormLayout getHeaderForm() {
        return headerForm;
    }

    public void AttachAcceptance(ActionEvent actionEvent) throws UnknownHostException {
        // Add event code here...
        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("MainAMDataControl"); 
        ApplicationModule am = dc.getApplicationModule();
        ViewObject findViewObject1 =
            am.findViewObject("BBLCLines1"); 
        String vBBLCNo =
            findViewObject1.getCurrentRow().getAttribute("BblcNo").toString();

        /****/
        ViewObject findViewObject2 =
            am.findViewObject("BBLCAcceptance1"); 
        String vBillNo =
            findViewObject2.getCurrentRow().getAttribute("BillReferenceNo").toString();
        vBillNo = vBillNo.replace("/", "-");
        String vAcceptanceNo =
            findViewObject2.getCurrentRow().getAttribute("ImpBblcAcceptanceId").toString();
  
        String ConcatStr =
            getDocumentNumber().getValue().toString() + "~LC:" + vBBLCNo +
            "~ACCEPTANCE:" + vBillNo + ">" +
            vAcceptanceNo; //currBBLCNo+"`"+getDocumentNumber().getValue().toString();
        
            String newPage = this.getFileUploadPage();
            newPage += "?doc=BBLC&docNo="+ConcatStr;
            
        //"http://localhost:7101/FileUploading-ViewController-context-root/faces/view1?doc=BBLC&docNo=" +ConcatStr;
        //getDocumentNumber().getValue();
        // String newPage = "http://localhost:7101/PurchaseMemo-ViewController-context-root/faces/SearchPG?headerId="+getBomId().getValue();
        FacesContext ctx = FacesContext.getCurrentInstance();
        ExtendedRenderKitService erks =
            Service.getService(ctx.getRenderKit(), ExtendedRenderKitService.class);
        String url = "window.open('" + newPage + "','_blank','toolbar=no,location=no,menubar=no,alwaysRaised=yes,height=500,width=1100');";
        erks.addScript(FacesContext.getCurrentInstance(), url);
    }


    public void setTotalInItemInfoPopUp(RichInputText totalInItemInfoPopUp) {
        this.totalInItemInfoPopUp = totalInItemInfoPopUp;
    }

    public RichInputText getTotalInItemInfoPopUp() {
        return totalInItemInfoPopUp;
    }

    private double calculateFreightCost() {
        String vYesNo = null;
        Double  freightCost=0.0;
        ViewObject bblcDetailsVo= appM.getBBLCDetails1();
        try {
            vYesNo =  bblcDetailsVo.getCurrentRow().getAttribute("FreightCostFlag").toString();
        }catch(Exception e){            
            vYesNo="No" ;
        }
        if (vYesNo.equals("Yes")) {

            try {                
                freightCost = Double.parseDouble(bblcDetailsVo.getCurrentRow().getAttribute("FreightCost").toString());
          
            } catch (Exception e) {
                freightCost=0.0; 
            }
        } else {
            
            freightCost=0.0;
        }
        return freightCost;
    }

    public void setTotalInSelectItemsWithGrn(RichInputText totalInSelectItemsWithGrn) {
        this.totalInSelectItemsWithGrn = totalInSelectItemsWithGrn;
    }

    public RichInputText getTotalInSelectItemsWithGrn() {
        return totalInSelectItemsWithGrn;
    }

    public void attachFabricRoll(ActionEvent actionEvent) throws UnknownHostException {
     
        // Add event code here...
        ViewObject BblcLineVO  = appM.getBBLCLines1();
        String vBBLCNo = BblcLineVO.getCurrentRow().getAttribute("BblcNo").toString();
         
        ViewObject BblcDetailPiVO  = appM.getBBLCDetailsPi1();
        String bblcDetPiId = BblcDetailPiVO.getCurrentRow().getAttribute("ImpBblcPiDetailId").toString();
     
        String ConcatStr =
            getDocumentNumber().getValue().toString() + "~LC:" + vBBLCNo +
            ">" +
            bblcDetPiId;      
        
        String newPage = this.getFileUploadPage();
        newPage += "?doc=BBLC&docNo="+ConcatStr;
        
        //getDocumentNumber().getValue();
        // String newPage = "http://localhost:7101/PurchaseMemo-ViewController-context-root/faces/SearchPG?headerId="+getBomId().getValue();
        FacesContext ctx = FacesContext.getCurrentInstance();
        ExtendedRenderKitService erks =
            Service.getService(ctx.getRenderKit(), ExtendedRenderKitService.class);
        String url ="window.open('" + newPage + "','_blank','toolbar=no,location=no,menubar=no,alwaysRaised=yes,height=500,width=1100');";
        erks.addScript(FacesContext.getCurrentInstance(), url);
    }

    public void editPopUpFetchLIstenerFabricRoll(PopupFetchEvent popupFetchEvent) {
        
            
        filterFabricRollVO();
        getFabricRollFileUpload().setValue(null);
      
       // getFabricRollFileUpload().getValue();
       
        
    }

    public void setFabricRollTable(RichTable fabricRollTable) {
        this.fabricRollTable = fabricRollTable;
    }

    public RichTable getFabricRollTable() {
        return fabricRollTable;
    }

    private void filterFabricRollVO() {
        ViewObject invVo = appM.getBBLCDetails1();
        String currentInvoiceNo ;
        try{
            currentInvoiceNo  = invVo.getCurrentRow().getAttribute("InvoiceNo").toString();
        }catch(Exception e ){
            currentInvoiceNo  = null;
        }
        
        ViewObject  fabricRollVo = appM.getfabricRollVO1();
        fabricRollVo.setWhereClause("INVOICE_NO = '"+currentInvoiceNo+"'");
        fabricRollVo.executeQuery();
    }

    public void setFabricRollFileUpload(RichInputFile fabricRollFileUpload) {
        this.fabricRollFileUpload = fabricRollFileUpload;
    }

    public RichInputFile getFabricRollFileUpload() {
        return fabricRollFileUpload;
    }

    public void addLocalInvoices(ActionEvent actionEvent) {
                        
        //this method is only for bblc with type local
        
        ViewObject lineVo = appM.getBBLCLines1();
                
        String currentBblcType;
        String beneficiary;
        
        try{
            currentBblcType = lineVo.getCurrentRow().getAttribute("BblcType").toString();
           
            
        }catch(Exception e){
            currentBblcType="" ;
        }
        
         try{
             currentBblcType = lineVo.getCurrentRow().getAttribute("BblcType").toString();
             beneficiary = lineVo.getCurrentRow().getAttribute("Beneficiary").toString();
             
         }catch(Exception e){
             beneficiary="" ;
         }
                
        //if bblc type is not local  ,  return without performing  rest functionalities
        
        if(!currentBblcType.equals("Local")){
            FacesContext context = FacesContext.getCurrentInstance();
            FacesMessage message =
                new FacesMessage("BBLC Type is Not Local");
            message.setSeverity(FacesMessage.SEVERITY_INFO);
            context.addMessage(null, message);
            
            //if bblc type is not local  ,  return without performing rest functionalities
            return;
        }        
        
        String orgId = getOrgId().getValue().toString();
        String currentBblc  = lineVo.getCurrentRow().getAttribute("BblcNo").toString();
        String currentBblcVendorId  = lineVo.getCurrentRow().getAttribute("BeneficiaryId").toString();
        
       
        ViewObject LocalInvoiceVo = appM.getLocalInvoicesVsBblcVO1();
              

        LocalInvoiceVo.setWhereClause("ORG_ID = '"+orgId+"' AND LC_NO = '"+currentBblc+"' AND VENDOR_ID= '"+currentBblcVendorId+"'");
        LocalInvoiceVo.setRangeSize(100);
        LocalInvoiceVo.executeQuery();
       
        Row[] LocalInvoiceRows = LocalInvoiceVo.getAllRowsInRange();
        
     
        ViewObject detailVo = appM.getBBLCDetails1();
            
         Row bblcDetailsRow; 
        
           for(Row localInvoiceRow : LocalInvoiceRows){
            bblcDetailsRow = detailVo.createRow();
            bblcDetailsRow.setAttribute("InvoiceNo", localInvoiceRow.getAttribute("InvoiceNum").toString());
            bblcDetailsRow.setAttribute("ItemsValue", localInvoiceRow.getAttribute("InvoiceAmount"));
            bblcDetailsRow.setAttribute("ImportValue", localInvoiceRow.getAttribute("InvoiceAmount"));
            bblcDetailsRow.setAttribute("InvoiceDate", localInvoiceRow.getAttribute("InvoiceDate"));
            bblcDetailsRow.setAttribute("Attribute20", "NoItem");
        }
        
      //  System.out.println("=================== LocalInvoiceVO.getAllRowsInRange().length =  " );
           
     }

    private void populateItemAndImportValue() {
        
        ViewObject bblcDetailsVo = appM.getBBLCDetails1();
        //if invoice is added from addLocalIinvoice method then  Attribute20 value  is set "NoItem"
        // if Attribute20 is "NoItem" then return from this method without updating invoice's itemvalue and importvalue
        String itemStatus=null;
        Row detailsRow =bblcDetailsVo.getCurrentRow();
        
        
        try{
            itemStatus=detailsRow.getAttribute("Attribute20").toString();
            
        }catch(Exception e){
            
            itemStatus="a";
           
        }
            if ( itemStatus.equals("NoItem")){
                   
                     return;
                }
                
         ViewObject bblcDetailsPiVo = appM.getBBLCDetailsPi1();
        Row detailsPiRow = bblcDetailsPiVo.getCurrentRow();
        
        double totalItemValue = 0; double totalImportValue=0;
        String IncoTerm;
                
        // checking if current details row has no details pi row 
        try {
        RowSet detailsPiRowSet = (RowSet)bblcDetailsVo.getCurrentRow().getAttribute("BBLCDetailsPi");
        
        }
        catch(NullPointerException e){
            String messageText="<html><head>\n" + 
            "<Attribute6>\n" + 
            "p {\n" + 
            "    font-family: verdana;\n" + 
            "    font-size: 20px;\n" + 
            "    \n" + 
            "}\n" + 
            "</style>\n" + 
            "</head><body>\n" + 
            "          <p style=\"color : red ;\">  <b>No Pi is attached in this invoice</b></p>\n" + 
            "          <p style=\"color : green ;\"><b>Attach a pi and change the Freight Cost Value</b></p>\n" + 
            "</body>\n" + 
            "</html>";
            
            
                Message.showMessage(messageText , "warn" );
                return ;
            
        }
        
        totalItemValue = calculateTotalItemValue(bblcDetailsVo);
       
          
        String  vYesNo;
        double freightCost=0.0 , otherCharge=0.0;
         
        try{
            freightCost  =Double.parseDouble( detailsRow.getAttribute("FreightCost").toString());
        }
        catch(Exception e){            
            freightCost = 0.0 ;
        }
        
        try {
            otherCharge = Double.parseDouble( detailsRow.getAttribute("OtherCharge").toString());
        } catch (Exception e) {            
            otherCharge=0.0;
        }
        
               
        try {
            vYesNo = detailsRow.getAttribute("FreightCostFlag").toString();  
        } catch (Exception e) {
            // TODO: Add catch code
            vYesNo = "No";
        }
        
        totalImportValue = calculateImportValue(vYesNo, freightCost, otherCharge, bblcDetailsVo);
            
        //updateitemAndImportValue(totalItemValue, totalImportValue);
      
      
     
      
        detailsRow.setAttribute("ItemsValue", totalItemValue); 
        detailsRow.setAttribute("ImportValue", totalImportValue);
       
         
        AdfFacesContext.getCurrentInstance().addPartialTarget(shipmentTable);
        AdfFacesContext.getCurrentInstance().addPartialTarget(shipmentImportValue);  
               
    }
    
    
    
    public void refreshQueryKeepingCurrentRow(ViewObject viewObject )  {
        
        
         Row currentRow;
         Key currentRowKey;
         
         // added on 7.jan.18 to handle exception if view object has no current row
        try{
           currentRow = viewObject.getCurrentRow();
           currentRowKey = currentRow.getKey();
        }
        catch(Exception e){
            return;
        }
        
     
       
      
       int rangePosOfCurrentRow = viewObject.getRangeIndexOf(currentRow);
       int rangeStartBeforeQuery = viewObject.getRangeStart();
       viewObject.executeQuery();
       viewObject.setRangeStart(rangeStartBeforeQuery);
       /*
        * In 10.1.2, there is this convenience method we could use
        * instead of the remaining lines of code
        *
        *  findAndSetCurrentRowByKey(currentRowKey,rangePosOfCurrentRow);
        *  
        */
       
         
       Row[] rows = viewObject.findByKey(currentRowKey, 1);
       if (rows != null && rows.length == 1)
       {
          viewObject.scrollRangeTo(rows[0], rangePosOfCurrentRow);
          viewObject.setCurrentRowAtRangeIndex(viewObject.getRangeIndexOf(rows[0]));
       }
       
               
     }


    public void setBiND_P_LC_REF_NO(RichInputText biND_P_LC_REF_NO) {
        this.biND_P_LC_REF_NO = biND_P_LC_REF_NO;
    }

    public RichInputText getBiND_P_LC_REF_NO() {
        return biND_P_LC_REF_NO;
    }

    public void setFabricRollFileUpload2(RichInputFile fabricRollFileUpload2) {
        this.fabricRollFileUpload2 = fabricRollFileUpload2;
    }

    public RichInputFile getFabricRollFileUpload2() {
        return fabricRollFileUpload2;
    }
    
    
    


    public void dialogueListenerPiDetail(DialogEvent dialogEvent) {
        // Add event code here...
        
    //    ViewObject piDetailVo  =  appM.getBBLCPiDetails1();
    
       ViewObject  bblcLinesVo = appM.getBBLCLines1();
        Row currentBblcRow = bblcLinesVo.getCurrentRow();
        
        if(currentBblcRow == null){
            return;
        }
        
        RowSet rs ;
        rs=(RowSet)currentBblcRow.getAttribute("BBLCPiDetails");
        
        
        boolean  bblcBeneficiaryIsNull ;
     
        String  firstPiBeneficiaryId =null; 
        String  firstPiBeneficiaryName =null; 
        String firstPiCurrency = null;
        
        //this method checks wheather beneficiery is null in current bblc row
        bblcBeneficiaryIsNull =  checkBblcBeneficiaryIsNull(currentBblcRow);
        
        
        Row firstPiDetailRow ;
        try{
            firstPiDetailRow =  rs.first();
            firstPiDetailRow.toString();
        }catch(Exception e){
            //this block will execute when no row in pi detail vo for current bblc row 
           
             //delece  beneficiary and currency from current bblc row  if no row in pi detail vo for current bblc row 
            deleteBeneficiaryAndCurrency(currentBblcRow);
             
         //   AdfFacesContext.getCurrentInstance().addPartialTarget(bblcTable);
            
            refreshBblcBeneficiaryAndCurrency();
             
            return ;
        }
        
        // if  atleast one row in pi detailvo then rest will execute 
        
       if (!bblcBeneficiaryIsNull){
       
           
            // if bblcBeneficiary Is not Null then return 
            return;
        }
        else{
           
            // if bblcBeneficiary Is  Null then  populate beneficiary and currency from first pi row
           
           
          
            try{
                firstPiBeneficiaryId= firstPiDetailRow.getAttribute("BeneficiaryId").toString();
                firstPiBeneficiaryName= firstPiDetailRow.getAttribute("BeneficiaryName").toString();
                firstPiCurrency=firstPiDetailRow.getAttribute("Attribute1").toString();
                
            }catch(NullPointerException e){
               
//                System.out.println("================== NullPointerException ");
//                deleteBeneficiaryAndCurrency(currentBblcRow);
//               
                refreshBblcBeneficiaryAndCurrency();
          
                return;
            }
            
         
            
            currentBblcRow.setAttribute("BeneficiaryId", firstPiBeneficiaryId);
            currentBblcRow.setAttribute("BeneficiaryName", firstPiBeneficiaryName);
             currentBblcRow.setAttribute("Currency", firstPiCurrency);
           
             refreshBblcBeneficiaryAndCurrency();
            
            
             
        }
        
      
    }

    private boolean checkBblcBeneficiaryIsNull(Row currentBblcRow) {
        
       
        String beneficiaryName=null; 
        try{
             beneficiaryName = currentBblcRow.getAttribute("BeneficiaryName").toString();
            return  false;
         }catch(NullPointerException e){
            
              return  true;
                    
          }
        
    }


   

    private void deleteBeneficiaryAndCurrency(Row currentBblcRow) {

         currentBblcRow.setAttribute("BeneficiaryId", null);
        currentBblcRow.setAttribute("BeneficiaryName", null);
        currentBblcRow.setAttribute("Currency", null);
    }
    
    
    
   public void commit(){
        
        
        
        boolean isVerifiedUser;
        isVerifiedUser= checkVerifiedUser();
        
          
         String currentUserName ;
         
        
         
         if(!isVerifiedUser){
             
            showWrongUserMessage();
            
            return;            
        }
        
      
        
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        
        
    }
    
    public void commit(ActionEvent actionEvent){
        
        
        
        boolean isVerifiedUser;
        isVerifiedUser= checkVerifiedUser();
        
          
         String currentUserName ;
         
        
         
         if(!isVerifiedUser){
             
            showWrongUserMessage();
            
            return;            
        }
        
      
        
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        
        
    }
    
    

    public void setBeneficiaryCurrency(RichColumn beneficiaryCurrency) {
        this.beneficiaryCurrency = beneficiaryCurrency;
    }

    public RichColumn getBeneficiaryCurrency() {
        return beneficiaryCurrency;
    }

  

    public void setBblcCurrency(RichOutputText bblcCurrency) {
        this.bblcCurrency = bblcCurrency;
    }

    public RichOutputText getBblcCurrency() {
        return bblcCurrency;
    }

   

    public void setBblcBeneficiaryId(RichOutputText bblcBeneficiaryId) {
        this.bblcBeneficiaryId = bblcBeneficiaryId;
    }

    public RichOutputText getBblcBeneficiaryId() {
        return bblcBeneficiaryId;
    }
    
    private void refreshBblcBeneficiaryAndCurrency() {
        
        
       
//        AdfFacesContext.getCurrentInstance().addPartialTarget(bblcBeneficiaryId);
//        AdfFacesContext.getCurrentInstance().addPartialTarget(bblcCurrency); 
//        AdfFacesContext.getCurrentInstance().addPartialTarget(bbLCbeneficiaryName); 
        AdfFacesContext.getCurrentInstance().addPartialTarget(bblcTable);
         
      //  refreshQueryKeepingCurrentRow(appM.getBBLCLines1() );
        
    }

    public void setBbLCbeneficiaryName(RichColumn bbLCbeneficiaryName) {
        this.bbLCbeneficiaryName = bbLCbeneficiaryName;
    }

    public RichColumn getBbLCbeneficiaryName() {
        return bbLCbeneficiaryName;
    }


    public void saveHeaderDoc(ActionEvent actionEvent) {
        
        
        commit();
        
       
    }

    public void deleteBblcHeader(ActionEvent actionEvent) {
        // Add event code here...
        
        
        boolean isVerifiedUser;
        isVerifiedUser= checkVerifiedUser();
        
        
        String currentUserName ;
        
    
                         
         if(!isVerifiedUser){
             
            showWrongUserMessage();
            return;            
        }
        
        
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Delete");
        Object result = operationBinding.execute();
        
        
    }

    private boolean checkVerifiedUser() {
        
        String docCreator;
        String docCreatorName;
         try{
            docCreator = appM.getBBLCHeader1().getCurrentRow().getAttribute("CreatedBy").toString();
        }catch(Exception e){
            docCreator="000000";
        }
        try{
          docCreatorName = appM.getBBLCHeader1().getCurrentRow().getAttribute("CreatedByName").toString();
        }catch(Exception e){
          docCreatorName="No Creator";
        }
        
        Map sessionScope = ADFContext.getCurrent().getSessionScope();
        
        String currentUser = (String)sessionScope.get("userId");
        
      //  String currentUser = "5219";
        
      if( currentUser != null && (currentUser.equals("6086")  ||  currentUser.equals("1545"))){
          // verify user for user: USER_EXPORT and Syed_harun
          return true;
      }
                         
       else if(!docCreator.equals(currentUser)){
            
         return   false;   
            
         //  return   true; 
            
        }
         return true;
    }


    private double calculateTotalImportValue( ViewObject bblcDetailsVo ) {
      
        Row CurrentDdetailsRows =  bblcDetailsVo.getCurrentRow();
        double totalImportValue = 0;
        double adjustmentCharges = 0.0, itemValue = 0.0;
        String bblsDetailsPiNo = null;
        boolean piInPreviousInvoices;

        RowSet detailsPiRowSet =
            (RowSet)CurrentDdetailsRows.getAttribute("BBLCDetailsPi");
        detailsPiRowSet.executeQuery();
       

        while (detailsPiRowSet.hasNext()) {
            Row detailsPiRow = detailsPiRowSet.next();
            try {
                bblsDetailsPiNo = detailsPiRow.getAttribute("PiNo").toString();
            } catch (Exception e) {

                
                return totalImportValue;
            }
            
            
             //  System.out.println("=============================  1  adjustmentCharge :"+calculateAdjustmentCharges(detailsPiRow));
              
                
                piInPreviousInvoices = checkPiInPreviousInvoices(bblcDetailsVo, bblsDetailsPiNo ,detailsPiRow );
                    if (!piInPreviousInvoices) {
                       
                        adjustmentCharges = calculateAdjustmentCharges(detailsPiRow);
                        if (adjustmentCharges != 0){
                           
                            itemValue = calculateItemValue(detailsPiRow);
                            
                           
                            itemValue += adjustmentCharges;
                           
                        }else{
                            itemValue = calculateItemValue(detailsPiRow);
                            
                        }
                           
                    } else {
                       
                        itemValue = calculateItemValue(detailsPiRow);
                    }
                    
           
           
            totalImportValue += itemValue;
          
        }

        
        return totalImportValue;
       
    }

    public void setShipmentImportValue(RichInputText shipmentImportValue) {
        this.shipmentImportValue = shipmentImportValue;
    }

    public RichInputText getShipmentImportValue() {
        return shipmentImportValue;
    }

    public void acceptanceDateValueChangeListener(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        
        Date acceptanceDate  ; 
        
        Date maturityDate ; 
        
        oracle.jbo.domain.Date  dt = ( oracle.jbo.domain.Date)   valueChangeEvent.getNewValue();
        acceptanceDate = dt.dateValue();
         
        
        
        
       // acceptanceDate = (Date)valueChangeEvent.getNewValue();
        
        try{
          //  acceptanceDate = (Date)valueChangeEvent.getNewValue();
        }catch(Exception e){
            
          //  return  ;
           
        }
        
        String bblcType ; 
        
        try{
            
            bblcType = appM.getBBLCLines1().getCurrentRow().getAttribute("BblcType").toString();
            
        }catch(Exception e){
            
            
            bblcType="dummy" ;
            
          
        }
        
        
        if(bblcType.equals("Local")){
            
            maturityDate = addDays(acceptanceDate,90);
            
        }
        
        else if(bblcType.equals("Foreign")){
            
            maturityDate = addDays(acceptanceDate,150);
            
            
        }
        else{
            Message.showMessage("provide BBLC type in BBLC table first !", "info");
            return;
        }
            
        
        appM.getBBLCAcceptance1().getCurrentRow().setAttribute("MaturityDate", maturityDate);
        
        
        AdfFacesContext.getCurrentInstance().addPartialTarget(maturityDateBind);
            
    }
    
    
    public static Date addDays(Date date, int days) {
        
                    GregorianCalendar cal = new GregorianCalendar();
                    cal.setTime(date);
                    cal.add(Calendar.DATE, days);
                                    
                    return cal.getTime();
            }


    public void setMaturityDateBind(RichInputDate maturityDateBind) {
        this.maturityDateBind = maturityDateBind;
    }

    public RichInputDate getMaturityDateBind() {
        return maturityDateBind;
    }

   
    
    

    private void addRowAtFirst(RichTable shipmentTable) {
        //this process can be done in view object impl class's  insert row (overriden method) 
        // Add event code here…
        CollectionModel tableModel = (CollectionModel)shipmentTable.getValue();
        JUCtrlHierBinding adfModel = (JUCtrlHierBinding)tableModel.getWrappedData();
        DCIteratorBinding dciter = adfModel.getDCIteratorBinding();
        NavigatableRowIterator nav=dciter.getNavigatableRowIterator();
        Row newRow = nav.createRow();
        newRow.setNewRowState(Row.STATUS_INITIALIZED);
        nav.insertRowAtRangeIndex(0, newRow);        dciter.setCurrentRowWithKey(newRow.getKey().toStringFormat(true));
        
    }

    private void showWrongUserMessage() {
        
        String currentUserName;
        try{
            currentUserName= appM.getAllUserVO1().first().getAttribute("UserName").toString();
        }
        catch(Exception e){
            currentUserName ="No Current User ";
        }
        
        String message="Only creatior of this document can delete or update this document.  Current User : "
                       + currentUserName;
        Message.showMessage(message, "info");
        
        
    }

    public void setBblcShipAccepTab(RichPanelTabbed bblcShipAccepTab) {
        this.bblcShipAccepTab = bblcShipAccepTab;
    }

    public RichPanelTabbed getBblcShipAccepTab() {
        return bblcShipAccepTab;
    }

    public void setShipmentTab(RichShowDetailItem shipmentTab) {
        this.shipmentTab = shipmentTab;
    }

    public RichShowDetailItem getShipmentTab() {
        return shipmentTab;
    }

    public void backToCurrentShipmentRow(ActionEvent actionEvent) {
        // Add event code here...
        

  
        
    }

    public void ShipmentChargePopUpFetchListener(PopupFetchEvent popupFetchEvent) {
        // Add event code here...
        
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession)ectx.getSession(false);
        
        
//        userSession.setAttribute("P_HEADER_ID", getHeaderID().getValue());
//        userSession.setAttribute("P_DETAIL_ID", getBbLCDETAIL_ID().getValue());

        userSession.setAttribute("P_ORG_ID", getOrgId().getValue());
        

        
        appM.getShipmentNo_LOV1().executeQuery();

        
        
        
    }

    private void setAllBblcTotalValues() {
        
        
        ViewObject lineVo = appM.getBBLCLines1();
         Row[] lineVoRows;
        lineVo.setRangeSize(200);
         lineVoRows = lineVo.getAllRowsInRange();
         
          
      
        
        double totalPiValues ;
        
        
        for (Row lineRow :lineVoRows){
               
            totalPiValues =   getTotaiPiValuesForBblc(lineRow) ;
            lineRow.setAttribute("TotalBblcValue", totalPiValues);
        }
        
   
        
    }

    private double getTotaiPiValuesForBblc(Row lineRow) {
        ViewObject piVo = appM.getBBLCPiDetails1();
        piVo.setRangeSize(100);
        RowSet lineVoRs ;
        lineVoRs = (RowSet)lineRow.getAttribute("BBLCPiDetails");
        
        double totalPiValue =0.0; 
          double piValue = 0.0;
        while(lineVoRs.hasNext() ){
            Row row=lineVoRs.next();
            
           try {
                piValue =Double.parseDouble(row.getAttribute("PiValue").toString());
            } catch (Exception e) {
                piValue=0;
            }
          
            totalPiValue = totalPiValue+ piValue;
        }
        
        return totalPiValue;
    }

    public void calculateBblcPercentage(ActionEvent actionEvent) {
        // Add event code here...
        
        double totalContractVal , totalLcVal , bblcPercentage , bblcIncreaseamount;
        
        try{
            totalContractVal = Double.parseDouble(this.totalContractValue.getValue().toString());
            totalLcVal = Double.parseDouble(this.totalLcVal.getValue().toString());
            bblcPercentage = Double.parseDouble(this.bblcPercentageOfContract.getValue().toString());
            bblcIncreaseamount =    Double.parseDouble(this.bblcIncreaseAmount.getValue().toString());   
            
        }catch(Exception e){
            
            return ;
        }
            
        totalLcVal  = totalLcVal + bblcIncreaseamount ;
                       
          
        bblcPercentage = ( totalLcVal / totalContractVal) *100 ; 
        this.bblcPercentageOfContract.setValue( bblcPercentage);
        
        AdfFacesContext.getCurrentInstance().addPartialTarget(bblcPercentOfContrForm);

        
        
    }

    public void setTotalLcVal(RichOutputText totalLcVal) {
        this.totalLcVal = totalLcVal;
    }

    public RichOutputText getTotalLcVal() {
        return totalLcVal;
    }

    public void setBblcPercentageOfContract(RichOutputText bblcPercentageOfContract) {
        this.bblcPercentageOfContract = bblcPercentageOfContract;
    }

    public RichOutputText getBblcPercentageOfContract() {
        return bblcPercentageOfContract;
    }

    public void setBblcIncreaseAmount(RichInputText bblcIncreaseAmount) {
        this.bblcIncreaseAmount = bblcIncreaseAmount;
    }

    public RichInputText getBblcIncreaseAmount() {
        return bblcIncreaseAmount;
    }

    public void setBblcPercentOfContrForm(RichPanelFormLayout bblcPercentOfContrForm) {
        this.bblcPercentOfContrForm = bblcPercentOfContrForm;
    }

    public RichPanelFormLayout getBblcPercentOfContrForm() {
        return bblcPercentOfContrForm;
    }

    public void BblcPercentCalcPopUpFetchListener(PopupFetchEvent popupFetchEvent) {
        // Add event code here...
        this.bblcPercentageOfContract.setValue(appM.getBBLCHeader1().getCurrentRow().getAttribute("BblcPercentOfContract"));
        
        this.bblcIncreaseAmount.setValue(null);
//        
        
    }


    private boolean checkBblcNoDuplicacy(String  bblcnumber ,String bblcLineId) {
        
        
       String  statement , status ;
        int flag ;
       statement =  "BEGIN  IEDOC_DOC_NO_PKG.IMPORT_BBLC_NO_UC (:1,:2,:3); end;";
        CallableStatement cs = appM.getDBTransaction().createCallableStatement(statement, 1);
        try {
            cs.registerOutParameter(3, OracleTypes.VARCHAR);
            cs.setString(1, bblcnumber);
            cs.setString(2, bblcLineId);
            cs.execute();
            flag = cs.getInt(3);
         
            cs.close();

        } catch (Exception e) {
            
            flag=1;
            status = e.getMessage();
        }
        
        if(flag ==1){
            // if duplicate bblc no found
            return true;
        }
        
        return false;
    }

    public void invoiceNoValueChangeListener(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
            
        String newInvoiceNo = (String)valueChangeEvent.getNewValue();
      
        String message ;
        String invoiceId = appM.getBBLCDetails1().getCurrentRow().getAttribute("ImpBblcDetailId").toString();
        String supplierId = appM.getBBLCLines1().getCurrentRow().getAttribute("BeneficiaryId").toString();
        String orgId = appM.getBBLCHeader1().getCurrentRow().getAttribute("OrgId").toString();
        
         boolean duplicateInvoiceNo ; 
            duplicateInvoiceNo =  checkInvoiceNoDuplicacy(newInvoiceNo, invoiceId, supplierId, orgId );
            
            
            if(duplicateInvoiceNo){
                message = "Duplicate record found for INVOICE NO : " +newInvoiceNo+ "  \n   Enter a Unique INVOICE NO."  ;                
                
                Message.showMessage(message , "info");                    
                
        //                    appM.getBBLCLines1().getCurrentRow().setAttribute("BblcNo",null );
        //                    bblcNumber.setValue(null);
   
                appM.getBBLCDetails1().getCurrentRow().setAttribute("InvoiceNo",valueChangeEvent.getOldValue() );
                INVOICENUMBER.setValue(valueChangeEvent.getOldValue());
                
            //   bblcNumber.setRequired(true);
                
                AdfFacesContext.getCurrentInstance().addPartialTarget(INVOICENUMBER);
                
                
                
            }
             
      
        
    }

    private boolean checkInvoiceNoDuplicacy(String newInvoiceNo , String invoiceId , String supplierId, String orgId) {
        
         
        String  statement , status ;
         int flag ;
        statement =  "BEGIN  IEDOC_DOC_NO_PKG.IMPORT_INVOICE_NO_UC(:1, :2, :3, :4, :5); end;";
         CallableStatement cs = appM.getDBTransaction().createCallableStatement(statement, 1);
         try {
             cs.registerOutParameter(5, OracleTypes.VARCHAR);
             cs.setString(1, newInvoiceNo);
             cs.setString(2, invoiceId);
             cs.setString(3, supplierId);
             cs.setString(4, orgId);
             cs.execute();
             flag = cs.getInt(5);
          
             cs.close();

         } catch (Exception e) {
             
             flag=1;
            e.printStackTrace();
         }
         
         if(flag ==1){
             // if duplicate bblc no found
             return true;
         }
         
         return false;
      
        
    }

    private void showBblcAndItemMessage() {
        
        
        try {

            int val;
            String val1 = null, val2 = null;
            val = Integer.parseInt(getHeaderID().getValue().toString());

           
            val1 = GET_BBLC_INVOICE_ITEM_CNT(val);
            val2 = GET_BBLC_PI_CNT(val);


            FacesContext context = FacesContext.getCurrentInstance();

            if (!val1.equals("-")) {
                
                 
                String message1 = GET_BBLC_INVOICE_ITEM_CNT(val);
                
                String message2 = "<html><head>\n" + 
                "<style>\n" +
               
                "p {\n" +
                       "font-weight: 500;"  +
                "}\n" +
                "</style>\n" +
                "</head><body>\n" +
                " <p style=\"width : 600px ;\">  <b>"+  message1 + "</b></p>"  +
                "</body>\n" +
                "</html>";
                
                
                 FacesMessage message ;
                 message =    new FacesMessage(message2);
                context.addMessage(null, message);
             
                   
            }

            if (!val2.equals("-")) {
                
                
                FacesMessage message2 = new FacesMessage(GET_BBLC_PI_CNT(val));
                context.addMessage(null, message2);
            }
            
        } catch (Exception e) { ; }
        
        
       
        
    }

    public void freightFlagValueChangeListener(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        
        ViewObject bblcDetailsVo = appM.getBBLCDetails1();
        Row detailsRow = bblcDetailsVo.getCurrentRow();
        
        double freightCost, otherCharge ,  totalImportValue = 0.0;
        try{
            freightCost = Double.parseDouble(detailsRow.getAttribute("FreightCost").toString());
        }
        catch(Exception e){
           freightCost =0.0 ;
        }
        
        try {
            otherCharge =Double.parseDouble( detailsRow.getAttribute("OtherCharge").toString());
        } catch (Exception e) {
            // TODO: Add catch code
            otherCharge=0.0;
        }
        
         String  vYesNo;
         vYesNo =   valueChangeEvent.getNewValue().toString();
         
         if(vYesNo.equals("0")){  vYesNo="Yes" ;}
         else if(vYesNo.equals("1")) {   vYesNo="No" ;}                 
        
             
        totalImportValue= calculateImportValue(vYesNo, freightCost ,otherCharge, bblcDetailsVo);
        detailsRow.setAttribute("ImportValue", totalImportValue);
        AdfFacesContext.getCurrentInstance().addPartialTarget(shipmentImportValue); 
         
         
        
    }

    private double calculateImportValue(String vYesNo, double freightCost,   double otherCharge, ViewObject bblcDetailsVo ) {
        
        Row detailsRow = bblcDetailsVo.getCurrentRow();
        double totalImportValue=0.0;
      
        String incoTerm = (String)detailsRow.getAttribute("BblcLineIncoTerm");
        
//        if (vYesNo.equals("Yes") ) {
//
//            try {                
//                if(freightCost==0){
//                    //return if freight cost == 0
//                    detailsRow.setAttribute("ImportValue",detailsRow.getAttribute("ItemsValue") );
//                    AdfFacesContext.getCurrentInstance().addPartialTarget(shipmentImportValue);
//                    return;
//                }   
//            } catch (Exception e) {  return;  }
//         } else {         
//            
//            // return if freight cost flag == No
//             detailsRow.setAttribute("ImportValue",detailsRow.getAttribute("ItemsValue") );
//             AdfFacesContext.getCurrentInstance().addPartialTarget(shipmentImportValue);
//             return;        
//        }
         
        String noItemFlag = (String)bblcDetailsVo.getCurrentRow().getAttribute("Attribute20");  
         
           
        if(noItemFlag != null &&  noItemFlag.equals("NoItem")){
            // if invoice added with 'Add Local Invoice' button      
           totalImportValue = Double.parseDouble(bblcDetailsVo.getCurrentRow().getAttribute("ItemsValue").toString()) ;  
      }
        else{
            totalImportValue = calculateTotalImportValue(bblcDetailsVo) ;
        }
          
        if (  (incoTerm.equals("CFR") || incoTerm.equals("CPT") ) && vYesNo.equals("Yes") ){
            // freight cost will be added with importValue only for incoTerm  is CFR and CPT
            //freight cost will not  be added with importValue if  incoTerm is EXW, FOB, FCA
            totalImportValue += freightCost ;                
       }
         
        //other charge will be added with import charge for any value of inco term       
        totalImportValue += otherCharge;
                       
       return  totalImportValue;
        
         
    }

    public void setFreightCostBind(RichInputText freightCostBind) {
        this.freightCostBind = freightCostBind;
    }

    public RichInputText getFreightCostBind() {
        return freightCostBind;
    }

    public void otherChargeValueChangeListener(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        
        
        ViewObject bblcDetailsVo = appM.getBBLCDetails1();
        Row detailsRow = bblcDetailsVo.getCurrentRow();
        String  vYesNo;
        double otherCharge=0.0, freightCost=0.0 , totalImportValue = 0.0;
        try{
            freightCost = Double.parseDouble( detailsRow.getAttribute("FreightCost").toString());
        }
        catch(Exception e){
                        
            freightCost=0.0;                        
        }
        try {
            otherCharge =Double.parseDouble( valueChangeEvent.getNewValue().toString());
        } catch (Exception e) {
            // TODO: Add catch code
            otherCharge=0.0;
        }
        
        try {
            vYesNo = detailsRow.getAttribute("FreightCostFlag").toString();  
        } catch (Exception e) {
            vYesNo="No";
        }
        
        System.out.println("Freight Flag : "+ vYesNo+ ", FreightCost : "+freightCost+", OtherCharge : "+ otherCharge );
        
       
        totalImportValue= calculateImportValue(vYesNo, freightCost ,otherCharge, bblcDetailsVo);
        detailsRow.setAttribute("ImportValue", totalImportValue);
        AdfFacesContext.getCurrentInstance().addPartialTarget(shipmentImportValue);
        
        
    }

    private String getFileUploadPage() throws UnknownHostException {
        String part1 = "http://";
      String  part2 = ":7003/FileUploading-ViewController-context-root/faces/view1";
        String ip = getServerIp();
        
        String page = part1+ip+part2;
        
        return page;
        
        
         
    }
    
    private String getServerIp() throws UnknownHostException {
         InetAddress localhost = InetAddress.getLocalHost(); 
         String ip;
         ip =  (localhost.getHostAddress()).trim();
         return ip;
     }

  

    public void closeLc(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        //lc is always active by default. So value changed means lc status set to closed 
        
        
        
        
    }
    
    
    
    public Object resolveExpression(String el) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ELContext elContext = facesContext.getELContext();
        ExpressionFactory expressionFactory =
            facesContext.getApplication().getExpressionFactory();
        ValueExpression valueExp =
            expressionFactory.createValueExpression(elContext, el,
                                                    Object.class);
        return valueExp.getValue(elContext);
    }

    public void setValueToEL(String el, Object val) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ELContext elContext = facesContext.getELContext();
        ExpressionFactory expressionFactory =
            facesContext.getApplication().getExpressionFactory();
        ValueExpression exp =
            expressionFactory.createValueExpression(elContext, el,
                                                    Object.class);
        exp.setValue(elContext, val);
    }

    
    
    
    
    
    
    
}
