import java.lang.*;
import java.util.Scanner;
class Attendance_warning{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the Attendance :");
             int Attendance=sc.nextInt();
             if(Attendance<75){
	     System.out.println("Warning ");
}else{
             System.out.println("Allowed "); 
}
            
}} 