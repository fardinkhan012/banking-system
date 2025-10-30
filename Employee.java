// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class BankingSystem {
   public BankingSystem() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter account holder name: ");
      String var2 = var1.nextLine();
      System.out.print("Enter initial balance: â‚¹");
      double var3 = var1.nextDouble();
      Account var5 = new Account(var2, var3);

      while(true) {
         System.out.println("\n--- Banking Menu ---");
         System.out.println("1. Deposit");
         System.out.println("2. Withdraw");
         System.out.println("3. View Balance");
         System.out.println("4. Exit");
         System.out.print("Choose an option (1-4): ");
         int var6 = var1.nextInt();
         switch (var6) {
            case 1:
               System.out.print("Enter deposit amount: â‚¹");
               double var7 = var1.nextDouble();
               var5.deposit(var7);
               break;
            case 2:
               System.out.print("Enter withdrawal amount: â‚¹");
               double var9 = var1.nextDouble();
               var5.withdraw(var9);
               break;
            case 3:
               var5.displayBalance();
             
               break;
            case 4:
               System.out.println("Thank you for banking with us!");
               return;
            default:
               System.out.println("Invalid choice. Please try again.");
         }
      }
   }
}
