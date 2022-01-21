package uoa.bioinformatics.clinicaltrials;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trial {
    public Trial(String eudraCTNumber, String trialStatus, String designOfTheTrial, String trialTypePhase, String scopeOfTheTrial, String estimatedDuration, String link, String therapeuticArea, String numberOfSubjects, String firstAddedDate) {
        this.eudraCTNumber = eudraCTNumber;
        this.trialStatus = trialStatus;
        this.designOfTheTrial = designOfTheTrial;
        this.trialTypePhase = trialTypePhase;
        this.scopeOfTheTrial = scopeOfTheTrial;
        this.estimatedDuration = estimatedDuration;
        this.link = link;
        this.therapeuticArea = therapeuticArea;
        this.numberOfSubjects = numberOfSubjects;
        this.firstAddedDate = firstAddedDate;
    }

    public Trial() {
    }

    @Id
    private String eudraCTNumber;

    private String trialStatus;
    private String designOfTheTrial;
    private String trialTypePhase;
    private String scopeOfTheTrial;
    private String estimatedDuration;
    private String link;
    private String therapeuticArea;
    private String numberOfSubjects;
    private String firstAddedDate;


    public void setEudraCTNumber(String eudraCTNumber) {
        this.eudraCTNumber = eudraCTNumber;
    }

    public String getEudraCTNumber() {
        return eudraCTNumber;
    }

    public String getΤrialStatus() {
        return trialStatus;
    }

    public void setΤrialStatus(String τrialStatus) {
        trialStatus = τrialStatus;
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTherapeuticArea() {
        return therapeuticArea;
    }

    public void setTherapeuticArea(String therapeuticArea) {
        therapeuticArea = therapeuticArea;
    }

    public String getNumberOfSubjects() {
        return numberOfSubjects;
    }

    public void setNumberOfSubjects(String numberOfSubjects) {
        numberOfSubjects = numberOfSubjects;
    }

    public String getFirstAddedDate() {
        return firstAddedDate;
    }

    public void setFirstAddedDate(String firstAddedDate) {
        firstAddedDate = firstAddedDate;
    }

    @Override
    public String toString() {
        return "Trial{" +
                "eudraCTNumber=" + eudraCTNumber +
                ", designOfTheTrial='" + designOfTheTrial + '\'' +
                ", firstAddedDate='" + firstAddedDate + '\'' +
                '}';
    }
}
