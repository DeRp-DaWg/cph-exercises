package Task1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //TODO:
        // lav en ny hund
        Owner myOwner = new Owner("Henning");
        Dog myDog = new Dog("Woodie", myOwner);
        // TODO: tilføj to hvalpe når hundeklassen er klar til hvalpe
        Dog myDogOffspring1 = new Dog("Snoopie",myOwner);
        Dog myDogOffspring2 = new Dog("Fido", myOwner);
        ArrayList<Dog> offsprings = new ArrayList<>(Arrays.asList(myDogOffspring1,myDogOffspring2));
        myDog.setOffSpring(offsprings);
        // print alle hvalpe
        printOffspring(myDog);
        System.out.println();
        // print ejeren
        System.out.println("The dog's owner is: " + myDog.getOwner());
        // TODO: fodr hunden når hundeklassen er modificeret så den kan fodres
        myDog.feedDog();
        myDog.feedDog();
    }
    public static void printOffspring(Dog dog) {
        System.out.println(dog.getName() + "'s offsprings are: ");
        for (Dog d : dog.getOffSpring()) {
            System.out.println(d.getName());
        }
    }
}
