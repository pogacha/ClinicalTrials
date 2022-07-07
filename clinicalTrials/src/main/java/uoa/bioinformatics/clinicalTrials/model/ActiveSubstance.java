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
    @Column(name="cas_number", nullable = false)
    private String cas_number;
    @Column(name="ev_substance_code", nullable = false)
    private String ev_substance_code;
    @Column(name="substance_name", nullable = false)
    private String substance_name;


    @JsonCreator
    public ActiveSubstance(String cas_number, String ev_substance_code, String substance_name) {
        this.cas_number = cas_number;
        this.ev_substance_code = ev_substance_code;
        this.substance_name = substance_name;
    }

    public ActiveSubstance() {
    }

    public String getCas_number() {
        return cas_number;
    }

    public void setCas_number(String cas_number) {
        this.cas_number = cas_number;
    }

    public String getEv_substance_code() {
        return ev_substance_code;
    }

    public void setEv_substance_code(String ev_substance_code) {
        this.ev_substance_code = ev_substance_code;
    }

    public String getSubstance_name() {
        return substance_name;
    }

    public void setSubstance_name(String substance_name) {
        this.substance_name = substance_name;
    }
}