//Operators

//########################Arithmetic Operators ###########################
class Operator
{
    public static void main(String[] args)
    {
        int a = 15;
        int b = 5;
        System.out.println(a + b); //(+) Operator
        System.out.println(a * b); //(*) Operator
        System.out.println(a - b); //(-) Operator
        System.out.println(a / b); //(/) Operator
        System.out.println(a % b); //(%) Operator
    }
}


//#######################  Unary Operator ##################################

class Operator
{
    public static void main(String[] args)
    {
        int a = 12;
        System.out.println(a++); //(a++) Post Increment Operator
        System.out.println(a--); //(a--) Post Decrement Operator
        System.out.println(++a); //(++a) Pre Increment Operator
        System.out.println(--a); //(--a) Pre Decrement Operator
    }
}

//#######################  AND Operator ##################################

class Operator
{
    public static void main(String[] args)
    {
        int x = 20;
        int y = 15;
        int z = 5;
        System.out.println(x > y && x < z);
        System.out.println(x < y && x > z);
    }
}

//#######################  OR Operator ##################################

class Operator
{
    public static void main(String[] args)
    {
        int x = 20;
        int y = 15;
        int z = 5;
        System.out.println(x > y || x < z); 
        System.out.println(x < y || x > z);
    }
}

//#######################  Ternary Operator ##################################

class Operator
{
    public static void main(String[] args)
    {
        int x = 10;
        int y = 70;
        int max = (x > y) ? x:y;
        System.out.println(max);
    }
}

//#######################  Assignment Operator ##################################

class Operator
{
    public static void main(String[] args)
    {
        int x = 5;
        int y = 6;
        x *= 2;
        y -= 10;
        System.out.println(x);
        System.out.println(y);
    }
}
