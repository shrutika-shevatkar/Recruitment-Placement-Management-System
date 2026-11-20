package com.rpms.model;

public class Offer {
    private int id;
    private int studentId;
    private int companyId;
    private double packageLpa;
    private String offerDate;
    private String status;

    public Offer(int id, int studentId, int companyId,
                 double packageLpa, String offerDate, String status) {
        this.id = id;
        this.studentId = studentId;
        this.companyId = companyId;
        this.packageLpa = packageLpa;
        this.offerDate = offerDate;
        this.status = status;
    }

    public int getId() { return id; }
    public int getStudentId() { return studentId; }
    public int getCompanyId() { return companyId; }
    public double getPackageLpa() { return packageLpa; }
    public String getOfferDate() { return offerDate; }
    public String getStatus() { return status; }
}
