class Complex
{
    int x;
    int y;
    Complex()
    {
        x=0;
        y=0;
    }
    Complex(int a,int b)
    {
        x=a;
        y=b;
    }
    Complex sum(Complex c2)
    {
        Complex sum=new Complex();
        sum.x=x+c2.x;
        sum.y=y+c2.y;
        return sum;
    }
    void display()
    {
        System.out.println(x+"+i"+y);
    }
    public static void main(String[] args)
    {
        Complex c1=new Complex(2,5);
        Complex c2=new Complex(5,9);
        Complex sum=new Complex();
        sum=c1.sum(c2);
        System.out.println("Sum is:");
        sum.display();
    }
}
