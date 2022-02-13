package uoa.bioinformatics.clinicalTrials.model;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity

@Table(name = "trial")
public class Trial {

    @Id
    @Column(name="eudraCTNumber", nullable = false)
    private String eudraCTNumber;
    @Column(name="trialStatus", nullable = false)
    private String trialStatus;
    @Column(name="designOfTheTrial")
    private String designOfTheTrial;
    @Column(name="trialTypePhase", nullable = false)
    private String trialTypePhase;
    @Column(name="scopeOfTheTrial")
    private String scopeOfTheTrial;
    @Column(name="estimatedDuration")
    private String estimatedDuration;
//    private String link;
//    private String therapeuticArea;
//    private String numberOfSubjects;
//    private String firstAddedDate;
//
    public Trial(String eudraCTNumber, String trialStatus, String designOfTheTrial, String trialTypePhase, String scopeOfTheTrial, String estimatedDuration) {
        this.eudraCTNumber = eudraCTNumber;
        this.trialStatus = trialStatus;
        this.designOfTheTrial = designOfTheTrial;
        this.trialTypePhase = trialTypePhase;
        this.scopeOfTheTrial = scopeOfTheTrial;
        this.estimatedDuration = estimatedDuration;
//        this.link = link;
//        this.therapeuticArea = therapeuticArea;
//        this.numberOfSubjects = numberOfSubjects;
//        this.firstAddedDate = firstAddedDate;
    }

    public Trial() {
    }


    public void setEudraCTNumber(String eudraCTNumber) {
        this.eudraCTNumber = eudraCTNumber;
    }

    public String getEudraCTNumber() {
        return eudraCTNumber;
    }

    public String getTrialStatus() {
        return trialStatus;
    }

    public void setTrialStatus(String trialStatus) {
        trialStatus = trialStatus;
    }

    public String getDesignOfTheTrial() {
        return designOfTheTrial;
    }

    public void setDesignOfTheTrial(String designOfTheTrial) {
        designOfTheTrial = designOfTheTrial;
    }

    public String getTrialTypePhase() {
        return trialTypePhase;
    }

    public void setTrialTypePhase(String trialTypePhase) {
        trialTypePhase = trialTypePhase;
    }

    public String getScopeOfTheTrial() {
        return scopeOfTheTrial;
    }

    public void setScopeOfTheTrial(String scopeOfTheTrial) {
        scopeOfTheTrial = scopeOfTheTrial;
    }

    public String getEstimatedDuration() {
        return estimatedDuration;
    }

    public void setEstimatedDuration(String estimatedDuration) {
        estimatedDuration = estimatedDuration;
    }

//    public String getLink() {
//        return link;
//    }
//
//    public void setLink(String link) {
//        this.link = link;
//    }
//
//    public String getTherapeuticArea() {
//        return therapeuticArea;
//    }
//
//    public void setTherapeuticArea(String therapeuticArea) {
//        therapeuticArea = therapeuticArea;
//    }
//
//    public String getNumberOfSubjects() {
//        return numberOfSubjects;
//    }
//
//    public void setNumberOfSubjects(String numberOfSubjects) {
//        numberOfSubjects = numberOfSubjects;
//    }
//
//    public String getFirstAddedDate() {
//        return firstAddedDate;
//    }
//
//    public void setFirstAddedDate(String firstAddedDate) {
//        firstAddedDate = firstAddedDate;
//    }

    @Override
    public String toString() {
        return "Trial{" +
                "eudraCTNumber=" + eudraCTNumber +
                ", designOfTheTrial='" + designOfTheTrial + '\'' +
                '}';
    }
}