package Banco;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int accountNumber = 12345-6;
        int agency = 1234;
        String clientName = "Nillo";
        String Birth = "16/07/1998";
        double balanceAccount1 = 2400.00;

        //put this variables in arrays so I can delete them
        //put try and catch to handle the exceptions
        //put a message of error if the value request if the value is higher than the balance

        Scanner scannerChoice = new Scanner(System.in);

        System.out.println("What you want to do?\n1: Withdrawn | 2: Transfer | 3: Current Balance | 4: Extract of two datas | 5: Cancel Your account");

        int choice = scannerChoice.nextInt();

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

    }

    static void withdrawn(double balanceAccount1){
        Scanner scannerWithdrawn = new Scanner(System.in);

        System.out.println("Your current balance is: $" + balanceAccount1 + ". How much do you want to take?");
        double withdrawn = scannerWithdrawn.nextDouble();

        if(withdrawn <= balanceAccount1) {

            balanceAccount1 = balanceAccount1 - withdrawn;
            System.out.println("You made a withdrawn of: $" + withdrawn + ", your current balance is: $" + balanceAccount1);
            //withdrawn means take money from your bank account

        } else System.out.println("You don't have enought money to withdrawn. Your current balance is: $" + balanceAccount1);

    }

    static void transfer(double balanceAccount1){
        Scanner scannerTransfer = new Scanner(System.in);

        double balanceAccount2 = 0;

        System.out.println("You have: $" + balanceAccount1 + ". How much do you want to transfer?");
        double valueTransfer = scannerTransfer.nextDouble();

        if (valueTransfer <= balanceAccount1){
            balanceAccount1 = balanceAccount1 - valueTransfer;
            balanceAccount2 = balanceAccount2 + valueTransfer;
            System.out.println("You sucessful transfer $" + valueTransfer + " from account1 to account2. Now account1 have: $"
            + balanceAccount1 + "and account2 have: $" + balanceAccount2);
        } else System.out.println("You don't have enought money to proceed. Current balance: $" + balanceAccount1);

    }

    static void currentBalance(double balanceAccount1){

        System.out.println("Current balance is: $" + balanceAccount1);

    }

    static void TwoDayExtractsConsults(double balanceAccount1){
        Scanner scannerDays = new Scanner(System.in);

        System.out.println("Chose the first data - 1: Monday | 2: Tuesday | 3: Wendnesday | 4: Thursday 5: Friday | 6: Saturday | 7: Sunday");
        int data1 = scannerDays.nextInt();

        System.out.println("Chose the second data - 1: Monday | 2: Tuesday | 3: Wendnesday | 4: Thursday 5: Friday | 6: Saturday | 7: Sunday");
        int data2 = scannerDays.nextInt();


        int week = 7;

        switch(week) {
            case 1:
                balanceAccount1 = balanceAccount1 - 100;
                String monday = "Monday";
                break;
            case 2:
                balanceAccount1 = balanceAccount1 - 200;
                break;
            case 3:
                balanceAccount1 = balanceAccount1 - 300;
                break;
            case 4:
                balanceAccount1 = balanceAccount1 - 400;
                break;
            case 5:
                balanceAccount1 = balanceAccount1 - 500;
                break;
            case 6:
                balanceAccount1 = balanceAccount1 - 600;
                break;
            case 7:
                balanceAccount1 = balanceAccount1 - 700;
                break;
        }

        System.out.println("Day 1: $" + data1 + ", and day two has: $" + data2 + ". The total of these two days is: $" + (data1 + data2));

        //continue this block of code with array

    }

    static void AccountCancel(int accountNumber ,int agency ,String clientName ,String Birth ,double balanceAccount1){
        Scanner scannerDelete = new Scanner(System.in);

        System.out.println("Chose the reason to delete your account\n1: I don't use | 2: This Account is givin me trouble | 3: I'm choose another bank");
        int deleteAccount = scannerDelete.nextInt();

        int reasonsDeleteAccount = 3;

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


    }

}


/* To-do List
* Atributos: conta, agência, nome do cliente, nascimento, saldo*

  Métodos: |Sacar, *Transferir, Cancelar conta com justificativa, *Consultar o
  * extrato entre duas datas, *consultar saldo atual.
 */