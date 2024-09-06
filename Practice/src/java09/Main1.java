package java09;

import java.util.Map;

public class Main1 {

    public static void main(String[] args) {
        Map<String,Integer> map1 = Map.ofEntries(Map.entry("s",32),Map.entry("d",32),Map.entry("e",32));
        Map<String,Integer> map2 = Map.of("abc",32,"try",42);

        System.out.println(map1);
        System.out.println(map2);
    }

}
