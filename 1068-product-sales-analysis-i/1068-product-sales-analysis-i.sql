# Write your MySQL query statement below
select product_name,year,price from Sales join product on (Sales.product_id=Product.product_id);