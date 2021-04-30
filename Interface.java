interface Interface  //Interface
{  
    void print();  
}  
    interface Show extends Interface
    {  
    void show();  
    }  
    class TestInterface implements Show
    {  
    public void print()
    {
        System.out.println("Hello");
    }  
    public void show()
    {
        System.out.println("Java");
    }  
      
    public static void main(String args[])
    {  
    TestInterface b = new TestInterface();  
    b.print();  
    b.show();  
     }  
}  
