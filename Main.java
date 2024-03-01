import java.util.Scanner;

public class Main {


    public static void inputVehicle(Ferry ferry, Scanner s){
        System.out.print(">Enter vehicle type (car/motorcycle/truck): ");
        String type = s.next();

        System.out.print(">Enter license plate number: ");
        String plate = s.next();

        System.out.print(">Enter size: ");
        int size = s.nextInt();

        Vehicle vehicle = new Vehicle(type, plate, size);
        ferry.addVehicleToFerry(vehicle);
    }

    public static void inputPerson(Ferry ferry, Scanner s){
        System.out.print(">Enter your full name: ");
        String name = s.next() + s.next();

        System.out.print(">Enter your age: ");
        int age = s.nextInt();

        Person person = new Person(name, age);
        ferry.addPersonToFerry(person);
    }



        public static void main(String[] args) {
        Ferry ferry = new Ferry(7); //list of vehicles in the ferry
        Scanner s = new Scanner(System.in);

        while(ferry.totalVehicles + ferry.totalPeople < ferry.capacity) {
            System.out.println("Ferry Ticket Calculator");
            System.out.println("1.Add a vehicle");
            System.out.println("2.Continue without a vehicle");
            System.out.println("3.Exit\n");

            System.out.print(">Enter your choice: "); // enter according to the given choices
            int choice = s.nextInt();

            if(choice == 1) { // if the user wants to continue with a vehicle
                inputVehicle(ferry,s);
            }

            else if(choice == 2){// if user wants to continue without vehicle
                inputPerson(ferry,s);
            }

            else if(choice == 3){ // if they want to exit
                break;
            }

            else { // if a number other than 1,2 or 3 is entered
                System.out.println("--Wrong input, please try again--\n");
            }
        }
        s.close();
    }
}

