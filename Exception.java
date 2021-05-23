public class Exception
{  
  public static void main(String args[])
{  
try
{    
      int data=100/0;  
}
   catch(ArithmeticException e)
   {
       System.out.println(e);
   }    
   System.out.println("Done!");  
  }  
}  


//####### Output  ##################

java.lang.ArithmeticException: / by zero
Done!
