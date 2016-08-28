package com.dms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Rishi on 7/29/2016.
 */
@Entity
public class Person {

    @Id
    @GeneratedValue
    private long id;
    private String firstName;
    private String lastName;
    private String Gender;
    private long StudentId;
    private Date birthDate;
    private String mobileNo;

    public Person() {
    }

    public Person(String firstName, String lastName, String gender, long studentId, Date birthDate, String mobileNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        Gender = gender;
        StudentId = studentId;
        this.birthDate = birthDate;
        this.mobileNo = mobileNo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public long getStudentId() {
        return StudentId;
    }

    public void setStudentId(long studentId) {
        StudentId = studentId;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
