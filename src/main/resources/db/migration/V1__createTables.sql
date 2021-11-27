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

CREATE TABLE priority (
    id serial UNIQUE,
    name VARCHAR(100) UNIQUE,
    description TEXT,
    PRIMARY KEY (id, name)
);

CREATE TABLE urgency (
    id serial UNIQUE,
    name VARCHAR(100) UNIQUE,
    description TEXT,
    PRIMARY KEY (id, name)
);

CREATE TABLE report (
    developer_id INT NOT NULL,
    bug_id INT NOT NULL,


    PRIMARY KEY (developer_id, bug_id),

    CONSTRAINT DEVELOPER_ID_FK FOREIGN KEY (developer_id)
        REFERENCES developer(id)
        ON DELETE NO ACTION ON UPDATE NO ACTION,

    CONSTRAINT BUG_ID_FK FOREIGN KEY (bug_id)
        REFERENCES bug(id)
        ON DELETE NO ACTION ON UPDATE NO ACTION

);



