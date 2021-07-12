
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Random myRand = new Random();
    Scanner scan = new Scanner (System.in);

    public void play_game() {
        int targetNum = myRand.nextInt(10);
        int userChoice;
        int userGuess;


        System.out.println("""
                Choose your language
                1. English
                2. Español
                3. Français
                4. 简体中文""");

        userChoice = scan.nextInt();

        if(userChoice == 1){
            Language myLang = new English();
            System.out.print(myLang.make_guess());
            userGuess = scan.nextInt();
            while(true) {
                if (userGuess < targetNum) {
                    System.out.println(myLang.too_low());
                } else if (userGuess > targetNum) {
                    System.out.println(myLang.too_high());
                } else if (userGuess == targetNum) {
                    System.out.println(myLang.correct());
                }
                System.out.println(myLang.make_guess());
                userGuess = scan.nextInt();
            }
        }
        else if(userChoice == 2){
            Language myLang = new Spanish();
            System.out.print(myLang.make_guess());
            userGuess = scan.nextInt();
            while (true) {
                if (userGuess < targetNum) {
                    System.out.println(myLang.too_low());
                } else if (userGuess > targetNum) {
                    System.out.println(myLang.too_high());
                } else if (userGuess == targetNum) {
                    System.out.println(myLang.correct());
                }
                System.out.println(myLang.make_guess());
                userGuess = scan.nextInt();
            }
        }

        else if(userChoice == 3){
            Language myLang = new French();
            System.out.print(myLang.make_guess());
            userGuess = scan.nextInt();
            while (true) {
                if (userGuess < targetNum) {
                    System.out.println(myLang.too_low());
                } else if (userGuess > targetNum) {
                    System.out.println(myLang.too_high());
                } else if (userGuess == targetNum) {
                    System.out.println(myLang.correct());
                }
                System.out.println(myLang.make_guess());
                userGuess = scan.nextInt();
            }
        }


        else if(userChoice == 4){
            Language myLang = new SimplifiedChinese();
            System.out.print(myLang.make_guess());
            userGuess = scan.nextInt();
            while (true) {
                if (userGuess < targetNum) {
                    System.out.println(myLang.too_low());
                } else if (userGuess > targetNum) {
                    System.out.println(myLang.too_high());
                } else if (userGuess == targetNum) {
                    System.out.println(myLang.correct());
                }
                System.out.println(myLang.make_guess());
                userGuess = scan.nextInt();
            }
        }

    }

}