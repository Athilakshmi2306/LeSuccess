# Write your MySQL query statement below

select t1.name as customers from customers as t1 left join orders as t2
on t1.id=t2.customerid
where t2.customerid is null;

