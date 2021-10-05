## Task 1: Aggregation
1.a Create a Driver.java class with the following private fields (use appropriate types):
- Name
- Age

1.b Create a constructor that populates all the fields above.

1.c Create a Car.java class with the following private fields (use appropriate types):
- Make
- Model
- Year
- BodyStyle
- Driver

1.d Create a constructor, that populates all the fields above, except the Driver.

1.e Create a Getter and a Setter for the Driver variable.

1.f override the toString method in the Car class, returning:
"Make: "+make+". Model: "+model+ " ("+ year + "), BodyStyle: "+bodyStyle

1.g override the toString method in the Driver class, returning:
" is driven by "+name

1.h In the main method, instantiate a new Driver, populating the fields with your own name and age.

1.i In the main method, instantiate a new car, populating the field with whatever values you see fit.

1.j In the main method, assign the driver to the car created, using the setter method created in step 1.e

1.k print the toString method of the car you've created followed by the toString method of the driver.

1.l In the main method, create yet another car and assign the same driver to this car.

1.m repeat the step 1.k for the new car created in 1.l.


## Task 2: Composition
2.a Create a Room.java class with the following fields (use appropriate types):
- Walls.java
- numberOfDoors
- numberOfLamps
- numberOfWindows

2.b Create a constructor that populates all the fields above.

2.c Create getters() for each of the fields above.

2.d Create a Building.java class with the following fields (use appropriate types):
- Rooms (make sure to use the \'final\' keyword here .(Tess: - if you have ever heard about it. The code should work either way ;).
- numberOfBathrooms
- numberOfFloors
- isOfficeBuilding

2.e Create a constructor that populates all the fields above.

2.f Create getters() for each of the fields above.

2.g In your main method, instantiate at least three different rooms.

2.h Add the three rooms to a collection (preferably of the same data type used for the "Rooms" field in your Building.java class).

2.i In your main method, instantiate a new building.

2.j print the total number of lamps in the entire building.

2.k make an if statement that checks if numberOfFloors > number of Rooms. if true, then print "This is an odd building".


## Task 3: (sorry, switching language now) ArrayList og Objekter

3.a Lav en klasse, Customer, med attributterne:
String firstName
String lastName
String username
int id

3.b Klassen skal have en konstruktor der tager et parameter med kundens navn og brugernavn. Giv klassen en toString() metode, der printer kundens detaljer pænt ud. Gør alle klassens felter private, og tilføj getters().

3.c Skriv en Main klasse med en main metode, hvor der oprettes en beholder af typen ArrayList, som du kalder 'customers'. Denne skal være erklæret som static global variabel - dvs tilgængelig udenfor main metoden. I customers skal du placere 6 instanser af Customer typen.
(Du kan oprette instanserne først, og så add'e dem til array'et. Du kan også adde og instantiere i samme linie.)

3.d Skriv en metode i Main kaldet printCustomers(), hvor du printer alle kunderne ud ved at gennemløbe 'customers' med et ’for each’ loop. Test metoden fra main ved at kalde den.