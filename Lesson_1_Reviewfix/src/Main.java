import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        //Q1 + Q2
        /*String name;
        int age;
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        name = input.nextLine();
        System.out.println("How old are you?");
        age = input.nextInt();
        System.out.println("Hi "+name+"\n" +"You are "+age+" years old.");

        if  (age >= 18) System.out.println("You can vote.");
        else System.out.println("You aren't old enough to vote."); */

        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int secret = rand.nextInt(0,21);
        int guess = input.nextInt();
        System.out.println("Guess a number between 0 and 20: ");
    }
}

