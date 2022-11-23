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

    public String getReimbId() { return this.reimbId; };
    public Integer getAmount() { return this.amount; };
    public String getSubmitted() { return this.submitted; };
    public String getResolved() { return this.resolved; };
    public String getDescription() { return this.description; };
    public String getReceipt() { return this.receipt; };
    public String getPaymentId() { return this.paymentId; };
    public String getAuthorId() { return this.authorId; };
    public String getResolverId() { return this.resolverId; };
    public String getStatusId() { return this.statusId; };
    public String getTypeId() { return this.typeId; };

    public void setReimbId(String reimbId1) { this.reimbId = reimbId1; };
    public void setAmount(Integer amount1) { this.amount = amount1; };
    public void setSubmitted(String submitted1) { this.submitted = submitted1; };
    public void setResolved(String resolved1) { this.resolved = resolved1; };
    public void setDescription(String description1) { this.description = description1; };
    public void setReceipt(String receipt1) { this.receipt = receipt1; };
    public void setPaymentId(String paymentId1) { this.paymentId = paymentId1; };
    public void setAuthorId(String authorId1) { this.authorId = authorId1; };
    public void setResolverId(String resolverId1) { this.resolverId = resolverId1; };
    public void setStatusId(String statusId1) { this.statusId = statusId1; };
    public void setTypeId(String typeId1) { this.typeId = typeId1; };
}
