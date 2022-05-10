package uoa.bioinformatics.clinicalTrials.model;

import com.fasterxml.jackson.annotation.JsonCreator;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity

@Table(name = "protocol")
public class Protocol {

    @Id
    @Column(name="protocolCodeNumber", nullable = false)
    private String protocolCodeNumber;
    @Column(name="eudraCTNumber", nullable = false)
    private String eudraCTNumber;
    @Column(name="fullTitle")
    private String fullTitle;
    @Column(name="simplifiedTitle")
    private String simplifiedTitle;
    @Column(name="mainObjective")
    private String mainObjective;
    @Column(name="safetyObjective")
    private String safetyObjective;


    @JsonCreator
    public Protocol(String protocolCodeNumber, String eudraCTNumber, String fullTitle, String simplifiedTitle, String mainObjective,
                 String safetyObjective ) {
        this.protocolCodeNumber = protocolCodeNumber;
        this.eudraCTNumber = eudraCTNumber;
        this.fullTitle = fullTitle;
        this.simplifiedTitle = simplifiedTitle;
        this.mainObjective = mainObjective;
        this.safetyObjective = safetyObjective;

    }

    public String getProtocolCodeNumber() {
        return protocolCodeNumber;
    }

    public void setProtocolCodeNumber(String protocolCodeNumber) {
        this.protocolCodeNumber = protocolCodeNumber;
    }

    public String getEudraCTNumber() {
        return eudraCTNumber;
    }

    public void setEudraCTNumber(String eudraCTNumber) {
        this.eudraCTNumber = eudraCTNumber;
    }

    public String getFullTitle() {
        return fullTitle;
    }

    public void setFullTitle(String fullTitle) {
        this.fullTitle = fullTitle;
    }

    public String getSimplifiedTitle() {
        return simplifiedTitle;
    }

    public void setSimplifiedTitle(String simplifiedTitle) {
        this.simplifiedTitle = simplifiedTitle;
    }

    public String getMainObjective() {
        return mainObjective;
    }

    public void setMainObjective(String mainObjective) {
        this.mainObjective = mainObjective;
    }

    public String getSafetyObjective() {
        return safetyObjective;
    }

    public void setSafetyObjective(String safetyObjective) {
        this.safetyObjective = safetyObjective;
    }

    @Override
    public String toString() {
        return "Protocol{" +
                "protocolCodeNumber='" + protocolCodeNumber + '\'' +
                ", eudraCTNumber='" + eudraCTNumber + '\'' +
                '}';
    }
}