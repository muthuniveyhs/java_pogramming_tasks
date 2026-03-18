import java.lang.*;
class Bank{
int account_no;
String accont_holder;
double balance;

    Bank(int account_no,String accont_holder,double balance){
        this.account_no=account_no;
        this.accont_holder=accont_holder;
        this.balance=balance;

    }
 void deposit(){
    balance=balance+1000;
    System.out.println("Deposit amount 1000\nBalance"+balance);
 }
 void withdraw(){
    balance=balance-1000;
    System.out.println("Withdraw amount 500\nBanlance" +balance);
 }
 void displayBalance(){
    balance=balance;
    System.out.println("The balance amount"+balance);

 }
public static void main(String args[]){
    Bank obj =new Bank(1236879,"nivi",2000);
    obj.deposit();
    obj.withdraw();
    obj.displayBalance();
}
}