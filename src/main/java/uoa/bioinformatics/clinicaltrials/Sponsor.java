package uoa.bioinformatics.clinicaltrials;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sponsor {
    public Sponsor(String sponsorName, String eudraCTNumber, String sponsorStatus){

        this.sponsorName = sponsorName;
        this.eudraCTNumber = eudraCTNumber;
        this.sponsorStatus = sponsorStatus;
    }


    public Sponsor() {
    }




    @Id
    private String sponsorName;
    private String eudraCTNumber;
    private String sponsorStatus;

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public String getEudraCTNumber() {
        return eudraCTNumber;
    }

    public void setEudraCTNumber(String eudraCTNumber) {
        this.eudraCTNumber = eudraCTNumber;
    }

    public String getSponsorStatus() {
        return sponsorStatus;
    }

    public void setSponsorStatus(String sponsorStatus) {
        this.sponsorStatus = sponsorStatus;
    }
}
