import java.util.ArrayList;

public class Listofexception {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");


        for(int i = 0; i < myList.size(); i++) {
            try{
                Integer castedValue = (Integer) myList.get(i);
                // if (myList.get(i) instanceof Integer){
                //     Integer castedValue = (Integer) myList.get(i);
                //     System.out.println("Casted value: " + castedValue);
                // } else{
                //     throw new ClassCastException("Can not cast to integer");
                // }
            } catch (ClassCastException e){
                System.out.println("Error: " + e.getMessage());
            }
        }


    }
}