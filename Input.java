import java.util.Scanner;
public class Input
{
    public static void main(String[] args)
    {
        int a;
        int b;
        int sum;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the Value of a");
        a = sc.nextInt();
        System.out.println("Enter the Value of b");
        b = sc.nextInt();
        sum = a + b;
        System.out.println("The sum is: "+sum);
    }    
}
