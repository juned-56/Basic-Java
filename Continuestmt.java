import java.util.Scanner;
public class Continuestmt
// {
//     public static void main(String[] args)
//         {
//             int n;
//             Scanner sc = new Scanner(System.in);
//             System.out.println("Enter the range: ");
//             n = sc.nextInt();
//             for(int i = 0; i <= n; i++)
//             {
//                 if(i == 6)
//                 {
//                     continue;
//                 }
//                 System.out.println(i);
//             }
//     }    
// }

//########################### Continue Statement in While Loop ####################


// {
//     public static void main(String[] args)
//     {
//        int i = 1;
//        while(i <= 10)
//        {
//            if(i == 9)
//            {
//                i++;
//                continue;
//            }
//            System.out.println(i);
//            i++;
//        }
//     }
// }



//########################### Continue Statement in Do While Loop ####################

{
    public static void main(String[] args)
    {
        int i = 1;
        do
        {
            if(i == 7)
            {
              i++;
              continue;  
            }
            System.out.println(i);
            i++;
        }while(i <= 20);
    }
}
