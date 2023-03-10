import java.util.Scanner;

/*
 * Program: Hw04prog1.java
 *
 * Author : Brian Chukwuisiocha
 * Date : March 9th 2023
 * Course : Programing 2
 *
 * Program Description:
 *
 *
 *
 */
public class Hw05prog1 {
    public static void main(String[] args) {
        System.out.println("This program calculates average score");
        System.out.println("---------------------------------------------");
        Scanner scan = new Scanner(System.in);
        int[] scoreArray = new int[5];

        int j = 1;
        // loop that collects inputs
        for(int i = 0; i < 5; i++){
            System.out.println("Enter the score for student " + j + " : ");
            scoreArray[i] = scan.nextInt();
            while(scoreArray[i] < 0 || scoreArray[i] > 50){
                System.out.println("Invalid input! Please enter a number between 0 and 100.");
                System.out.println("Enter the score for student " + j + " : ");
                scoreArray[i] = scan.nextInt();
            }
            j++;
        }

        j = 1;
        // loop to display scores
        System.out.println("------------------------------------------");
        for (int i = 0; i < scoreArray.length; i++){
            System.out.println("Student " + j + " is " + scoreArray[i]);
            j++;
        }

        int sum = 0;
        int max = scoreArray[0];
        int min = scoreArray[0];
        // loop for calculations
        for (int i = 0; i < scoreArray.length; i++){
            sum += scoreArray[i];
            if(scoreArray[i] > max) {
                max = scoreArray[i];
            }
            if(scoreArray[i] < min){
                min = scoreArray[i];
            }
        }
        double average = (double) sum / scoreArray.length;
        System.out.println("------------------------------------------");

        System.out.println("The maximum score is " + max);
        System.out.println("The minimum score is " + min);
        System.out.printf("The average score is %.2f", average);
    }
}
