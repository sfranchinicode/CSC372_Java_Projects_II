# Bank Account Inheritance Project (Java)

## Overview
This project demonstrates the use of **object-oriented programming (OOP)** principles in Java, specifically focusing on **inheritance**, **encapsulation**, and **method overriding behavior**. 
The program simulates a simple banking system with a base `BankAccount` class and a specialized `CheckingAccount` subclass that supports overdraft fees and interest rates.

## Project Structure

The project contains three Java classes:

- `BankAccount.java` – Superclass representing a basic bank account
- `CheckingAccount.java` – Subclass that extends `BankAccount` with additional features
- `TestAccount.java` – Driver class used to test functionality

## Features

### BankAccount Class
The base class includes:

- Fields:
  - First name
  - Last name
  - Account ID
  - Balance

- Methods:
  - `deposit(double amount)` – Adds funds to the account
  - `withdrawal(double amount)` – Subtracts funds from the account
  - Getters and setters for personal/account information
  - `getBalance()` – Returns current balance
  - `accountSummary()` – Displays full account details

### CheckingAccount Class
Extends `BankAccount` and adds:

- Interest rate field
- Overdraft handling with a $30 fee

- Methods:
  - `processWithdrawal(double amount)`  
    - Allows overdrawing the account
    - Applies a $30 overdraft fee if balance becomes negative
  - `setInterestRate(double rate)` / `getInterestRate()`
  - `displayAccount()`  
    - Displays all account information including interest rate

## Test Program (TestAccount)
The `TestAccount` class demonstrates functionality by:

1. Creating a `CheckingAccount` object
2. Setting account holder information
3. Setting interest rate
4. Depositing funds
5. Processing a withdrawal
6. Displaying the final account summary

## Example Output
When run, the program:
- Deposits money into the account
- Processes a withdrawal
- Applies overdraft fee if necessary
- Prints a formatted account summary including interest rate

## Concepts Demonstrated
- Class inheritance (`extends`)
- Encapsulation (private fields with getters/setters)
- Method reuse from superclass
- Basic financial logic (deposit, withdrawal, overdraft fee)
- Console output formatting


## Author
Student Java Project – Banking System Simulation
