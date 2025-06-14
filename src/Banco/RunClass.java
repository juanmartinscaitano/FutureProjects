package Banco;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RunClass {
    public static void main(String[] args){
        int accountNumber = 12345-6;
        int agency = 1234;
        String clientName = "Nillo";
        String Birth = "16/07/1998";
        double balanceAccount1 = 2400.00;
        //balance means the current account money

    }

    public static void take(String[] args){
        Scanner scannerTake = new Scanner(System.in);

        double balance = 2400.00;

        System.out.println("Your current balance is: $" + balance + ". How much do you want to take?");
        double take = scannerTake.nextDouble();

        if(take <= balance) {

            balance = balance - take;
            System.out.println("You made a withdrawn of: $" + take + ", your current balance is: $" + balance);
            //withdrawn means take money from your bank account

        } else System.out.println("You don't have enought money to withdrawn. Your current balance is: $" + balance);

    }

    public static void transfer(String[] args){
        Scanner scannerTransfer = new Scanner(System.in);

        double balanceAccunt1 = 2400.00;
        double balanceAccunt2 = 0;

        System.out.println("How much do you want to transfer?");
        double valueTransfer = scannerTransfer.nextDouble();

        if (valueTransfer <= balanceAccunt1){
            balanceAccunt1 = balanceAccunt1 - valueTransfer;
            balanceAccunt2 = balanceAccunt2 + valueTransfer;
            System.out.println("You sucessful transfer $" + valueTransfer + " from account1 to account2. Now account1 have: $"
            + balanceAccunt1 + "and account2 have: $" + balanceAccunt2);
        } else System.out.println("You don't have enought money to proceed. Current balance: $" + balanceAccunt1);

    }

    public static void currentBalance(String[] args){
        double balance = 2400;

        System.out.println("Current balance is: $" + balance);
    }

    public static void TwoDayExtractsConsults(String[] args){
        Scanner scannerDays = new Scanner(System.in);
        Random randomValue = new Random(50);

        double balance = 2400.00;
        double day1 = randomValue.nextInt();
        double day2 = randomValue.nextInt();

        //continue this block of code with array

    }

    public static void AccountCancel(String[] args){
        //write block of code here
    }

}


/* To-do List
* Atributos: conta, agência, nome do cliente, nascimento, saldo*

  Métodos:*Sacar, *Transferir, Cancelar conta com justificativa, *Consultar o
  * extrato entre duas datas, *consultar saldo atual.
 */