package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Your program should start with a variable holding the current money on a user’s bank account
        // (start with e.g. 100)
        //The user should now enter an amount and he should enter if he wants to deposit to his account or
        // if he wants to withdraw (e.g. 1 for deposit, 2 for withdrawal)
        //The variable holding money on the account should be updated accordingly and the
        // current money should be printed. The program should run and let the user interact until
        // the money on his account is zero or less.
        Scanner scanner = new Scanner(System.in);
        double UserAccountBalance = 100.0;
        double negativeLimit = 0.0;
        int count = 0;
        while(UserAccountBalance > negativeLimit){
            System.out.println("enter an amount");
            double amount = scanner.nextDouble();
            System.out.println("enter 1 for deposit,2 for withdrawal");
            int operation = scanner.nextInt();
            if(operation == 1){
                UserAccountBalance += amount;
                count++;
                System.out.println("The currentBalance is " + UserAccountBalance);
            }
                else if(operation == 2 & UserAccountBalance -amount >= negativeLimit ){
                    UserAccountBalance -= amount;
                    count++;
                    System.out.println("The currentBalance is " + UserAccountBalance);
                }
                    else{
                        System.out.println("insufficient balance");
                        break;
                    }





                }
            }
        }



