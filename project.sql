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

Insert into Location values(101,'Mumbai','Maha',400092);
Insert into Location values(102,'Pune','Maha',400123);
Insert into Location values(103,'Patna','MP',400628);
Insert into Location values(104,'Kanpur','UP',400593);
Insert into Location values(105,'Kolkata','WestB',400236);
Insert into Location values(106,'Nigdi','MP',400638);
commit;
 drop table Location;
 
 

 Insert into Programs_Scheduled values(501,'JD',103,'13-JUN-2017','13-SEP-2017',6);
 Insert into Programs_Scheduled values(502,'AP',101,'13-JUN-2017','13-SEP-2017',5);
 Insert into Programs_Scheduled values(503,'TS',104,'13-JUN-2017','13-SEP-2017',5);
 commit;
 select * from Programs_Scheduled;

Insert into Application values(1001,'Nikhil Pandey','21-NOV-1994','BE',99,'Java Developer','nikhil@gmail.com',501,'accepted','20-MAR-2017'); 
Insert into Application values(1002,'Pranali Sawant','01-SEP-1993','BE',75,'Manager','pranalis@gmail.com',503,'confirmed','21-APR-2017');
Insert into Application values(1003,'Nehali Pansare','13-FEB-1995','BE',79,'Team Leader','pansaren@ymail.com',502,'accepted','22-MAR-2017');
Insert into Application values(1004,'Pooja Pal','30-JULY-1994','BE',83,'Tester','palpooja@yahoo.com',501,'applied','12-MAY-2017');
Insert into Application values(1005,'Rhitika Shetty','25-DEC-1995','BE',69,'Group Leader','rhitika@gmail.com',503,'confirmed','21-APR-2017');
Insert into Application values(1006,'Amruta Patil','11-MAR-1993','BE',86,'App Developer','amrutap@gmail.com',502,'applied','12-MAY-2017');
Insert into Application values(1007,'Jaini Parikh','13-OCT-1994','BE',59,'Java Devloper','jainip@gmail.com',501,'rejected','12-MAY-2017');
commit;
select * from Application;

SELECT appl.Application_id,appl.full_name,appl.status,appl.Scheduled_program_id,ps.start_date,ps.end_date FROM Application appl JOIN Programs_Scheduled ps ON appl.Scheduled_program_id=ps.Scheduled_program_id WHERE((status='confirmed')AND(start_date='13-JUN-2017' AND end_date='13-SEP-2017'));


