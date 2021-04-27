//Two types of Constructor
//Default constructor
//Parameterized constructor

//#######################################  Default constructor  ###############################################

public class Constructor
{
    Constructor()  //Defalut Constructor
    {
        System.out.println("This is default Contructor");
    }    
    public static void main(String[] args)
    {
        Constructor cons = new Constructor();
    }
}



//#######################################  Default constructor  ###############################################

public class Constructor
{
    int id;
    String name;
    Constructor(int iid, String nam)  //Parameterized Constructor
    {
        id = iid;
        name = nam;
    }
    void display()
    {
        System.out.println("Id is: "+id+" Name is: "+name);
    }
    public static void main(String[] args)
    {
        Constructor obj = new Constructor(20, "Juned");
        Constructor obj1 = new Constructor(25, "Adnan");
        obj.display();
        obj1.display();
    }
}
