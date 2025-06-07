USE sleipnir;
CREATE TABLE t_order_0 (
    order_id BIGINT NOT NULL,
    account_id INT NOT NULL,
    user_id INT NOT NULL,
    -- Add other necessary fields like order_time, status, etc.
    PRIMARY KEY (order_id)
) ENGINE=InnoDB;

USE sleipnir;
CREATE TABLE IF NOT EXISTS t_order_1 LIKE t_order_0;

USE sleipnir;
CREATE TABLE IF NOT EXISTS t_order_2 LIKE t_order_0;