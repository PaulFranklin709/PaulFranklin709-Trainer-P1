package com.revaturePaulFranklin.p1.dtos.responses.requests;

import javax.servlet.http.HttpServletRequest;

public class ShowMyReimbursementTicketsRequest {
    private String token;

    public ShowMyReimbursementTicketsRequest(HttpServletRequest request) {
        this.token = request.getParameter("token");
    }

    public String getToken() {
        return token;
    }
}
