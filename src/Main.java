import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

       int ans, guess, guessNum = 0;
       final int maxGuesses = 5;
       String str, playAgain = "y";

       Scanner scan = new Scanner(System.in);
       Random generator = new Random();
       ans = generator.nextInt(10) + 1;

       while (playAgain.equals("y") || playAgain.equals("Y")) {
           System.out.println("Welcome to Guessing Game.");
           System.out.println("Guess a number from 1 to 10 (0 to quit): ");

           guess = scan.nextInt();
           guessNum = 0;
           while (guess !=0)
           {
               guessNum++;
               if(guess == ans)
               {
                   System.out.println("You're on the money!");
                   break;
               }
               else if (guess < ans)
               {
                   System.out.println( "Your guess is too low.");
               }
               else if (guess > ans)
               {
                   System.out.println("Your guess is too high.");
               }
               if (guessNum == maxGuesses)
               {
                   System.out.println("The number was " + ans);
                   break;
               }
               System.out.println("Enter your guess (0 to quit):");
               guess = scan.nextInt();
           }
           System.out.println("Want to play again? (y/n)");
           playAgain = scan.next();
       }
        System.out.println("Thanks for your participation.");
    }

}