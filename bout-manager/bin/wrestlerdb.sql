DROP TABLE IF EXISTS wrestler                     CASCADE;
DROP TABLE IF EXISTS school                       CASCADE;
DROP TABLE IF EXISTS wrestler-school              CASCADE;


CREATE SEQUENCE wrestler_wrestler_id_seq
  INCREMENT BY 1
  NO MAXVALUE
  NO MINVALUE
  CACHE 1;

CREATE TABLE wrestler (
  wrestler_id integer DEFAULT nextval('wrestler_wrestler_id_seq'::regclass) NOT NULL,
  first_name varchar(80) NOT NULL,    
  last_name varchar(80) NOT NULL,
  wins integer NOT NULL,    
  losses integer NOT NULL,     
  previous_season_state_rank integer NOT NULL,         
  weight_class varchar(3) NOT NULL 
  school_id integer NOT NULL
  CONSTRAINT pk_wrestler_wrestler_id PRIMARY KEY (wrestler_id)
);

CREATE SEQUENCE school_school_id_seq
  INCREMENT BY 1
  NO MAXVALUE
  NO MINVALUE
  CACHE 1;

CREATE Table school(
  school_id integer DEFAULT nextval('school_school_id_seq'::regclass) NOT NULL,
  name varchar(80) NOT NULL
        CONSTRAINT pk_school_school_id PRIMARY KEY (school_id)  