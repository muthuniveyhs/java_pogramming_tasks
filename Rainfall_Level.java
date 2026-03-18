import java.lang.*;
import java.util.Scanner;
class Rainfall_Level{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the Rainfall :");
             int Rainfall=sc.nextInt();
             if(Rainfall>200 && Rainfall<=300){
	     System.out.println("Flood Level ");
              }           
             else if(Rainfall>150 && Rainfall<=200){
	     System.out.println("Very Heavy ");
             }
             else if(Rainfall>100 && Rainfall<=150){
	     System.out.println("Heavy Rain ");
             }
             else if(Rainfall>50 && Rainfall<=100){
	     System.out.println("Moderate Rain");
             }
             else {
             System.out.println("Light Rain "); 
             }
            
}} 