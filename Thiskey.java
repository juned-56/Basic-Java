public class Thiskey
{
    int id;
    String name;
    float salary;
    Thiskey(int id, String name, float salary)
    {
        this.id = id;              //This Keyword
        this.name = name;
        this.salary = salary;
    }    
    void display()
    {
        System.out.println("Id: "+id+" Name: "+name+" Salary "+salary);
    }
}
    class Testt
    {
        public static void main(String[] args)
        {
            Thiskey t1 = new Thiskey(20, "Juned", 186000f);
            Thiskey t2 = new Thiskey(25, "Adnan", 183000f);
            t1.display();
            t2.display();    
        }
    }
