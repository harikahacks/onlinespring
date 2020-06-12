package com.google.demospring.department.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Department {

    @Id
    private int depId;
    private String depName;
    private int depStaff;
    private int depLabs;

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public int getDepStaff() {
        return depStaff;
    }

    public void setDepStaff(int depStaff) {
        this.depStaff = depStaff;
    }

    public int getDepLabs() {
        return depLabs;
    }

    public void setDepLabs(int depLabs) {
        this.depLabs = depLabs;
    }

    @Override
    public String toString() {
        return "Department{" +
                "depId=" + depId +
                ", depName='" + depName + '\'' +
                ", depStaff=" + depStaff +
                ", depLabs=" + depLabs +
                '}';
    }

}
