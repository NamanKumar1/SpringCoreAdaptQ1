public class Customer {
    private int customerId;
    private String customerName;
    private String customerContact;
    private Address customerAddress;

    // Constructor, getters, and setters

    public Customer(int customerId, String customerName, String customerContact) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerContact = customerContact;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(String customerContact) {
        this.customerContact = customerContact;
    }

    public Address getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(Address customerAddress) {
        this.customerAddress = customerAddress;
    }
}
