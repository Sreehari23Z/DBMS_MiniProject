INSERT INTO product (product_id, product_name, category, supplier_id, supplier_name, stock_quantity, alarm_quantity, mrp, buying_const, latest_stock_date) VALUES
(1, 'Double Horse Rice', 'Groceries', 1, 'Anil Kumar', 100, 10, 50.0, 40.0, '2023-01-01'),
(2, 'Eastern Masala', 'Spices', 2, 'Suresh Menon', 200, 20, 60.0, 45.0, '2023-02-01'),
(3, 'Nirapara Coconut Oil', 'Oils', 3, 'Ravi Nair', 300, 30, 70.0, 50.0, '2023-03-01'),
(4, 'Milma Milk', 'Dairy', 4, 'Lakshmi Pillai', 400, 40, 80.0, 55.0, '2023-04-01'),
(5, 'Kannan Devan Tea', 'Beverages', 5, 'Manoj Varma', 500, 50, 90.0, 60.0, '2023-05-01'),
(6, 'MTR Ready-to-Eat', 'Snacks', 1, 'Anil Kumar', 600, 60, 100.0, 65.0, '2023-06-01'),
(7, 'Fortune Oil', 'Groceries', 2, 'Suresh Menon', 700, 70, 150.0, 130.0, '2023-07-01'),
(8, 'Nestle Milk', 'Dairy', 3, 'Ravi Nair', 800, 80, 60.0, 55.0, '2023-08-01'),
(9, 'Dove Soap', 'Personal Care', 4, 'Lakshmi Pillai', 900, 90, 40.0, 35.0, '2023-09-01'),
(10, 'Colgate Toothpaste', 'Personal Care', 5, 'Manoj Varma', 1000, 100, 50.0, 45.0, '2023-10-01');

INSERT INTO supplier_info (supplier_id, supplier_name, contact_address, contact_no, email, upi_id, supp_bank_acc_no, ifsc_no) VALUES
(1, 'Anil Kumar', 'Thrissur, Kerala', '9876543210', 'anil.kumar@example.com', 'anil.kumar@upi', '1234567890', 'HDFC0001234'),
(2, 'Suresh Menon', 'Kochi, Kerala', '9876543211', 'suresh.menon@example.com', 'suresh.menon@upi', '1234567891', 'ICIC0001234'),
(3, 'Ravi Nair', 'Palakkad, Kerala', '9876543212', 'ravi.nair@example.com', 'ravi.nair@upi', '1234567892', 'SBI0001234'),
(4, 'Lakshmi Pillai', 'Thiruvananthapuram, Kerala', '9876543213', 'lakshmi.pillai@example.com', 'lakshmi.pillai@upi', '1234567893', 'BOB0001234'),
(5, 'Manoj Varma', 'Munnar, Kerala', '9876543214', 'manoj.varma@example.com', 'manoj.varma@upi', '1234567894', 'PNB0001234');