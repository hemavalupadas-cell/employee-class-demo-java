class Employee
{
    int id=2789478;
   static String name="Hema";
    float salary=55667.15f;
    String email="Hema@1234";
    String role="Student";

public static void display(){
    System.out.println("+name");
    System.out.println("+role");
}
}

class EmpData
{
    public static void main(String args[])
    {
        Employee e1 = new Employee();
        System.out.println(e1.name);
        System.out.println(e1.role);
        
    }
}