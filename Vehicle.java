import java.util.ArrayList;


class Vehicle {

    
    private final String type;
    private final String plate;
    private final int size;

    


    public Vehicle(String type, String plate, int size) {//constructor
        this.type = type;
        this.plate = plate;
        this.size = size;

    }

    public int vehicleTicket() { //calculate ferry tickets for each type of vehicle
        switch (type) {
            case "car":
                return size * 5;
            case "motorcycle":
                return size * 2;
            case "truck":
                return size * 10;
            default:
                return 0;
        }
    }

    public String getType() {
        return type;
    }//getters to reach to the private variables through main

    public String getPlate() {
        return plate;
    }

    public int getSize() {
        return size;
    }


}
