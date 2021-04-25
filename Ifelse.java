import java.util.Scanner;
public class Ifelse
{
    public static void main(String[] args)
    {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of a");
        a = sc.nextInt();
        System.out.println("Enter the Value of a");
        b = sc.nextInt();
        if(a > b)
        {
            System.out.println("a is Largest: "+a);
        }
        else
        {
            System.out.println("b is Largest: "+b);
        }
    }
}
