CREATE TABLE Accounts (
  AccountID INT PRIMARY KEY,
  CustomerID INT,
  Balance DECIMAL(12,2)
);

CREATE TABLE Employees (
  EmployeeID INT PRIMARY KEY,
  Name VARCHAR(100),
  Department VARCHAR(50),
  Salary DECIMAL(12,2)
);
