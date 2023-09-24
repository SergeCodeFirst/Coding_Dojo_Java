package fundamentals;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class LoopS {
    public static void main(String[] args) {
        int i = 1;
        while (i < 5){
            System.out.println(i + "'s Turn");
            i++;
        }
        
        System.out.println("===============");
        
        for (int j =0; j < 5; j++){
            System.out.println(j + "'s Times");
        }

        System.out.println("===============");
        ArrayList<Object> AllType = new ArrayList<Object>();
        AllType.add("Marc");
        AllType.add(3);
        AllType.add(true);

        int k=0;
        while (k < AllType.size()){
            System.out.println(AllType.get(k));
            k++;
        }

        for (int v=0; v< AllType.size(); v++){
            System.out.println(AllType.get(v));
        }

        System.out.println("===============");

        for(Object obj : AllType){
            System.out.println(obj);
        }
    }
}
