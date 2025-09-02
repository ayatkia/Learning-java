import resturan_pakage.data.foodData;
import staff.Cashier;
import staff.Chef;
import staff.Employer;
import staff.Waiter;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Employer Cashier,Chef,Waiter;
    static int number;
    public static void main(String[] args) {
        foodData foodData = new foodData();
        Scanner scanner = new Scanner(System.in);
        System.out.println(foodData.toString());
        System.out.print("Number of your orders: ");


        while (true)
        {
            if (scanner.hasNextInt())
            {
                 number = scanner.nextInt();

                if (number>0&& number<5)
                {
                    System.out.println("Your " +foodData.MENUE[number-1][0]+ " have been sent to you");
                    break;
                }else
                    System.out.println("Please enter a valid number");
            }else
                System.out.println("you should enter an integer number");
                scanner = new Scanner(System.in);
        }
        Waiter=new Waiter(resturan_pakage.data.foodData.MENUE[number-1]);
        Chef=new Chef(foodData.MENUE[number-1]);
        Cashier=new Cashier(foodData.MENUE[number-1]);




    }
}