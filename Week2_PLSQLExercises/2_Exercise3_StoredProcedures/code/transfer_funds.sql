DELIMITER $$

CREATE PROCEDURE TransferFunds(
  IN fromAccount INT,
  IN toAccount INT,
  IN amount DECIMAL(12,2)
)
BEGIN
  DECLARE fromBalance DECIMAL(12,2);


  SELECT Balance INTO fromBalance FROM Accounts WHERE AccountID = fromAccount;

  IF fromBalance >= amount THEN
    UPDATE Accounts
    SET Balance = Balance - amount
    WHERE AccountID = fromAccount;

    UPDATE Accounts
    SET Balance = Balance + amount
    WHERE AccountID = toAccount;
  ELSE
    SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Insufficient funds';
  END IF;
END $$

DELIMITER ;
