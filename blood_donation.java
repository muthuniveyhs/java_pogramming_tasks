import java.lang.*;
import java.util.Scanner;
class blood_donation{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the donated blood weight :");
             int blood_weight=sc.nextInt();
             if(blood_weight<50){
	     System.out.println("Cannot donate");
}else{
             System.out.println("Can donate"); 
}
            
}} 