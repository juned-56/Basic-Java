//#################### Char to Int Conversion Using Character.getNumericValue() Method  #########################

public class Conversion3
{
    public static void main(String[] args)
    {
        char a = '6';
        int b = Character.getNumericValue(a);
        System.out.println(b);
    }    
}


//#################### Char to Int Conversion Using String.valueOf() Method  #########################


public class Conversion3
{
    public static void main(String[] args)
    {
        char a = '6';
        int b = Integer.parseInt(String.valueOf(a));
        System.out.println(b);
    }
}
