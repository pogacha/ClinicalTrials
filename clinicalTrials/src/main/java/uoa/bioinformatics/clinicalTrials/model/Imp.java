package uoa.bioinformatics.clinicalTrials.model;

import com.fasterxml.jackson.annotation.JsonCreator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity

@Table(name = "imp")
public class Imp {

    @Id
    @Column(name="impId", nullable = false)
    private String impId;
    @Column(name="routesOfAdm", nullable = false)
    private String routesOfAdm;
    @Column(name="tradeName", nullable = false)
    private String tradeName;
    @Column(name="productName")
    private String productName;
    @Column(name="impRole", nullable = false)
    private String impRole;
    @Column(name="moreInfo")
    private String moreInfo;
    @Column(name="hasMarketingAuth")
    private String hasMarketingAuth;
    @Column(name="countryHasMarketingAuth")
    private String countryHasMarketingAuth;
    @Column(name="pharmForm")
    private String pharmForm;


    @JsonCreator

    public Imp(String impId, String routesOfAdm, String tradeName, String productName, String impRole, String moreInfo, String hasMarketingAuth, String countryHasMarketingAuth, String pharmForm) {
        this.impId = impId;
        this.routesOfAdm = routesOfAdm;
        this.tradeName = tradeName;
        this.productName = productName;
        this.impRole = impRole;
        this.moreInfo = moreInfo;
        this.hasMarketingAuth = hasMarketingAuth;
        this.countryHasMarketingAuth = countryHasMarketingAuth;
        this.pharmForm = pharmForm;
    }

    public Imp() {
    }

    public String getImpId() {
        return impId;
    }

    public void setImpId(String impId) {
        this.impId = impId;
    }

    public String getRoutesOfAdm() {
        return routesOfAdm;
    }

    public void setRoutesOfAdm(String routesOfAdm) {
        this.routesOfAdm = routesOfAdm;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getImpRole() {
        return impRole;
    }

    public void setImpRole(String impRole) {
        this.impRole = impRole;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

    public String getHasMarketingAuth() {
        return hasMarketingAuth;
    }

    public void setHasMarketingAuth(String hasMarketingAuth) {
        this.hasMarketingAuth = hasMarketingAuth;
    }

    public String getCountryHasMarketingAuth() {
        return countryHasMarketingAuth;
    }

    public void setCountryHasMarketingAuth(String countryHasMarketingAuth) {
        this.countryHasMarketingAuth = countryHasMarketingAuth;
    }

    public String getPharmForm() {
        return pharmForm;
    }

    public void setPharmForm(String pharmForm) {
        this.pharmForm = pharmForm;
    }
}