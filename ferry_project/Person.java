

public class Person {

    private final String name;
    private final int age;



    public Person(String fullName, int age){//construction
        this.name = fullName;
        this.age = age;
    }

    public int personTicket(){ // if the person is under 18, ticket is $5, otherwise ticket is $10.
        if (age<18){
            return 5;
        }
        else{
            return 10;
        }
    }

    public String getName(){
        return name;
    }//getters to reach to the private variables through main
    public int getAge(){
        return age;
    }



}
