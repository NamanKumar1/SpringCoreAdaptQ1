import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {
    private Customer customer;

    @BeforeEach
    public void setup() {
        // Load the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the Customer bean from the ApplicationContext
        customer = (Customer) context.getBean("customerBean");
    }

    @Test
    public void testCustomerDetails() {
        // Verify the customer details
        Assertions.assertEquals(1, customer.getCustomerId());
        Assertions.assertEquals("Naman Kumar", customer.getCustomerName());
        Assertions.assertEquals("naman@CapG.com", customer.getCustomerContact());
    }

    @Test
    public void testCustomerAddress() {
        // Verify the customer address details
        Address address = customer.getCustomerAddress();
        Assertions.assertEquals("123 Main Street", address.getStreet());
        Assertions.assertEquals("New York", address.getCity());
        Assertions.assertEquals("NY", address.getState());
        Assertions.assertEquals("12345", address.getZip());
        Assertions.assertEquals("USA", address.getCountry());
    }
}
