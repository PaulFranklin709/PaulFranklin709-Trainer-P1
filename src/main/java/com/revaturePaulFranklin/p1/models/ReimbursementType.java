package com.revaturePaulFranklin.p1.models;

public class ReimbursementType {
//    CREATE TABLE ERS_REIMBURSEMENT_TYPES (
//            TYPE_ID VARCHAR(255) PRIMARY KEY,
//    TYPE VARCHAR(255) UNIQUE
//);
    private String typeId;
    private String type;

    public String getTypeId() { return this.typeId; };
    public String getType() { return this.type; };

    public void setTypeId(String typeId1) { this.typeId = typeId1; };
    public void setType(String type1) { this.type = type1; };
}
