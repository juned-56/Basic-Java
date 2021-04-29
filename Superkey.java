class Superkey
{  
    int id;  
    String name;  
    Superkey(int id,String name)   //parameterized constructor
    {  
    this.id=id;     //Using this Keyword
    this.name=name;  
    }  
}  
    class Employee extends Superkey
    {  
    float salary;  
    Employee(int id,String name,float salary)  
    {  
    super(id,name);     //reusing parent constructor  
    this.salary=salary;  
    }  
    void display(){
        System.out.println("Id is: "+id);
        System.out.println("Name of Employee: "+name);
        System.out.println("Salary: "+salary);     
}  
    }  
    class TestSuper
    {  
    public static void main(String[] args)
    {  
    Employee emp = new Employee(8,"Juned",90000f);  
    emp.display();  
    }
}  
