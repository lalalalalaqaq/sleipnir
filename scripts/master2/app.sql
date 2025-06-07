select * from t_order_0 UNION all 
select * from t_order_1 UNION all 
select * from t_order_2;

TRUNCATE TABLE t_order_0;
TRUNCATE TABLE t_order_1;
TRUNCATE TABLE t_order_2;
