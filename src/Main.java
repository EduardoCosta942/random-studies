import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaring vars:
        Scanner input = new Scanner(System.in);
        String word;
        int amountOfConsults;
        String[] history;
        boolean stopMenu;
        int option;


        // Solving for amountOfConsults:
        System.out.println("Type the amount of consults: ");
        amountOfConsults = input.nextInt();

        // Solving for vars that depends on amountOfConsults:
        history = new String[amountOfConsults];

        // Menu:
        stopMenu = false;
        for (int x = 0; x != amountOfConsults; x++) {
            do {
                System.out.println("---------------MENU---------------\n1- Verificar Palindromo\n2- Ver histórico\n3- Sair\nType your option");
                option = input.nextInt();
                if (option >= 1 && option <= 3) {
                    stopMenu = true;
                }
            } while (!stopMenu);

            // Executing tasks according to option:
            if (option == 1) {
                // Solving for word:
                System.out.println("Type the word: ");
                word = input.next();
                // Running method isPalindrome:
                if (isPalindrome(word)) {
                    System.out.println("'" + word + "' is palindrome");
                } else {
                    System.out.println("'" + word + "' is not palindrome");
                }
                System.out.println(isPalindrome(word));
                // Keeping var word at history:
                history[x] = word;
            } else if (option == 2) {
                for (String name:history) {
                    if (!(name == null)) System.out.println(name);
                }
            } else {
                System.exit(0);
            }
        }

    }
    public static boolean isPalindrome(String word) {
        // Checking if palindrome - using trim
        StringBuilder wordSb = new StringBuilder(word.trim().toLowerCase());
        return word.trim().toLowerCase().equals(wordSb.reverse().toString());
    }
}