# Write your MySQL query statement below

SELECT class FROM (
    SELECT COUNT(student) AS COUNT,class
FROM Courses
GROUP BY class
) AS E 
WHERE E.COUNT>=5 ;