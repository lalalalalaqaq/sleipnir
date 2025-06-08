USE sleipnir;
CREATE TABLE t_address (
    id BIGINT NOT NULL AUTO_INCREMENT,
    address_name VARCHAR(50) NOT NULL,
    user_id INT NOT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB;