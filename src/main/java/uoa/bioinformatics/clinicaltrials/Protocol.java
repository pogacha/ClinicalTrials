package uoa.bioinformatics.clinicaltrials;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Protocol {


    public Protocol(String id, String ProtocolCodeNumber, String SummaryKey, String EudraCTNumber, String FullTitle, String MainObjective, String SafetyObjective, String SimplifiedTitle) {

        this.id = id;
        this.ProtocolCodeNumber = ProtocolCodeNumber;
        this.SummaryKey = SummaryKey;
        this.EudraCTNumber = EudraCTNumber;
        this.FullTitle = FullTitle;
        this.MainObjective = MainObjective;
        this.SafetyObjective = SafetyObjective;
        this.SimplifiedTitle = SimplifiedTitle;
    }


    public Protocol() {

    }


    @Id
    @GeneratedValue
    public String id;
    public String ProtocolCodeNumber;
    public String SummaryKey;
    public String EudraCTNumber;
    public String FullTitle;
    public String MainObjective;
    public String SafetyObjective;
    public String SimplifiedTitle;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProtocolCodeNumber() {
        return ProtocolCodeNumber;
    }

    public void setProtocolCodeNumber(String protocolCodeNumber) {
        ProtocolCodeNumber = protocolCodeNumber;
    }

    public String getSummaryKey() {
        return SummaryKey;
    }

    public void setSummaryKey(String summaryKey) {
        SummaryKey = summaryKey;
    }

    public String getEudraCTNumber() {
        return EudraCTNumber;
    }

    public void setEudraCTNumber(String eudraCTNumber) {
        EudraCTNumber = eudraCTNumber;
    }

    public String getFullTitle() {
        return FullTitle;
    }

    public void setFullTitle(String fullTitle) {
        FullTitle = fullTitle;
    }

    public String getMainObjective() {
        return MainObjective;
    }

    public void setMainObjective(String mainObjective) {
        MainObjective = mainObjective;
    }

    public String getSafetyObjective() {
        return SafetyObjective;
    }

    public void setSafetyObjective(String safetyObjective) {
        SafetyObjective = safetyObjective;
    }

    public String getSimplifiedTitle() {
        return SimplifiedTitle;
    }

    public void setSimplifiedTitle(String simplifiedTitle) {
        SimplifiedTitle = simplifiedTitle;
    }

    @Override
    public String toString() {
        return "Protocol{" +
                "id='" + id + '\'' +
                ", ProtocolCodeNumber='" + ProtocolCodeNumber + '\'' +
                ", SummaryKey='" + SummaryKey + '\'' +
                ", EudraCTNumber='" + EudraCTNumber + '\'' +
                ", FullTitle='" + FullTitle + '\'' +
                ", MainObjective='" + MainObjective + '\'' +
                ", SafetyObjective='" + SafetyObjective + '\'' +
                ", SimplifiedTitle='" + SimplifiedTitle + '\'' +
                '}';
    }
}