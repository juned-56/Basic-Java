import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
      int n;
      int rev = 0;
	  Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
    while(n != 0) {
    
      int digit = n % 10;
      rev = rev * 10 + digit;
      n /= 10;
    }

    System.out.println(rev);
    }
}
