import java.lang.*;
import java.util.Scanner;
class BMI_category{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("enter the value for bmi is: ");
             int bmi=sc.nextInt();
             //System.out.println("enter the value for height :");
	     //int height=sc.nextInt();
             //int bmi=weight/(height*height);
	     //System.out.println("enter the value for weight is: "+weight);
             //System.out.println("enter the value for height :"+height);
             System.out.println("calculate the body mass index :"+bmi);
             if(bmi>35&&bmi<=40){
                    System.out.println("Severely Obese");
                }
             else if(bmi>30&&bmi<=35){
                     System.out.println("Obese");
               }
             else if(bmi>25&&bmi<=30){
                     System.out.println("Overweight");
              }
             else if(bmi>18&&bmi<=25){
                     System.out.println("Underweight");
              }

            
}}