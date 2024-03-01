import java.util.ArrayList;

public class Ferry {
    ArrayList<Vehicle> ferryVehicle = new ArrayList<Vehicle>(); //arraylist for vehicles
    ArrayList<Person> ferryPeople = new ArrayList<Person>(); //arraylist for people without vehicles


    int capacity;
    int totalVehicles = 0;
    int totalPeople = 0;

    public Ferry(int capacity) {//constructor
        this.capacity = capacity;

    }

    public void printVehicles() {
        for (Vehicle vehicle : ferryVehicle) {
            System.out.println("---------------------------------------");
            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Vehicle Plate: " + vehicle.getPlate());
            System.out.println("Vehicle Size: " + vehicle.getSize());
            System.out.println("Ticket Price: " + vehicle.vehicleTicket());


        }
    }

    public void printPeople(){
        for (Person person: ferryPeople){
            System.out.println("---------------------------------------");
            System.out.println("Full Name: " + person.getName());
            System.out.println("Age: "+ person.getAge());
            System.out.println("Ticket Price: " + person.personTicket());


        }
    }

    public void addVehicleToFerry(Vehicle vehicle) { // to register the vehicles to the ferry
        ferryVehicle.add(vehicle);
        System.out.println("Vehicle added successfully.\n");
        totalVehicles += vehicle.getSize();
        if (totalVehicles + totalPeople == capacity) {
            printVehicles();
            printPeople();
        }
    }

   public void addPersonToFerry(Person person){ //to register the people without vehicles to the ferry
        ferryPeople.add(person);
       System.out.println("Person added successfully.\n");
       totalPeople ++;
        if (totalVehicles + totalPeople == capacity){
            printVehicles();
            printPeople();
        }
    }

}
