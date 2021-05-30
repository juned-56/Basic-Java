//####################### Char to Int Conversion Using Character.forDigit() Method  #############################

public class Conversion4
{
    public static void main(String[] args)
    {
        int REDIX = 16;  //REDIX 10 for decimal and for hexa use redix 16 
        int a = 8;
        char b = Character.forDigit(a,REDIX);
        System.out.println(b);
    }    
}
