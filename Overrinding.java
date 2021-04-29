import java.util.Scanner;
public class Overriding
{
    void result()
    {
        int a;
        int b;
        int sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        b = sc.nextInt();
        sum = a + b;
        System.out.println("The Sum is: "+sum);
    }
}

//Chlid Class
class Sum extends Overriding
{
    void result() 
    { 
        int a;
        int b;
        int minus;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        b = sc.nextInt();
        minus = a - b;
        System.out.println("The Sum is: "+minus);
    }
}

//Child Class
class Multiply extends Overriding
{
    void result()   //Overriding
    {
        int a;
        int b;
        int mul;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        b = sc.nextInt();
        mul = a * b;
        System.out.println("The Multilpy is: "+mul);
    }
    public static void main(String[] args)
    {
        Sum obj = new Sum();
        Multiply obj1 = new Multiply();
        obj.result();
        obj1.result();
    }
}
    
    
