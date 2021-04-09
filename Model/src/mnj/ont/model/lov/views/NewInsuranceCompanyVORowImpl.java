package mnj.ont.model.lov.views;

import oracle.jbo.domain.Date;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Feb 16 00:36:42 BDT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class NewInsuranceCompanyVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        IsuranceCompany {
            public Object get(NewInsuranceCompanyVORowImpl obj) {
                return obj.getIsuranceCompany();
            }

            public void put(NewInsuranceCompanyVORowImpl obj, Object value) {
                obj.setIsuranceCompany((String)value);
            }
        }
        ,
        InsuranceCoverNoteNo {
            public Object get(NewInsuranceCompanyVORowImpl obj) {
                return obj.getInsuranceCoverNoteNo();
            }

            public void put(NewInsuranceCompanyVORowImpl obj, Object value) {
                obj.setInsuranceCoverNoteNo((String)value);
            }
        }
        ,
        InsuranceCoverDate {
            public Object get(NewInsuranceCompanyVORowImpl obj) {
                return obj.getInsuranceCoverDate();
            }

            public void put(NewInsuranceCompanyVORowImpl obj, Object value) {
                obj.setInsuranceCoverDate((Date)value);
            }
        }
        ,
        OrganizationName {
            public Object get(NewInsuranceCompanyVORowImpl obj) {
                return obj.getOrganizationName();
            }

            public void put(NewInsuranceCompanyVORowImpl obj, Object value) {
                obj.setOrganizationName((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(NewInsuranceCompanyVORowImpl object);

        public abstract void put(NewInsuranceCompanyVORowImpl object,
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
    public static final int ISURANCECOMPANY = AttributesEnum.IsuranceCompany.index();
    public static final int INSURANCECOVERNOTENO = AttributesEnum.InsuranceCoverNoteNo.index();
    public static final int INSURANCECOVERDATE = AttributesEnum.InsuranceCoverDate.index();
    public static final int ORGANIZATIONNAME = AttributesEnum.OrganizationName.index();

    /**
     * This is the default constructor (do not remove).
     */
    public NewInsuranceCompanyVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute IsuranceCompany.
     * @return the IsuranceCompany
     */
    public String getIsuranceCompany() {
        return (String) getAttributeInternal(ISURANCECOMPANY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute IsuranceCompany.
     * @param value value to set the  IsuranceCompany
     */
    public void setIsuranceCompany(String value) {
        setAttributeInternal(ISURANCECOMPANY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute InsuranceCoverNoteNo.
     * @return the InsuranceCoverNoteNo
     */
    public String getInsuranceCoverNoteNo() {
        return (String) getAttributeInternal(INSURANCECOVERNOTENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute InsuranceCoverNoteNo.
     * @param value value to set the  InsuranceCoverNoteNo
     */
    public void setInsuranceCoverNoteNo(String value) {
        setAttributeInternal(INSURANCECOVERNOTENO, value);
    }

    /**
     * Gets the attribute value for the calculated attribute InsuranceCoverDate.
     * @return the InsuranceCoverDate
     */
    public Date getInsuranceCoverDate() {
        return (Date) getAttributeInternal(INSURANCECOVERDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute InsuranceCoverDate.
     * @param value value to set the  InsuranceCoverDate
     */
    public void setInsuranceCoverDate(Date value) {
        setAttributeInternal(INSURANCECOVERDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute OrganizationName.
     * @return the OrganizationName
     */
    public String getOrganizationName() {
        return (String) getAttributeInternal(ORGANIZATIONNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute OrganizationName.
     * @param value value to set the  OrganizationName
     */
    public void setOrganizationName(String value) {
        setAttributeInternal(ORGANIZATIONNAME, value);
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
