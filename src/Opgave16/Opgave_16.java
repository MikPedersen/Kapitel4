package Opgave16;
/*
Write a program that displays a random lowercase letter using the Math.random() method.
 */
public class Opgave_16 {
    public static void main(String[] args) {
        System.out.println(getRandomLowerCaseLetter());
    }

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }
    public static char getRandomLowerCaseLetter(){
        return getRandomCharacter('a', 'z');
    }
}
