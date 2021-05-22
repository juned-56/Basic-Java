class Tostring
{  
 int rollno;  
 String name;  
 String course;  
  
 Tostring(int rollno, String name, String course){  
 this.rollno = rollno;  
 this.name = name;  
 this.course = course;  
 }  
   
 public String toString()    //overriding the toString() method 
 { 
    return rollno+" "+name+" "+course;  
 }  
 public static void main(String args[]){  
   Tostring s1=new Tostring(1,"Juned","B.Tech");  
   Tostring s2=new Tostring(2,"Javed","B.Tech");  
     
   System.out.println(s1);
   System.out.println(s2);
 }  
}  
