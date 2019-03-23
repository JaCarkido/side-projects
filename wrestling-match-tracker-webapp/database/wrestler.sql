DROP TABLE IF EXISTS wrestler              CASCADE;
DROP TABLE IF EXISTS matches                 CASCADE;

CREATE TABLE wrestler(
wrestler_id serial NOT NULL,
first_name varchar(45) NOT NULL,
last_name varchar(45) NOT NULL,
grade varchar(10) NOT NULL,
weight_class integer,
varsity boolean NOT NULL DEFAULT false,
wins integer, 
losses integer,
win_percent integer,
total_matches integer,
CONSTRAINT pk_wrestler_id PRIMARY KEY(wrestler_id)
);

CREATE TABLE matches(
match_id serial NOT NULL,
wrestler_id int NOT NULL,
opponent varchar(45),
opponent_school varchar(45),
opponent_score integer NOT NULL,
outcome varchar(1)NOT NULL CHECK(outcome ILIKE 'W' OR outcome ILIKE 'L'),
weight_class int, 
home_score int NOT NULL,
score_sequence varchar (500),
event varchar(100),
match_date DATE,
CONSTRAINT pk_matches_id PRIMARY KEY(match_id)
);


INSERT INTO wrestler (first_name, last_name, grade, weight_class) VALUES ('Randy', 'Savage', 'Senior', 285);
INSERT INTO wrestler (first_name, last_name, grade, weight_class) Values ('Sean','Barker','Freshman',106);
INSERT INTO wrestler (first_name, last_name, grade, weight_class) Values ('Kane','Surrar','Sophamore',106);
INSERT INTO wrestler (first_name, last_name, grade, weight_class) Values ('Jake','Arnold','Sophamore',113);
INSERT INTO wrestler (first_name, last_name, grade, weight_class) Values ('Kenny','Jenkins','Senior',120);
INSERT INTO wrestler (first_name, last_name, grade, weight_class) Values ('Cade','Cass','Freshman',126);
INSERT INTO wrestler (first_name, last_name, grade, weight_class) Values ('Nate','Brown','Sophamore',126);
INSERT INTO wrestler (first_name, last_name, grade, weight_class) Values ('Ashton','Jenkins','Sophamore',132);
INSERT INTO wrestler (first_name, last_name, grade, weight_class) Values ('Josh','Dunn','Sophamore',132);
INSERT INTO wrestler (first_name, last_name, grade, weight_class) Values ('Austin','Peterson','Freshman',138);
INSERT INTO wrestler (first_name, last_name, grade, weight_class) Values ('Cameron','','Freshman',138);
INSERT INTO wrestler (first_name, last_name, grade, weight_class) Values ('Cameron','Galla','Junior',138);
INSERT INTO wrestler (first_name, last_name, grade, weight_class) Values ('Brandon','Reidenour','Freshman',145);
INSERT INTO wrestler (first_name, last_name, grade, weight_class) Values ('Joey','Judsen','Senior',152);
INSERT INTO wrestler (first_name, last_name, grade, weight_class) Values ('Kodey','Trent','Junior',152);
INSERT INTO wrestler (first_name, last_name, grade, weight_class) Values ('Anthony','Norton','Junior',160);
INSERT INTO wrestler (first_name, last_name, grade, weight_class) Values ('Brody','Stallings','Junior',170);
INSERT INTO wrestler (first_name, last_name, grade, weight_class) Values ('Christian','Scnhieder','Junior',182);
INSERT INTO wrestler (first_name, last_name, grade, weight_class) Values ('Max','Kysanzsky','Freshman',220);
INSERT INTO wrestler (first_name, last_name, grade, weight_class) Values ('Logan','Henderson','Senior',285);

   

ALTER TABLE matches
ADD FOREIGN KEY(wrestler_id)
REFERENCES wrestler(wrestler_id);



