package ch03pc03;
import java.util.Scanner;

/**
 *
 * @author frank.olson
 * date: 11/1/2017
 * purpose: calculate the BMI and determine if a person is underweight, optimal, or overweight
 */
public class Ch03pc03 {

    public static void main(String[] args) {
        //variables
        double weight, height, bmi;
        
        //create a keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        //Request input
        System.out.print("Please enter your weight in pounds: ");
        weight = keyboard.nextDouble();
        System.out.print("Please enter your height in inches: ");
        height = keyboard.nextDouble();
        
        //Calculation
        bmi = (weight * 703)/(Math.pow(height,2));
        
        //Display
        if (bmi < 18.5)
            System.out.println("You are underweight for a sedentary person.");
        else if (bmi >= 18.5 && bmi <= 25)
            System.out.println("You are at the optimal weight for a sedentary person.");
        else
            System.out.println("You are overweight for a sedentary person.");
    }
    
}
