
CREATE TABLE carts (
                       cart_id INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
                       user_id INT(11),
                       created_at TIMESTAMP DEFAULT LOCALTIMESTAMP NOT NULL NULL_TO_DEFAULT,
                       updated_at TIMESTAMP
);

