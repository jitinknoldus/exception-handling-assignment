package exception_handling_assignment.task1;

//functionality to make simple calculator and managing the errors.

import java.util.Scanner;

public class SimpleCalculator {

    static int simpleCalculator(int number1, int number2, int operation) throws CustomException{
        switch(operation){
            case 1:
                return number1 + number2;
            case 2:
                return number1 - number2;
            case 3:
                return number1 * number2;
            case 4 :
                if(number2 == 0){
                    throw new CustomException("Invalid Input");
                }
                return number1 / number2;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter 1st number ");
        int number1 = scannerObject.nextInt();

        System.out.println("Enter 2nd number");
        int number2 = scannerObject.nextInt();

        System.out.println("Enter operation");
        System.out.println("press 1 to add");
        System.out.println("press 2 to subtract");
        System.out.println("press 3 to multiply");
        System.out.println("press 4 to divide");
        int operation = scannerObject.nextInt();

        try{
            simpleCalculator(number1,number2,operation);
        }
        catch (CustomException e){
            System.out.println(e);

        }


    }

}
