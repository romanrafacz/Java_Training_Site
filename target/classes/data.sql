INSERT INTO customer (CUSTOMER_ID, name)
VALUES (1, 'erik'), (2, 'rome'), (3, 'skorox'), (4,'iggs');

INSERT INTO customer_profile (customer_profile_id, email, customer_id, customer_profile_phone)
VALUES (1, 'erik@gmail.com', 1, '123-456-7890'), (2, 'rome@gmail.com', 2, '123-456-7890'), (3, 'skorox@gmail.com', 3, '123-456-7890'), 
(4, 'igby@gmail.com', 4, '123-456-7890');

INSERT INTO product (product_id, product_code, product_price, product_in_stock)
VALUES (1, 'TR106', 500, True), (2, 'WA855', 100, True);

INSERT INTO customer_order (order_id, code, quantity, order_date, customer_id )
VALUES (1, 'TR106', 25, '2016-01-17 18:47:52.69', 1), (2, 'WA855', 5, '2016-03-22 18:47:52.69', 4),
(3, 'TR106', 15, '2016-01-24 18:47:52.69', 2), (4, 'WA855', 10, '2016-01-7 18:47:52.69', 3), (5, 'WA855', 10, '2016-01-7 18:47:52.69', 1);

