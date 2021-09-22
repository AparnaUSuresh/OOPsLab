import java.io.*;
class Emp
{
    int eNo;
    String eName;
    double eSalary;
    Emp(int a,String b,double c)
    {
        eNo=a;
        eName=b;
        eSalary=c;
    }
    static void search(Emp a[],int x)
    {
        int flag=0;
for(int i=0;i<a.length;i++)
{
    if(a[i].eNo==x)
    {
        System.out.println("Employee found.The details of the searched employee:");
        System.out.println("Number:"+a[i].eNo);
        System.out.println("Name:"+a[i].eName);
        System.out.println("Salary:"+a[i].eSalary);
        flag=1;
        break;
    }
}
if(flag==0)
    System.out.println("Employee not found");

    }
public static void main(String[] args)throws IOException
{
    int num;
    String name;
    double sal;

    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter number of employees");

    int n=Integer.parseInt(br.readLine());
    Emp e[]=new Emp[n];
    for(int i=0;i<n;i++)
    {
        System.out.println("Enter Employee Number,Name and salary for Employee "+(i+1));
        num=Integer.parseInt(br.readLine());
        name=br.readLine();
        sal=Double.parseDouble(br.readLine());
        e[i]=new Emp(num,name,sal);
    }
    System.out.println("Enter eNumber of Employee to be searched:");
    num=Integer.parseInt(br.readLine());
    search(e,num);

}
}