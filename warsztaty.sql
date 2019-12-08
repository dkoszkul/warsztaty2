-- Stworzenie tabeli users
CREATE TABLE users (
    id INT AUTO_INCREMENT,
    userName VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(60) NOT NULL,
    PRIMARY KEY (id)
);