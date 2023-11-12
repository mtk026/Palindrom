package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please Enter a word Which you want to chenck Polidrome stituation");
        Scanner scan =new Scanner(System.in);

        String word = scan.next();

        String str = word;
        String temp="";

        for (int i = str.length() - 1; i >= 0; i--) {
            temp+=str.charAt(i);
        }
        System.out.println(temp);
        if (temp.equals(str)) {
            System.out.println("ok");
        } else {
            System.out.println("false");
        }
        System.out.println(Math.pow(2,3));
    }
}