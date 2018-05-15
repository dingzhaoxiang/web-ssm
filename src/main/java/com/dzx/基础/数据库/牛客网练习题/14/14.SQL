CREATE TABLE `salaries` (
`emp_no` int(11) NOT NULL,
`salary` int(11) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`from_date`));

CREATE TABLE 'titles' (
`emp_no` int(11) NOT NULL,
`title` varchar(50) NOT NULL,
`from_date` date NOT NULL,
`to_date` date DEFAULT NULL);

select t.title,avg(s.salary) from salaries as s inner join titles as t
on s.emp_no=t.emp_no and  t.to_date='9999-01-01'
and s.to_date='9999-01-01' group by t.title;