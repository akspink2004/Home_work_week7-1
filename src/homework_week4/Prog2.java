package homework_week4;
//      2. Print multiplication table of 24, 50 and 29 using loop.
public class Prog2 {
    public static void main(String[] args) {

        int a = 24;
        for(int i = 1; i <= 10; ++i)
        {
            System.out.println(a+" * " +i+" = " +a*i);

        }
        System.out.println("------------------");
        int b = 50;
        for(int i = 1; i <= 10; ++i)
        {
            System.out.println(b+" * " + i + " = " +b*i);
        }
        System.out.println("------------------");
        int c = 29;
        for(int i = 1; i <= 10; ++i)
        {
            System.out.println(c+ " * "+c+ " = " +c*i);
        }
        System.out.println("------------------");
    }
}
