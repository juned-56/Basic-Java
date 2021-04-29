interface Instanceof{}  
class A implements Instanceof
{  
public void a()
{
    System.out.println("a  is method");
    }  
}  
class B implements Instanceof
{  
public void b()
{
    System.out.println("b is method");
    }  
}  
  
class Call
{  
    void invoke(Instanceof p)
{   //upcasting  
    if(p instanceof A)
{  
    A a=(A)p;   //Downcasting   
    a.a();  
}  
if(p instanceof B)
{  
    B b=(B)p;   //Downcasting   
    b.b();  
}  
  
    }  
}       //end of Call class  
  
class Test4{  
public static void main(String args[])
{  
    Instanceof p=new B();  
    Call c=new Call();  
    c.invoke(p);  
    }  
}  
