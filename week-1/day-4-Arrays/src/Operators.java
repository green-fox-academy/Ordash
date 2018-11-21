import java.awt.geom.RectangularShape;

public class Operators {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println(result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult +  "-1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " *10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " /5 = " + result);

        previousResult = result;

        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("result is now " + result);
        result++;
        System.out.println("result is now " + result);
        result--;
        System.out.println("result is now " + result);
        result += 2;
        System.out.println("result is now " + result);
        result *=10;
        System.out.println("result is now " + result);
        result -=10;
        System.out.println("result is now " + result);
        result /=10;
        System.out.println("result is now " + result);

        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an alien");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score!");

        int secondTopScore = 81;
        if((topScore > secondTopScore) && (topScore < 100) )
            System.out.println("Greater than top score and less than 100");

        if ((topScore >90) || (secondTopScore <=90))
            System.out.println("One of these sets is true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if(isCar)
            System.out.println("This is not suppose to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");

        double firstNum = 20d;
        double secondNum = 80d;
        double total = (firstNum+secondNum)*25;
        System.out.println(total);
        double remainder = total%40;
        System.out.println(remainder);
        if (remainder <= 20)
            System.out.println("Total was over the limit");


        //  ,..........,> expression
        int score = 100; // int> data type, score> variable, 100> value
        if (score > 90) { // '>' operator
            System.out.println("You got the high score!"); // in between the brackets=expression
            score = 0;

        }






















    }
}
