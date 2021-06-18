class Employee
{
    int emp_id;
    String emp_name;
    double salary;
    void read(int id,String name,double sal)
    {
        emp_id=id;
        emp_name=name;
        salary=sal;
    }
    void display()
    {
        System.out.println("Employee id:"+emp_id);
        System.out.println("Employee name:"+emp_name);
        System.out.println("Salary:"+salary);
    }
    public static void main(String[] args)
    {
        Employee e1=new Employee();
        Employee e2=new Employee();
        e1.read(12,"Rohan",19500);
        e2.read(18,"Rahul",20000);
        System.out.println("Employee Details:");
        e1.display();
        System.out.println("Annual Salary:"+e1.salary*12);
        e2.display();
        System.out.println("Annual Salary:"+e2.salary*12);
    }
}
