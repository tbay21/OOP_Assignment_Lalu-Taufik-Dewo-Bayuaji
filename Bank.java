public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;

    public Bank() {
        this.customers = new Customer[10];
        this.numberOfCustomers = 0;
    }

    public void addCustomer(String firstName, String lastName, String accountNumber) {
        if (this.numberOfCustomers < this.customers.length) {
            this.customers[this.numberOfCustomers] =
                    new Customer(firstName, lastName, accountNumber);
            this.numberOfCustomers++;
        }
    }

    public int getNumOfCustomers() {
        return this.numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        if (index >= 0 && index < this.numberOfCustomers) {
            return this.customers[index];
        }
        return null;
    }

    public Customer findCustomer(String accountNumber) {
        for (int i = 0; i < this.numberOfCustomers; i++) {
            if (this.customers[i].getAccountNumber().equals(accountNumber)) {
                return this.customers[i];
            }
        }
        return null;
    }
}