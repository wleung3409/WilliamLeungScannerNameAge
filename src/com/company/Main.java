package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
	// write your code here
        Scanner input= new Scanner(System.in);
        System.out.println("What is your name?");
        String name=input.nextLine();
        System.out.println("Hello "+name+", nice to meet you");
        System.out.println("How old are you?");
        int ree=input.nextInt();
        System.out.println("You are "+ree+" years old");
    }
}
