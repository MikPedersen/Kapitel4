package Opgave1;
/*
Create a program to take the userinput: lenght from center to vertex,
and use 2 mathematical formulas to compute the area and return the result
 */
import java.util.Scanner;
public class Opgave_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the lenght from the center to a vertex");
        double r = input.nextDouble();
        //Calculate the side
        double s = 2 * r * Math.sin(Math.PI / 5);
        //Calculate the area
        double area = 5 * Math.pow(s, 2) / (4 * Math.tan(Math.PI / 5));
        //Round the result to 2 digits
        area = Math.round(area * 100) / 100.0;
        System.out.println("The area of the pentagon is " + area);
    }
}
