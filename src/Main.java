import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        while(true) {
            int num;
            while(true) {
                try{
                    System.out.print("Enter a number between 1 and 100: ");
                    num = in.nextInt();
                    if(num>100 || num<1){
                        System.out.println("Please enter a number between 1 and 100: ");
                    } else break;
                } catch(InputMismatchException e){
                    System.out.println("Invalid input.");
                    in.next();
                }
            }

            int computerNum = random.nextInt(100) + 1;
            int count = 1;
            while(num!=computerNum) {
                if(num<computerNum) {
                    System.out.print(num + " is lower than the number! Try higher -> ");
                    count++;
                    while(true) {
                        try{
                            num = in.nextInt();
                            if(num>100 || num<1){
                                System.out.print("Please enter a number between 1 and 100: ");
                            } else break;
                        } catch(InputMismatchException e){
                            System.out.print("Invalid input. Try higher -> ");
                            in.next();
                        }
                    }
                } else {
                    System.out.print(num + " is higher than the number! Try lower -> ");
                    count++;
                    while(true) {
                        try{
                            num = in.nextInt();
                            if(num>100 || num<1){
                                System.out.print("Please enter a number between 1 and 100: ");
                            } else break;
                        } catch(InputMismatchException e){
                            System.out.print("Invalid input. Try lower -> ");
                            in.next();
                        }
                    }
                }

            }
            System.out.println("Hurray! you guessed it right in " + count + " attempts");
            System.out.print("Wanna play again(y/n) -> ");
            String ans = in.next();
            while(true) {
                if(!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n")) {
                    System.out.print("Invalid input. Write y(yes) or n(no): ");
                    ans = in.next();
                } else break;
            }


            if(ans.equalsIgnoreCase("n")) break;
        }
    }

}