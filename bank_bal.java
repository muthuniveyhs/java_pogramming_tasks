import java.lang.*;
import java.util.Scanner;
class bank_bal{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the Bank Balance :");
             int bank_balance=sc.nextInt();
             if(bank_balance<1000){
	     System.out.println("Low balance ");
}else{
             System.out.println("Balance OK "); 
}
            
}} 