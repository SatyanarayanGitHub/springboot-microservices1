--CREATE SEQUENCE hibernate_sequence START WITH 1 INCREMENT BY 1;

--CREATE TABLE payment_tb (
--  payment_id INT NOT NULL,
--   payment_status VARCHAR(255),
--   transaction_id VARCHAR(255),
--   order_id INT NOT NULL,
--   amount DOUBLE PRECISION NOT NULL,
--   CONSTRAINT pk_payment_tb PRIMARY KEY (payment_id)
--);

INSERT INTO payment_tb (payment_id, payment_status,transaction_id) VALUES (201,'success','45f649cb-68e5-44b5-9090-acd7fd247c05');
INSERT INTO payment_tb (payment_id, payment_status,transaction_id) VALUES (202,'success','1539d3d5-ab29-4bb3-94b5-f4b240e2bbee');