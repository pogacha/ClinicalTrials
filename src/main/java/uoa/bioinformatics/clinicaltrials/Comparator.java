package uoa.bioinformatics.clinicaltrials;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Comparator {


    public Comparator(String id, String EudraCTNumber, String PharmForm, String RoutesOfAdm, String TypeOfComparator) {

        this.id = id;
        this.EudraCTNumber = EudraCTNumber;
        this.PharmForm = PharmForm;
        this.RoutesOfAdm = RoutesOfAdm;
        this.TypeOfComparator = TypeOfComparator;
    }


    public Comparator() {

    }


    @Id
    @GeneratedValue
    public String id;
    public String EudraCTNumber;
    public String PharmForm;
    public String RoutesOfAdm;
    public String TypeOfComparator;

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

    public String getPharmForm() {
        return PharmForm;
    }

    public void setPharmForm(String pharmForm) {
        PharmForm = pharmForm;
    }

    public String getRoutesOfAdm() {
        return RoutesOfAdm;
    }

    public void setRoutesOfAdm(String routesOfAdm) {
        RoutesOfAdm = routesOfAdm;
    }

    public String getTypeOfComparator() {
        return TypeOfComparator;
    }

    public void setTypeOfComparator(String typeOfComparator) {
        TypeOfComparator = typeOfComparator;
    }

    @Override
    public String toString() {
        return "Comparator{" +
                "id='" + id + '\'' +
                ", EudraCTNumber='" + EudraCTNumber + '\'' +
                ", PharmForm='" + PharmForm + '\'' +
                ", RoutesOfAdm='" + RoutesOfAdm + '\'' +
                ", TypeOfComparator='" + TypeOfComparator + '\'' +
                '}';
    }
}