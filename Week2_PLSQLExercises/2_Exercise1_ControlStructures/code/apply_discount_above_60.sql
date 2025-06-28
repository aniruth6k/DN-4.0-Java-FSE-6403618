UPDATE Loans
JOIN Customers ON Loans.CustomerID = Customers.CustomerID
SET Loans.InterestRate = Loans.InterestRate - 1
WHERE Customers.Age > 60;
