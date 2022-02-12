package uoa.bioinformatics.clinicaltrials;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {


    public User(String id, String UserName, String SponsorName, String Pass, String Organisation, String Phone, String Email, String Adress) {

        this.id = id;
        this.UserName = UserName;
        this.SponsorName = SponsorName;
        this.Pass = Pass;
        this.Organisation = Organisation;
        this.Phone = Phone;
        this.Email = Email;
        this.Address = Adress;
    }


    public User() {

    }




    @Id
    @GeneratedValue
    public String id;
    public String UserName;
    public String SponsorName;
    public String Pass;
    public String Organisation;
    public String Phone;
    public String Email;
    public String Address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getSponsorName() {
        return SponsorName;
    }

    public void setSponsorName(String sponsorName) {
        SponsorName = sponsorName;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String pass) {
        Pass = pass;
    }

    public String getOrganisation() {
        return Organisation;
    }

    public void setOrganisation(String organisation) {
        Organisation = organisation;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "user{" +
                "id='" + id + '\'' +
                ", UserName='" + UserName + '\'' +
                ", SponsorName='" + SponsorName + '\'' +
                ", Pass='" + Pass + '\'' +
                ", Organisation='" + Organisation + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Email='" + Email + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}