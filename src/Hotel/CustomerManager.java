import java.util.HashMap;

public class CustomerManager {

    private HashMap<Integer, Customer> customers;

    public CustomerManager() {

        customers = new HashMap<>();

    }

    public Customer createCustomer(int id,
                                   String name,
                                   String phone) {

        Customer c = new Customer(id, name, phone);

        customers.put(id, c);

        return c;
    }
}
