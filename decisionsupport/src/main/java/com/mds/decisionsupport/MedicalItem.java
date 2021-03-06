package com.mds.decisionsupport;

/**
 * This class was automatically generated by the data modeler tool.
 */
@org.kie.api.definition.type.Label(value = "Medical Item")
public class MedicalItem  implements java.io.Serializable {

static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Key
    @org.kie.api.definition.type.Label(value = "Date")
    @org.kie.api.definition.type.Position(value = 4)
    private java.lang.String date;
    
    @org.kie.api.definition.type.Key
    @org.kie.api.definition.type.Label(value = "Item name")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.String itemName;
    
    @org.kie.api.definition.type.Key
    @org.kie.api.definition.type.Label(value = "Item type")
    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.String itemType;
    
    @org.kie.api.definition.type.Key
    @org.kie.api.definition.type.Label(value = "Nomenclature code")
    @org.kie.api.definition.type.Position(value = 3)
    private java.lang.String nomenclatureCode;
    
    @org.kie.api.definition.type.Key
    @org.kie.api.definition.type.Label(value = "Nomenclature name")
    @org.kie.api.definition.type.Position(value = 2)
    private java.lang.String nomenclatureName;
    
    @org.kie.api.definition.type.Key
    @org.kie.api.definition.type.Label(value = "Unit")
    @org.kie.api.definition.type.Position(value = 6)
    private java.lang.String unit;
    
    @org.kie.api.definition.type.Key
    @org.kie.api.definition.type.Label(value = "Value")
    @org.kie.api.definition.type.Position(value = 5)
    private java.lang.String value;

    public MedicalItem() {
    }

    public MedicalItem(java.lang.String itemName, java.lang.String itemType, java.lang.String nomenclatureName, java.lang.String nomenclatureCode, java.lang.String date, java.lang.String value, java.lang.String unit) {
        this.itemName = itemName;
        this.itemType = itemType;
        this.nomenclatureName = nomenclatureName;
        this.nomenclatureCode = nomenclatureCode;
        this.date = date;
        this.value = value;
        this.unit = unit;
    }


    
    public java.lang.String getDate() {
        return this.date;
    }

    public void setDate(  java.lang.String date ) {
        this.date = date;
    }
    
    public java.lang.String getItemName() {
        return this.itemName;
    }

    public void setItemName(  java.lang.String itemName ) {
        this.itemName = itemName;
    }
    
    public java.lang.String getItemType() {
        return this.itemType;
    }

    public void setItemType(  java.lang.String itemType ) {
        this.itemType = itemType;
    }
    
    public java.lang.String getNomenclatureCode() {
        return this.nomenclatureCode;
    }

    public void setNomenclatureCode(  java.lang.String nomenclatureCode ) {
        this.nomenclatureCode = nomenclatureCode;
    }
    
    public java.lang.String getNomenclatureName() {
        return this.nomenclatureName;
    }

    public void setNomenclatureName(  java.lang.String nomenclatureName ) {
        this.nomenclatureName = nomenclatureName;
    }
    
    public java.lang.String getUnit() {
        return this.unit;
    }

    public void setUnit(  java.lang.String unit ) {
        this.unit = unit;
    }
    
    public java.lang.String getValue() {
        return this.value;
    }

    public void setValue(  java.lang.String value ) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com.mds.decisionsupport.MedicalItem that = (com.mds.decisionsupport.MedicalItem)o;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (itemName != null ? !itemName.equals(that.itemName) : that.itemName != null) return false;
        if (itemType != null ? !itemType.equals(that.itemType) : that.itemType != null) return false;
        if (nomenclatureCode != null ? !nomenclatureCode.equals(that.nomenclatureCode) : that.nomenclatureCode != null) return false;
        if (nomenclatureName != null ? !nomenclatureName.equals(that.nomenclatureName) : that.nomenclatureName != null) return false;
        if (unit != null ? !unit.equals(that.unit) : that.unit != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 13 * result + (date != null ? date.hashCode() : 0);
        result = 13 * result + (itemName != null ? itemName.hashCode() : 0);
        result = 13 * result + (itemType != null ? itemType.hashCode() : 0);
        result = 13 * result + (nomenclatureCode != null ? nomenclatureCode.hashCode() : 0);
        result = 13 * result + (nomenclatureName != null ? nomenclatureName.hashCode() : 0);
        result = 13 * result + (unit != null ? unit.hashCode() : 0);
        result = 13 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}