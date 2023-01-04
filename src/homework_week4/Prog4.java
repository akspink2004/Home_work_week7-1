package homework_week4;
//     4. Take values of length and breadth of a rectangle from user and check if it is square or not.
import java.util.Scanner;
public class Prog4 {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.println("Enter value of length : ");
        int l = In.nextInt();
        System.out.println("Enter value of breadth : ");
        int b = In.nextInt();
        if (l == b){
            System.out.println("It Is square");
            }else {
            System.out.println("It Is rectangle");
        }


    }
}
