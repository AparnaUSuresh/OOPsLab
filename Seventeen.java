import java.io.*;
interface Shapes
{
    void area();
    void perimeter();
}
class Circle implements Shapes
{
    int r;
    Circle(int a)
    {
        r=a;
    }
    public void area()
    {
        System.out.println("Area of the circle is"+3.14*r*r);
    }
    public void perimeter()
    {
        System.out.println("Perimeter of the circle is"+2*3.14*r);
    }
}
class Rectangle implements Shapes
{
    int l,b;
    Rectangle(int a,int b)
    {
        l=a;
        this.b=b;
    }
    public void area()
    {
        System.out.println("Area of the rectangle is"+l*b);
    }
    public void perimeter()
    {
        System.out.println("Perimeter of the circle is"+2*(l+b));
    }

}
class seventeen
{
    public static void main(String[] args)throws IOException
    {


        int ch;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter radius");
        int rad= Integer.parseInt(br.readLine());
        Circle c = new Circle(rad);
        System.out.println("Enter l and b");
        int l= Integer.parseInt(br.readLine());
        int b= Integer.parseInt(br.readLine());
        Rectangle r = new Rectangle(l,b);
        System.out.println("Menu\n1.Area of Circle\n2.Area of Rectangle\n3.Perimeter of Circle\n4.Perimeter of Rectangle\n");

        do {
            System.out.println("Enter choice");
            ch = Integer.parseInt(br.readLine());
            switch (ch) {
                case 1:

                    c.area();
                    break;
                case 2:

                    r.area();
                    break;
                case 3:

                    c.perimeter();
                    break;
                case 4:

                    r.perimeter();
                    break;
                default:
                    System.out.println("Wrong choice");
                    System.exit(0);
            }
        }while(true);
    }
}