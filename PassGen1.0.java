package PassGen;

import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;



class services {
    static void password_generator() {


        System.out.println("Enter the length of your required password:-");
        Scanner User_length = new Scanner(System.in);
        Integer input_length = User_length.nextInt();


        String extended_string = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890@#$%!";

        StringBuilder str = new StringBuilder();
        Random rnd = new Random();

        while (str.length() < input_length) {

            int index = (int) (rnd.nextFloat() * extended_string.length());
            str.append(extended_string.charAt(index));
        }

        String genStr = str.toString();
        System.out.println("Your generated random password is:-" + genStr);

        System.out.println("\nDo you want to copy this password to clipboard?(y/n)");
        Scanner char_1 = new Scanner(System.in);
        String choice_1 = char_1.nextLine();

        String y = "y";
        String Y = "Y";
        String n = "n";
        String N = "N";


        if (choice_1.equals(y) || choice_1.equals(Y)) {

            StringSelection stringSelection = new StringSelection(genStr);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);

            System.out.println("\nYour password is successfully copied to keyboard !!");


        }
        else if (choice_1.equals(n) || choice_1.equals(N)) {

            System.out.println("\nOk, your password is not copied into your clipboard !! ");

        }
        else {

            System.out.println("\nWrong input !!");


        }


        System.out.println("\nDo you want to save this password in a TEXT file into your system?(y/n)");
        Scanner char_2 = new Scanner(System.in);
        String choice_2 = char_2.nextLine();



        if (choice_2.equals(y) || choice_2.equals(Y)) {
            try {

                File newTextFile = new File("D:/YourPassword.txt");

                FileWriter fw = new FileWriter(newTextFile);
                fw.write(genStr);
                fw.close();

            } catch (IOException iox) {

                iox.printStackTrace();
            }

            System.out.println("Your file saved in D:/ named as YourPassword.txt  ");


        }
        else if (choice_2.equals(n) || choice_2.equals(N)) {

            System.out.println("\nOk, your password is not saved into your system !!\n ");


        }
        else {

            System.out.println("\nWrong input !!");


        }

    }


    static void help() {
        System.out.println("\nPassGen is a software designed by FantoX to help you:-");
        System.out.println("1. Generate a strong password .");
        System.out.println("2. Copy the generated password into your clipboard.");
        System.out.println("3. Save your password as a .txt file into your D:/ drive for future use.");
        System.out.println("\n");

        System.out.println("Usage of PassGen:-");
        System.out.println("1. press 'C' or 'c' to continue the application");
        System.out.println("    i) Enter the length of your required password to generate a password of that exact size.");
        System.out.println("       ex: Type '10' and press 'enter' to generate a password of length '10'");
        System.out.println("   ii) Next, You can copy your password into your clipboard to easily paste anywhere just by pressing 'y' and 'enter'. ");
        System.out.println("       or, Press 'n' and 'enter' to cancel the copy operation. ");
        System.out.println("  iii) Next, You can create a .txt file into your D:/ just by pressing 'y' and enter. ");
        System.out.println("       or, Press 'n' and 'enter' to cancel the file saving operation. ");
        System.out.println("2. Enter 'help' and press 'enter' to open this user manual.");
        System.out.println("3. Enter 'exit' to exit the application.");
        System.out.println("\n");
        System.out.println("If you have any suggestions then feel free to mail me on: shubhapratimbiswas@gmail.com");
        System.out.println("\n");
        System.out.println("\n");


    }


}


public class pg2 {
    public static void main(String[] args) {

        while(true) {

            System.out.println("(::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::)");
            System.out.println("(::::::::::::::::::      WELCOME TO PassGen v.1.0        ::::::::::::::::::)");
            System.out.println("(::::::::::::::::::                                      ::::::::::::::::::)");
            System.out.println("(::::::::::::::::::Press c to continue to the application::::::::::::::::::)");
            System.out.println("(::::::::::::::::::Enter help to learn how it works      ::::::::::::::::::)");
            System.out.println("(::::::::::::::::::Press exit to exit the application    ::::::::::::::::::)");
            System.out.println("(:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::-by FantoX:::)");
            Scanner input = new Scanner(System.in);
            String user_input = input.nextLine();
            String help = "help";
            String HELP = "HELP";
            String c = "c";
            String C = "C";
            String exit = "exit";
            String EXIT = "EXIT";

            services password_gen = new services();
            services help_user = new services();

            //if (user_input.equals(C) || user_input.equals(c)) {

            //  password_gen.password_generator();

            //}
            //else if (user_input.equals(help) || user_input.equals(Help)) {
            //  help_user.help();


            //}
            //else {
            //  System.out.println("Wrong input !!");


            //}


            switch (user_input) {
                case "c":
                    password_gen.password_generator();
                    break;
                case "C":
                    password_gen.password_generator();
                    break;
                case "HELP":
                    help_user.help();
                    break;
                case "help":
                    help_user.help();
                    break;
                case "exit":
                    System.out.println("Exiting application...");
                    return;
                case "EXIT":
                    System.out.println("Exiting Application...");
                    return;
                default:
                    System.out.println("Wrong input !!\n");
                    break;


            }
        }//end of while(true) loop.


    }
}