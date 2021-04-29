public class Covariant
{
    Covariant get()
    {
        return this;
    }  
}  
  
class Bag extends Covariant
{  
Bag get()
{
    return this;
}  
void message()
{
    System.out.println("This is covariant return type");
}  
  
public static void main(String args[])
{  
new Bag().get().message();  
    }  
}
 
