import java.util.*;
class Fibo implements Runnable
{
    int a,b;
    Fibo(int start,int end)
    {
      a=start;
      b=end;
    }
    public void run()
    {
        int f=0,s=1,t;
        System.out.println("\nFibonacci numbers in the range from"+a+" to "+b+" are:");
        if(a<f && f<b)
            System.out.print(f+" ");
        if(a<s && s<b)
            System.out.print(s+" ");
        do {

            t=f+s;
            f=s;
            s=t;
            if(a<t && t<b)
                System.out.print(t+" ");
            else if (b<t)
                break;
        }while (true);
    }
}
class Even implements Runnable
{
    int a,b;
    Even(int start,int end)
    {
        a=start;
        b=end;
    }
    public void run()
    {
        System.out.println("\nEven numbers in the range from"+a+" to "+b+" are:");
while (a<=b)
{
    if(a%2==0) {
        System.out.print(a + " ");
        a+=2;
    }
    else a++;
}

    }
}
public class ThreadInterface
{
    public static void main(String[] args)
    {
        Fibo f=new Fibo(6,15);
        Thread t1=new Thread(f);
        t1.start();
        Even e=new Even(7,15);
        Thread t2=new Thread(e);
        t2.start();

    }
}