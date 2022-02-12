package uoa.bioinformatics.clinicaltrials;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ActiveSubstance {


    public ActiveSubstance(String CasNumber, String ImpId, String EVSubstanceCode, String RoutesOfAdm, String SubstanceName) {

        this.CasNumber = CasNumber;
        this.ImpId = ImpId;
        this.EVSubstanceCode = EVSubstanceCode;
        this.SubstanceName = SubstanceName;
    }


    public ActiveSubstance() {

    }


    @Id
    public String CasNumber;
    public String ImpId;
    public String EVSubstanceCode;
    public String SubstanceName;

    public String getCasNumber() {
        return CasNumber;
    }

    public void setCasNumber(String casNumber) {
        CasNumber = casNumber;
    }

    public String getImpId() {
        return ImpId;
    }

    public void setImpId(String impId) {
        ImpId = impId;
    }

    public String getEVSubstanceCode() {
        return EVSubstanceCode;
    }

    public void setEVSubstanceCode(String EVSubstanceCode) {
        this.EVSubstanceCode = EVSubstanceCode;
    }

    public String getSubstanceName() {
        return SubstanceName;
    }

    public void setSubstanceName(String substanceName) {
        SubstanceName = substanceName;
    }

    @Override
    public String toString() {
        return "ActiveSubstance{" +
                "CasNumber='" + CasNumber + '\'' +
                ", ImpId='" + ImpId + '\'' +
                ", EVSubstanceCode='" + EVSubstanceCode + '\'' +
                ", SubstanceName='" + SubstanceName + '\'' +
                '}';
    }
}