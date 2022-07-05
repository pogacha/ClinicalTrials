package uoa.bioinformatics.clinicalTrials.model;

import com.fasterxml.jackson.annotation.JsonCreator;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Id;
import java.util.Date;


@Entity

@Table(name = "criteria")
public class Criteria {

    @Id
    @Column(name="id", nullable = false)
    private String id;
    @Column(name="eudraCTNumber", nullable = false)
    private String eudraCTNumber;
    @Column(name="specificVulnerablePopulations")
    private String specificVulnerablePopulations;
    @Column(name="exclusionCriteria")
    private String exclusionCriteria;
    @Column(name="criteriaAge")
    private String criteriaAge;
    @Column(name="criteriaGender")
    private String criteriaGender;
    @Column(name="criteriaHivTest")
    private Boolean criteriaHivTest;
    @Column(name="incIteriaOther")
    private String incIteriaOther;
    @Column(name="groupOfSubjects")
    private String groupOfSubjects;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEudraCTNumber() {
        return eudraCTNumber;
    }

    public void setEudraCTNumber(String eudraCTNumber) {
        this.eudraCTNumber = eudraCTNumber;
    }

    public String getSpecificVulnerablePopulations() {
        return specificVulnerablePopulations;
    }

    public void setSpecificVulnerablePopulations(String specificVulnerablePopulations) {
        this.specificVulnerablePopulations = specificVulnerablePopulations;
    }

    public String getExclusionCriteria() {
        return exclusionCriteria;
    }

    public void setExclusionCriteria(String exclusionCriteria) {
        this.exclusionCriteria = exclusionCriteria;
    }

    public String getCriteriaAge() {
        return criteriaAge;
    }

    public void setCriteriaAge(String criteriaAge) {
        this.criteriaAge = criteriaAge;
    }

    public String getcriteriaGender() {
        return criteriaGender;
    }

    public void setCriteriaGender(String criteriaGender) {
        this.criteriaGender = criteriaGender;
    }

    public Boolean getCriteriaHivTest() {
        return criteriaHivTest;
    }

    public void setCriteriaHivTest(Boolean criteriaHivTest) {
        this.criteriaHivTest = criteriaHivTest;
    }

    public String getIncIteriaOther() {
        return incIteriaOther;
    }

    public void setIncIteriaOther(String incIteriaOther) {
        this.incIteriaOther = incIteriaOther;
    }

    public String getGroupOfSubjects() {
        return groupOfSubjects;
    }

    public void setGroupOfSubjects(String groupOfSubjects) {
        this.groupOfSubjects = groupOfSubjects;
    }



    @JsonCreator
    public Criteria(String id, String eudraCTNumber, String specificVulnerablePopulations, String exclusionCriteria, String criteriaAge, String criteriaGender, Boolean criteriaHivTest, String incIteriaOther, String groupOfSubjects) {
        this.id = id;
        this.eudraCTNumber = eudraCTNumber;
        this.specificVulnerablePopulations = specificVulnerablePopulations;
        this.exclusionCriteria = exclusionCriteria;
        this.criteriaAge = criteriaAge;
        this.criteriaGender = criteriaGender;
        this.criteriaHivTest = criteriaHivTest;
        this.incIteriaOther = incIteriaOther;
        this.groupOfSubjects = groupOfSubjects;
    }



    public Criteria() {
    }


}