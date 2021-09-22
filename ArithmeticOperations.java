Sub.java

package Arithmetic;

public class Sub
{
    public static int difference(int a,int b)
    {
        return a-b;
    }
}



Add.java


package Arithmetic;


public class Add
{
    public static int sum(int a,int b)
    {
        return a+b;
    }
}
 

Mul.java


package Arithmetic;


public class Mul
{
    public static int product(int a,int b)
    {
        return a*b;
    }
}



Div.java


package Arithmetic;

public class Div
{
    public static double quotient(int a,int b)
    {
        return a/b;
    }
}

ArithmeticOperations.java



import Arithmetic.*;
import java.util.*;
public class ArithmeticOperations
{
    public static void main(String args[])
    {
Scanner sc=new Scanner(System.in);
System.out.println("Enter 2 numbers");
int x=sc.nextInt();
int y=sc.nextInt();
        Add a=new Add();
        Sub s=new Sub();
        Div d=new Div();
        Mul m=new Mul();
        System.out.println("Sum="+a.sum(x,y));
        System.out.println("Difference="+s.difference(x,y));
        System.out.println("Product="+m.product(x,y));
        System.out.println("Quotient="+d.quotient(x,y));
    }
}