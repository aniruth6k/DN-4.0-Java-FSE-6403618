INSERT INTO Customers (CustomerID, Name, Age, Balance, IsVIP) VALUES
  (1, 'Alice', 65, 12000.00, FALSE),
  (2, 'Bob', 45, 8000.00, FALSE),
  (3, 'Charlie', 70, 15000.00, FALSE);

INSERT INTO Loans (LoanID, CustomerID, InterestRate, DueDate) VALUES
  (101, 1, 10.00, CURDATE() + INTERVAL 20 DAY),
  (102, 2, 12.00, CURDATE() + INTERVAL 40 DAY),
  (103, 3, 11.00, CURDATE() + INTERVAL 10 DAY);
