package com.company.E13;

import java.util.*;

public class IsUnique {

    public static void main(String[] args) {
        Map<String, String> sampleMap1 = new HashMap<>(){
            {
                put("Key1", "John");
                put("Key2", "Franklin");
                put("Key3", "Theodore");
                put("Key4", "John");
                put("Key5", "Kennedy");
            }
        };
        Map<String, String> sampleMap2 = new HashMap<>(){
            {
                put("Key1", "John");
                put("Key2", "Franklin");
                put("Key3", "Theodore");
                put("Key4", "Johnson");
                put("Key5", "Kennedy");
            }
        };
        System.out.println(isUnique(sampleMap1));
        System.out.println(isUnique(sampleMap2));
    }

    public static boolean isUnique(Map<String, String> map){
        Collection<String> valueList = map.values();
        Set<String> valueSet = new HashSet<>(valueList);
        return valueSet.size() >= map.size();
    }

}
