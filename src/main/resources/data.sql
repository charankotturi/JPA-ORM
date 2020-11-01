--create table person (
--     id integer not null primary key,
--     name varchar(255) not null,
--     description varchar(255) not null,
--     joinDate timestamp
--);
INSERT INTO person (id, name, description, joinDate)
VALUES (1001, 'charan', 'smart', sysdate());
INSERT INTO person (id, name, description, joinDate)
VALUES (1002, 'virat', 'aggressive', sysdate());
INSERT INTO person (id, name, description, joinDate)
VALUES (1003, 'dhoni', 'patient', sysdate());
INSERT INTO person (id, name, description, joinDate)
VALUES (1004, 'john', 'careless', sysdate());