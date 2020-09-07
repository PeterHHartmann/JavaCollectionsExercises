package com.company.E10;

import java.util.HashSet;
import java.util.Set;

public class OddRemover {

    public static void main(String[] args) {
        Set<String> sampleSet = new HashSet<>(){
            {
                add("John");
                add("Franklin");
                add("Sabrina");
                add("Frank");
                add("Peter");
            }
        };
        OddRemover oddRemover = new OddRemover();
        System.out.println(oddRemover.removeOddLength(sampleSet));
    }

    public Set<String> removeOddLength(Set<String> set){
        set.removeIf(word -> word.length() % 2 == 1);
        return set;
    }

}
