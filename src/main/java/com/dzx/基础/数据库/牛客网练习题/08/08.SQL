CREATE TABLE `dept_manager` (
`dept_no` char(4) NOT NULL,
`emp_no` int(11) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`dept_no`));

CREATE TABLE `salaries` (
`emp_no` int(11) NOT NULL,
`salary` int(11) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`from_date`));

select dm.dept_no, dm.emp_no, sl.salary
  from salaries sl
  inner join dept_manager dm
  on dm.emp_no = sl.emp_no and dm.to_date = '9999-01-01'
  and sl.to_date = '9999-01-01';