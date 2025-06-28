BankStoredProcedures Project

This project contains stored procedures for common banking operations.

1. create_tables.sql
   - Creates Accounts and Employees tables.

2. insert_sample_data.sql
   - Inserts test accounts and employee records.

3. process_monthly_interest.sql
   - Stored procedure ProcessMonthlyInterest:
     - Adds 1% interest to all account balances.

4. update_employee_bonus.sql
   - Stored procedure UpdateEmployeeBonus:
     - Updates salary of employees in a given department by a specified bonus percentage.

5. transfer_funds.sql
   - Stored procedure TransferFunds:
     - Transfers amount from one account to another after checking sufficient balance.
