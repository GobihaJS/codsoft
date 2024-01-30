package Task;

import java.util.Scanner;
class Account {
 private double balance;
 public Account(double initial_bal) {
     this.balance = initial_bal;
 }
 public double getBalance() {
     return balance;
 }
 public void deposit(double amount) {
     balance += amount;
 }
 public boolean withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         return true;
     } else {
         System.out.println("Insufficient funds!");
         return false;
     }
 }
}
class ATM {
 private Account user_acc;
 public ATM(Account user_acc) {
     this.user_acc = user_acc;
 }
 public void displayMenu() {
     System.out.println("1. Withdraw");
     System.out.println("2. Deposit");
     System.out.println("3. Check Balance");
     System.out.println("4. Exit");
 }
 public void transaction(int choice) {
     Scanner input = new Scanner(System.in);
     switch (choice) {
         case 1:
             System.out.print("Enter withdrawal amount: ");
             double withdrawl = input.nextDouble();
             if (withdrawl > 0) {
                 if (user_acc.withdraw(withdrawl)) {
                     System.out.println("Withdrawal successful. Remaining balance: " + user_acc.getBalance());
                 }
             } else {
                 System.out.println("Invalid amount for withdrawal.");
             }
             break;
         case 2:
             System.out.print("Enter deposit amount: ");
             double deposit_amt = input.nextDouble();
             if (deposit_amt > 0) {
                 user_acc.deposit(deposit_amt);
                 System.out.println("Deposit successful. Updated balance: " + user_acc.getBalance());
             } else {
                 System.out.println("Invalid amount for deposit.");
             }
             break;
         case 3:
             System.out.println("Current balance: " + user_acc.getBalance());
             break;
         case 4:
             System.out.println("Exiting ATM. Thank you!");
             System.exit(0);
             break;
         default:
             System.out.println("Invalid choice. Please choose a valid option.");
     }
 }
}
public class ATM_system {
 public static void main(String[] args) {
     Account user_acc = new Account(1000.0);
     ATM atm = new ATM(user_acc);
     System.out.println("Welcome to the ATM. Your initial balance is: " + user_acc.getBalance());
     while (true) {
         atm.displayMenu();
         Scanner input = new Scanner(System.in);
         System.out.print("Enter your choice (1-4): ");
         int choice = input.nextInt();
         atm.transaction(choice);
     }
 }
}
