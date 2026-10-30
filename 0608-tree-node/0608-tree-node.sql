-- # Write your MySQL query statement below


select 
id,
CASE 
WHEN p_id is null then 'Root'
WHEN id in (select p_id
from Tree
where p_id is not null
group by p_id
having count(p_id) > 0) THEN 'Inner'
ELSE 'Leaf'
END
as type
from Tree