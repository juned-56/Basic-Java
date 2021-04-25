//Variables


// class Variables
// int age = 20;  //Instance Variable
// statc int speed = 70; //static variable
// void method()
// {
//     int n = 90; //Local variable
//     }
// }


//#####################Local Variable  #####################

 class Variables
 {
    public void CarSpeed()
    {
      int speed = 70;    //Local variable speed
      System.out.println(speed);
}
    public static void main(String[] args)
{
    Variables object = new Variables();
    object.CarSpeed();
   }
}


//#######################Instance Variable  ##################

class Variables
{
   int speed;          //instance variable speed
}
class Run
{
    public static void main(String[] args)
{
    Variables obj = new Variables(); 
    obj.speed = 20;
    System.out.println(obj.speed);
    }
}



//####################### Static Variavle  ##########################

class Car
{
    public static int speed = 20000; //Static variable
}
public class Variables
{
    public static void main(String[] args)
    {
           // Car.speed = 20000; //You can access the static variable without object
        System.out.println(Car.speed);
    }
}
