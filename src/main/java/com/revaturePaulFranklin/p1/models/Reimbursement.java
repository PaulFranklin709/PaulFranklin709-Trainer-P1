package com.revaturePaulFranklin.p1.models;

public class Reimbursement {
//            REIMB_ID VARCHAR(255) PRIMARY KEY,
//    AMOUNT NUMERIC(6,2) NOT NULL,
//    SUBMITTED TIMESTAMP NOT NULL,
//    RESOLVED TIMESTAMP,
//    DESCRIPTION VARCHAR(255) NOT NULL,
//    RECEIPT BYTEA,
//    PAYMENT_ID VARCHAR(255),
//    AUTHOR_ID VARCHAR(255) NOT NULL REFERENCES ERS_USERS(USER_ID),
//    RESOLVER_ID VARCHAR(255) REFERENCES ERS_USERS,
//    STATUS_ID VARCHAR(255) NOT NULL REFERENCES ERS_REIMBURSEMENT_STATUSES(STATUS_ID),
//    TYPE_ID VARCHAR(255) NOT NULL REFERENCES ERS_REIMBURSEMENT_TYPES(TYPE_ID)
    private String reimbId;
    private Integer amount;
//    https://www.postgresql.org/docs/9.1/datatype-datetime.html
    private String submitted;
    private String resolved;
    private String description;
    private String receipt;
    private String paymentId;
    private String authorId;
    private String resolverId;
    private String statusId;
    private String typeId;

    public String getReimbId() {
        return reimbId;
    }

    public void setReimbId(String reimbId) {
        this.reimbId = reimbId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getSubmitted() {
        return submitted;
    }

    public void setSubmitted(String submitted) {
        this.submitted = submitted;
    }

    public String getResolved() {
        return resolved;
    }

    public void setResolved(String resolved) {
        this.resolved = resolved;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getResolverId() {
        return resolverId;
    }

    public void setResolverId(String resolverId) {
        this.resolverId = resolverId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }
}
