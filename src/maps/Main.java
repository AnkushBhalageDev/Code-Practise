package maps;

import java.util.IdentityHashMap;
import java.util.WeakHashMap;

public class Main {
    public static void main(String[] args) {
        IdentityHashMap iHashmap= new IdentityHashMap();
        String s1= new String("name");
        String s2= new String("name");
        iHashmap.put(s1,"Ankush");
        iHashmap.put(s2,"Kartik");
        System.out.println(iHashmap);
        System.out.println(iHashmap.get(s2));

        WeakHashMap weakHashMap= new WeakHashMap();
        weakHashMap.put(s1,"Ankush");
        weakHashMap.put(s2,"Kartik");
        System.out.println(weakHashMap);



    }
}
