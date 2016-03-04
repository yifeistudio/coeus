package com.yifeistudio.coeus.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

/**
 *
 * Created by yi on 16-3-4.
 */
@Entity
@Table(name = "t_user")
public class User extends CommonBean{

    private String name;
    private String password;
    private Boolean gender;
    private Date birthDate;
    private String currentLocation;
    private String homeTown;
    private String email;
    private String phone;
    private Byte[] icon;
    private Integer identity;

    public User() {

    }

    public User(String id, String name, String password, Boolean gender, Date birthDate, String currentLocation, String homeTown, String email, String phone, Byte[] icon, Integer identity) {

        this.id = id;
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.birthDate = birthDate;
        this.currentLocation = currentLocation;
        this.homeTown = homeTown;
        this.email = email;
        this.phone = phone;
        this.icon = icon;
        this.identity = identity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    @Column(name = "birth_date")
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Column(name = "current_location")
    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Byte[] getIcon() {
        return icon;
    }

    public void setIcon(Byte[] icon) {
        this.icon = icon;
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }
}
///~End of File.