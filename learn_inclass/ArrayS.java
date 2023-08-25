import java.util.ArrayList;

public class ArrayS {
    public static void main(String[] args) {
        // =========== ARRAYS ==============
        // String[] strs = new String[5];
        // int[] nums = new int[5];
        
        // strs[0] = "Jhon";
        // strs[1] = "Micheal";
        // strs[2] = "Jonas";
        // strs[3] = "Steev";
        // strs[4] = "Marck";
        
        // nums[0] = 18;
        // nums[0] = 40;
        // nums[0] = 35;
        // nums[0] = 25;
        // nums[0] = 10;
        
        String[] Names = {"Lucien","Micheal","Luc","Jhon","Marc"};
        int[] Ages = {18, 45, 36, 8, 25};
        
        // System.out.println("====================");
        // System.out.println(Ages[0]);
        // System.out.println(Names[3]);
        // Ages[0] = 67;
        // Names[3] = "Lexis";
        // System.out.println(Names[3]);
        // System.out.println(Ages[0]);
        // System.out.println("====================");
        
        // =========== ARRAYS LIST ==============
        System.out.println("====================");
        ArrayList<Integer> AgesList = new ArrayList<Integer>();
        ArrayList<String> NamesList = new ArrayList<String>();

        System.out.println(NamesList);
        System.out.println(AgesList);
        
        System.out.println(AgesList.size());
        System.out.println(NamesList.size());

        System.out.println("NameList is empty?: " + NamesList.isEmpty());
        System.out.println("AgeList is empty?: " + AgesList.isEmpty());
        
        NamesList.add("Jhon");
        NamesList.add("Claude");
        NamesList.add("Micheal");
        AgesList.add(22);
        AgesList.add(35);
        AgesList.add(45);
        
        System.out.println("AgesList Countain '22'?: " + AgesList.contains(22));
        System.out.println("AgesList Countain '10'?: " + AgesList.contains(10));
        System.out.println("NameList Countain 'Jhon'?: " + NamesList.contains("Jhon"));
        System.out.println("NameList Countain 'Marc'?: " + NamesList.contains("Marc"));
        
        System.out.println("NameList Is Empty?: " + NamesList.isEmpty());
        System.out.println("AgesList Is Empty?: " + AgesList.isEmpty());

        System.out.println("Name at index 0 is :" + NamesList.get(0));
        System.out.println("Age at index 2 is :" + AgesList.get(2));

        System.out.println(AgesList);
        System.out.println(NamesList);

        System.out.println("AgesList Size Is?: " + AgesList.size());
        System.out.println("NamesList Size Is?: " + NamesList.size());

        ArrayList<Object> AllTypes = new ArrayList<>();
        AllTypes.add(0);
        AllTypes.add("Hello");
        AllTypes.add(new ArrayList<Integer>());
        
        // Most used ArrayList method are:
        // add, clear, clone, contains, get, indexOf, isEmpty, remove, size. 
        // Try them out and see what you can do with the ArrayList class.
        System.out.println("====================");


    }
}
