package com.workintech.stacks;

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
        System.out.println("Initial text = " + text);
        text = text.replaceAll("[.,'?\\-\\s]", "");
        Stack<Character> stackOriginal = new Stack<>();
        var stackTemp = new Stack<>(); //normal stack
        var stackReversed = new Stack<>(); // ters cevrilmis stack

        var chars = text.toCharArray();
        for(var c : chars){
            stackOriginal.push(c);
            /*
              l
              e
              h
             */
            stackTemp.push(c);
            /*
              l
              e
              h
             */
        }

        for(char c : chars){
            Object charTemp = stackTemp.pop();
            stackReversed.push((Character)charTemp);
            /*
              l
              e
              h
             */

            /* stackReversed
            h
            e
            l
             */
        }
        System.out.println("Reversed = " + stackReversed);
        System.out.println("Original = " + stackOriginal);

        if(stackOriginal.equals(stackReversed)){
            return true;
        }
        return false;
    }
}