import java.lang.*;
import java.util.Scanner;
class college_admission{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("enter your mark :");
             int mark=sc.nextInt();
             System.out.println("your documents is verified:");
             String document=sc.next();
            
             
             if(mark>=120){
              

                  if(document.equals("yes"))
                  {
                      System.out.println("confirm admission");
                  }

             else 
                  {
                   System.out.println("verify documents");
                  }
           }
            else{
                System.out.println("your not eligible");

               }



}}