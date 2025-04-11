package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double monthly_payout;
        double interest_rate;
        double totalMonths;
        double monthlyRate;
        double annuity;
        int number_of_years;

        Scanner myscanner= new Scanner(System.in);

        System.out.println("Enter the monthly payout. Please insert on only number.Eg 5300, 6777");
        monthly_payout = myscanner.nextDouble();
        System.out.println(monthly_payout);


        System.out.println("What is the number of Years.Eg 12,34");
        number_of_years = myscanner.nextInt();
        totalMonths = number_of_years * 12;
        System.out.println(totalMonths);

        System.out.println("What is the interest rate as a percentage but do not include %. Eg 7.62, 5 ");
        interest_rate = myscanner.nextDouble();
        monthlyRate = interest_rate / 100/12;
        System.out.println(monthlyRate);


        annuity= monthly_payout * (1 - Math.pow(1 + monthlyRate, - totalMonths)) / monthlyRate;
        System.out.println("You will need to invest $" + annuity+ "today" );
    }
}