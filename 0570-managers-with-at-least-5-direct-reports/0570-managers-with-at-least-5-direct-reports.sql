# Write your MySQL query statement below
select distinct m.name as name
from employee e join employee m
on m.id = e.managerid
group by m.id
having count(*) >= 5