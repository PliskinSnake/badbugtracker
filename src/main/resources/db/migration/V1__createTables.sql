CREATE SEQUENCE base_sequence INCREMENT 1 START 101;

CREATE TABLE developer (
    id serial UNIQUE ,
    firstName varchar(100),
    secondName varchar(100),
    email varchar(150) UNIQUE,
    CONSTRAINT DEVELOPERS_PK PRIMARY KEY (id, email)
);

CREATE TABLE bug (
    id serial,
    title varchar(200),
    description TEXT,
    dateOfCreation DATE,
    developer_id INT,
    PRIMARY KEY (id)
);

CREATE TABLE status (
    name VARCHAR(100) UNIQUE,
    description TEXT,
    PRIMARY KEY (name)
);

CREATE TABLE urgency (
    name VARCHAR(100) UNIQUE,
    description TEXT,
    PRIMARY KEY (name)
);

-- CREATE TABLE report (
--     id SERIAL UNIQUE,
--     bug_id INT NOT NULL,
--     status VARCHAR NOT NULL,
--     urgency VARCHAR NOT NULL,
--     developer_id INT NOT NULL,
--
--     PRIMARY KEY (id),
--
--     CONSTRAINT BUG_ID_FK FOREIGN KEY (bug_id)
--         REFERENCES bug(id)
--         ON DELETE NO ACTION ON UPDATE NO ACTION,
--
--     CONSTRAINT STATUS_FK FOREIGN KEY (status)
--         REFERENCES status(name)
--         ON DELETE NO ACTION ON UPDATE NO ACTION,
--
--     CONSTRAINT URGENCY_FK FOREIGN KEY (urgency)
--         REFERENCES urgency(name)
--         ON DELETE NO ACTION ON UPDATE NO ACTION,
--
--     CONSTRAINT DEVELOPER_EMAIL_FK FOREIGN KEY (developer_id)
--         REFERENCES developer(id)
--         ON DELETE NO ACTION ON UPDATE NO ACTION
-- );



