package com.revaturePaulFranklin.p1.models;

public class ReimbursementStatus {
//    CREATE TABLE ERS_REIMBURSEMENT_STATUSES (
//            STATUS_ID VARCHAR(255) PRIMARY KEY,
//    STATUS VARCHAR(255) UNIQUE
//);
    private String statusId;
    private String status;

    public String getStatusId() { return this.statusId; };
    public String getStatus() { return this.status; };

    public void setStatusId(String statusId1) { this.statusId = statusId1; };
    public void setStatus(String status1) { this.status = status1; };
}
