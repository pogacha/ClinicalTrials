package uoa.bioinformatics.clinicaltrials;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Criteria {
    public Criteria(String id, String EudraCTNumber, String SpecificVulnerablePopulations, String ExclusionCriteria, String CriteriaAge, String CriteriaGender, String CriteriaHIVTest, String IncCriteriaOther, String GroupOfSubjects){
        this.id = id;
        this.EudraCTNumber = EudraCTNumber;
        this.SpecificVulnerablePopulations = SpecificVulnerablePopulations;
        this.ExclusionCriteria = ExclusionCriteria;
        this.CriteriaAge = CriteriaAge;
        this.CriteriaGender = CriteriaGender;
        this.CriteriaHIVTest = CriteriaHIVTest;
        this.IncCriteriaOther = IncCriteriaOther;
        this.GroupOfSubjects = GroupOfSubjects;
    }

    public Criteria(){
    }


    @Id
    @GeneratedValue
    private String id;
    private String EudraCTNumber;
    private String SpecificVulnerablePopulations;
    private String ExclusionCriteria;
    private String CriteriaAge;
    private String CriteriaGender;
    private String CriteriaHIVTest;
    private String IncCriteriaOther;
    private String GroupOfSubjects;

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

    public String getSpecificVulnerablePopulations() {
        return SpecificVulnerablePopulations;
    }

    public void setSpecificVulnerablePopulations(String specificVulnerablePopulations) {
        SpecificVulnerablePopulations = specificVulnerablePopulations;
    }

    public String getExclusionCriteria() {
        return ExclusionCriteria;
    }

    public void setExclusionCriteria(String exclusionCriteria) {
        ExclusionCriteria = exclusionCriteria;
    }

    public String getCriteriaAge() {
        return CriteriaAge;
    }

    public void setCriteriaAge(String criteriaAge) {
        CriteriaAge = criteriaAge;
    }

    public String getCriteriaGender() {
        return CriteriaGender;
    }

    public void setCriteriaGender(String criteriaGender) {
        CriteriaGender = criteriaGender;
    }

    public String getCriteriaHIVTest() {
        return CriteriaHIVTest;
    }

    public void setCriteriaHIVTest(String criteriaHIVTest) {
        CriteriaHIVTest = criteriaHIVTest;
    }

    public String getIncCriteriaOther() {
        return IncCriteriaOther;
    }

    public void setIncCriteriaOther(String incCriteriaOther) {
        IncCriteriaOther = incCriteriaOther;
    }

    public String getGroupOfSubjects() {
        return GroupOfSubjects;
    }

    public void setGroupOfSubjects(String groupOfSubjects) {
        GroupOfSubjects = groupOfSubjects;
    }

    @Override
    public String toString() {
        return "Criteria{" +
                "id='" + id + '\'' +
                ", EudraCTNumber='" + EudraCTNumber + '\'' +
                ", SpecificVulnerablePopulations='" + SpecificVulnerablePopulations + '\'' +
                ", ExclusionCriteria='" + ExclusionCriteria + '\'' +
                ", CriteriaAge='" + CriteriaAge + '\'' +
                ", CriteriaGender='" + CriteriaGender + '\'' +
                ", CriteriaHIVTest='" + CriteriaHIVTest + '\'' +
                ", IncCriteriaOther='" + IncCriteriaOther + '\'' +
                ", GroupOfSubjects='" + GroupOfSubjects + '\'' +
                '}';
    }
}
