//Two types of  Methods in java
//Predefined method
//User-defined method


//###########################predefined method   ######################################


public class Methods
{
    public static void main(String[] args)
    {
        System.out.println("The Largest Number is: "+Math.max(80, 40));
    }    
}


//##########################User-defined method   #####################################

import java.util.Scanner;
public class Methods
  {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        findFactorial(n);    
    }
    public static void findFactorial(int n)
    {
        int f = 1;
        for(int i = 1; i <= n; i++)
        {
            f = f * i;
        }
        System.out.println("The Factorial of "+n+" is: "+f);
    }
}
