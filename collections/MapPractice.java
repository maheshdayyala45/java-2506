package collections;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapPractice {

    public static void main(String[] args) {
        //creation of map
        Map<Integer, String> m = new TreeMap<>();

        //addition of elements into the map
        m.put(1, "mahesh");
        m.put(2,"harika" );
        m.put(3, "maha");

        //retreival keys from the map
        Set<Integer> keys=m.keySet();
        for (Integer key : keys) {
            System.out.println(key);   
        }

        //retrieval of values from the map
        Collection<String> values=m.values();
        for (String value : values) {
            System.out.println(value);
            
        }
        //retrieval of the values from the map based on keys
        System.out.println(m.get(1));
        for (Integer key : keys) {
            System.out.println(key +" "+ m.get(key));    
        }

        //verification of key in a map
        System.out.println(m.containsKey(1));

        //verification of values in a map
        System.out.println(m.containsValue("maha"));

        m.remove(1);
          m.putIfAbsent(1, "mahesh");
        m.replace(1, "harilu");
        m.clear();
      
        


        System.out.println(m);

        
    }
    
}
