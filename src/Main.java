import resturan_pakage.data.foodData;
import staff.Cashier;
import staff.Chef;
import staff.Employer;
import staff.Waiter;

import java.sql.Array;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arry={4,2,55,6,7,9,25,1,3};
//        Sort1 sort1 = new Sort1(arry);
//        sort1.sorting();
        Selectionsort selectionsort=new Selectionsort(arry);
        selectionsort.sorting();







    }
}