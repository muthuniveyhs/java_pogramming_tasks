import java.lang.*;
import java.util.Scanner;
class price_check{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the First product price :");
             int first_product=sc.nextInt();
             System.out.println("Enter the Second product price :");
             int second_product=sc.nextInt();
             if(first_product<second_product){

	     System.out.println("Price one is cheaper ");
}else{
             System.out.println("Price two is cheaper");
}
            
}} 