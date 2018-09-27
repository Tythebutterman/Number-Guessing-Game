import java.util.Scanner;

public class NumberGuessingGame {

    public static void main (String[]args){
        Scanner keyboard;
        int testing;
        int pickednumber;
        String guess;

        keyboard=new Scanner(System.in);

        pickednumber = (int)(Math.random()*100);
        System.out.println(pickednumber);
        System.out.println("pick a number from 1-100");
        testing=keyboard.nextInt();
        if (testing<pickednumber) {
            System.out.println("a little higher");
        }

        else if (testing>pickednumber){
            System.out.println("a little lower");
        }

        if (testing==pickednumber){
            System.out.println("YOU WON!");
        }

        System.out.println("Try a different number");
        testing=keyboard.nextInt();
        if (testing<pickednumber) {
            System.out.println("too low");
        }

        else if (testing>pickednumber){
            System.out.println("too high");
        }
        if (testing==pickednumber){
            System.out.println("YOU WON!");
        }

        System.out.println("One more chance");
        testing=keyboard.nextInt();
        if (testing<pickednumber) {
            System.out.println("too low");
        }

        else if (testing>pickednumber){
            System.out.println("too high");
        }
        if (testing==pickednumber){
            System.out.println("YOU WON!");
        }



        System.out.println("The correct number was...");
        System.out.println(pickednumber);

    }









}
