//Overloading 
//changing number of arguments

class Over
{
    static int add(int a,int b)
    {
        return a+b;
    }
    static int add(int a,int b,int c)
    {
        return a+b+c;
    }
}
    class TestOverloading
    {
    public static void main(String[] args)
    {
    System.out.println(Over.add(10,10));
    System.out.println(Over.add(20,10,30));
    }
}

//changing data type of arguments

// class Over
// {
//     static int add(int a,int b)
//     {
//         return a+b;
//     }
//     static int add(int a,int b,int c)
//     {
//         return a+b+c;
//     }
// }
//     class TestOverloading
//     {
//     public static void main(String[] args)
//     {
//     System.out.println(Over.add(10,10));
//     System.out.println(Over.add(20,10,30));
//     }
// }


class Adder
{  
    static int sum(int a, int b)
    {
        return a+b;
    }  
    static double sum(double a, double b)
    {
        return a+b;
    }  
}  
    class TestOverloading1
    {  
    public static void main(String[] args)
    {  
    System.out.println(Adder.sum(10,40));  
    System.out.println(Adder.sum(16.7,18.4));  
    }
}  
    
