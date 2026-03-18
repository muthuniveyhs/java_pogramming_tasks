import java.lang.*;
import java.util.Scanner;
class density{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("mass value is:");
             int mass=sc.nextInt();
             System.out.println("volume value is:");
             int volume=sc.nextInt();
	     double density=(mass/volume);
	     System.out.println("mass value is:"+mass);
             System.out.println("volume value is:"+volume);
             System.out.println("calculation of the density:"+density);
}}