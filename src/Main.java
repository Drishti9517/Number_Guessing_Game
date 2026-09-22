import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int computer_num = 55;
        int count = 1;
        while(num!=computer_num) {
            if(num<computer_num) {
                System.out.print(num + " is lower that the number! Try higher -> ");
                count++;
                num = in.nextInt();
            } else {
                System.out.print(num + " is higher that the number! Try lower -> ");
                count++;
                num = in.nextInt();
            }

        }
        System.out.println("Hurray! you guessed it right in " + count + " attempts");
    }
}