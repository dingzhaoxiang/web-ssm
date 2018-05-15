CREATE TABLE `salaries` (
`emp_no` int(11) NOT NULL,
`salary` int(11) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`from_date`));

select (select salary from salaries WHERE emp_no = 10001 order by to_date desc limit 1)-
       (select salary from salaries WHERE emp_no = 10001 order by to_date asc limit 1)
as growth;