import java.util.Scanner;

// Carolina Hernandez-Acosta
// 9/15/2023
// 1st period
// Input Practice 1
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int intOne, intTwo;
        String nameOne;
        double doubleOne;
        //Scanner name = new Scanner(System.in);
        // Create a Scanner object
        System.out.println("Enter your name :: ");
        nameOne = input.next();

        //Input methods

        System.out.println("Enter a double :: ");
        doubleOne = input.nextDouble();

        System.out.print("Enter integer one :: ");
        intOne = input.nextInt();

        System.out.print("Enter integer two :: ");
        intTwo = input.nextInt();

        //nameOne = input.nextLine();

        System.out.println("integer one = " + intOne);
        System.out.println("integer two = " + intTwo);
        System.out.println("Your lucky number is " + intOne + intTwo + "!");

        System.out.println("Your name is: " + nameOne);
        System.out.println("Your double is: " +doubleOne);


    }
}