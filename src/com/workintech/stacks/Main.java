package com.workintech.stacks;

import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't node"));

    }

    public static boolean checkForPalindrome(String text) {
        //TODO: numerik ve alfabetik karakterler dısındaki herseyi bosluk ile degistir.

       String cleanedStr = text.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        LinkedList<Character> charList = new LinkedList<>();

        //TODO: Stringi karakter array'ine cevir ve her bir karakteri sırayla alıp karakter listesinin içine ekle

       for(char c : cleanedStr.toCharArray()){
           charList.add(c);
       }

       //TODO: Listenin size'i 1den büyük oldugunda esitlige bak

       while (charList.size() > 1) {
           if(!charList.pollFirst().equals(charList.pollLast())){
               return false;
           }
       }
       return true;
    }
}