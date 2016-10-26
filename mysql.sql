drop table student;
drop table teacher;
drop table course;
drop table StudentRelaCourse;
drop table TeacherRelaCourse;

---建表
create table student(
	id int not null AUTO_INCREMENT,
	firstname varchar(20) not null,
	lastname varchar(20) not null,
	age int not null,
	gender varchar(10) not null,
	sno varchar(10) not null,
	PRIMARY KEY  (`id`)
);

create table teacher(
	id int not null AUTO_INCREMENT,
	firstname varchar(20) not null,
	lastname varchar(20) not null,
	age int not null,
	gender varchar(10) not null,
	tno varchar(10) not null,
	PRIMARY KEY  (`id`)
); 

create table course(
	id int not null AUTO_INCREMENT,
	cno varchar(10) not null,
	classhour int not null,
	score float not null,
	PRIMARY KEY  (`id`)
);

create table StudentRelaCourse(
	id int not null AUTO_INCREMENT,
	sno varchar(10) not null,
	cno varchar(10) not null,
	score float not null,
	PRIMARY KEY  (`id`)
);


create table TeacherRelaCourse(
	id int not null AUTO_INCREMENT,
	tno varchar(10) not null,
	cno varchar(10) not null,
	PRIMARY KEY  (`id`)
);


---插入数据

insert into student(firstname,lastname,age,gender,sno) values('jimmy','jobs',20,'male','S0001');
insert into student(firstname,lastname,age,gender,sno) values('steven','bosh',23,'male','S0002');
insert into student(firstname,lastname,age,gender,sno) values('jessica','lucy',19,'female','S0003');
insert into student(firstname,lastname,age,gender,sno) values('lily','karen',24,'female','S0004');
insert into student(firstname,lastname,age,gender,sno) values('lyken','cliton',18,'male','S0005');
insert into student(firstname,lastname,age,gender,sno) values('bill','gas',21,'male','S0006');
insert into student(firstname,lastname,age,gender,sno) values('boge','zhak',27,'male','S0007');
insert into student(firstname,lastname,age,gender,sno) values('jacker','luise',18,'male','S0008');
insert into student(firstname,lastname,age,gender,sno) values('rampf','kiler',16,'female','S0009');
insert into student(firstname,lastname,age,gender,sno) values('sam','song',23,'male','S0010');
insert into student(firstname,lastname,age,gender,sno) values('jill','lee',22,'female','S0011');
insert into student(firstname,lastname,age,gender,sno) values('grace','gseng',29,'male','S0012');
insert into student(firstname,lastname,age,gender,sno) values('terpu','cliton',31,'female','S0013');
insert into student(firstname,lastname,age,gender,sno) values('montain','gas',36,'male','S0014');

--insert into student(firstname,lastname,age,gender,sno) values();

insert into teacher(firstname,lastname,age,gender,tno) values('lucy','bolish',35,'male','T0001');
insert into teacher(firstname,lastname,age,gender,tno) values('kaly','carl',33,'female','T0002');
insert into teacher(firstname,lastname,age,gender,tno) values('carl','lee',30,'male','T0003');
insert into teacher(firstname,lastname,age,gender,tno) values('jobs','bush',29,'female','T0004');
--insert into teacher(firstname,lastname,age,gender,tno) values();

insert into course(cno,classhour,score) values('C001',6,10);
insert into course(cno,classhour,score) values('C002',5,6);
insert into course(cno,classhour,score) values('C003',4,8);
insert into course(cno,classhour,score) values('C004',8,6);
insert into course(cno,classhour,score) values('C005',7,4);
insert into course(cno,classhour,score) values('C006',6,5);
--insert into course(cno,classhour,score) values();

insert into StudentRelaCourse(sno,cno,score) values('S0001','C001',8);
insert into StudentRelaCourse(sno,cno,score) values('S0001','C003',7);
insert into StudentRelaCourse(sno,cno,score) values('S0002','C002',6);
insert into StudentRelaCourse(sno,cno,score) values('S0002','C004',6);
insert into StudentRelaCourse(sno,cno,score) values('S0003','C005',4);
insert into StudentRelaCourse(sno,cno,score) values('S0003','C006',4);
insert into StudentRelaCourse(sno,cno,score) values('S0004','C001',9);
insert into StudentRelaCourse(sno,cno,score) values('S0005','C003',8);
insert into StudentRelaCourse(sno,cno,score) values('S0005','C004',6);
insert into StudentRelaCourse(sno,cno,score) values('S0005','C006',5);
insert into StudentRelaCourse(sno,cno,score) values('S0006','C004',5);
insert into StudentRelaCourse(sno,cno,score) values('S0006','C006',5);
insert into StudentRelaCourse(sno,cno,score) values('S0007','C001',9);
insert into StudentRelaCourse(sno,cno,score) values('S0007','C006',5);
insert into StudentRelaCourse(sno,cno,score) values('S0007','C002',6);
insert into StudentRelaCourse(sno,cno,score) values('S0008','C003',5);
insert into StudentRelaCourse(sno,cno,score) values('S0009','C004',5);
insert into StudentRelaCourse(sno,cno,score) values('S0010','C006',4);
insert into StudentRelaCourse(sno,cno,score) values('S0010','C005',4);
insert into StudentRelaCourse(sno,cno,score) values('S0011','C003',5);
insert into StudentRelaCourse(sno,cno,score) values('S0012','C002',6);
insert into StudentRelaCourse(sno,cno,score) values('S0013','C001',5);
insert into StudentRelaCourse(sno,cno,score) values('S0014','C003',5);
insert into StudentRelaCourse(sno,cno,score) values('S0014','C005',4);
--insert into StudentRelaCourse(sno,cno,score) values();

insert into TeacherRelaCourse(tno,cno) values('T0001','C001');
insert into TeacherRelaCourse(tno,cno) values('T0002','C002');
insert into TeacherRelaCourse(tno,cno) values('T0003','C003');
insert into TeacherRelaCourse(tno,cno) values('T0004','C004');
insert into TeacherRelaCourse(tno,cno) values('T0003','C005');
insert into TeacherRelaCourse(tno,cno) values('T0001','C006');
--insert into TeacherRelaCourse(tno,cno) values();


--------- 查询
select * from student;
select * from teacher;
select * from course;
select * from studentrelacourse;
select * from teacherrelacourse;


