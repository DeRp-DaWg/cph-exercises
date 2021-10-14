package Task1;

import java.util.ArrayList;

public class Dog {
    private String name;
    private Owner owner;
    private boolean isHungry;
    private ArrayList<Dog> offSpring;

    public Dog(String name, Owner owner) {
        this.name = name;
        this.owner = owner;
        this.isHungry = true;
        this.offSpring = new ArrayList<>();
    }

    public void feedDog() {
        if (isHungry) {
            System.out.println(name+" is being fed");
            isHungry = false;
        } else {
            System.out.println(name+" is not hungry");
        }
    }

    public ArrayList<Dog> getOffSpring() {
        return offSpring;
    }

    public void setOffSpring(ArrayList<Dog> offSpring) {
        this.offSpring = offSpring;
    }

    public Owner getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }
}
