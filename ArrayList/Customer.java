public class Customer {
    private String firstName;
    private String lastName;
    private String accountNumber;
    private Account account;

    public Customer(String firstName, String lastName, String accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return this.account;
    }
}