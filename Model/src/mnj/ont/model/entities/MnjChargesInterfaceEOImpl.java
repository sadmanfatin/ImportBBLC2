package mnj.ont.model.entities;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jun 08 11:55:40 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MnjChargesInterfaceEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        InterfaceId {
            public Object get(MnjChargesInterfaceEOImpl obj) {
                return obj.getInterfaceId();
            }

            public void put(MnjChargesInterfaceEOImpl obj, Object value) {
                obj.setInterfaceId((Number)value);
            }
        }
        ,
        ShipmentHeaderId {
            public Object get(MnjChargesInterfaceEOImpl obj) {
                return obj.getShipmentHeaderId();
            }

            public void put(MnjChargesInterfaceEOImpl obj, Object value) {
                obj.setShipmentHeaderId((Number)value);
            }
        }
        ,
        ShipmentLineId {
            public Object get(MnjChargesInterfaceEOImpl obj) {
                return obj.getShipmentLineId();
            }

            public void put(MnjChargesInterfaceEOImpl obj, Object value) {
                obj.setShipmentLineId((Number)value);
            }
        }
        ,
        ToParentTable {
            public Object get(MnjChargesInterfaceEOImpl obj) {
                return obj.getToParentTable();
            }

            public void put(MnjChargesInterfaceEOImpl obj, Object value) {
                obj.setToParentTable((String)value);
            }
        }
        ,
        ChargeTypeId {
            public Object get(MnjChargesInterfaceEOImpl obj) {
                return obj.getChargeTypeId();
            }

            public void put(MnjChargesInterfaceEOImpl obj, Object value) {
                obj.setChargeTypeId((Number)value);
            }
        }
        ,
        ChargeAmount {
            public Object get(MnjChargesInterfaceEOImpl obj) {
                return obj.getChargeAmount();
            }

            public void put(MnjChargesInterfaceEOImpl obj, Object value) {
                obj.setChargeAmount((Number)value);
            }
        }
        ,
        CurrencyCode {
            public Object get(MnjChargesInterfaceEOImpl obj) {
                return obj.getCurrencyCode();
            }

            public void put(MnjChargesInterfaceEOImpl obj, Object value) {
                obj.setCurrencyCode((String)value);
            }
        }
        ,
        ActionFlag {
            public Object get(MnjChargesInterfaceEOImpl obj) {
                return obj.getActionFlag();
            }

            public void put(MnjChargesInterfaceEOImpl obj, Object value) {
                obj.setActionFlag((String)value);
            }
        }
        ,
        LandedCostFlag {
            public Object get(MnjChargesInterfaceEOImpl obj) {
                return obj.getLandedCostFlag();
            }

            public void put(MnjChargesInterfaceEOImpl obj, Object value) {
                obj.setLandedCostFlag((String)value);
            }
        }
        ,
        EventType {
            public Object get(MnjChargesInterfaceEOImpl obj) {
                return obj.getEventType();
            }

            public void put(MnjChargesInterfaceEOImpl obj, Object value) {
                obj.setEventType((String)value);
            }
        }
        ,
        ApplyChargesFlag {
            public Object get(MnjChargesInterfaceEOImpl obj) {
                return obj.getApplyChargesFlag();
            }

            public void put(MnjChargesInterfaceEOImpl obj, Object value) {
                obj.setApplyChargesFlag((String)value);
            }
        }
        ,
        FirstShipmentFlag {
            public Object get(MnjChargesInterfaceEOImpl obj) {
                return obj.getFirstShipmentFlag();
            }

            public void put(MnjChargesInterfaceEOImpl obj, Object value) {
                obj.setFirstShipmentFlag((String)value);
            }
        }
        ,
        RequestId {
            public Object get(MnjChargesInterfaceEOImpl obj) {
                return obj.getRequestId();
            }

            public void put(MnjChargesInterfaceEOImpl obj, Object value) {
                obj.setRequestId((Number)value);
            }
        }
        ,
        UserId {
            public Object get(MnjChargesInterfaceEOImpl obj) {
                return obj.getUserId();
            }

            public void put(MnjChargesInterfaceEOImpl obj, Object value) {
                obj.setUserId((Number)value);
            }
        }
        ,
        RespId {
            public Object get(MnjChargesInterfaceEOImpl obj) {
                return obj.getRespId();
            }

            public void put(MnjChargesInterfaceEOImpl obj, Object value) {
                obj.setRespId((Number)value);
            }
        }
        ,
        RespApplId {
            public Object get(MnjChargesInterfaceEOImpl obj) {
                return obj.getRespApplId();
            }

            public void put(MnjChargesInterfaceEOImpl obj, Object value) {
                obj.setRespApplId((Number)value);
            }
        }
        ,
        ProcessFlag {
            public Object get(MnjChargesInterfaceEOImpl obj) {
                return obj.getProcessFlag();
            }

            public void put(MnjChargesInterfaceEOImpl obj, Object value) {
                obj.setProcessFlag((String)value);
            }
        }
        ,
        UploadStatus {
            public Object get(MnjChargesInterfaceEOImpl obj) {
                return obj.getUploadStatus();
            }

            public void put(MnjChargesInterfaceEOImpl obj, Object value) {
                obj.setUploadStatus((String)value);
            }
        }
        ,
        ErrorDescription {
            public Object get(MnjChargesInterfaceEOImpl obj) {
                return obj.getErrorDescription();
            }

            public void put(MnjChargesInterfaceEOImpl obj, Object value) {
                obj.setErrorDescription((String)value);
            }
        }
        ,
        CreationDate {
            public Object get(MnjChargesInterfaceEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(MnjChargesInterfaceEOImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        InterfaceFlag {
            public Object get(MnjChargesInterfaceEOImpl obj) {
                return obj.getInterfaceFlag();
            }

            public void put(MnjChargesInterfaceEOImpl obj, Object value) {
                obj.setInterfaceFlag((String)value);
            }
        }
        ,
        InterfaceDescription {
            public Object get(MnjChargesInterfaceEOImpl obj) {
                return obj.getInterfaceDescription();
            }

            public void put(MnjChargesInterfaceEOImpl obj, Object value) {
                obj.setInterfaceDescription((String)value);
            }
        }
        ,
        ChargeName {
            public Object get(MnjChargesInterfaceEOImpl obj) {
                return obj.getChargeName();
            }

            public void put(MnjChargesInterfaceEOImpl obj, Object value) {
                obj.setChargeName((String)value);
            }
        }
        ,
        PlanType {
            public Object get(MnjChargesInterfaceEOImpl obj) {
                return obj.getPlanType();
            }

            public void put(MnjChargesInterfaceEOImpl obj, Object value) {
                obj.setPlanType((String)value);
            }
        }
        ,
        MajorChargeName {
            public Object get(MnjChargesInterfaceEOImpl obj) {
                return obj.getMajorChargeName();
            }

            public void put(MnjChargesInterfaceEOImpl obj, Object value) {
                obj.setMajorChargeName((String)value);
            }
        }
        ,
        BBLCShipmentCharges {
            public Object get(MnjChargesInterfaceEOImpl obj) {
                return obj.getBBLCShipmentCharges();
            }

            public void put(MnjChargesInterfaceEOImpl obj, Object value) {
                obj.setBBLCShipmentCharges((BBLCShipmentChargesEOImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(MnjChargesInterfaceEOImpl object);

        public abstract void put(MnjChargesInterfaceEOImpl object,
                                 Object value);

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


    public static final int INTERFACEID = AttributesEnum.InterfaceId.index();
    public static final int SHIPMENTHEADERID = AttributesEnum.ShipmentHeaderId.index();
    public static final int SHIPMENTLINEID = AttributesEnum.ShipmentLineId.index();
    public static final int TOPARENTTABLE = AttributesEnum.ToParentTable.index();
    public static final int CHARGETYPEID = AttributesEnum.ChargeTypeId.index();
    public static final int CHARGEAMOUNT = AttributesEnum.ChargeAmount.index();
    public static final int CURRENCYCODE = AttributesEnum.CurrencyCode.index();
    public static final int ACTIONFLAG = AttributesEnum.ActionFlag.index();
    public static final int LANDEDCOSTFLAG = AttributesEnum.LandedCostFlag.index();
    public static final int EVENTTYPE = AttributesEnum.EventType.index();
    public static final int APPLYCHARGESFLAG = AttributesEnum.ApplyChargesFlag.index();
    public static final int FIRSTSHIPMENTFLAG = AttributesEnum.FirstShipmentFlag.index();
    public static final int REQUESTID = AttributesEnum.RequestId.index();
    public static final int USERID = AttributesEnum.UserId.index();
    public static final int RESPID = AttributesEnum.RespId.index();
    public static final int RESPAPPLID = AttributesEnum.RespApplId.index();
    public static final int PROCESSFLAG = AttributesEnum.ProcessFlag.index();
    public static final int UPLOADSTATUS = AttributesEnum.UploadStatus.index();
    public static final int ERRORDESCRIPTION = AttributesEnum.ErrorDescription.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int INTERFACEFLAG = AttributesEnum.InterfaceFlag.index();
    public static final int INTERFACEDESCRIPTION = AttributesEnum.InterfaceDescription.index();
    public static final int CHARGENAME = AttributesEnum.ChargeName.index();
    public static final int PLANTYPE = AttributesEnum.PlanType.index();
    public static final int MAJORCHARGENAME = AttributesEnum.MajorChargeName.index();
    public static final int BBLCSHIPMENTCHARGES = AttributesEnum.BBLCShipmentCharges.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MnjChargesInterfaceEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("mnj.ont.model.entities.MnjChargesInterfaceEO");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for InterfaceId, using the alias name InterfaceId.
     * @return the InterfaceId
     */
    public Number getInterfaceId() {
        return (Number)getAttributeInternal(INTERFACEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for InterfaceId.
     * @param value value to set the InterfaceId
     */
    public void setInterfaceId(Number value) {
        setAttributeInternal(INTERFACEID, value);
    }

    /**
     * Gets the attribute value for ShipmentHeaderId, using the alias name ShipmentHeaderId.
     * @return the ShipmentHeaderId
     */
    public Number getShipmentHeaderId() {
        return (Number)getAttributeInternal(SHIPMENTHEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ShipmentHeaderId.
     * @param value value to set the ShipmentHeaderId
     */
    public void setShipmentHeaderId(Number value) {
        setAttributeInternal(SHIPMENTHEADERID, value);
    }

    /**
     * Gets the attribute value for ShipmentLineId, using the alias name ShipmentLineId.
     * @return the ShipmentLineId
     */
    public Number getShipmentLineId() {
        return (Number)getAttributeInternal(SHIPMENTLINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ShipmentLineId.
     * @param value value to set the ShipmentLineId
     */
    public void setShipmentLineId(Number value) {
        setAttributeInternal(SHIPMENTLINEID, value);
    }

    /**
     * Gets the attribute value for ToParentTable, using the alias name ToParentTable.
     * @return the ToParentTable
     */
    public String getToParentTable() {
        return (String)getAttributeInternal(TOPARENTTABLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ToParentTable.
     * @param value value to set the ToParentTable
     */
    public void setToParentTable(String value) {
        setAttributeInternal(TOPARENTTABLE, value);
    }

    /**
     * Gets the attribute value for ChargeTypeId, using the alias name ChargeTypeId.
     * @return the ChargeTypeId
     */
    public Number getChargeTypeId() {
        return (Number)getAttributeInternal(CHARGETYPEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChargeTypeId.
     * @param value value to set the ChargeTypeId
     */
    public void setChargeTypeId(Number value) {
        setAttributeInternal(CHARGETYPEID, value);
    }

    /**
     * Gets the attribute value for ChargeAmount, using the alias name ChargeAmount.
     * @return the ChargeAmount
     */
    public Number getChargeAmount() {
        return (Number)getAttributeInternal(CHARGEAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChargeAmount.
     * @param value value to set the ChargeAmount
     */
    public void setChargeAmount(Number value) {
        setAttributeInternal(CHARGEAMOUNT, value);
    }

    /**
     * Gets the attribute value for CurrencyCode, using the alias name CurrencyCode.
     * @return the CurrencyCode
     */
    public String getCurrencyCode() {
        return (String)getAttributeInternal(CURRENCYCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CurrencyCode.
     * @param value value to set the CurrencyCode
     */
    public void setCurrencyCode(String value) {
        setAttributeInternal(CURRENCYCODE, value);
    }

    /**
     * Gets the attribute value for ActionFlag, using the alias name ActionFlag.
     * @return the ActionFlag
     */
    public String getActionFlag() {
        return (String)getAttributeInternal(ACTIONFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for ActionFlag.
     * @param value value to set the ActionFlag
     */
    public void setActionFlag(String value) {
        setAttributeInternal(ACTIONFLAG, value);
    }

    /**
     * Gets the attribute value for LandedCostFlag, using the alias name LandedCostFlag.
     * @return the LandedCostFlag
     */
    public String getLandedCostFlag() {
        return (String)getAttributeInternal(LANDEDCOSTFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for LandedCostFlag.
     * @param value value to set the LandedCostFlag
     */
    public void setLandedCostFlag(String value) {
        setAttributeInternal(LANDEDCOSTFLAG, value);
    }

    /**
     * Gets the attribute value for EventType, using the alias name EventType.
     * @return the EventType
     */
    public String getEventType() {
        return (String)getAttributeInternal(EVENTTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for EventType.
     * @param value value to set the EventType
     */
    public void setEventType(String value) {
        setAttributeInternal(EVENTTYPE, value);
    }

    /**
     * Gets the attribute value for ApplyChargesFlag, using the alias name ApplyChargesFlag.
     * @return the ApplyChargesFlag
     */
    public String getApplyChargesFlag() {
        return (String)getAttributeInternal(APPLYCHARGESFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for ApplyChargesFlag.
     * @param value value to set the ApplyChargesFlag
     */
    public void setApplyChargesFlag(String value) {
        setAttributeInternal(APPLYCHARGESFLAG, value);
    }

    /**
     * Gets the attribute value for FirstShipmentFlag, using the alias name FirstShipmentFlag.
     * @return the FirstShipmentFlag
     */
    public String getFirstShipmentFlag() {
        return (String)getAttributeInternal(FIRSTSHIPMENTFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for FirstShipmentFlag.
     * @param value value to set the FirstShipmentFlag
     */
    public void setFirstShipmentFlag(String value) {
        setAttributeInternal(FIRSTSHIPMENTFLAG, value);
    }

    /**
     * Gets the attribute value for RequestId, using the alias name RequestId.
     * @return the RequestId
     */
    public Number getRequestId() {
        return (Number)getAttributeInternal(REQUESTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for RequestId.
     * @param value value to set the RequestId
     */
    public void setRequestId(Number value) {
        setAttributeInternal(REQUESTID, value);
    }

    /**
     * Gets the attribute value for UserId, using the alias name UserId.
     * @return the UserId
     */
    public Number getUserId() {
        return (Number)getAttributeInternal(USERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for UserId.
     * @param value value to set the UserId
     */
    public void setUserId(Number value) {
        setAttributeInternal(USERID, value);
    }

    /**
     * Gets the attribute value for RespId, using the alias name RespId.
     * @return the RespId
     */
    public Number getRespId() {
        return (Number)getAttributeInternal(RESPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for RespId.
     * @param value value to set the RespId
     */
    public void setRespId(Number value) {
        setAttributeInternal(RESPID, value);
    }

    /**
     * Gets the attribute value for RespApplId, using the alias name RespApplId.
     * @return the RespApplId
     */
    public Number getRespApplId() {
        return (Number)getAttributeInternal(RESPAPPLID);
    }

    /**
     * Sets <code>value</code> as the attribute value for RespApplId.
     * @param value value to set the RespApplId
     */
    public void setRespApplId(Number value) {
        setAttributeInternal(RESPAPPLID, value);
    }

    /**
     * Gets the attribute value for ProcessFlag, using the alias name ProcessFlag.
     * @return the ProcessFlag
     */
    public String getProcessFlag() {
        return (String)getAttributeInternal(PROCESSFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProcessFlag.
     * @param value value to set the ProcessFlag
     */
    public void setProcessFlag(String value) {
        setAttributeInternal(PROCESSFLAG, value);
    }

    /**
     * Gets the attribute value for UploadStatus, using the alias name UploadStatus.
     * @return the UploadStatus
     */
    public String getUploadStatus() {
        return (String)getAttributeInternal(UPLOADSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for UploadStatus.
     * @param value value to set the UploadStatus
     */
    public void setUploadStatus(String value) {
        setAttributeInternal(UPLOADSTATUS, value);
    }

    /**
     * Gets the attribute value for ErrorDescription, using the alias name ErrorDescription.
     * @return the ErrorDescription
     */
    public String getErrorDescription() {
        return (String)getAttributeInternal(ERRORDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for ErrorDescription.
     * @param value value to set the ErrorDescription
     */
    public void setErrorDescription(String value) {
        setAttributeInternal(ERRORDESCRIPTION, value);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the CreationDate
     */
    public Date getCreationDate() {
        return (Date)getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreationDate.
     * @param value value to set the CreationDate
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for InterfaceFlag, using the alias name InterfaceFlag.
     * @return the InterfaceFlag
     */
    public String getInterfaceFlag() {
        return (String)getAttributeInternal(INTERFACEFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for InterfaceFlag.
     * @param value value to set the InterfaceFlag
     */
    public void setInterfaceFlag(String value) {
        setAttributeInternal(INTERFACEFLAG, value);
    }

    /**
     * Gets the attribute value for InterfaceDescription, using the alias name InterfaceDescription.
     * @return the InterfaceDescription
     */
    public String getInterfaceDescription() {
        return (String)getAttributeInternal(INTERFACEDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for InterfaceDescription.
     * @param value value to set the InterfaceDescription
     */
    public void setInterfaceDescription(String value) {
        setAttributeInternal(INTERFACEDESCRIPTION, value);
    }

    /**
     * Gets the attribute value for ChargeName, using the alias name ChargeName.
     * @return the ChargeName
     */
    public String getChargeName() {
        return (String)getAttributeInternal(CHARGENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChargeName.
     * @param value value to set the ChargeName
     */
    public void setChargeName(String value) {
        setAttributeInternal(CHARGENAME, value);
    }

    /**
     * Gets the attribute value for PlanType, using the alias name PlanType.
     * @return the PlanType
     */
    public String getPlanType() {
        return (String)getAttributeInternal(PLANTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for PlanType.
     * @param value value to set the PlanType
     */
    public void setPlanType(String value) {
        setAttributeInternal(PLANTYPE, value);
    }

    /**
     * Gets the attribute value for MajorChargeName, using the alias name MajorChargeName.
     * @return the MajorChargeName
     */
    public String getMajorChargeName() {
        return (String)getAttributeInternal(MAJORCHARGENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for MajorChargeName.
     * @param value value to set the MajorChargeName
     */
    public void setMajorChargeName(String value) {
        setAttributeInternal(MAJORCHARGENAME, value);
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

    /**
     * @return the associated entity BBLCShipmentChargesEOImpl.
     */
    public BBLCShipmentChargesEOImpl getBBLCShipmentCharges() {
        return (BBLCShipmentChargesEOImpl)getAttributeInternal(BBLCSHIPMENTCHARGES);
    }

    /**
     * Sets <code>value</code> as the associated entity BBLCShipmentChargesEOImpl.
     */
    public void setBBLCShipmentCharges(BBLCShipmentChargesEOImpl value) {
        setAttributeInternal(BBLCSHIPMENTCHARGES, value);
    }


    /**
     * @param interfaceId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number interfaceId) {
        return new Key(new Object[]{interfaceId});
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        super.doDML(operation, e);
    }
}