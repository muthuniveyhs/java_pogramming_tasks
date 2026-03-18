import java.lang.*;
import java.util.Scanner;
class prime_single{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
       int n=10;
        int count=0;
        for(int j=2;j<n;j++){
            if(n%2==0){
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
    