import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = (int)(Math.random()*100);

        int mynum = 0;

        do {
            System.out.println("Guess a number between 1 and 100");
            mynum = sc.nextInt();

            if (mynum == num){
                System.out.println("You guessed it!");
                break;
            }
            else if (mynum < num) {
                System.out.println("Too low!");
            }
            else {
                System.out.println("Too high!");
            }
        }
        while (mynum>=0);
        System.out.println("my number is "+num);

  
}
}