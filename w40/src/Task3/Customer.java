package Task3;

public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int ID = 0;

    public Customer(String firstName, String lastName, String username) {
        id = ID++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", id=" + id +
                '}';
    }
}
