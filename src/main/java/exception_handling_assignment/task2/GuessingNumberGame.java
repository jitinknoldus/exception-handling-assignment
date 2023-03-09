package exception_handling_assignment.task2;
import java.util.Random;

//creating a number guessing game and handling errors


import java.util.Scanner;

public class GuessingNumberGame extends Exception {

    static void guessingNumberGame(int guessedNumber,int generatedNumber) {
        Scanner scannerObject = new Scanner(System.in);
        boolean flag = true;

        while(flag){

            if(generatedNumber == guessedNumber){
                System.out.println("You guessed it !");
                flag = false;
                System.exit(0);
            }

            if(generatedNumber>guessedNumber){
                System.out.println("Too Low");
                guessedNumber = scannerObject.nextInt();
            }
            if(generatedNumber<guessedNumber){
                System.out.println("Too High");
                guessedNumber = scannerObject.nextInt();
            }
        }
    }


    public static void main(String[] args) throws CustomGameException {
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter you number");
        int guessedNumber = scannerObject.nextInt();

        Random randomNum = new Random();
        int generatedNumber = randomNum.nextInt(100)+ 1;


        while (true){
            try{
                guessingNumberGame(guessedNumber,generatedNumber);
            }
            catch(Exception e){
                System.out.println(e);
            }

        }
    }
}
