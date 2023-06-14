import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        // Load the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the Customer bean from the ApplicationContext
        Customer customer = (Customer) context.getBean("customerBean");

        // Print the details of the Customer
        System.out.println("Customer Details:");
        System.out.println("Customer ID: " + customer.getCustomerId());
        System.out.println("Customer Name: " + customer.getCustomerName());
        System.out.println("Customer Contact: " + customer.getCustomerContact());

        // Get the Address from the Customer and print its details
        Address address = customer.getCustomerAddress();
        System.out.println("Customer Address:");
        System.out.println("Street: " + address.getStreet());
        System.out.println("City: " + address.getCity());
        System.out.println("State: " + address.getState());
        System.out.println("Zip: " + address.getZip());
        System.out.println("Country: " + address.getCountry());
    }
}
