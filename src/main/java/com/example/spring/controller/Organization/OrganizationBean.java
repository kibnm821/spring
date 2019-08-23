package com.example.spring.controller.Organization;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORGANIZATION_SEQ")
public class OrganizationBean{
    @Id
    @GeneratedValue
    private String ORGANIZATION_SEQ;
    private String NAME;
    private String TELEPHONE;
    private String ORDER_NUMBER;
    private String PARENT_ORGANIZATION_SEQ;


    public OrganizationBean() {
    }

    public OrganizationBean(String ORGANIZATION_SEQ, String NAME, String TELEPHONE, String ORDER_NUMBER, String PARENT_ORGANIZATION_SEQ) {
        this.ORGANIZATION_SEQ = ORGANIZATION_SEQ;
        this.NAME = NAME;
        this.TELEPHONE = TELEPHONE;
        this.ORDER_NUMBER = ORDER_NUMBER;
        this.PARENT_ORGANIZATION_SEQ = PARENT_ORGANIZATION_SEQ;
    }

    public String getORGANIZATION_SEQ() {
        return this.ORGANIZATION_SEQ;
    }

    public void setORGANIZATION_SEQ(String ORGANIZATION_SEQ) {
        this.ORGANIZATION_SEQ = ORGANIZATION_SEQ;
    }

    public String getNAME() {
        return this.NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getTELEPHONE() {
        return this.TELEPHONE;
    }

    public void setTELEPHONE(String TELEPHONE) {
        this.TELEPHONE = TELEPHONE;
    }

    public String getORDER_NUMBER() {
        return this.ORDER_NUMBER;
    }

    public void setORDER_NUMBER(String ORDER_NUMBER) {
        this.ORDER_NUMBER = ORDER_NUMBER;
    }

    public String getPARENT_ORGANIZATION_SEQ() {
        return this.PARENT_ORGANIZATION_SEQ;
    }

    public void setPARENT_ORGANIZATION_SEQ(String PARENT_ORGANIZATION_SEQ) {
        this.PARENT_ORGANIZATION_SEQ = PARENT_ORGANIZATION_SEQ;
    }

    public OrganizationBean ORGANIZATION_SEQ(String ORGANIZATION_SEQ) {
        this.ORGANIZATION_SEQ = ORGANIZATION_SEQ;
        return this;
    }

    public OrganizationBean NAME(String NAME) {
        this.NAME = NAME;
        return this;
    }

    public OrganizationBean TELEPHONE(String TELEPHONE) {
        this.TELEPHONE = TELEPHONE;
        return this;
    }

    public OrganizationBean ORDER_NUMBER(String ORDER_NUMBER) {
        this.ORDER_NUMBER = ORDER_NUMBER;
        return this;
    }

    public OrganizationBean PARENT_ORGANIZATION_SEQ(String PARENT_ORGANIZATION_SEQ) {
        this.PARENT_ORGANIZATION_SEQ = PARENT_ORGANIZATION_SEQ;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof OrganizationBean)) {
            return false;
        }
        OrganizationBean organizationBean = (OrganizationBean) o;
        return Objects.equals(ORGANIZATION_SEQ, organizationBean.ORGANIZATION_SEQ) && Objects.equals(NAME, organizationBean.NAME) && Objects.equals(TELEPHONE, organizationBean.TELEPHONE) && Objects.equals(ORDER_NUMBER, organizationBean.ORDER_NUMBER) && Objects.equals(PARENT_ORGANIZATION_SEQ, organizationBean.PARENT_ORGANIZATION_SEQ);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ORGANIZATION_SEQ, NAME, TELEPHONE, ORDER_NUMBER, PARENT_ORGANIZATION_SEQ);
    }

    @Override
    public String toString() {
        return "{" +
            " ORGANIZATION_SEQ='" + getORGANIZATION_SEQ() + "'" +
            ", NAME='" + getNAME() + "'" +
            ", TELEPHONE='" + getTELEPHONE() + "'" +
            ", ORDER_NUMBER='" + getORDER_NUMBER() + "'" +
            ", PARENT_ORGANIZATION_SEQ='" + getPARENT_ORGANIZATION_SEQ() + "'" +
            "}";
    }

}