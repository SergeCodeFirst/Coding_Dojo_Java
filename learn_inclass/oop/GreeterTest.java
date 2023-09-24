package oop;

public class GreeterTest {
    public static void main(String[] args){
        Greeter hW = new Greeter();
        String greeting = hW.greet();
        String greetingWithFirstName = hW.greet("Eduardo");
        String greetingWithName = hW.greet("Eduardo", "Molis");

        // if (greeting.equals("Hello World") || greetingWithName.equals("Hello Eduardo")){
        //     System.out.println("Test successful");
        // } else{
        //     System.out.println("Test Fail");
        // }

        System.out.println(greeting);
        System.out.println(greetingWithFirstName);
        System.out.println(greetingWithName);
        
        // System.out.println(hW.createGreating("Molis"));
    }
}