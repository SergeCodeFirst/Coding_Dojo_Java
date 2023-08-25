import java.util.HashMap;
import java.util.Set;

public class HasMapS {
    public static void main(String[] args) {
        HashMap<String, String> newMap = new HashMap<String, String>();
        // newMap.put("nidja@gmai.com", "Nidja");
        newMap.put("nidja@gmai.com", "Nidja");
        newMap.put("samuraii@gmai.com", "Samuraii");
        newMap.put("warior@gmai.com", "Warior");

        String name = newMap.get("nidja@gmai.com");
        System.out.println("The name is: " + name);
        
        Set<String> myKeys = newMap.keySet();
        System.out.println("My set: " + myKeys);
        for (String key : myKeys){
            System.out.println(key);
            System.out.println(newMap.get(key));
        }
        // Most use HashMap Method
        // clear, containsKey, containsValue,isEmpty, keySet, remove, replace, size, values. 
    }
    
}
