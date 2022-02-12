package uoa.bioinformatics.clinicaltrials;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Imp{


    public Imp(String id, String EudraCTNumber, String RoutesOfAdm, String TradeName, String ProductName, String IMPRole, String MoreInfo, String hasMarketingAuth, String CountryhasMarketingAuth, String PharmForm) {

        this.id = id;
        this.EudraCTNumber = EudraCTNumber;
        this.RoutesOfAdm = RoutesOfAdm;
        this.TradeName = TradeName;
        this.ProductName = ProductName;
        this.IMPRole = IMPRole;
        this.MoreInfo = MoreInfo;
        this.hasMarketingAuth = hasMarketingAuth;
        this.CountryhasMarketingAuth = CountryhasMarketingAuth;
        this.PharmForm = PharmForm;
    }


    public Imp() {

    }


    @Id
    @GeneratedValue
    public String id;
    public String EudraCTNumber;
    public String RoutesOfAdm;
    public String TradeName;
    public String ProductName;
    public String IMPRole;
    public String MoreInfo;
    public String hasMarketingAuth;
    public String CountryhasMarketingAuth;
    public  String PharmForm;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEudraCTNumber() {
        return EudraCTNumber;
    }

    public void setEudraCTNumber(String eudraCTNumber) {
        EudraCTNumber = eudraCTNumber;
    }

    public String getRoutesOfAdm() {
        return RoutesOfAdm;
    }

    public void setRoutesOfAdm(String routesOfAdm) {
        RoutesOfAdm = routesOfAdm;
    }

    public String getTradeName() {
        return TradeName;
    }

    public void setTradeName(String tradeName) {
        TradeName = tradeName;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getIMPRole() {
        return IMPRole;
    }

    public void setIMPRole(String IMPRole) {
        this.IMPRole = IMPRole;
    }

    public String getMoreInfo() {
        return MoreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        MoreInfo = moreInfo;
    }

    public String getHasMarketingAuth() {
        return hasMarketingAuth;
    }

    public void setHasMarketingAuth(String hasMarketingAuth) {
        this.hasMarketingAuth = hasMarketingAuth;
    }

    public String getCountryhasMarketingAuth() {
        return CountryhasMarketingAuth;
    }

    public void setCountryhasMarketingAuth(String countryhasMarketingAuth) {
        CountryhasMarketingAuth = countryhasMarketingAuth;
    }

    public String getPharmForm() {
        return PharmForm;
    }

    public void setPharmForm(String pharmForm) {
        PharmForm = pharmForm;
    }

    @Override
    public String toString() {
        return "Imp{" +
                "id='" + id + '\'' +
                ", EudraCTNumber='" + EudraCTNumber + '\'' +
                ", RoutesOfAdm='" + RoutesOfAdm + '\'' +
                ", TradeName='" + TradeName + '\'' +
                ", ProductName='" + ProductName + '\'' +
                ", IMPRole='" + IMPRole + '\'' +
                ", MoreInfo='" + MoreInfo + '\'' +
                ", hasMarketingAuth='" + hasMarketingAuth + '\'' +
                ", CountryhasMarketingAuth='" + CountryhasMarketingAuth + '\'' +
                ", PharmForm='" + PharmForm + '\'' +
                '}';
    }
}