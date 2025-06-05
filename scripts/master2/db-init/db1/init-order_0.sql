USE db0;
CREATE TABLE IF NOT EXISTS order_0 (
    id BIGINT PRIMARY KEY,
    user_id BIGINT NOT NULL,
    order_no VARCHAR(50) NOT NULL,
    amount DECIMAL(10,2) NOT NULL,
    UNIQUE KEY uniq_order_no(order_no)
) ENGINE=InnoDB;