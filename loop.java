import java.lang.*;
import java.util.Scanner;
class prime{
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
    for(int i=0;i<=100;i++){
        int count=0;
        for(int j=2;j<i;j++){
            if(i%j==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println(i+" prime number");
        }
        else{ 
            System.out.println(i+"  not a prime number");
        }
    }
      }
    }