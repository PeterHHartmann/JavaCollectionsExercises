package com.company.E8;

import java.util.HashSet;
import java.util.Set;

public class LengthFinder {

    public static void main(String[] args) {
        Set<String> sampleSet = new HashSet<>(){
            {
                add("John");
                add("Franklin");
                add("Reagan");
                add("Pip");
            }
        };
        LengthFinder lengthFinder = new LengthFinder();
        System.out.println(lengthFinder.minLength(sampleSet));
    }

    public int minLength(Set<String> set){
        if(set.size() == 0){
            return 0;
        }
        int longestString = Integer.MAX_VALUE;
        for (String word : set){
            if(word.length() < longestString){
                longestString = word.length();
            }
        }
        return longestString;
    }

}
