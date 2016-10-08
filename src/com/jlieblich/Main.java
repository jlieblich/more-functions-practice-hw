package com.jlieblich;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.print("Ask a question about your future.\nPress \'ENTER\' for a response, type \'1\' to exit:");
        magicBall();
    }

    private static int randomNumber() {

        return (int) Math.round(Math.random() * 8);
    }

    //Print a response after a 3.5 second delay each time a new line is entered (excluding "1")
    private static void magicBall() {
        Scanner s = new Scanner(System.in);
        if(s.nextLine().equals("1")) {
            System.exit(0);
        } else {
            System.out.println("Good question! Let's ask the spirits...");
            try {
                Thread.sleep(3500);
                int choice = randomNumber();
                switch(choice) {
                    case 0:
                        System.out.println("Seems unlikely");
                        break;
                    case 1:
                        System.out.println("Absolutely");
                        break;
                    case 2:
                        System.out.println("You may never know...");
                        break;
                    case 3:
                        System.out.println("Try again, but only if you're sure you want to know the answer");
                        break;
                    case 4:
                        System.out.println("Possible but unlikely");
                        break;
                    case 5:
                        System.out.println("Yes");
                        break;
                    case 6:
                        System.out.println("No");
                        break;
                    case 7:
                        System.out.println("No chance");
                        break;
                    case 8:
                        System.out.println("Only if you act as the catalyst");
                        break;
                }
            } catch(InterruptedException ignored) {
            }
            magicBall();
        }
    }
}
