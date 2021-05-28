package com.example.demo.student;

import org.yaml.snakeyaml.constructor.Construct;

import java.time.LocalDate;

public class student {
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer aga;

    public student() {
    }

    public student(Long id, String name, String email, LocalDate dob, Integer aga) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.aga = aga;
    }

    public student(String name, String email, LocalDate dob, Integer aga) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.aga = aga;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAga() {
        return aga;
    }

    public void setAga(Integer aga) {
        this.aga = aga;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", aga=" + aga +
                '}';
    }
}
