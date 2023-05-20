use facedetection;

create table face(cid int, fname varchar(20),lname varchar(20),
    aname varchar(20),dob date,age int,gender varchar(10), address varchar(100),
    city varchar(100),state varchar(100), arresteddate date, crimein varchar(100),
	photo  varchar(200));

create table face_height(cid int, hair int, forehead int,
	eyes int,nose int,lips int, chin int );

create table face_suspectphoto(crimeid int,
	suspectphoto varchar(100),photo_height varchar(100));

create table criminal_suspect(cid int, criminalId int);

create table face_suspects(crimeid int,cid int);