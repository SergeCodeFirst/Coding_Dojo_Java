package oop;

public class Greeter {
    public String greet(String name){
        return createGreating(name);
    }
    public String greet(){
        return createGreating("World");
    }

    public String greet(String firstName, String lastName){
        System.out.println("we are about to greet" + firstName);
        String fullName = firstName + " " + lastName;
        // return createGreating(firstName + " " + lastName);
        return createGreating(fullName);
    }

    private String createGreating(String toBetGreated){
        return "Greeting " + toBetGreated + ", welcome to coding dojo";
    }
}
