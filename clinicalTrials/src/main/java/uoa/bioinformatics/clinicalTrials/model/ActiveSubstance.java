package uoa.bioinformatics.clinicalTrials.model;

import com.fasterxml.jackson.annotation.JsonCreator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "active_substance")
public class ActiveSubstance {

    @Id
    @Column(name="casNumber", nullable = false)
    private String casNumber;
    @Column(name="evSubstanceCode", nullable = false)
    private String evSubstanceCode;
    @Column(name="substanceName", nullable = false)
    private String substanceName;

    @JsonCreator
    public ActiveSubstance(String casNumber, String evSubstanceCode, String substanceName) {
        this.casNumber = casNumber;
        this.evSubstanceCode = evSubstanceCode;
        this.substanceName = substanceName;
    }

    public ActiveSubstance() {
    }

    public String getCasNumber() {
        return casNumber;
    }

    public void setCasNumber(String casNumber) {
        this.casNumber = casNumber;
    }

    public String getEvSubstanceCode() {
        return evSubstanceCode;
    }

    public void setEvSubstanceCode(String evSubstanceCode) {
        this.evSubstanceCode = evSubstanceCode;
    }

    public String getSubstanceName() {
        return substanceName;
    }

    public void setSubstanceName(String substanceName) {
        this.substanceName = substanceName;
    }
}