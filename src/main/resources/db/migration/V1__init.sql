CREATE SEQUENCE weather_sequence START 1 INCREMENT 1;

CREATE TABLE weather_event (
    id BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('weather_sequence'),
    city VARCHAR(255) NOT NULL,
    date_time TIMESTAMP NOT NULL
);

ALTER SEQUENCE weather_sequence OWNED BY weather_event.id;