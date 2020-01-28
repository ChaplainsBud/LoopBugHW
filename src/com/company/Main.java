package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner keyboard = new Scanner(System.in);

        String userInput = "";

        userInput = keyboard.nextLine();
        System.out.println("Enter a string.");

        userInput = keyboard.nextLine();

        while (userInput != "") {
            System.out.println(userInput);
        }

    }
}


// condition: as long as there is an input, display text
// what condition can I use while(true) ...
// keyboard.close()