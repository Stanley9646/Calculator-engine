package com.calcengine;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalcEngine {
    public static  void  main (String[]args){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateAndTime =now.format(formatter);
        System.out.println("Current date and time: " + formattedDateAndTime);

        char[] operators = {'+', '-', '*', '/','%'};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value1 : ");
        double  value1= scanner.nextInt();
        System.out.print("Enter value2 : ");
        double  value2 = scanner.nextInt();
        System.out.println("Enter the operator (+, -, *, /,%):");
        char operator = scanner.next().charAt(0);
        double result;
        switch (operator){
            case '+' :result= value1 + value2;
            break;
            case '-': result=value1 - value2;
            break;
            case '*': result=value1 * value2;
                break;
            case '/':result= value1 / value2;
                break;
            case '%': result=value1 % value2;
                break;
            default:
                System.out.println("invalid operator");
                return ;
        }


        System.out.printf("Result : %.2f\n", result);
    }
}
