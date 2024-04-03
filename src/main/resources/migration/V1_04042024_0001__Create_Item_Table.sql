CREATE TABLE item
(
    id integer NOT NULL auto_increment,
    title varchar(255),
    link varchar(255),
    publication_date varchar(255),
    pinned BOOLEAN,
    PRIMARY KEY (id)
);