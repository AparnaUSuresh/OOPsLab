import java.util.*;
class MultTable extends Thread
{
  public void run()
  {
      for(int i=1;i<=10;i++)
      {
          System.out.println(i+" * 5 = "+(i*5));
      }
  }
}
class Prime extends Thread
{
    public void run()
    {
        int i=2,n,count=0,flag,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        n=sc.nextInt();
while (count<n)
{
    flag=0;
    for(j=2;j<i;j++)
    {
        if(i%j==0) {
            flag = 1;
            break;
        }
    }
    if (flag==0)
    {
        count++;
        System.out.println(i);
    }
    i++;
}
    }
}
public class ThreadClass
{
    public static void main(String[] args)
    {
        MultTable m=new MultTable();
        m.start();
        Prime p=new Prime();
        p.start();
    }
}