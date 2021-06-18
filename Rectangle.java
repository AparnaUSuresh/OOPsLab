class Rectangle
{
    double width;
    double length;
    double area;
    String color;
    Rectangle(double w,double l,String c)
    {
        width=w;
        length=l;
        color=c;
        area=0.0;
    }
    void findArea()
    {
        area=length*width;
    }
    void match(Rectangle b)
    {
        if(area==b.area && color==b.color)
        {
            System.out.println("Matching Rectangles");
        }
        else
            System.out.println("Non matching Rectangles");
    }
    public static void main(String[] args)
    {
        Rectangle r1=new Rectangle(5.2,4.7,"red");
        Rectangle r2=new Rectangle(5.2,4.7,"red");
        r1.findArea();
        r2.findArea();
        r1.match(r2);
    }
}
