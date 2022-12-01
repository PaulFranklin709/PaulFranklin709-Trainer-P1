package com.revaturePaulFranklin.p1.handlers;

import com.revaturePaulFranklin.p1.dtos.requests.SubmitReimbursementTicketRequest;
import com.revaturePaulFranklin.p1.dtos.responses.Principal;
import com.revaturePaulFranklin.p1.services.ReimbursementService;
import com.revaturePaulFranklin.p1.services.TokenService;
import com.revaturePaulFranklin.p1.utils.custom_exceptions.InvalidAuthenticationException;
import com.revaturePaulFranklin.p1.utils.custom_exceptions.InvalidReimbursementException;
import io.javalin.http.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReimbursementHandler {
    private final Logger logger = LoggerFactory.getLogger(ReimbursementHandler.class);

//    Services
    private final ReimbursementService reimbursementService;
    private final TokenService tokenService;

//    Statuses
    private final Integer STATUS_CREATED = 201;
    private final Integer STATUS_UNAUTHORIZED = 401;
    private final Integer STATUS_FORBIDDEN = 403;

    public ReimbursementHandler(ReimbursementService reimbursementService, TokenService tokenService) {
        this.reimbursementService = reimbursementService;
        this.tokenService = tokenService;
    }

    public void submitUserReimbursementTicket(Context context) {
        SubmitReimbursementTicketRequest requestToSubmitUserReimbursementTicket = new SubmitReimbursementTicketRequest(context.req);

        try {
            Principal principal = tokenService.retrievePrincipalFromToken(requestToSubmitUserReimbursementTicket.getToken());

            reimbursementService.submitNewReimbursementTicket(principal, requestToSubmitUserReimbursementTicket);

            context.status(STATUS_CREATED);
        } catch (InvalidAuthenticationException exception) {
            logger.error("Failed to get User by login from handler.");

//            https://github.com/221114-Java-React/Resources/blob/5c14d956b8dc2e95878f21e42a959fda022fa3a4/week3-rest/intro-web-http.md
            context.status(STATUS_UNAUTHORIZED);
        } catch (InvalidReimbursementException exception) {
            logger.error("Failed to create new Reimbursement from handler.");

//            https://github.com/221114-Java-React/Resources/blob/5c14d956b8dc2e95878f21e42a959fda022fa3a4/week3-rest/intro-web-http.md
            context.status(STATUS_FORBIDDEN);
        }
    }
}
