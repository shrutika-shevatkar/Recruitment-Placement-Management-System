package com.rpms.model;

public class Placement {
    private int id;
    private int studentId;
    private int companyId;
    private String placedOn;

    public Placement(int id, int studentId,
                     int companyId, String placedOn) {
        this.id = id;
        this.studentId = studentId;
        this.companyId = companyId;
        this.placedOn = placedOn;
    }

    public int getId() {
        return id;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public String getPlacedOn() {
        return placedOn;
    }
}
