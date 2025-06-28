SELECT LoanID, CustomerID, DueDate
FROM Loans
WHERE DueDate <= CURDATE() + INTERVAL 30 DAY;
