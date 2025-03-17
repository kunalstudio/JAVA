/*Create abstract class – Account with attributes account id, customer id and abstract
methods – deposit and withdraw. Create child class – SavingAccount from this abstract class.
This class will implement withdraw and deposit methods. deposit method will take account id
and deposit amount. Amount will be deposited into specific account with that id. Method will
return new balance if account with that id exists, else returns -1. withdraw method will take
account id and withdraw amount. It will return -1 if account with specific id does not exist. Else,
it will check if withdraw amount is less than or equal to existing balance. If yes, perform
withdrawal and return new balance. Write a java program to test the SavingAccount class by
creating an instance of it*/

import java.util.Scanner;
abstract class Account
{ 
  int acc_id ;
  int c_id ;
  abstract int deposit();
  abstract int withdrawal();
  
  void get()
  { Scanner s = new Scanner(System.in);
    acc_id = s.nextInt();
  }
}

class SavingAccount extends Account
{ int amount,aid;
  int balance=0;
  
  super.get();
  
  int deposit()
  { Scanner s = new Scanner(System.in);
    System.out.println("Enetr Account id ");
	aid = s.nextInt();
	System.out.println("Enter amount to be deposited:");
	amount = s.nextInt();
	balance += amount ;
	if( super.acc_id == aid )
	return 1;
	else 
	return -1;
  }
  
  int withdrawal()
  { Scanner s = new Scanner(System.in);
    System.out.println("Enetr Account id ");
	aid = s.nextInt();
	System.out.println("Enter amount to be withdrawed:");
	amount = s.nextInt();
	balance -= amount ;
	if( super.acc_id == aid )
	return 1;
	else 
	return -1;
  }
}

class Child
{ Account a = new SavingAccount();
  if( a.deposit() == 1)
	System.out.println("Deposited!");
  else
	System.out.println("Account not found");
  if( a.withdrawal() == 1)
	System.out.println("Deposited!");
  else
	System.out.println("Account not found");
}