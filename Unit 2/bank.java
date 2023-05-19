import java.util.*;
class Account{
double balance;
String name;
public Account(String acname,double bal){
name=acname;
balance=bal;
}
public void Withdraw(double bal){
balance-=bal;
}
public void Deposit(double bal){
balance+=bal;
}
public double Balance(){
return balance;
}
}
class Demo{
public static void main(String ar[]){
Account usAccount = new Account("US account", 100.00);
Account chAccount = new Account("Swiss account", 1000000.00);
System.out.println("Intial state");
System.out.println(usAccount.name+" "+usAccount.Balance());
System.out.println(chAccount.name+" "+chAccount.Balance());
usAccount.Withdraw(20);
System.out.println("The balance of the US account is now: " + usAccount.Balance());
chAccount.Deposit(200);
System.out.println("The balance of the Swiss account is now: " + chAccount.Balance());
System.out.println("Ending balances");
System.out.println(usAccount.name+" "+usAccount.Balance());
System.out.println(chAccount.name+" "+chAccount.Balance());
}
}