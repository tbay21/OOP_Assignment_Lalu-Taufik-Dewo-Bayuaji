import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank bank = new Bank();
        int choice;

        do {
            System.out.println("\n=== BANK MANAGEMENT SYSTEM ===");
            System.out.println("1. Add Account");
            System.out.println("2. View Customer");
            System.out.println("3. Check Balance");
            System.out.println("4. Deposit");
            System.out.println("5. Withdraw");
            System.out.println("6. List All Customers");
            System.out.println("0. Exit");
            System.out.print("Choose menu: ");

            choice = input.nextInt();
            input.nextLine();

            if (choice >= 2 && choice <= 6 && bank.getNumOfCustomers() == 0) {
                System.out.println("No customer available.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("First Name: ");
                    String firstName = input.nextLine();

                    System.out.print("Last Name: ");
                    String lastName = input.nextLine();

                    System.out.print("Account Number: ");
                    String accountNumber = input.nextLine();

                    bank.addCustomer(firstName, lastName, accountNumber);

                    Customer customer = bank.findCustomer(accountNumber);

                    System.out.print("Initial Balance: Rp ");
                    double balance = input.nextDouble();

                    customer.setAccount(new Account(balance));

                    System.out.println("Account created successfully.");
                    break;

                case 2:
                    System.out.print("Account Number: ");
                    accountNumber = input.nextLine();

                    customer = bank.findCustomer(accountNumber);

                    if (customer != null) {
                        System.out.println("Name: " +
                                customer.getFirstName() + " " +
                                customer.getLastName());
                        System.out.println("Account Number: " +
                                customer.getAccountNumber());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    System.out.print("Account Number: ");
                    accountNumber = input.nextLine();

                    customer = bank.findCustomer(accountNumber);

                    if (customer != null) {
                        System.out.println("Balance: Rp " +
                                customer.getAccount().getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    System.out.print("Account Number: ");
                    accountNumber = input.nextLine();

                    customer = bank.findCustomer(accountNumber);

                    if (customer != null) {
                        System.out.print("Deposit amount: Rp ");
                        double amount = input.nextDouble();

                        if (customer.getAccount().deposit(amount)) {
                            System.out.println("Deposit successful.");
                        } else {
                            System.out.println("Invalid amount.");
                        }
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 5:
                    System.out.print("Account Number: ");
                    accountNumber = input.nextLine();

                    customer = bank.findCustomer(accountNumber);

                    if (customer != null) {
                        System.out.print("Withdraw amount: Rp ");
                        double amount = input.nextDouble();

                        if (customer.getAccount().withdraw(amount)) {
                            System.out.println("Withdraw successful.");
                        } else {
                            System.out.println("Invalid amount or insufficient balance.");
                        }
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 6:
                    System.out.println("\n=== CUSTOMER LIST ===");

                    for (int i = 0; i < bank.getNumOfCustomers(); i++) {
                        customer = bank.getCustomer(i);

                        System.out.println(
                                customer.getAccountNumber() + " - " +
                                customer.getFirstName() + " " +
                                customer.getLastName() +
                                " - Rp " +
                                customer.getAccount().getBalance()
                        );
                    }
                    break;

                case 0:
                    System.out.println("System closed.");
                    break;

                default:
                    System.out.println("Invalid menu.");
            }

        } while (choice != 0);

        input.close();
    }
}