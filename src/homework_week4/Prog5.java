package homework_week4;
//   5. Take two int values from user and print greatest among them.
import java.util.Scanner;
public class Prog5 {
    public static void main(String[] args) {
        Scanner Sa = new Scanner(System.in);
        System.out.println("Enter first value : ");
        int a = Sa.nextInt();
        System.out.println("Enter second valeu : ");
        int b = Sa.nextInt();
        if (a == b){
            System.out.println("Both value are equal ");
        } else if (a>b) {
            System.out.println(a + "    is greter ");
        } else {
            System.out.println(b+ "    is greter ");
        }

        }
    }

