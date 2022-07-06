package uoa.bioinformatics.clinicalTrials.model;

import com.fasterxml.jackson.annotation.JsonCreator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity

@Table(name = "comparator")
public class Comparator {

    @Id
    @Column(name="id", nullable = false)
    private String id;
    @Column(name="eudraCTNumber", nullable = false)
    private String eudraCTNumber;
    @Column(name="pharmForm")
    private String pharmForm;
    @Column(name="routesOfAdm")
    private String routesOfAdm;
    @Column(name="typeOfComparator")
    private String typeOfComparator;

    public Comparator() {
    }

    @JsonCreator
    public Comparator(String id, String eudraCTNumber, String pharmForm, String routesOfAdm, String typeOfComparator) {
        this.id = id;
        this.eudraCTNumber = eudraCTNumber;
        this.pharmForm = pharmForm;
        this.routesOfAdm = routesOfAdm;
        this.typeOfComparator = typeOfComparator;
    }

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

    public String getPharmForm() {
        return pharmForm;
    }

    public void setPharmForm(String pharmForm) {
        this.pharmForm = pharmForm;
    }

    public String getRoutesOfAdm() {
        return routesOfAdm;
    }

    public void setRoutesOfAdm(String routesOfAdm) {
        this.routesOfAdm = routesOfAdm;
    }

    public String getTypeOfComparator() {
        return typeOfComparator;
    }

    public void setTypeOfComparator(String typeOfComparator) {
        this.typeOfComparator = typeOfComparator;
    }
}