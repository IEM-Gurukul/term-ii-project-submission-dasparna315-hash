public class Customer extends User {

    private String phone;

    public Customer(int userId, String name, String phone) {

        super(userId, name);
        this.phone = phone;

    }

    public int getCustomerId() {
        return userId;
    }

    @Override
    public void displayUser() {

        System.out.println("Customer ID: " + userId);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);

    }
}
