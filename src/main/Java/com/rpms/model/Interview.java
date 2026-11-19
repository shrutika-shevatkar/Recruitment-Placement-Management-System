package com.rpms.model;

public class Interview {
    private int id;
    private int studentId;
    private int companyId;
    private String interviewDate;
    private String status;

    public Interview(int id, int studentId, int companyId,
                     String interviewDate, String status) {
        this.id = id;
        this.studentId = studentId;
        this.companyId = companyId;
        this.interviewDate = interviewDate;
        this.status = status;
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

    public String getInterviewDate() {
        return interviewDate;
    }

    public String getStatus() {
        return status;
    }
}
