
//###################  Single Inheritance ############################

// public class Inheritance
// {
//     void eat()
//     {
//         System.out.println("Eating.............");
//     }    
// }
// class Dog extends Inheritance
// {
//     void bark()
//     {
//         System.out.println("Dog is Barking......");
//     }
// }
// class Testtt
// {
//     public static void main(String[] args)
//     {
//         Dog obj = new Dog();
//         obj.eat();
//         obj.bark();
//     }
// }


//############ Example #####################

// import java.util.Scanner;
// public class Inheritance
// {
//     void add()
//     {
//         int a;
//         int b;
//         int sum;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of a: ");
//         a = sc.nextInt();
//         System.out.println("Enter the value of b: ");
//         b = sc.nextInt();
//         sum = a + b;
//         System.out.println("The sum is: "+sum);
//     }
// }
// class Area extends Inheritance
// {
//     void area_of_square()
//     {
//         int a;
//         int area;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of a: ");
//         a = sc.nextInt();
//         area = a * a;
//         System.out.println("The Area is: "+area);
//     }
// }
// class TestInhe
// {
//     public static void main(String[] args)
//     {
//         Area d = new Area();
//         d.add();
//         d.area_of_square();
//     }
// }


//######################## Multilevel Inheritance #########################

// class Inheritance
// {  
//     void eat()
//     {
//         System.out.println("Eating.............");
//     }  
// }  
//     class Dog extends Inheritance
//     {  
//     void bark()
//     {
//         System.out.println("barking...........");
//     }  
// }  
//     class Doggy extends Dog
//     {  
//     void weep()
//     {
//         System.out.println("weeping...........");
//     }  
//  }  
//     class TestInheritance2
//     {  
//     public static void main(String args[])
//     {  
//     Doggy d=new Doggy();  
//     d.weep();  
//     d.bark(); 
//     d.eat();  
//     }
// }  


//#####################  Hierarchical Inheritance #####################

class Inheritance
{  
    void eat()
    {
        System.out.println("eating..........");
    }  
}  
    class Dog extends Inheritance
    {  
    void bark()
    {
        System.out.println("barking...........");
}  
    }  
    class Cat extends Inheritance
    {  
    void meow()
    {
        System.out.println("meowing.........");
    }  
    }  
    class TestInheritance
    {  
    public static void main(String args[])
    {  
    Cat c=new Cat();  
    c.meow();  
    c.eat();   
    }
} 


//Multiple Inheritance is Not  supported in java
