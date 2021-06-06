import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erica Joseph
 */
public class App {
    public static void main(String[] args) {
        //initiate scannner
        Scanner sc = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("#.##");
//input
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        String tempChoice = sc.next().toUpperCase();
        System.out.println("Your choice: "+tempChoice);

        if(tempChoice.equals("C")){
            System.out.print("Please enter the temperature in Fahrenheit: ");
            double feh = sc.nextDouble();
            double celciusCon = (feh - 32) * 1.8;
            System.out.print("The temperature in Celsius is: "+ df2.format(celciusCon));
        }
        else if(tempChoice.equals("F")){
            System.out.print("Please enter the temperature in Celcius: ");
            double cel = sc.nextDouble();
            double fehrenCon = (cel *(1.8)) + 32;
            System.out.print("The temperature in Fahrenheit is: "+ df2.format(fehrenCon));
        }
    }
}

