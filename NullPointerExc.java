public class NullPointerExc
{ 
  
  public static void main(String args[]) {
    String str = null;
    simpleNullCheck(str);
}

private static void simpleNullCheck(String str1)
    {
        System.out.println(str1.length());
    }

}


//############3 Output  #################

Exception in thread "main" java.lang.NullPointerException
