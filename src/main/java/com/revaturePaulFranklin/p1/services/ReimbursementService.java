package com.revaturePaulFranklin.p1.services;

import com.revaturePaulFranklin.p1.daos.ReimbursementDAO;
import com.revaturePaulFranklin.p1.dtos.responses.requests.SubmitReimbursementTicketRequest;
import com.revaturePaulFranklin.p1.dtos.responses.Principal;
import com.revaturePaulFranklin.p1.models.Reimbursement;
import com.revaturePaulFranklin.p1.utils.custom_exceptions.InvalidReimbursementException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Timestamp;
import java.util.List;
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

    public List<Reimbursement> showAllReimbursementTicket() {
        return reimbursementDAO.getAllPendingReimbursementTickets();
    }

    public void approveReimbursementTicket(String reimbId, Principal principal) {
        boolean isResolved = reimbursementDAO.getIsResolvedReimbursementTicket(reimbId);

        if (isResolved) {
            throw new InvalidReimbursementException();
        }

        Timestamp myTime = new Timestamp(System.currentTimeMillis());
        reimbursementDAO.approveReimbursementTicket(reimbId, myTime, principal.getUserId());
    }

    public void denyReimbursementTicket(String reimbId, Principal principal) {
        boolean isResolved = reimbursementDAO.getIsResolvedReimbursementTicket(reimbId);

        if (isResolved) {
            throw new InvalidReimbursementException();
        }

        Timestamp myTime = new Timestamp(System.currentTimeMillis());
        reimbursementDAO.denyReimbursementTicket(reimbId, myTime, principal.getUserId());
    }
}
