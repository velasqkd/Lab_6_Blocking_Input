import java.util.Random;
import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        double fahrenheit = 0;
        String trash = "";
        boolean done = false;

        do {

        System.out.println("Please enter the temperature in celsius: ");
        if(in.hasNextDouble())
        {
            celsius = in.nextDouble();
            fahrenheit = (celsius * 9/5) + 32;
            celsius = fahrenheit;
            System.out.println("The new temperature in fahrenheit is: " + fahrenheit);
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Invalid value, please re-enter the value: "  + trash);
        }
        } while (!done);
    }
}




class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons = 0;
        double milesPerGallon = 0;
        double pricePerGallon = 0;

        do {
            System.out.println("Please enter the number of gallons of gas in the tank: ");
            gallons = in.nextDouble();
        } while (gallons <= 0);
        do {
            System.out.println("Please enter the fuel efficiency in miles per gallon in the tank: ");
            milesPerGallon = in.nextDouble();
        } while (milesPerGallon <= 0);
        do {
            System.out.println("Please enter the price of gas per gallon: ");
            pricePerGallon = in.nextDouble();
        } while (pricePerGallon <= 0);

        double costToDrive100Miles = (100/milesPerGallon) * pricePerGallon;
        double distanceWithFullTank = gallons * milesPerGallon;

        System.out.println("The cost to drive 100 miles is: " + costToDrive100Miles);
        System.out.println("The distance you are able to drive with a full tank of gas is: " + distanceWithFullTank);
    }
}


class RectangleInfo {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        double width = 0;
        double height = 0;

        do {
            System.out.println("Please enter the width of the rectangle: ");
            while (!in.hasNextDouble())
            {
                System.out.println("Please enter a valid number for the width.");
                in.next();
            }
            width = in.nextDouble();
        }while (width <= 0);
        do {
            System.out.println("Please enter the height of the rectangle: ");
            while (!in.hasNextDouble())
            {
                System.out.println("Please enter a valid number for the height.");
                in.next();
            }
            height = in.nextDouble();
        }while (height <= 0);

        double area = width * height;

        System.out.println("The area of the rectangle is: " + area);
    }
}




import java.util.Scanner;
import java.util.Random;
class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();

        int randomNumber = generator.nextInt(10) + 1;
        int userGuess = 0;
        boolean done = false;

        do {
            System.out.print("Guess the number between 1 and 10: ");
            if (in.hasNextInt())
            {
                userGuess = in.nextInt();

                if (userGuess >= 1 && userGuess <= 10)
                {
                    done = true;
                } else
                {
                    System.out.println("Please enter a number between 1 and 10.");
                }
            } else
            {
                System.out.println("Invalid input. Please enter an integer between 1 and 10.");
                in.nextLine();
            }
        } while (!done);

        System.out.println("The random number was: " + randomNumber);
        if (userGuess == randomNumber)
        {
            System.out.println("Congratulations! Your guess was correct!");
        } else if (userGuess < randomNumber)
        {
            System.out.println("Your guess was too LOW.");
        } else
        {
            System.out.println("Your guess was too HIGH.");
        }
    }
}

