package Task3;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Customer> customers = new ArrayList<>();
    public static void main(String[] args) {
        Customer customer1 = new Customer("navn","nvan","BristleBack");
        Customer customer2 = new Customer("IkkeMitRigtigeFornavn","IkkeMitRigtigeEfternavn","ShadowFiend");
        Customer customer3 = new Customer("abcd","efgh","Viper");
        Customer customer4 = new Customer("ijkl","mnop","Alchemist");
        Customer customer5 = new Customer("123","321","Tidehunter");
        Customer customer6 = new Customer("Fornavn","Efternavn","Weaver");

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        customers.add(customer6);

        printCustomers();
    }
    public static void printCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
