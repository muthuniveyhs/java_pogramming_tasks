import java.lang.*;
import java.util.Scanner;
class prime{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("enter the size of array");
             int size=sc.nextInt();
             int a[]=new int[size];
    for(int i=1;i<size;i++){
         a[i]=sc.nextInt();
         int n=a[i];
        int count=0;
        for(int j=2;j<n;j++){
            if(n%j==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println(n+" prime number");
        }
        else{ 
            System.out.println(n+"  not a prime number");
        }
    }
      }
    }