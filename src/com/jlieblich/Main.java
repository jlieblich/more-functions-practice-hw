package com.jlieblich;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.print("Ask a question about your future.\nPress \'ENTER\' for a response, \'1\' to exit:");
        magicBall();
    }

    public static int randomNumber() {
        return (int) Math.round(Math.random() * 8);
    }

    public static void magicBall() {
        Scanner s = new Scanner(System.in);
        if(s.nextLine().equals("1")) {
            System.exit(0);
        } else {
            System.out.println("Good question! Let's ask the spirits...");
            try {
                Thread.sleep(3500);
            } catch(InterruptedException e) {
                //no interruptions possible
            }
            int choice = randomNumber();
            switch(choice) {
                case 0:
                    System.out.print("Seems unlikely");
                    break;
                case 1:
                    System.out.print("Absolutely");
                    break;
                case 2:
                    System.out.print("You may never know...");
                    break;
                case 3:
                    System.out.print("Try again, but only if you're sure you want to know the answer");
                    break;
                case 4:
                    System.out.print("Possible but unlikely");
                    break;
                case 5:
                    System.out.print("Yes");
                    break;
                case 6:
                    System.out.print("No");
                    break;
                case 7:
                    System.out.print("No chance");
                    break;
                case 8:
                    System.out.print("Only if you act as the catalyst");
                    break;
            }
            magicBall();
        }
    }
}
