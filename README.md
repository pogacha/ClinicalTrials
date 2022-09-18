# ClinicalTrials
UOA Bioinformatics Web Project

## Prerequisites

In order to run ClinicalTrials you will need
-  16.14.0 node version
-  3.5.0 npm version
-  13.2.3 angular version 
- 2.6 Spring boot version  
- any mySQL client (for the development we used MySQL Workbench)

## Installation

- First build clinical trials database (Code 1)
- After initialize the server with the previous database run the clinicalTrials folder as an intelijIDEA project (BE)
- At last navigate to clinicalTrials-frontend and run
``` ng serve ``` and open localhost:4200/ to run the project

## API
At  https://web.postman.co/workspace/My-Workspace~a2b39f53-cfbe-414b-8a73-f27700d93be1/overview there are examples for most of the calls that are used


## Annex
#### Code 1
``` 
DROP DATABASE IF EXISTS clinicaltrials;
CREATE DATABASE IF NOT EXISTS clinicaltrials;

USE clinicaltrials;


CREATE TABLE sponsor(
sponsor_id INT AUTO_INCREMENT,
sponsor_name VARCHAR(250)  NOT NULL ,
sponsor_status VARCHAR(250),
name_of_supporting_org VARCHAR(250),
PRIMARY KEY (sponsor_id),
INDEX sponsor_idx (sponsor_name)
);

CREATE TABLE trial_user(
user_id INT AUTO_INCREMENT,
sponsor_id INT,
user_name VARCHAR (250),
pass VARCHAR(250),
organisation VARCHAR(250),
phone VARCHAR(250),
email VARCHAR(250),
address VARCHAR(250),
PRIMARY KEY (user_id),
FOREIGN KEY (sponsor_id) REFERENCES sponsor(sponsor_id)
		ON DELETE CASCADE
        ON UPDATE CASCADE 
);

CREATE TABLE trial(
eudraCTNumber VARCHAR(50) NOT NULL,
sponsor_id INT,
trial_status VARCHAR(250) NOT NULL,
design_of_the_trial MEDIUMTEXT,
trial_type_phase TEXT NOT NULL,
scope_of_the_trial MEDIUMTEXT,
estimated_duration VARCHAR(255),
link VARCHAR(250),
therapeutic_area VARCHAR(250),
number_of_subjects INT,
first_added_date DATE,
PRIMARY KEY (eudraCTNumber),
FOREIGN KEY (sponsor_id) REFERENCES sponsor(sponsor_id)
		ON DELETE SET NULL
        ON UPDATE SET NULL, 
INDEX trial_idx (EudraCTNumber)
);

CREATE TABLE criteria(
id INT AUTO_INCREMENT,
eudraCTNumber VARCHAR(50) NOT NULL,
specific_vulnerable_populations MEDIUMTEXT,
exclusion_criteria MEDIUMTEXT,
criteria_age VARCHAR(250),
criteria_gender VARCHAR(250),
criteria_hiv_test BOOLEAN,
inc_iteria_other MEDIUMTEXT,
group_of_subjects MEDIUMTEXT,
PRIMARY KEY (id),
FOREIGN KEY (eudraCTNumber) REFERENCES trial(eudraCTNumber)
	ON DELETE CASCADE
	ON UPDATE CASCADE 
);


CREATE TABLE protocol(
protocol_code_number VARCHAR(250) NOT NULL,
eudraCTNumber VARCHAR(50) NOT NULL,
full_title MEDIUMTEXT,
simplified_title MEDIUMTEXT,
main_objective MEDIUMTEXT,
safety_objective MEDIUMTEXT,
PRIMARY KEY (protocol_code_number),
FOREIGN KEY (eudraCTNumber) REFERENCES trial(eudraCTNumber)
	ON DELETE CASCADE
	ON UPDATE CASCADE,
INDEX protocol_idx (protocol_code_number)
);

CREATE TABLE comparator(
id INT AUTO_INCREMENT,
eudraCTNumber VARCHAR(50) NOT NULL,
pharm_form VARCHAR(250),
routes_of_adm VARCHAR(250),
type_of_comparator VARCHAR(250) NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (eudraCTNumber) REFERENCES trial(eudraCTNumber)
	ON DELETE CASCADE
	ON UPDATE CASCADE
);

CREATE TABLE imp(
imp_id INT AUTO_INCREMENT,
eudraCTNumber VARCHAR(50) NOT NULL,
routes_of_adm VARCHAR(250),
trade_name VARCHAR(250),
product_name VARCHAR(250),
imp_role VARCHAR(250),
more_info MEDIUMTEXT,
has_marketing_auth VARCHAR(3),
country_has_marketing_auth VARCHAR(250),
pharm_form VARCHAR(250),
PRIMARY KEY (imp_id),
INDEX imp_idx (imp_id),
FOREIGN KEY (eudraCTNumber) REFERENCES trial(eudraCTNumber)
	ON DELETE CASCADE
	ON UPDATE CASCADE
);

CREATE TABLE active_substance(
cas_number VARCHAR(250) NOT NULL,
ev_substance_code VARCHAR(250) NOT NULL,
substance_name VARCHAR(250),
PRIMARY KEY (cas_number)
);


CREATE TABLE imp_substance_assoc(
imp_id INT,
cas_number VARCHAR(250),
PRIMARY KEY (imp_id, cas_number),
FOREIGN KEY (imp_id) REFERENCES imp(imp_id)
	ON DELETE CASCADE
	ON UPDATE CASCADE,
FOREIGN KEY (cas_number) REFERENCES active_substance(cas_number)
	ON DELETE CASCADE
	ON UPDATE CASCADE
);
```





