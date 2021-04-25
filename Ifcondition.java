import java.util.Scanner;
public class Ifcondition
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
    }
}
