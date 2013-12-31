package com.mds.factmodel;

/**
 * This class was automatically generated by the data modeler tool.
 */
@org.kie.api.definition.type.Label(value = "Symptome")
public class Symptome  implements java.io.Serializable {

static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Label(value = "code")
    @org.kie.api.definition.type.Position(value = 3)
    private java.lang.String code;
    
    @org.kie.api.definition.type.Label(value = "comment")
    @org.kie.api.definition.type.Position(value = 5)
    private java.lang.String comment;
    
    @org.kie.api.definition.type.Label(value = "informationType")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.String informationType;
    
    @org.kie.api.definition.type.Label(value = "linked")
    @org.kie.api.definition.type.Position(value = 6)
    private java.util.List<com.mds.factmodel.Symptome> linked;
    
    @org.kie.api.definition.type.Label(value = "localName")
    @org.kie.api.definition.type.Position(value = 7)
    private java.lang.String localName;
    
    @org.kie.api.definition.type.Label(value = "location")
    @org.kie.api.definition.type.Position(value = 9)
    private java.util.List<java.lang.String> location;
    
    @org.kie.api.definition.type.Label(value = "nomenclature")
    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.String nomenclature;
    
    @org.kie.api.definition.type.Label(value = "quantity")
    @org.kie.api.definition.type.Position(value = 8)
    private java.util.List<com.mds.factmodel.Amount> quantity;
    
    @org.kie.api.definition.type.Label(value = "systemeCode")
    @org.kie.api.definition.type.Position(value = 2)
    private java.lang.String systemeCode;
    
    @org.kie.api.definition.type.Label(value = "timeSymptome")
    @org.kie.api.definition.type.Position(value = 4)
    private java.util.Date timeSymptome;

    public Symptome() {
    }

    public Symptome(java.lang.String informationType, java.lang.String nomenclature, java.lang.String systemeCode, java.lang.String code, java.util.Date timeSymptome, java.lang.String comment, java.util.List<com.mds.factmodel.Symptome> linked, java.lang.String localName, java.util.List<com.mds.factmodel.Amount> quantity, java.util.List<java.lang.String> location) {
        this.informationType = informationType;
        this.nomenclature = nomenclature;
        this.systemeCode = systemeCode;
        this.code = code;
        this.timeSymptome = timeSymptome;
        this.comment = comment;
        this.linked = linked;
        this.localName = localName;
        this.quantity = quantity;
        this.location = location;
    }


    
    public java.lang.String getCode() {
        return this.code;
    }

    public void setCode(  java.lang.String code ) {
        this.code = code;
    }
    
    public java.lang.String getComment() {
        return this.comment;
    }

    public void setComment(  java.lang.String comment ) {
        this.comment = comment;
    }
    
    public java.lang.String getInformationType() {
        return this.informationType;
    }

    public void setInformationType(  java.lang.String informationType ) {
        this.informationType = informationType;
    }
    
    public java.util.List<com.mds.factmodel.Symptome> getLinked() {
        return this.linked;
    }

    public void setLinked(  java.util.List<com.mds.factmodel.Symptome> linked ) {
        this.linked = linked;
    }
    
    public java.lang.String getLocalName() {
        return this.localName;
    }

    public void setLocalName(  java.lang.String localName ) {
        this.localName = localName;
    }
    
    public java.util.List<java.lang.String> getLocation() {
        return this.location;
    }

    public void setLocation(  java.util.List<java.lang.String> location ) {
        this.location = location;
    }
    
    public java.lang.String getNomenclature() {
        return this.nomenclature;
    }

    public void setNomenclature(  java.lang.String nomenclature ) {
        this.nomenclature = nomenclature;
    }
    
    public java.util.List<com.mds.factmodel.Amount> getQuantity() {
        return this.quantity;
    }

    public void setQuantity(  java.util.List<com.mds.factmodel.Amount> quantity ) {
        this.quantity = quantity;
    }
    
    public java.lang.String getSystemeCode() {
        return this.systemeCode;
    }

    public void setSystemeCode(  java.lang.String systemeCode ) {
        this.systemeCode = systemeCode;
    }
    
    public java.util.Date getTimeSymptome() {
        return this.timeSymptome;
    }

    public void setTimeSymptome(  java.util.Date timeSymptome ) {
        this.timeSymptome = timeSymptome;
    }
}