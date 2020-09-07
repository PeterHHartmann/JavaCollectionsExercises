package com.company.E1;

import java.util.ArrayList;

public class Vowels {

    char[] vowelList = {'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args){
        ArrayList<String> sampleData = new ArrayList<>();
        sampleData.add("Frank");
        sampleData.add("John");
        sampleData.add("Kirk");
        sampleData.add("Franklin");
        sampleData.add("Theodore");
        Vowels vowels = new Vowels();
        System.out.println(vowels.averageVowels(sampleData));
    }

    public double averageVowels(ArrayList<String> wordlist){
        int vowelCount = 0;
        for(String word : wordlist){
            for(int i = 0; i < word.length(); i++){
                char currentVowel = word.charAt(i);
                for(char vowel : vowelList){
                    if(currentVowel == vowel){
                        vowelCount++;
                    }
                }
            }
        }
        return vowelCount;
    }

}
