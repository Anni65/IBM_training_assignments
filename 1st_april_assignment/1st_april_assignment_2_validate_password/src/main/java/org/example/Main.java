package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main
{
    private static Scanner scanner=new Scanner(System.in);
    private static final int MIN_LENGTH = 8;

    public static boolean checkLength(String password) {
        return password.length() > MIN_LENGTH;
    }

    public static boolean haveDigit(String password) {
        for(int i=0; i < password.length(); i++){
            char symbol = password.charAt(i);
            if(Character.isDigit(symbol)){
                return true;
            }
        }
        return false;
    }

    public static boolean uprandlow(String password) {
        String lwr = password.toLowerCase();
        boolean chk1 = lwr.equals(password);
        String uppr = password.toUpperCase();
        boolean chk2 = uppr.equals(password);
        boolean final_check = !chk2 && !chk1;
        return final_check;
    }

    public static boolean checkPassword(String password) {
        return checkLength(password) && haveDigit(password) && uprandlow(password);
    }
    public static void main(String[] args) {
        System.out.print("Enter Password");

        String str=scanner.next();
        boolean flag=checkPassword(str);
        if(flag==true)
            System.out.print("Valid Password");
        else
            System.out.print("Invalid Password");

    }
}
