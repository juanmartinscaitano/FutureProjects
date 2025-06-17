package Banco;

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
        //balance means the current account money
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
                withdrawn(balanceAccount1);
                break;
            case 5:
                withdrawn(balanceAccount1);
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

    static void TwoDayExtractsConsults(){
        Scanner scannerDays = new Scanner(System.in);
        Random randomValue = new Random(50);

        double balance = 2400.00;
        double day1 = randomValue.nextInt();
        double day2 = randomValue.nextInt();

        //continue this block of code with array

    }

    static void AccountCancel(String[] args){
        //write block of code here
    }

}


/* To-do List
* Atributos: conta, agência, nome do cliente, nascimento, saldo*

  Métodos: |Sacar, *Transferir, Cancelar conta com justificativa, *Consultar o
  * extrato entre duas datas, *consultar saldo atual.
 */