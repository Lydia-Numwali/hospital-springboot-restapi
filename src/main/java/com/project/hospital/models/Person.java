package com.project.hospital.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Embeddable
public class Person {
    @NotNull
    @Min(3) @Max(100)
    private String fname;
    @NotNull
    @Min(3) @Max(100)
    private String lname;
    @NotNull
    @Column(unique = true)
    private String phone;
    @NotNull
    private int age;
    @NotNull
    private String gender;

    public Person() {}

    public Person(String fname, String lname, String phone, int age, String gender) {
        this.fname = fname;
        this.lname = lname;
        this.phone = phone;
        this.age = age;
        this.gender = gender;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
