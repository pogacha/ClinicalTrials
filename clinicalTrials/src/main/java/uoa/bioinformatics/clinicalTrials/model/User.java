package uoa.bioinformatics.clinicalTrials.model;

import com.fasterxml.jackson.annotation.JsonCreator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity

@Table(name = "trial_user")
public class User {
    @Id
    @Column(name="userId", nullable = false)
    private String userId;
    @Column(name="sponsorId", nullable = false)
    private String sponsorId;
    @Column(name="userName")
    private String userName;
    @Column(name="pass", nullable = false)
    private String pass;
    @Column(name="organisation")
    private String organisation;
    @Column(name="phone")
    private String phone;
    @Column(name="email")
    private String email;
    @Column(name="address")
    private String address;


    public User() {
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSponsorId() {
        return sponsorId;
    }

    public void setSponsorId(String sponsorId) {
        this.sponsorId = sponsorId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @JsonCreator
    public User(String userId, String userName, String pass, String organisation, String phone, String email, String address ) {
        this.userId = userId;
        this.userName = userName;
        this.pass = pass;
        this.organisation = organisation;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }
}
