-- user_list
INSERT INTO user_list (user_name, account, password, role, enable, created_date, last_modified_date)
VALUES ('管理員', 'admin', '$2a$10$ImVdIzxYdYmwlFbM9s1yuuc6HRRQfEJRuh3BnhOV5d1xDJ0ZpO9rW',
        'admin,ROLE_manager', true, '2022-12-29 16:08:05','2022-12-29 16:08:05');

INSERT INTO user_list (user_name, account, password, role, enable, created_date, last_modified_date)
VALUES ('員工', 'staff', '$2a$10$c/So5rcv8en7B/TOoC8HReIxhRm2CXkj74HzH//O1LGkHUtMu3gxC',
        'normal,ROLE_worker', true, '2022-12-29 16:09:05','2022-12-29 16:09:05');

-- order_list
INSERT INTO order_list (bill_status, order_no, order_date, product_id, product_name, src_qty, est_date, created_date,
                        last_modified_date)
VALUES (0, '20221031001', 20221031, 'A10**', '(成品-特級)熊貓豆腐', '0', 20221031, '2022-10-31 16:08:05',
        '2022-10-31 16:08:05');
INSERT INTO order_list (bill_status, order_no, order_date, product_id, product_name, src_qty, est_date, created_date,
                        last_modified_date)
VALUES (0, '20221031002', 20221031, 'B10**', '(成品-高級)四神海鮮八寶包子', '0', 20221031, '2022-10-31 16:08:05',
        '2022-10-31 16:08:05');

-- info_list
INSERT INTO info_list (order_no, row_no, nct_product_id, nct_product_name, qj_set_weight, qj_upp_weight, qj_low_weight,
                       def_valid_day, created_date, last_modified_date)
VALUES ('20221031001', 1, 'A10-01', '大魔術豆腐-1kg/箱-白', '0', '0', '0', '365', '2022-10-31 16:14:07',
        '2022-10-31 16:14:07');
INSERT INTO info_list (order_no, row_no, nct_product_id, nct_product_name, qj_set_weight, qj_upp_weight, qj_low_weight,
                       def_valid_day, created_date, last_modified_date)
VALUES ('20221031001', 2, 'A10-02', '大魔術豆腐-1kg/箱-黑', '0', '0', '0', '365', '2022-10-31 16:15:07',
        '2022-10-31 16:15:07');


INSERT INTO info_list (order_no, row_no, nct_product_id, nct_product_name, qj_set_weight, qj_upp_weight, qj_low_weight,
                       def_valid_day, created_date, last_modified_date)
VALUES ('20221031002', 1, 'B10-01', '鎮魂包子-40顆/箱-魚翅', '0', '0', '0', '150', '2022-10-31 16:16:07',
        '2022-10-31 16:16:07');
INSERT INTO info_list (order_no, row_no, nct_product_id, nct_product_name, qj_set_weight, qj_upp_weight, qj_low_weight,
                       def_valid_day, created_date, last_modified_date)
VALUES ('20221031002', 2, 'B10-02', '鎮魂包子-40顆/箱-鮑魚', '0', '0', '0', '150', '2022-10-31 16:16:07',
        '2022-10-31 16:16:07');
INSERT INTO info_list (order_no, row_no, nct_product_id, nct_product_name, qj_set_weight, qj_upp_weight, qj_low_weight,
                       def_valid_day, created_date, last_modified_date)
VALUES ('20221031002', 3, 'B10-03', '鎮魂包子-40顆/箱-海蔘', '0', '0', '0', '150', '2022-10-31 16:16:07',
        '2022-10-31 16:16:07');
INSERT INTO info_list (order_no, row_no, nct_product_id, nct_product_name, qj_set_weight, qj_upp_weight, qj_low_weight,
                       def_valid_day, created_date, last_modified_date)
VALUES ('20221031002', 4, 'B10-04', '鎮魂包子-40顆/箱-乾貝', '0', '0', '0', '150', '2022-10-31 16:16:07',
        '2022-10-31 16:16:07');
INSERT INTO info_list (order_no, row_no, nct_product_id, nct_product_name, qj_set_weight, qj_upp_weight, qj_low_weight,
                       def_valid_day, created_date, last_modified_date)
VALUES ('20221031002', 5, 'B10-05', '鎮魂包子-40顆/箱-螃蟹', '0', '0', '0', '150', '2022-10-31 16:16:07',
        '2022-10-31 16:16:07');
INSERT INTO info_list (order_no, row_no, nct_product_id, nct_product_name, qj_set_weight, qj_upp_weight, qj_low_weight,
                       def_valid_day, created_date, last_modified_date)
VALUES ('20221031002', 6, 'B10-06', '鎮魂包子-40顆/箱-草蝦', '0', '0', '0', '150', '2022-10-31 16:16:07',
        '2022-10-31 16:16:07');
INSERT INTO info_list (order_no, row_no, nct_product_id, nct_product_name, qj_set_weight, qj_upp_weight, qj_low_weight,
                       def_valid_day, created_date, last_modified_date)
VALUES ('20221031002', 7, 'B10-07', '鎮魂包子-40顆/箱-花枝', '0', '0', '0', '150', '2022-10-31 16:16:07',
        '2022-10-31 16:16:07');
INSERT INTO info_list (order_no, row_no, nct_product_id, nct_product_name, qj_set_weight, qj_upp_weight, qj_low_weight,
                       def_valid_day, created_date, last_modified_date)
VALUES ('20221031002', 8, 'B10-08', '鎮魂包子-40顆/箱-比目魚', '0', '0', '0', '150', '2022-10-31 16:16:07',
        '2022-10-31 16:16:07');