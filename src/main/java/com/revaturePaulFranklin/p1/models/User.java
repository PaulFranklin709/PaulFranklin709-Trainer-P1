package com.revaturePaulFranklin.p1.models;

public class User {
//    CREATE TABLE ERS_USERS (
//            USER_ID VARCHAR(255) PRIMARY KEY,
//    USERNAME VARCHAR(255) UNIQUE NOT NULL,
//    EMAIL VARCHAR(255) UNIQUE NOT NULL,
//    PASSWORD VARCHAR(255) NOT NULL,
//    GIVEN_NAME VARCHAR(255) NOT NULL,
//    SURNAME VARCHAR(255) NOT NULL,
//    IS_ACTIVE BOOLEAN,
//    ROLE_ID VARCHAR(255) REFERENCES ERS_USER_ROLES(ROLE_ID)
//            );
    private String userId;
    private String username;
    private String email;
    private String password;
    private String givenName;
    private String surname;
    private Boolean isActive;
    private String roleId;

    public String getUserId() { return this.userId; };
    public String getUsername() { return this.username; };
    public String getEmail() { return this.email; };
    public String getPassword() { return this.password; };
    public String getGivenName() { return this.givenName; };
    public String getSurname() { return this.surname; };
    public Boolean getIsActive() { return this.isActive; };
    public String getRoleId() { return this.roleId; };

    public void setUserId(String userId1) { this.userId = userId1; };
    public void setUsername(String username1) { this.username = username1; };
    public void setEmail(String email1) { this.email = email1; };
    public void setPassword(String password1) { this.password = password1; };
    public void setGivenName(String givenName1) { this.givenName = givenName1; };
    public void setSurname(String surname1) { this.surname = surname1; };
    public void setIsActive(Boolean isActive1) { this.isActive = isActive1; };
    public void setRoleId(String roleId1) { this.roleId = roleId1; };
}
