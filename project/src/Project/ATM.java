package Project;
import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        ATMOperations obj = new ATMOperations();
        obj.checkPin();
    }
}
class ATMOperations {
    float balance;
    int PIN = 3116;
    public void checkPin() 
    {
    	System.out.println("Welcome to ATM Punjab National Bank ");
    	System.out.println("service 24*7");
    	System.out.println("Enter the Card First:--");
        System.out.println("Enter the pin:");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();
        if (enteredPin == PIN) {
             menu();
        } else {
             System.out.println("Enter a valid pin");
        }
    }
    public void menu() {
        System.out.println("Enter your choice:");
        System.out.println("1. Check A/C Balance");
        System.out.println("2.  Deposit Money");
        System.out.println("3.  Withdraw Money");
        System.out.println("4. Change Password");
        System.out.println("5. Exit");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        switch (opt) {
            case 1:
                checkBalance();
                menu();
                break;
            case 2:
                withdrawMoney();
                menu();
                break;
            case 3:
                depositMoney();
                menu();
                break;
            case 4:
            	changepin();
            	menu();
            	break;
            case 5:
                System.out.println("Exiting...");
                sc.close();
                return;
            default:
                System.out.println("Enter a valid choice");
                menu();
                break;
        }
    }
// check the balance 
    public void checkBalance() {
        System.out.println("You have total money is : " + balance+" Rs..");
        menu();
    }
 // deposit the money
    public void depositMoney() {
        System.out.println("Enter the amount:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        balance += amount;
        System.out.println("Money deposited successfully");
        menu();
    }
// withdraw money   
    public void withdrawMoney() {
        System.out.println("Enter amount to withdraw money is :");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Money withdrawal successful.");
            System.out.println("Thank You..");
        }
        menu();
    }
  // change the pin change 
     public void changepin()
     {
    	  System.out.println("Enter your old password"+PIN);
    	  System.out.println("Enter you new pin");
    	  Scanner sc=new Scanner(System.in);
    	  int newpin=sc.nextInt();
    	  System.out.println("change your new password is "+newpin);
    	   PIN=newpin;
    	   System.out.println("successfully you password change");
    	  
     }
}
