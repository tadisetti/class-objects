import java.util.*;
class Atm
{
  int balance;
  //withdraw
  void withdraw(int amount)
  {
    if(balance>amount)
    {
      balance=balance-amount;
      System.out.println("withdraw succesfully");
    }
    else
    {
      System.out.println("insufficient balance");
    }
  }
  
//deposite
void deposite(int amount)
  {
  balance=balance+amount;
System.out.println("deposite successfully");
  }
//check balance
void checkbalance()
  {
    System.out.println(balance);
  }
}
class Operations
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Atm atm=new Atm();
      atm.balance=10000;
      char ch='y';
      do
      {
      System.out.println("1.withdraw \n 2.deposite \n 3.check balance");
        System.out.println("select option");
        int option=sc.nextInt();
        switch(option)
          {
            case 1:
            System.out.println("Enter amount");
            int amount=sc.nextInt();
            atm.withdraw(amount);
            break;
            case 2:
            System.out.println("Enter amount");
            int amount1=sc.nextInt();
            atm.deposite(amount1);
            break;
            case 3:
              
            atm.checkbalance();
            break;
            default:
              System.out.println("invalid option");
            }
        System.out.println("do you want to continue");
        ch=sc.next().charAt(0);
        }
        while(ch=='y');
      }
  }


  
  