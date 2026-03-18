import java.lang.*;
import java.util.Scanner;
class Hightemperature{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the temperature :");
             int temperature=sc.nextInt();
             System.out.println((temperature>30)?"Very Hot":"Normal");
         
}} 