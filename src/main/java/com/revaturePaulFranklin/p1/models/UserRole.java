package com.revaturePaulFranklin.p1.models;

public class UserRole {
//    CREATE TABLE ERS_USER_ROLES (
//            ROLE_ID VARCHAR(255) PRIMARY KEY,
//    ROLE VARCHAR(255) UNIQUE
//);
    private String roleId;
    private String role;

    public String getRoleId() { return this.roleId; };
    public String getRole() { return this.role; };

    public void setRoleId(String roleId1) { this.roleId = roleId1; };
    public void setRole(String role1) { this.role = role1; };
}
