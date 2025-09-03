package chalenge;

import java.util.Scanner;

public class Retrieve {
    public static void main(String[] args) {

        try{

            System.out.println("Please put your salary to calculate the taxes: ");
            Scanner scannerTax = new Scanner(System.in);
            double salary = scannerTax.nextDouble();
            double tax;


            if(salary <= 2259.20){
                tax = 0;
                tax = salary * tax / 100;
                double salaryAfter = salary - tax;
                System.out.printf("The tax is R$%.2f and your current salary is R$%.2f", tax, salaryAfter);
            }
            else if(salary > 2259.21 && salary <= 2826.65){
                tax = 7.5;
                tax = salary * tax / 100;
                double salaryAfter = salary - tax;
                System.out.printf("The tax is R$%.2f and your current salary is R$%.2f", tax, salaryAfter);
            }
            else if(salary > 2826.66 && salary <= 3751.05){
                tax = 15;
                tax = salary * tax / 100;
                double salaryAfter = salary - tax;
                System.out.printf("The tax is R$%.2f and your current salary is R$%.2f", tax, salaryAfter);
            }
            else if(salary > 3751.06 && salary <= 4664.68){
                tax = 22.5;
                tax = salary * tax / 100;
                double salaryAfter = salary - tax;
                System.out.printf("The tax is R$%.2f and your current salary is R$%.2f", tax, salaryAfter);
            }
            else if(salary > 4664.68){
                tax = 27.5;
                tax = salary * tax / 100;
                double salaryAfter = salary - tax;
                System.out.printf("The tax is R$%.2f and your current salary is R$%.2f", tax, salaryAfter);
            }

        } catch (Exception ex){
            System.err.println("Type only numbers");
        }

    }
}

//2.259,20 0%
//De R$ 2.259,21 até R$ 2.826,65	7,5%	R$ 169,44
//De R$ 2.826,66 até R$ 3.751,05	15,0%	R$ 381,44
//De R$ 3.751,06 até R$ 4.664,68	22,5%	R$ 662,77
//Acima de R$ 4.664,68	27,5%	R$ 896,00

// crie um código que calcule o recolhimento de Imposto de Renda de um funcionário a partir do valor do salário informado pelo usuário
//make a code who calculate the retrieve of gain tax of one employer from the salary value insert the by user




