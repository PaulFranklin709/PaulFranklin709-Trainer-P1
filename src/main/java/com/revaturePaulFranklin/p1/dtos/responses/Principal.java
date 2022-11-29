package com.revaturePaulFranklin.p1.dtos.responses;

import com.revaturePaulFranklin.p1.models.UserRole;

public class Principal {
    private String userId;
    private String username;
    private String role;

    public Principal(String userId, String username, UserRole userRole) {
        this.userId = userId;
        this.username = username;
        this.role = userRole.getRole();
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }
}
