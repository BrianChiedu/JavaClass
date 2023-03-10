/*
 * Program: L7prog1.java
 *
 * Author : Brian Chukwuisiocha
 * Date : March 19th 2023
 * Course : Programming 2
 *
 */
public class Lab7 {
    public static void main(String[] args) {
        String[] stringArr = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

        // Loop to print the array in order
        System.out.print("Array in order: ");
        for (int i = 0; i < stringArr.length; i++){
            if(i == (stringArr.length - 1)){
                System.out.println(stringArr[i] + " |-");
            } else {
                System.out.print(stringArr[i] + ", ");
            }
        }
        System.out.println();

        // Loop to print the array in reverse order
        System.out.print("Array in reverse: ");
        for (int i = (stringArr.length - 1); i >= 0; i--){
            if(i == 0){
                System.out.println(stringArr[i] + " |-");
            } else {
                System.out.print(stringArr[i] + ", ");
            }
        }
        System.out.println();

        // Loop to print the array with switched pairs
        System.out.print("Array with switched pairs: ");
        for (int i = 1; i < stringArr.length; i+=2){
            if(i == (stringArr.length) - 1){
                System.out.println(stringArr[i] + ", " + stringArr[i-1] + " |-");
            } else {
                System.out.print(stringArr[i] + ", " + stringArr[i-1] + ", ");
            }
        }
        System.out.println();

        // Loop for the special print
        System.out.print("Special print: ");
        for (int i = 0; i < (stringArr.length/2); i++){
            if (i == (stringArr.length/2) - 1){
                System.out.println(stringArr[i] + stringArr[stringArr.length-1-i] + " |-");
            } else {
                System.out.print(stringArr[i] + stringArr[stringArr.length-1-i] + ", ");
            }
        }
        System.out.println();

        // Loop to print the different 2-element combinations
        for (int i=0; i< stringArr.length; i++){
            for (int j=i; j< stringArr.length; j++){
                if (j == (stringArr.length - 1)){
                    break;
                } else if (i == (stringArr.length - 2)) {
                    System.out.print(stringArr[i] + "" + stringArr[j+1] + " |-");
                } else {
                    System.out.print(stringArr[i] + "" + stringArr[j+1] + ", ");
                }
            }
            System.out.println();
        }
    }
}
