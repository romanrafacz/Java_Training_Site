INSERT INTO customer (CUSTOMER_ID, name)
VALUES (1, 'erik'), (2, 'rome'), (3, 'skorox'), (4,'iggs');

INSERT INTO customer_profile (customer_profile_id, email, customer_id)
VALUES (1, 'erik@gmail.com', 1);

INSERT INTO customer_order (code, quantity, order_date, customer_id )
VALUES ('TR106', 25, '2016-01-17 18:47:52.69', 1);

INSERT INTO product (product_id, product_code, product_price, product_in_stock)
VALUES (1, 'TR106', 50, True);