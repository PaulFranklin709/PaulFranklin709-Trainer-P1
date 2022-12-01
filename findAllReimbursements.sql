--https://www.postgresql.org/docs/current/ddl-schemas.html
SET search_path TO p1;

SELECT * FROM ERS_REIMBURSEMENTS;
DELETE FROM ERS_REIMBURSEMENTS WHERE reimb_id != '0';
