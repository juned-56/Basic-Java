import java.util.Scanner;
public class Table
{
    public static void main(String[] args)
    {
        int n;
        Scanner cc = new Scanner(System.in);
        System.out.println("Enter the Number");
        n = cc.nextInt();
        for(int i = 1; i <= 10; i++)
        {
        System.out.println(n+" x "+i+ " = "+n * i);
        }
    }    
}
