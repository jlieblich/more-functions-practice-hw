package com.jlieblich;
import java.util.Scanner;
public class smallerEight {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] answers = {"Yes", "No", "Maybe", "Definitely", "Impossible", "Ask Again Later",
                            "Outlook Unclear", "Count On It", "Highly Unlikely"};
        boolean repeat = true;
        while(repeat) {
            int rand = (int)Math.round(Math.random()*8);
            System.out.println(answers[rand]);
            if(s.nextLine().equals("1")) repeat = false;
        }
    }
}