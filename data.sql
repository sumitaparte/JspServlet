create table Location(
 LocationID varchar2(10) primary key,
 city varchar2(10),
 hstate varchar2(10),
 zip varchar2(10)
 );
 
 create table Programs_Scheduled (
 Scheduled_program_id varchar2(5) primary key,
 ProgramName varchar2(5),
 LocationID varchar2(10)  REFERENCES Location(LocationID) ,
 start_date date,
 end_date date,
 sessions_per_week number
 );
 
 
create table Application
(
Application_id number(25) primary key,
full_name varchar2(20),
date_of_birth date,
highest_qualification varchar2(10),
marks_obtained number, 
goals varchar2(20),
 email_id varchar2(20),
 Scheduled_program_id varchar2(5) REFERENCES Programs_Scheduled(Scheduled_program_id),
 status varchar2(10),
Date_Of_Interview date
);
ALTER table Application modify status DEFAULT 'applied';
 
ALTER TABLE Application ADD CONSTRAINT user_applications CHECK (status in ('applied','accepted','rejected','confirmed'));
 ///////////////////////////

create table Programs_Offered(
 ProgramName varchar2(5) , 
 description varchar2(20),
 applicant_eligibility varchar2(40) ,
 duration number,
 degree_certificate_offered varchar2(10)
 );
 


create table Participant (
 Roll_no varchar2(5) primary key,
 email_id varchar2(20),
 Application_id  number(25) REFERENCES Application(Application_id) ,
 Scheduled_program_id varchar2(5) REFERENCES Programs_Scheduled(scheduled_program_id)
 );
 
create table Users (
 login_id varchar2(5) primary key,
 password varchar2(10),
 role varchar2(5)
) ;
 
 ALTER TABLE Users
ADD CONSTRAINT user_check CHECK (role in ('admin','mac'));
 