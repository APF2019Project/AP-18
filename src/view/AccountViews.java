package view;

import model.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountViews {
    public static void showMoney(Account account){System.out.println(account.getShopCoins());}
    public static void wrongPassowrdError(){
        System.out.println("Error: Wrong Password");
    }
    public static void askForUsername(){
        System.out.println("Please enter username:");
    }
    public static void askForPassword(){
        System.out.println("Please enter password:");
    }
    public static String scanUsername(Scanner scanner) {
        return scanner.nextLine() ;
    }
    public static void userNotFoundError(){
        System.out.println("Error: user not found! please write a correct username.");
    }
    public static void wrongPasswordError(){
        System.out.println("Error: wrong password");
    }
    public static String scanPassword(Scanner scanner) {
        return scanner.nextLine() ;
    }
    public static void accountExistsError(){
        System.out.println("Error: an account with this username exists, Please choose another username!");
    }
    public static void accountCreateSuccesfully(){
        System.out.println("Account created successfully :)");
    }
    public static void loginSuccesfull(){
        System.out.println("Login successful!");
    }
    public static void showUsername(Account account){
        System.out.println(account.getUsername());
    }
    public static void showLeaderBoard(){
        ArrayList<Account> accounts = Account.getAccounts();
        for (int i = accounts.size() - 1; i >= 0; i--) {
            Account account = accounts.get(i);
            System.out.println(account.getUsername());
        }
    }
}
