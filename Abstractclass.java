abstract class Abstractclass  //Abstract class
{  
abstract void run();     //Abstract Method
}   
class Bikee extends Abstractclass
{  
void run()
{
    System.out.println("Bike is Running.........");
    }  
}  
class Car extends Abstractclass
{  
void run()
{
    System.out.println("Car is Running...........");
    }  
}    
class TestAbstractclass
{  
public static void main(String args[])
{  
    Abstractclass s=new Car();
s.run();  
    }  
}  
