package com.workintech.queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import static com.workintech.stacks.Main.checkForPalindrome;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't node"));
    }

    private static boolean checkForPalindrome(String text){
        System.out.println("Initial Text: " + text);
        text = text.replaceAll("[.,'?\\-\\s]", "");
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        char[] chars = text.toCharArray();
        for(char c : chars){
            stack.push(c); // stack = > o,l,l,e,h
            queue.offer(c); // queue = > h,e,l,l,o
        }

        System.out.println("Queue: " + queue);
        System.out.println("Stack: " + stack);

        while ( !queue.isEmpty()){
            Character c = queue.remove();
            Character cStack = stack.pop();

            System.out.println("Removed Item Queue: " + c);
            System.out.println("Removed Item Stack: " + cStack);

            if(c != cStack){
                return false;
            }
        }
        return true;

    }
}
