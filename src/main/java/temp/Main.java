package temp;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();
        map.put(111,"1");
        map.put(333,"3");
        map.put(222,"2");
        List<Integer> list = new ArrayList<>(map.keySet());
        for (int i:list){
            System.out.println(i);
        }
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
    }
}
