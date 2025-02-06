import java.util.Scanner;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        //Q1
        /*
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }

         */

        //Q2 ??
        /*
        int guessMe = 8;
        int number = 1;

         */

        //Q3
        /*
        int x;
        int total = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        x = input.nextInt();
        for (int i=1; i <= x; i++){
            System.out.println(i);
            total = total +i;
        }
        System.out.println("The sum is: " + total);

         */

        //Q4
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100: ");
        int x = input.nextInt();
        int i = 1;

        while(true){
            int multiple = i*x;
            if(multiple <= 100) {
                System.out.println(multiple);
                i += 1;
            }
            else {
                break;
            }
        }

         */

        //Q5
        /*
        int total = 0;
        int score;
        int testCount = 0;
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Enter a test score [999 to quit]: ");
            score = input.nextInt();
            total += score;
            testCount += 1;
            if(score == 999) {
                break;
            }

        }
        System.out.println("Your average test score is: " + (total - 999)/testCount + "%");

         */


    }
}