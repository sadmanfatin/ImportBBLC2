package mnj.ont.model.views;

import mnj.ont.model.entities.BBLCAcceptanceEOImpl;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Mar 19 12:02:18 BDT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class BBLCAcceptanceVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        ImpBblcAcceptanceId {
            public Object get(BBLCAcceptanceVORowImpl obj) {
                return obj.getImpBblcAcceptanceId();
            }

            public void put(BBLCAcceptanceVORowImpl obj, Object value) {
                obj.setImpBblcAcceptanceId((Number)value);
            }
        }
        ,
        ImpBblcLineId {
            public Object get(BBLCAcceptanceVORowImpl obj) {
                return obj.getImpBblcLineId();
            }

            public void put(BBLCAcceptanceVORowImpl obj, Object value) {
                obj.setImpBblcLineId((Number)value);
            }
        }
        ,
        BillReferenceNo {
            public Object get(BBLCAcceptanceVORowImpl obj) {
                return obj.getBillReferenceNo();
            }

            public void put(BBLCAcceptanceVORowImpl obj, Object value) {
                obj.setBillReferenceNo((String)value);
            }
        }
        ,
        BillReferenceDate {
            public Object get(BBLCAcceptanceVORowImpl obj) {
                return obj.getBillReferenceDate();
            }

            public void put(BBLCAcceptanceVORowImpl obj, Object value) {
                obj.setBillReferenceDate((Date)value);
            }
        }
        ,
        BillValue {
            public Object get(BBLCAcceptanceVORowImpl obj) {
                return obj.getBillValue();
            }

            public void put(BBLCAcceptanceVORowImpl obj, Object value) {
                obj.setBillValue((Number)value);
            }
        }
        ,
        AcceptanceDate {
            public Object get(BBLCAcceptanceVORowImpl obj) {
                return obj.getAcceptanceDate();
            }

            public void put(BBLCAcceptanceVORowImpl obj, Object value) {
                obj.setAcceptanceDate((Date)value);
            }
        }
        ,
        MaturityDate {
            public Object get(BBLCAcceptanceVORowImpl obj) {
                return obj.getMaturityDate();
            }

            public void put(BBLCAcceptanceVORowImpl obj, Object value) {
                obj.setMaturityDate((Date)value);
            }
        }
        ,
        BillEntryNo {
            public Object get(BBLCAcceptanceVORowImpl obj) {
                return obj.getBillEntryNo();
            }

            public void put(BBLCAcceptanceVORowImpl obj, Object value) {
                obj.setBillEntryNo((String)value);
            }
        }
        ,
        BillEntryDate {
            public Object get(BBLCAcceptanceVORowImpl obj) {
                return obj.getBillEntryDate();
            }

            public void put(BBLCAcceptanceVORowImpl obj, Object value) {
                obj.setBillEntryDate((Date)value);
            }
        }
        ,
        BillSubmitBank {
            public Object get(BBLCAcceptanceVORowImpl obj) {
                return obj.getBillSubmitBank();
            }

            public void put(BBLCAcceptanceVORowImpl obj, Object value) {
                obj.setBillSubmitBank((Date)value);
            }
        }
        ,
        CreationDate {
            public Object get(BBLCAcceptanceVORowImpl obj) {
                return obj.getCreationDate();
            }

            public void put(BBLCAcceptanceVORowImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        CreatedBy {
            public Object get(BBLCAcceptanceVORowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(BBLCAcceptanceVORowImpl obj, Object value) {
                obj.setCreatedBy((Number)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(BBLCAcceptanceVORowImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(BBLCAcceptanceVORowImpl obj, Object value) {
                obj.setLastUpdatedBy((Number)value);
            }
        }
        ,
        LastUpdateDate {
            public Object get(BBLCAcceptanceVORowImpl obj) {
                return obj.getLastUpdateDate();
            }

            public void put(BBLCAcceptanceVORowImpl obj, Object value) {
                obj.setLastUpdateDate((Date)value);
            }
        }
        ,
        Currency {
            public Object get(BBLCAcceptanceVORowImpl obj) {
                return obj.getCurrency();
            }

            public void put(BBLCAcceptanceVORowImpl obj, Object value) {
                obj.setCurrency((String)value);
            }
        }
        ,
        NotificationSent {
            public Object get(BBLCAcceptanceVORowImpl obj) {
                return obj.getNotificationSent();
            }

            public void put(BBLCAcceptanceVORowImpl obj, Object value) {
                obj.setNotificationSent((Date)value);
            }
        }
        ,
        NotificationCount {
            public Object get(BBLCAcceptanceVORowImpl obj) {
                return obj.getNotificationCount();
            }

            public void put(BBLCAcceptanceVORowImpl obj, Object value) {
                obj.setNotificationCount((Number)value);
            }
        }
        ,
        PaymentAmount {
            public Object get(BBLCAcceptanceVORowImpl obj) {
                return obj.getPaymentAmount();
            }

            public void put(BBLCAcceptanceVORowImpl obj, Object value) {
                obj.setPaymentAmount((Number)value);
            }
        }
        ,
        PaymentNo {
            public Object get(BBLCAcceptanceVORowImpl obj) {
                return obj.getPaymentNo();
            }

            public void put(BBLCAcceptanceVORowImpl obj, Object value) {
                obj.setPaymentNo((String)value);
            }
        }
        ,
        BBLC_Acceptance_inv_det_ {
            public Object get(BBLCAcceptanceVORowImpl obj) {
                return obj.getBBLC_Acceptance_inv_det_();
            }

            public void put(BBLCAcceptanceVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        BBLCLinesVO1 {
            public Object get(BBLCAcceptanceVORowImpl obj) {
                return obj.getBBLCLinesVO1();
            }

            public void put(BBLCAcceptanceVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(BBLCAcceptanceVORowImpl object);

        public abstract void put(BBLCAcceptanceVORowImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int IMPBBLCACCEPTANCEID = AttributesEnum.ImpBblcAcceptanceId.index();
    public static final int IMPBBLCLINEID = AttributesEnum.ImpBblcLineId.index();
    public static final int BILLREFERENCENO = AttributesEnum.BillReferenceNo.index();
    public static final int BILLREFERENCEDATE = AttributesEnum.BillReferenceDate.index();
    public static final int BILLVALUE = AttributesEnum.BillValue.index();
    public static final int ACCEPTANCEDATE = AttributesEnum.AcceptanceDate.index();
    public static final int MATURITYDATE = AttributesEnum.MaturityDate.index();
    public static final int BILLENTRYNO = AttributesEnum.BillEntryNo.index();
    public static final int BILLENTRYDATE = AttributesEnum.BillEntryDate.index();
    public static final int BILLSUBMITBANK = AttributesEnum.BillSubmitBank.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int CURRENCY = AttributesEnum.Currency.index();
    public static final int NOTIFICATIONSENT = AttributesEnum.NotificationSent.index();
    public static final int NOTIFICATIONCOUNT = AttributesEnum.NotificationCount.index();
    public static final int PAYMENTAMOUNT = AttributesEnum.PaymentAmount.index();
    public static final int PAYMENTNO = AttributesEnum.PaymentNo.index();
    public static final int BBLC_ACCEPTANCE_INV_DET_ = AttributesEnum.BBLC_Acceptance_inv_det_.index();
    public static final int BBLCLINESVO1 = AttributesEnum.BBLCLinesVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public BBLCAcceptanceVORowImpl() {
    }

    /**
     * Gets BBLCAcceptanceEO entity object.
     * @return the BBLCAcceptanceEO
     */
    public BBLCAcceptanceEOImpl getBBLCAcceptanceEO() {
        return (BBLCAcceptanceEOImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for IMP_BBLC_ACCEPTANCE_ID using the alias name ImpBblcAcceptanceId.
     * @return the IMP_BBLC_ACCEPTANCE_ID
     */
    public Number getImpBblcAcceptanceId() {
        return (Number) getAttributeInternal(IMPBBLCACCEPTANCEID);
    }

    /**
     * Sets <code>value</code> as attribute value for IMP_BBLC_ACCEPTANCE_ID using the alias name ImpBblcAcceptanceId.
     * @param value value to set the IMP_BBLC_ACCEPTANCE_ID
     */
    public void setImpBblcAcceptanceId(Number value) {
        setAttributeInternal(IMPBBLCACCEPTANCEID, value);
    }

    /**
     * Gets the attribute value for IMP_BBLC_LINE_ID using the alias name ImpBblcLineId.
     * @return the IMP_BBLC_LINE_ID
     */
    public Number getImpBblcLineId() {
        return (Number) getAttributeInternal(IMPBBLCLINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for IMP_BBLC_LINE_ID using the alias name ImpBblcLineId.
     * @param value value to set the IMP_BBLC_LINE_ID
     */
    public void setImpBblcLineId(Number value) {
        setAttributeInternal(IMPBBLCLINEID, value);
    }

    /**
     * Gets the attribute value for BILL_REFERENCE_NO using the alias name BillReferenceNo.
     * @return the BILL_REFERENCE_NO
     */
    public String getBillReferenceNo() {
        return (String) getAttributeInternal(BILLREFERENCENO);
    }

    /**
     * Sets <code>value</code> as attribute value for BILL_REFERENCE_NO using the alias name BillReferenceNo.
     * @param value value to set the BILL_REFERENCE_NO
     */
    public void setBillReferenceNo(String value) {
        setAttributeInternal(BILLREFERENCENO, value);
    }

    /**
     * Gets the attribute value for BILL_REFERENCE_DATE using the alias name BillReferenceDate.
     * @return the BILL_REFERENCE_DATE
     */
    public Date getBillReferenceDate() {
        return (Date) getAttributeInternal(BILLREFERENCEDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for BILL_REFERENCE_DATE using the alias name BillReferenceDate.
     * @param value value to set the BILL_REFERENCE_DATE
     */
    public void setBillReferenceDate(Date value) {
        setAttributeInternal(BILLREFERENCEDATE, value);
    }

    /**
     * Gets the attribute value for BILL_VALUE using the alias name BillValue.
     * @return the BILL_VALUE
     */
    public Number getBillValue() {
        return (Number) getAttributeInternal(BILLVALUE);
    }

    /**
     * Sets <code>value</code> as attribute value for BILL_VALUE using the alias name BillValue.
     * @param value value to set the BILL_VALUE
     */
    public void setBillValue(Number value) {
        setAttributeInternal(BILLVALUE, value);
    }

    /**
     * Gets the attribute value for ACCEPTANCE_DATE using the alias name AcceptanceDate.
     * @return the ACCEPTANCE_DATE
     */
    public Date getAcceptanceDate() {
        return (Date) getAttributeInternal(ACCEPTANCEDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for ACCEPTANCE_DATE using the alias name AcceptanceDate.
     * @param value value to set the ACCEPTANCE_DATE
     */
    public void setAcceptanceDate(Date value) {
        setAttributeInternal(ACCEPTANCEDATE, value);
    }

    /**
     * Gets the attribute value for MATURITY_DATE using the alias name MaturityDate.
     * @return the MATURITY_DATE
     */
    public Date getMaturityDate() {
        return (Date) getAttributeInternal(MATURITYDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for MATURITY_DATE using the alias name MaturityDate.
     * @param value value to set the MATURITY_DATE
     */
    public void setMaturityDate(Date value) {
        setAttributeInternal(MATURITYDATE, value);
    }

    /**
     * Gets the attribute value for BILL_ENTRY_NO using the alias name BillEntryNo.
     * @return the BILL_ENTRY_NO
     */
    public String getBillEntryNo() {
        return (String) getAttributeInternal(BILLENTRYNO);
    }

    /**
     * Sets <code>value</code> as attribute value for BILL_ENTRY_NO using the alias name BillEntryNo.
     * @param value value to set the BILL_ENTRY_NO
     */
    public void setBillEntryNo(String value) {
        setAttributeInternal(BILLENTRYNO, value);
    }

    /**
     * Gets the attribute value for BILL_ENTRY_DATE using the alias name BillEntryDate.
     * @return the BILL_ENTRY_DATE
     */
    public Date getBillEntryDate() {
        return (Date) getAttributeInternal(BILLENTRYDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for BILL_ENTRY_DATE using the alias name BillEntryDate.
     * @param value value to set the BILL_ENTRY_DATE
     */
    public void setBillEntryDate(Date value) {
        setAttributeInternal(BILLENTRYDATE, value);
    }

    /**
     * Gets the attribute value for BILL_SUBMIT_BANK using the alias name BillSubmitBank.
     * @return the BILL_SUBMIT_BANK
     */
    public Date getBillSubmitBank() {
        return (Date) getAttributeInternal(BILLSUBMITBANK);
    }

    /**
     * Sets <code>value</code> as attribute value for BILL_SUBMIT_BANK using the alias name BillSubmitBank.
     * @param value value to set the BILL_SUBMIT_BANK
     */
    public void setBillSubmitBank(Date value) {
        setAttributeInternal(BILLSUBMITBANK, value);
    }

    /**
     * Gets the attribute value for CREATION_DATE using the alias name CreationDate.
     * @return the CREATION_DATE
     */
    public Date getCreationDate() {
        return (Date) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATION_DATE using the alias name CreationDate.
     * @param value value to set the CREATION_DATE
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public Number getCreatedBy() {
        return (Number) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy.
     * @param value value to set the CREATED_BY
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @return the LAST_UPDATED_BY
     */
    public Number getLastUpdatedBy() {
        return (Number) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @param value value to set the LAST_UPDATED_BY
     */
    public void setLastUpdatedBy(Number value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @return the LAST_UPDATE_DATE
     */
    public Date getLastUpdateDate() {
        return (Date) getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @param value value to set the LAST_UPDATE_DATE
     */
    public void setLastUpdateDate(Date value) {
        setAttributeInternal(LASTUPDATEDATE, value);
    }

    /**
     * Gets the attribute value for CURRENCY using the alias name Currency.
     * @return the CURRENCY
     */
    public String getCurrency() {
      
        
       return (String) getAttributeInternal(CURRENCY);
    }

    /**
     * Sets <code>value</code> as attribute value for CURRENCY using the alias name Currency.
     * @param value value to set the CURRENCY
     */
    public void setCurrency(String value) {
    
        setAttributeInternal(CURRENCY, value);
    }

    /**
     * Gets the attribute value for NOTIFICATION_SENT using the alias name NotificationSent.
     * @return the NOTIFICATION_SENT
     */
    public Date getNotificationSent() {
        return (Date) getAttributeInternal(NOTIFICATIONSENT);
    }

    /**
     * Sets <code>value</code> as attribute value for NOTIFICATION_SENT using the alias name NotificationSent.
     * @param value value to set the NOTIFICATION_SENT
     */
    public void setNotificationSent(Date value) {
        setAttributeInternal(NOTIFICATIONSENT, value);
    }

    /**
     * Gets the attribute value for NOTIFICATION_COUNT using the alias name NotificationCount.
     * @return the NOTIFICATION_COUNT
     */
    public Number getNotificationCount() {
        return (Number) getAttributeInternal(NOTIFICATIONCOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for NOTIFICATION_COUNT using the alias name NotificationCount.
     * @param value value to set the NOTIFICATION_COUNT
     */
    public void setNotificationCount(Number value) {
        setAttributeInternal(NOTIFICATIONCOUNT, value);
    }

    /**
     * Gets the attribute value for PAYMENT_AMOUNT using the alias name PaymentAmount.
     * @return the PAYMENT_AMOUNT
     */
    public Number getPaymentAmount() {
        return (Number) getAttributeInternal(PAYMENTAMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for PAYMENT_AMOUNT using the alias name PaymentAmount.
     * @param value value to set the PAYMENT_AMOUNT
     */
    public void setPaymentAmount(Number value) {
        setAttributeInternal(PAYMENTAMOUNT, value);
    }

    /**
     * Gets the attribute value for PAYMENT_NO using the alias name PaymentNo.
     * @return the PAYMENT_NO
     */
    public String getPaymentNo() {
        return (String) getAttributeInternal(PAYMENTNO);
    }

    /**
     * Sets <code>value</code> as attribute value for PAYMENT_NO using the alias name PaymentNo.
     * @param value value to set the PAYMENT_NO
     */
    public void setPaymentNo(String value) {
        setAttributeInternal(PAYMENTNO, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link BBLC_Acceptance_inv_det_.
     */
    public RowIterator getBBLC_Acceptance_inv_det_() {
        return (RowIterator)getAttributeInternal(BBLC_ACCEPTANCE_INV_DET_);
    }


    /**
     * Gets the view accessor <code>RowSet</code> BBLCLinesVO1.
     */
    public RowSet getBBLCLinesVO1() {
        return (RowSet)getAttributeInternal(BBLCLINESVO1);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}