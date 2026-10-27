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





# Shape program

## Program Overview

Shape program is a Java-based application designed to calculate the area of a square, the area of a circle, and the volume of a cylinder through a simple console interface.

The system applies Object-Oriented Programming (OOP) concepts, including inheritance, method overriding, and polymorphism. Each shape has its own calculation method, while the main program uses a common parent class reference to execute different calculations.

Users can enter shape dimensions and colors through the keyboard using Java Scanner.

## Features

- Calculate the area of a square
- Calculate the area of a circle
- Calculate the volume of a cylinder
- Input dimensions and colors using Scanner
- Display calculation results
- Apply inheritance between shape classes
- Demonstrate polymorphism through a common calculation method
- Console-based interface

## Technologies

- Java
- Object-Oriented Programming (OOP)
- Inheritance
- Method Overriding
- Polymorphism
- Java Scanner
- Visual Studio Code

## Classes and Methods

### Bentuk

**Attributes:**
- `warna` — stores the color of the shape.

**Constructor:**
- `Bentuk(String warna)` — initializes the shape color.

**Methods:**
- `getWarna()` — returns the shape color.
- `setWarna(String warna)` — changes the shape color.
- `hitung()` — defines the common calculation method for polymorphism.
- `printInfo()` — displays basic shape information.

### BujurSangkar

Extends `Bentuk`.

**Attributes:**
- `sisi` — stores the side length.

**Constructor:**
- `BujurSangkar(double sisi, String warna)` — initializes the side length and color.

**Methods:**
- `getSisi()` — returns the side length.
- `setSisi(double sisi)` — changes the side length.
- `hitung()` — calculates the square area.
- `printInfo()` — displays the square color and area.

### Lingkaran

Extends `Bentuk`.

**Attributes:**
- `radius` — stores the circle radius.
- `PHI` — defines the value of pi as a class constant.

**Constructor:**
- `Lingkaran(double radius, String warna)` — initializes the radius and color.

**Methods:**
- `getRadius()` — returns the radius.
- `setRadius(double r)` — changes the radius.
- `hitung()` — calculates the circle area.
- `printInfo()` — displays the circle color and area.

### Silinder

Extends `Lingkaran`.

**Attributes:**
- `tinggi` — stores the cylinder height.

**Constructor:**
- `Silinder(double tinggi, double radius, String warna)` — initializes the height, radius, and color.

**Methods:**
- `getTinggi()` — returns the cylinder height.
- `setTinggi(double t)` — changes the cylinder height.
- `hitung()` — calculates the cylinder volume by multiplying the base area by the height.
- `printInfo()` — displays the cylinder color and volume.

### Main

**Methods:**
- `main(String[] args)` — runs the application.
- Uses `Scanner` to receive dimensions and colors from the user.
- Creates objects of `BujurSangkar`, `Lingkaran`, and `Silinder`.
- Stores the objects in a `Bentuk[]` array.
- Calls `hitung()` through parent-class references to demonstrate polymorphism.

## Object-Oriented Programming Concepts

### Inheritance

Inheritance allows a class to reuse attributes and methods from another class.

- `BujurSangkar` extends `Bentuk`.
- `Lingkaran` extends `Bentuk`.
- `Silinder` extends `Lingkaran`.

### Polymorphism

Polymorphism is demonstrated through the overridden `hitung()` method.

- `BujurSangkar.hitung()` calculates the square area.
- `Lingkaran.hitung()` calculates the circle area.
- `Silinder.hitung()` calculates the cylinder volume.

The main program calls `hitung()` through references of type `Bentuk`. Java executes the implementation corresponding to each object's actual class.


