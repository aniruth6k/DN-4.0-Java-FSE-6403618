CREATE TABLE Customers (
  CustomerID INT PRIMARY KEY,
  Name VARCHAR(100),
  Age INT,
  Balance DECIMAL(10,2),
  IsVIP BOOLEAN DEFAULT FALSE
);

CREATE TABLE Loans (
  LoanID INT PRIMARY KEY,
  CustomerID INT,
  InterestRate DECIMAL(5,2),
  DueDate DATE,
  FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);
