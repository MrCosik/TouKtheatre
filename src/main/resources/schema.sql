-- DROP TABLE IF EXISTS app_user;
-- DROP TABLE IF EXISTS movie;
-- DROP TABLE IF EXISTS room;
-- DROP TABLE IF EXISTS user_movie;

CREATE TABLE app_user
(
    id       INT PRIMARY KEY AUTO_INCREMENT,
    name     VARCHAR,
    username VARCHAR
);

CREATE TABLE room
(
    id              INT PRIMARY KEY AUTO_INCREMENT,
    number          INT,
    amount_of_seats INT
);

CREATE TABLE movie
(
    id                INT PRIMARY KEY AUTO_INCREMENT,
    title             VARCHAR,
    length_in_minutes INT
);

CREATE TABLE room_movie
(
    id             INT PRIMARY KEY AUTO_INCREMENT,
    room_id        INT REFERENCES room (id)
        ON DELETE CASCADE ON UPDATE CASCADE,
    movie_id       INT REFERENCES movie (id)
        ON DELETE CASCADE ON UPDATE CASCADE,
    time_of_airing VARCHAR
);

CREATE TABLE user_movie
(
    id          INT PRIMARY KEY AUTO_INCREMENT,
    user_id     INT REFERENCES app_user (id)
        ON DELETE CASCADE ON UPDATE CASCADE,
    movie_id    INT REFERENCES movie (id)
        ON DELETE CASCADE ON UPDATE CASCADE,
    seat_row    VARCHAR,
    seat_number INT
);

