import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        while(true) {
            try{
                System.out.print("Enter a number: ");
                num = in.nextInt();
                break;
            } catch(InputMismatchException e){
                System.out.println("Invalid input.");
                in.next();
            }
        }

        int computer_num = 55;
        int count = 1;
        while(num!=computer_num) {
            if(num<computer_num) {
                System.out.print(num + " is lower that the number! Try higher -> ");
                count++;
                while(true) {
                    try{
                        num = in.nextInt();
                        break;
                    } catch(InputMismatchException e){
                        System.out.print("Invalid input.Try higher -> ");
                        in.next();
                    }
                }
            } else {
                System.out.print(num + " is higher that the number! Try lower -> ");
                count++;
                while(true) {
                    try{
                        num = in.nextInt();
                        break;
                    } catch(InputMismatchException e){
                        System.out.print("Invalid input.Try lower -> ");
                        in.next();
                    }
                }
            }

        }
        System.out.println("Hurray! you guessed it right in " + count + " attempts");
    }

}