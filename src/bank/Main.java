package bank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        try {
            int accountNumber = 12345-6;
            int agency = 1234;
            String clientName = "Nillo";
            String Birth = "16/07/1998";
            double balanceAccount1 = 2400.00;

            Scanner scannerChoice = new Scanner(System.in);

            System.out.println("What you want to do?\n1: Withdrawn | 2: Transfer | 3: Current Balance | 4: Extract of two datas | 5: Cancel Your account");

            int choice = scannerChoice.nextInt();

            while(choice < 1 || choice > 5) {
                System.err.println("Please type only 1 to 5");
                choice = scannerChoice.nextInt();
            }

            switch (choice) {
                case 1:
                    withdrawn(balanceAccount1);
                    break;
                case 2:
                    transfer(balanceAccount1);
                    break;
                case 3:
                    currentBalance(balanceAccount1);
                    break;
                case 4:
                    TwoDayExtractsConsults(balanceAccount1);
                    break;
                case 5:
                    AccountCancel(accountNumber ,agency ,clientName ,Birth ,balanceAccount1);
                    break;
            }
        } catch (Exception e) {
            System.err.println("Type only number");;
        }

    }

    static void withdrawn(double balanceAccount1){
        try{
            Scanner scannerWithdrawn = new Scanner(System.in);

            System.out.println("Your current balance is: $" + balanceAccount1 + ", how much do you want to take?");
            double withdrawn = scannerWithdrawn.nextDouble();

            if(withdrawn <= balanceAccount1) {

                balanceAccount1 = balanceAccount1 - withdrawn;
                System.out.println("You made a withdrawn of: $" + withdrawn + ", your current balance is: $" + balanceAccount1);
                //withdrawn means take money from your bank account

            } else {
                System.err.println("You don't have enought money to withdrawn.");
                System.out.println("Current balance is: $" + balanceAccount1);
            }

        } catch (InputMismatchException withdrawnException) {
            System.err.println("Type only numbers");
        }



    }

    static void transfer(double balanceAccount1){
        try {
            Scanner scannerTransfer = new Scanner(System.in);

            double balanceAccount2 = 0;

            System.out.println("You have: $" + balanceAccount1 + ". How much do you want to transfer?");
            double valueTransfer = scannerTransfer.nextDouble();

            if (valueTransfer <= balanceAccount1){
                balanceAccount1 = balanceAccount1 - valueTransfer;
                balanceAccount2 = balanceAccount2 + valueTransfer;
                System.out.println("You sucessful transfer $" + valueTransfer + " from account1 to account2. Now account1 have: $"
                        + balanceAccount1 + "and account2 have: $" + balanceAccount2);
            } else {
                System.err.println("You don't have enought money to proceed.");
                System.out.println("Current balance: $" + balanceAccount1);
            }


        } catch (InputMismatchException TransferException){
            System.err.println("Type only numbers");
        }

    }

    static void currentBalance(double balanceAccount1){

        System.out.println("Current balance is: $" + balanceAccount1);

    }

    static void TwoDayExtractsConsults(double balanceAccount1){
        Scanner scannerDays = new Scanner(System.in);

        try {
            System.out.println("Chose the first data - 1: Monday | 2: Tuesday | 3: Wednesday | 4: Thursday | 5: Friday | 6: Saturday | 7: Sunday");
            int data1 = scannerDays.nextInt();

            while (data1 < 1 || data1 > 7) {
                System.err.println("Type only 1 to 7");
                data1 = scannerDays.nextInt();
            }

            System.out.println("Chose the second data - 1: Monday | 2: Tuesday | 3: Wednesday | 4: Thursday | 5: Friday | 6: Saturday | 7: Sunday");
            int data2 = scannerDays.nextInt();

            while (data2 < 1 || data2 > 7) {
                System.err.println("Type only 1 to 7");
                data2 = scannerDays.nextInt();
            }

            int week1 = data1;
            int week2 = data2;

            switch(week1) {
                case 1:
                    data1 = 100;
                    balanceAccount1 = balanceAccount1 - data1;
                    String monday = "Monday";
                    break;
                case 2:
                    data1 = 200;
                    balanceAccount1 = balanceAccount1 - data1;
                    break;
                case 3:
                    data1 = 300;
                    balanceAccount1 = balanceAccount1 - data1;
                    break;
                case 4:
                    data1 = 400;
                    balanceAccount1 = balanceAccount1 - data1;
                    break;
                case 5:
                    data1 = 500;
                    balanceAccount1 = balanceAccount1 - data1;
                    break;
                case 6:
                    data1 = 600;
                    balanceAccount1 = balanceAccount1 - data1;
                    break;
                case 7:
                    data1 = 700;
                    balanceAccount1 = balanceAccount1 - data1;
                    break;
            }

            switch(week2) {
                case 1:
                    data2 = 10;
                    balanceAccount1 = balanceAccount1 - data2;
                    String monday = "Monday";
                    break;
                case 2:
                    data2 = 20;
                    balanceAccount1 = balanceAccount1 - data2;
                    break;
                case 3:
                    data2 = 30;
                    balanceAccount1 = balanceAccount1 - data2;
                    break;
                case 4:
                    data2 = 40;
                    balanceAccount1 = balanceAccount1 - data2;
                    break;
                case 5:
                    data2 = 50;
                    balanceAccount1 = balanceAccount1 - data2;
                    break;
                case 6:
                    data2 = 60;
                    balanceAccount1 = balanceAccount1 - data2;
                    break;
                case 7:
                    data2 = 70;
                    balanceAccount1 = balanceAccount1 - data2;
                    break;
            }

            System.out.printf("Day 1: $ %d, and day 2: $%d. These two datas added is: $%d", data1, data2, data1 + data2);
        } catch (InputMismatchException TwoDayExtractsConsultsException) {
            System.err.println("Please type only numbers!");
        }

    }

    static void AccountCancel(int accountNumber ,int agency ,String clientName ,String Birth ,double balanceAccount1){

        try{
            Scanner scannerDelete = new Scanner(System.in);



            System.out.println("Chose the reason to delete your account\n1: I don't use | 2: This Account is givin me trouble | 3: I'm choose another bank");
            int deleteAccount = scannerDelete.nextInt();

            while(deleteAccount != 1 && deleteAccount != 2 && deleteAccount != 3){
                System.err.println("Please type only 1, 2 or 3!");
                deleteAccount = scannerDelete.nextInt();
            }

            int reasonsDeleteAccount = deleteAccount;

            switch (reasonsDeleteAccount) {
                case 1:
                    System.out.println("We are sorry to hear you don't use your account. It will be deleted in an instant");
                    accountNumber = 0; agency = 0; clientName = null; Birth = null; balanceAccount1 = 0;
                    break;
                case 2:
                    System.out.println("We are sorry to hear you are having trouble with our bank. Your account will be deleted in an instant");
                    accountNumber = 0; agency = 0; clientName = null; Birth = null; balanceAccount1 = 0;
                    break;
                case 3:
                    System.out.println("We are sorry to hear you are chosing another bank. Your account will be deleted in an instant");
                    accountNumber = 0; agency = 0; clientName = null; Birth = null; balanceAccount1 = 0;
                    break;

            }

        } catch (InputMismatchException AccountCancelException) {
            System.err.println("Type only numbers");;
        }

    }

}


