import resturan_pakage.data.foodData;
import staff.Cashier;
import staff.Chef;
import staff.Employer;
import staff.Waiter;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arry = {4, 2, 55, 6, 7, 9, 25, 1, 3};
        /// //////////////Sort///////////////////////
//        Sort1 sort1 = new Sort1(arry);
//        sort1.sorting();
//        Selectionsort selectionsort=new Selectionsort(arry);
//        selectionsort.sorting();
        /// /////////////ArraySort/////////////
//        LinearSearch linearSearch = new LinearSearch();
//       int x= linearSearch.search(arry,9);
//       System.out.println(x);
        ///  ///////InsertArray///////////////
//        InsertOperation insertOperation = new InsertOperation();
//         arry= insertOperation.InsertionSort(arry,4,100);
//
//            System.out.print(Arrays.toString(arry));
        ///  ///////DeleteArray///////////////
//        DeleteOperation delete = new DeleteOperation();
//        arry=delete.DeleteionSort(arry,4);
//        System.out.print(Arrays.toString(arry));
        ///  ///////PalindromeCheck ///////////////

//       boolean x= PalindromeCheck.isPalindrome("level");
//       if(x==true){
//           System.out.println("Palindrome");
//       }else {
//           System.out.println("Not Palindrome");
//       }

        ///  ///////ReverseString ///////////////
        String text = "hello";
        System.out.println("رشته اصلی: " + text);
        System.out.println("معکوس: " + ReverseString.reverse(text));

        /// ///////////////////// TwoSumTwoPointers ////////////////////
        int target = 9;
        int[] result = TwoSumTwoPointers.TwoSum(arry, target);
        if (result.length > 0) {
            System.out.println("Numbers: " + result[0] + " , " + result[1]);
        } else {
            System.out.println("No solution found!");
        }
    }
}
