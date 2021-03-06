package mnj.ont.model.service.common;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Nov 28 13:29:24 BDT 2015
// ---------------------------------------------------------------------
public interface MainAM extends ApplicationModule {
    void populatePiLines1(String OrgId);

    void populatePiLines(Row poprow);

    String getPopulateValue(Row r, String columnName);

    String getOrgId();

    Row createPiLines();

    void callPiFetch();

    void populateContractLines1(String OrgId);

    void populateContractLines(Row poprow);

    Row createContractLines();

    void callContractFetch();

    void populateCountryLines1();

    void populateCountryLines(Row poprow);

    Row createCountryLines();

    void callCountryFetch();

    void populateItemLines1(String OrgId);

    void populateItemLines(Row poprow);

    String getHeaderId();

    Row createItemLines();

    void callItemFetch();

    String copy(String headerId);

    void selectAllLines(String flag);

    void HeaderFormulaCalculation(String HeaderId);

    String version();

    int invoicenovalidation(String invoiceno);

    int billrefnovalidation(String billrefno);

    int billofentrynovalidation(String billofentryno);

    int bblcvalidation(String bblcnumber);

    void setSessionValues(String orgId, String userId, String respId,
                          String respAppl);

    String copybblc(String headerId);

    void BBLCHeaderDynamWhere(String a, String b, String c, String d);

    void ExecuteBBLCLines();

    void UploadFabrincRoll(String InvoiceNo, String ContractNo);

    void MnjDetItemsPopulate(String ShipmentNo, int DetailLine_Id);


    String GetBBLCInvoiceItemCount(int Header_Id);

    String GetBBLCPiCount(int Header_Id);

    void CopyLine_ChargeInterface(int Interface_Id);

    void GenerateCharge_Lines(int Header_Id, int Detail_Id, int User_Id);

    void ProcessLines();

    void executeQuery_ShipmentChrg();

    String CopyBBLCLinesAM();

    String callBBLCReport();

    void selectAllLinesNew(String flag);

    void callItemWithGRNFetch();

    void setFileData(String name, String fileSize, String path,
                     String contTyp);
}
