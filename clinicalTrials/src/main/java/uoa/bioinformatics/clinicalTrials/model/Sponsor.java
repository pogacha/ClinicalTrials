package uoa.bioinformatics.clinicalTrials.model;

import com.fasterxml.jackson.annotation.JsonCreator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity

@Table(name = "sponsor")
public class Sponsor {

    @Id
    @Column(name = "sponsorId", nullable = false)
    private String sponsorId;
    @Column(name = "sponsorName", nullable = false)
    private String sponsorName;
    @Column(name = "sponsorStatus")
    private String sponsorStatus;
    @Column(name = "nameOfSupportingOrg")
    private String nameOfSupportingOrg;

    public Sponsor() {
    }

    public Sponsor(String sponsorId, String sponsorName, String sponsorStatus, String nameOfSupportingOrg) {
        this.sponsorId = sponsorId;
        this.sponsorName = sponsorName;
        this.sponsorStatus = sponsorStatus;
        this.nameOfSupportingOrg = nameOfSupportingOrg;
    }

    public String getSponsorId() {
        return sponsorId;
    }

    public void setSponsorId(String sponsorId) {
        this.sponsorId = sponsorId;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }

    public String getSponsorStatus() {
        return sponsorStatus;
    }

    public void setSponsorStatus(String sponsorStatus) {
        this.sponsorStatus = sponsorStatus;
    }

    public String getNameOfSupportingOrg() {
        return nameOfSupportingOrg;
    }

    public void setNameOfSupportingOrg(String nameOfSupportingOrg) {
        this.nameOfSupportingOrg = nameOfSupportingOrg;
    }
}