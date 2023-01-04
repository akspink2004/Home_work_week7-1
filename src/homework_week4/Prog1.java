package homework_week4;
//1. Take 10 integers from keyboard using loop and print their average value on the
//        screen.
import java.util.Scanner;
public class Prog1 {
    public static void main(String[] args) {
        Scanner In = new  Scanner(System.in);
        int sum = 0;
        for (int i=0; i<10;i++){
            System.out.println("Enter value : ");
            sum = sum + In.nextInt();
        }
        double avg = sum / 10;
        System.out.println("Total : " +sum);
        System.out.println("avg  :  " +avg);

    }
}
