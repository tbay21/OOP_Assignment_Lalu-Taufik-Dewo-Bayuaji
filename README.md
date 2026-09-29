# Bank Management System

## Program Overview

Bank Management System is a Java-based banking application designed to help bank employees manage customer accounts through a simple console interface.

The system applies Object-Oriented Programming (OOP) concepts by separating account, customer, and bank management into different classes. Bank employees can create customer accounts by entering customer information, an account number, and an initial balance.

The system also provides features to view customer information, check account balances, deposit funds, withdraw funds, and display all registered customers.

## Features

- Add customer account
- Assign account number
- Set initial balance
- View customer information
- Check account balance
- Deposit funds
- Withdraw funds
- List all customers
- Console-based interface

## Technologies

- Java
- Object-Oriented Programming (OOP)
- Java Scanner
- GitHub

## Project Structure

```text
Bank-Management-System/
│
├── src/
│   ├── Account.java
│   ├── Customer.java
│   ├── Bank.java
│   └── Main.java
│
└── README.md

## Classes and Methods

### Account

**Attributes:**
- `balance` — stores the account balance.

**Constructor:**
- `Account(double initialBalance)` — initializes the account with an initial balance.

**Methods:**
- `getBalance()` — returns the current balance.
- `deposit(double amount)` — adds money to the account.
- `withdraw(double amount)` — withdraws money from the account.

### Customer

**Attributes:**
- `firstName` — stores the customer's first name.
- `lastName` — stores the customer's last name.
- `accountNumber` — stores the customer's account number.
- `account` — stores the customer's bank account.

**Constructor:**
- `Customer(String firstName, String lastName, String accountNumber)` — initializes a customer.

**Methods:**
- `getFirstName()` — returns the customer's first name.
- `getLastName()` — returns the customer's last name.
- `getAccountNumber()` — returns the customer's account number.
- `setAccount(Account account)` — assigns an account to the customer.
- `getAccount()` — returns the customer's account.

### Bank

**Attributes:**
- `customers` — stores customer objects in an array.
- `numberOfCustomers` — stores the number of registered customers.

**Constructor:**
- `Bank()` — initializes the customer array and customer count.

**Methods:**
- `addCustomer(String firstName, String lastName, String accountNumber)` — adds a new customer.
- `getNumOfCustomers()` — returns the number of registered customers.
- `getCustomer(int index)` — returns a customer based on the array index.
- `findCustomer(String accountNumber)` — finds a customer using their account number.
