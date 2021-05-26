import java.util.Scanner;
public class JavaSubstring
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String: ");
    String S = sc.nextLine();
    System.out.println("Enter the Starting Point: ");
    int start = sc.nextInt();
    System.out.println("Enter the Ending Point: ");
    int end = sc.nextInt();
    System.out.println("The Substring is: ");
    System.out.println(S.substring(start, end));
    }

}
