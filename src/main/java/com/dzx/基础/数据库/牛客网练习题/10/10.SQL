CREATE TABLE `dept_emp` (
`emp_no` int(11) NOT NULL,
`dept_no` char(4) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`dept_no`));

CREATE TABLE `dept_manager` (
`dept_no` char(4) NOT NULL,
`emp_no` int(11) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`dept_no`));

select dept_emp.emp_no,dept_manager.emp_no from dept_emp inner join dept_manager
    on dept_emp.dept_no=dept_manager.dept_no where dept_emp.emp_no!=dept_manager.emp_no
    and dept_manager.to_date='9999-01-01';