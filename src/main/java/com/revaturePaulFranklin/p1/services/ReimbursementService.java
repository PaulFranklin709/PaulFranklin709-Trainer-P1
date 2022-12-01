package com.revaturePaulFranklin.p1.services;

import com.revaturePaulFranklin.p1.daos.ReimbursementDAO;
import com.revaturePaulFranklin.p1.dtos.requests.SubmitReimbursementTicketRequest;
import com.revaturePaulFranklin.p1.dtos.responses.Principal;
import com.revaturePaulFranklin.p1.models.Reimbursement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Timestamp;
import java.util.UUID;

public class ReimbursementService {
    private final Logger logger = LoggerFactory.getLogger(ReimbursementService.class);

//    DAOs
    private final ReimbursementDAO reimbursementDAO;

    public ReimbursementService(ReimbursementDAO reimbursementDAO) {
        this.reimbursementDAO = reimbursementDAO;
    }

    public void submitNewReimbursementTicket(Principal principal, SubmitReimbursementTicketRequest requestToSubmitUserReimbursementTicket) {
        Timestamp myTime = new Timestamp(System.currentTimeMillis());
        Reimbursement reimbursement = new Reimbursement(
                UUID.randomUUID().toString(),
                requestToSubmitUserReimbursementTicket.getAmount(),
                myTime,
                requestToSubmitUserReimbursementTicket.getDescription(),
                principal.getUserId(),
                requestToSubmitUserReimbursementTicket.getTypeId()
        );

        reimbursementDAO.createReimbursementTicket(reimbursement);
    }
}
