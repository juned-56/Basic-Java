//There are two types of binding
//Static Binding (also known as Early Binding)
//Dynamic Binding (also known as Late Binding)

//################################   Static Binding  ##################################

// public class Binding
// {
//     private void eat()
//     {
//         System.out.println("dog is eating...");
//     }  
  
//  public static void main(String args[])
//  {  
//   Binding d=new Binding();  
//   d.eat();  
//     }      
// }


//##############################   Dynamic Binding  ###################################

public class Binding
{
    void read()
    {
        System.out.println("Student is Reading...");
    }  
}  
  
class Stu extends Binding{  
 void read()
 {
     System.out.println("Student is eating...");
    }  
  
 public static void main(String args[])
 {  
  Binding a=new Stu();  
  a.read();  
    }  
}
