import java.lang.*;
import java.util.Scanner;
class Pass_Fail_ternary{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the Mark :");
             int mark=sc.nextInt();
             System.out.println((mark>34)?"Passed the exam":"Failed");           
}} 