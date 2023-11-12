package com.personal.myApplications.entity;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
public class ApplicationsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int serialNo;
    @Column(length = 100, nullable = false)
    private String companyName;
    @Column(length = 20, nullable = false)
    private String platform;
    private LocalDate appliedDate;

    @Column(length = 10)
    private String Applicationstatus;
    private boolean accepted;
    private boolean rejected;

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public LocalDate getAppliedDate() {
        return appliedDate;
    }

    public void setAppliedDate(LocalDate appliedDate) {
        this.appliedDate = appliedDate;
    }

    public String getApplicationstatus() {
        return Applicationstatus;
    }

    public void setApplicationstatus(String applicationstatus) {
        Applicationstatus = applicationstatus;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public boolean isRejected() {
        return rejected;
    }

    public void setRejected(boolean rejected) {
        this.rejected = rejected;
    }

    public ApplicationsEntity(){}

    public ApplicationsEntity(int serialNo, String companyName, String platform, LocalDate appliedDate, String applicationstatus, boolean accepted, boolean rejected) {
        this.serialNo = serialNo;
        this.companyName = companyName;
        this.platform = platform;
        this.appliedDate = appliedDate;
        Applicationstatus = applicationstatus;
        this.accepted = accepted;
        this.rejected = rejected;
    }
}
