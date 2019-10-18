package Opgave8;
/*
Take userinput as a character and return the numerical value from the ASCII table
 */

import java.util.Scanner;
public class Opgave_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character:");
        char userinput = input.next().charAt(0);

        System.out.println("The ASCII code for " + userinput + " is " + (int)(userinput));
    }
}
