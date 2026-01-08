# Write your MySQL query statement below
SELECT product_id, price FROM (
    SELECT product_id,
        new_price AS price,
        DENSE_RANK() OVER (
            PARTITION BY product_id
            ORDER BY change_date DESC
        ) AS dr
    FROM products
    WHERE change_date <= '2019-08-16'
) t
WHERE dr = 1
union
select distinct product_id,10 as price from products
where product_id not in (select product_id from products where change_date<='2019-08-16');