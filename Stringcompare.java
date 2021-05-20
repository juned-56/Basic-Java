
//########################################## compare by equals() Method   #############################################

public class Stringcompare
{
    public static void main(String[] args)
    {
        String s1 = "juned";
        String s2 = "juned";
        String s3 = "javed";
        String s4 = new String("juned");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
    }
}



// Case Ignore 


public class Stringcompare
{
    public static void main(String[] args)
    {
      String s1 = "juned";
        String s2 = "Juned";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));  //Ignore Case
    }
}



//###################################    compare by == operator    #############################################



public class Stringcompare
{
    public static void main(String[] args)
    {
       String s1 = "juned";  
      String s2 = "juned";  
      String s3 = new String("juned");  
      System.out.println(s1==s2); 
      System.out.println(s1==s3);
    }  
   }  
