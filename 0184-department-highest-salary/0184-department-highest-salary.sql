# Write your MySQL query statement below


-- select 
-- d.name as Department,first.max_salary
-- from Department as d
-- join( 
    select new.name as Department,first.name as Employee ,
    first.max_salary as Salary 
    from Department as new
    join(
    select second.departmentId,second.max_salary,f.name
    from Employee as f
    join (
    select e.departmentId,
    max(e.salary) as max_salary
-- from Department as d
from Employee as e
-- where d.id = e.departmentId
group by e.departmentId 
    ) as second
    where f.departmentId = second.departmentId and f.salary = second.max_salary ) first
    where first.departmentId=new.id
-- ) as first
-- on d.id = first.departmentId