
package atm_interface;
import java.util.Scanner;
public class ATM_Interface {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pin=1234;
        int balanance=1000;
        int withdraw;
        int Deposit;
         
        System.out.println("**....WELCOME To ATM.....**");
        // System.out.println("Please Insert your CARD....");
        System.out.print("Please Enter your PIN :-   ");
        int Your_pin=sc.nextInt();
        //
        if(Your_pin!=pin)
        {
            System.out.println("Sorry ..! Incorrect PIN..");
        }
        else
        {
             while(true)
             {
                 System.out.println("Please Select your Choice..");
                System.out.println("\n 1.For WITHDRAW ..\n 2.For DEPOSITE..\n 3.Check BALANCE ..\n 4.Exit...\n");
                 int Choice=sc.nextInt();

                 switch(Choice)
                 {
                     case 1:
                     {
                        System.out.print("Enter AMOUNT for Withdraw :--");
                        withdraw=sc.nextInt();

                         if(balanance >= withdraw)
                         {
                             withdraw=balanance-withdraw;
                             System.out.println("\n\nPlease  collect your CASH : \n"+withdraw);
                         }
                         else
                         {
                             System.out.println("In-sufficient BALANCE..");
                         }
                         break;
                        }
                     

                     //
                     case 2:
                     {
                         System.out.print("Enter AMOUNT for Deposite :-");
                         Deposit=sc.nextInt();
                         Deposit=balanance+Deposit;
                         System.out.println("\n\n Your Availabel BALANCE  is :\n"+Deposit);
                         break;
                     }
                     
                    

                     //
                     case 3:
                     {
                         System.out.println("\n Your Availabel BALANCE is :\n "+balanance);
                         break;
                        }
                     

                     case 4:
                     {
                        System.out.println("\n **..THANK YOU FOR USING THIS ATM ..**");

                         System.exit(0);
                         break;
                     }

                 }
            }
        }
    }
}