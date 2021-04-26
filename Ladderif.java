import java.util.Scanner;
public class Ladderif
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of n: ");
        n = sc.nextInt();
        if(n > 0)
        {
            System.out.println("Greater Than Zero: "+n);
        }    
        else if(n < 0)
        {
            System.out.println("Lower Than Zero: "+n);
        }
        else
        {
            System.out.println("Zero: "+n);
        }
    }   
}
