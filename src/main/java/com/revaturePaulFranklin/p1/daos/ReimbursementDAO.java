package com.revaturePaulFranklin.p1.daos;

import com.revaturePaulFranklin.p1.models.Reimbursement;
import com.revaturePaulFranklin.p1.utils.ConnectionFactory;
import com.revaturePaulFranklin.p1.utils.custom_exceptions.InvalidReimbursementException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ReimbursementDAO {
    private final Logger logger = LoggerFactory.getLogger(ReimbursementDAO.class);

    public void createReimbursementTicket(Reimbursement reimbursement) {
        try (Connection sqlConnection = ConnectionFactory.getInstance().getConnection()) {
//            https://www.postgresql.org/docs/current/ddl-schemas.html
            PreparedStatement preparedSqlStatement = sqlConnection.prepareStatement("INSERT INTO p1.ERS_REIMBURSEMENTS\n" +
                    "(REIMB_ID,AMOUNT,SUBMITTED,RESOLVED,DESCRIPTION,RECEIPT,PAYMENT_ID,AUTHOR_ID,RESOLVER_ID,STATUS_ID,TYPE_ID)\n" +
                    "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            preparedSqlStatement.setString(1, reimbursement.getReimbId());
            preparedSqlStatement.setDouble(2, reimbursement.getAmount());
            preparedSqlStatement.setTimestamp(3, reimbursement.getSubmitted());
            preparedSqlStatement.setTimestamp(4, reimbursement.getResolved());
            preparedSqlStatement.setString(5, reimbursement.getDescription());
            preparedSqlStatement.setBytes(6, reimbursement.getReceipt());
            preparedSqlStatement.setString(7, reimbursement.getPaymentId());
            preparedSqlStatement.setString(8, reimbursement.getAuthorId());
            preparedSqlStatement.setString(9, reimbursement.getResolverId());
            preparedSqlStatement.setString(10, reimbursement.getStatusId());
            preparedSqlStatement.setString(11, reimbursement.getTypeId());
            preparedSqlStatement.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
            logger.error("Failed to save new Reimbursement in database.");
            throw new InvalidReimbursementException();
        }
    }
}
