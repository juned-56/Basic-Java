import java.util.Scanner;
class Array
{
    public static void main(String[] args)
    {
        int []arr = new int[50];   //declaration and instantiation  
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        n = sc.nextInt();
        System.out.println("Enter the "+n+" Elements in The Array: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Array is: ");
        for(int i = 0; i < n; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
