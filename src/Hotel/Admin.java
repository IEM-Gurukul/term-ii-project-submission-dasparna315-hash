public class Admin extends User {

    public Admin(int userId, String name) {

        super(userId, name);

    }

    @Override
    public void displayUser() {

        System.out.println("Admin ID: " + userId);
        System.out.println("Name: " + name);

    }
}
