select f.employee_id ,name,f.reports_count,f.average_age 
from Employees as e
join (select reports_to as employee_id,count(reports_to) as reports_count,round(avg(age)) as average_age 
from Employees
where reports_to is not null
group by reports_to
) as f 
where e.employee_id = f.employee_id 
order by f.employee_id asc