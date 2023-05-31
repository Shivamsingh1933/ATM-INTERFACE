import java.math.BigInteger;
import java.util.Scanner;


class ATM
{
    double balance;
    int pin = 2567;
    int OTP = 4242;
    String phoneno;

    public void insertcard()
    {
        System.out.println("INSERT YOUR CARD");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println("***** CARD VERIFIED *****");
        System.out.println("***** THANK YOU *****");


    }

    public void checkpin(){
        System.out.println("ENTER PIN: ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin==pin){
            System.out.println("******ACCESS GRANTED******");
            menu();
        }
        else
        {
            System.out.println("****** WRONG PIN ENTERED ******");
            System.out.println("****** PRESS ON 'FORGOT PIN' *****");
            System.out.println("****** INPUT YOUR PHONE NUMBER *****");
            Scanner r = new Scanner(System.in);
            String phoneno = r.nextLine();
            System.out.println("**** ENTER OTP ****");
            Scanner e = new Scanner(System.in);
            int otp = e.nextInt();
            if(otp == OTP)
            {
                System.out.println("RESET YOU PIN");
            }
            else
            {
                System.out.println("***** WRONG OTP *****");
            }


        }

    }

    public void menu(){
        System.out.println("Enter your choice: ");
        System.out.println("1. Check A/c balance");
        System.out.println("2. Withdraw money");
        System.out.println("3. Deposit money");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt == 1){
            checkbalance();
        }
        else if(opt == 2){
            withdrawmoney();
        }
        else if(opt == 3){
            depositmoney();
        }
        else if(opt == 4){
            return;
        }
        else{
            System.out.println("Enter a valid choice");
        }

    }

    public void checkbalance(){
        System.out.println("balance: " +balance);
        menu();
    }

    public void depositmoney(){
        System.out.println("Enter the amount");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        balance = balance + amount;
        System.out.println("Money depositted succesfully");
        menu();
    }
    
    public void withdrawmoney(){
        System.out.println("enter amount to withdraw: ");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        if(amount > balance){
            System.out.println("Insufficient balance");
        }
        else{
            balance = balance - amount;
            System.out.println("");
            System.out.println("");
            System.out.println("Money withdrawl successfull");
            System.out.println("****PLEASE COLLECT THE SLIP CAREFULLY****");

        }
        menu();
    
    }
    
}
public class ATMInterface {
    public static void main(String[] args){
        ATM obj = new ATM();
        obj.insertcard();
        obj.checkpin();

    }
    
}
