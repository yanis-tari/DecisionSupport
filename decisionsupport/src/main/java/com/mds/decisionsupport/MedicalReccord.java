package com.mds.decisionsupport;

/**
 * This class was automatically generated by the data modeler tool.
 */
@org.kie.api.definition.type.Label(value = "Medical reccord")
public class MedicalReccord  implements java.io.Serializable {

static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Key
    @org.kie.api.definition.type.Label(value = "Birth date")
    @org.kie.api.definition.type.Position(value = 2)
    private java.lang.String birthDate;
    
    @org.kie.api.definition.type.Key
    @org.kie.api.definition.type.Label(value = "First name")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.String firstName;
    
    @org.kie.api.definition.type.Key
    @org.kie.api.definition.type.Label(value = "LastName")
    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.String lastName;
    
    @org.kie.api.definition.type.Key
    @org.kie.api.definition.type.Label(value = "Mail")
    @org.kie.api.definition.type.Position(value = 3)
    private java.lang.String mail;
    
    @org.kie.api.definition.type.Key
    @org.kie.api.definition.type.Label(value = "Medical Items")
    @org.kie.api.definition.type.Position(value = 5)
    private java.util.List<com.mds.decisionsupport.MedicalItem> medicalItems;
    
    @org.kie.api.definition.type.Key
    @org.kie.api.definition.type.Label(value = "Phone Number")
    @org.kie.api.definition.type.Position(value = 4)
    private java.lang.String phoneNumber;

    public MedicalReccord() {
    }

    public MedicalReccord(java.lang.String firstName, java.lang.String lastName, java.lang.String birthDate, java.lang.String mail, java.lang.String phoneNumber, java.util.List<com.mds.decisionsupport.MedicalItem> medicalItems) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.medicalItems = medicalItems;
    }


    
    public java.lang.String getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(  java.lang.String birthDate ) {
        this.birthDate = birthDate;
    }
    
    public java.lang.String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(  java.lang.String firstName ) {
        this.firstName = firstName;
    }
    
    public java.lang.String getLastName() {
        return this.lastName;
    }

    public void setLastName(  java.lang.String lastName ) {
        this.lastName = lastName;
    }
    
    public java.lang.String getMail() {
        return this.mail;
    }

    public void setMail(  java.lang.String mail ) {
        this.mail = mail;
    }
    
    public java.util.List<com.mds.decisionsupport.MedicalItem> getMedicalItems() {
        return this.medicalItems;
    }

    public void setMedicalItems(  java.util.List<com.mds.decisionsupport.MedicalItem> medicalItems ) {
        this.medicalItems = medicalItems;
    }
    
    public java.lang.String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(  java.lang.String phoneNumber ) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com.mds.decisionsupport.MedicalReccord that = (com.mds.decisionsupport.MedicalReccord)o;
        if (birthDate != null ? !birthDate.equals(that.birthDate) : that.birthDate != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (mail != null ? !mail.equals(that.mail) : that.mail != null) return false;
        if (medicalItems != null ? !medicalItems.equals(that.medicalItems) : that.medicalItems != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 13 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 13 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 13 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 13 * result + (mail != null ? mail.hashCode() : 0);
        result = 13 * result + (medicalItems != null ? medicalItems.hashCode() : 0);
        result = 13 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        return result;
    }
}