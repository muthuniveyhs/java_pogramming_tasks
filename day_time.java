import java.lang.*;
import java.util.Scanner;
class time{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the time:");
             int time=sc.nextInt();
             if(time<12){
	     System.out.println("Good Morning");
              }           
             else if(time>12 && time<=17){
	     System.out.println("Good Afternoon");
             }
             else if(time>18 && time<=21){
	     System.out.println("Good Evening");
             }
             else{
	     System.out.println("Good Night");
             }
             
            
}}