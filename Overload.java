import java.util.*;
class Overload
{
    int area(int l,int b)
    {
        return l*b;
    }
    double area(double r)
    {
        return 3.14*r*r;
    }
    int area(int a)
    {
        return a*a;
    }
    public static void main(String args[])
    {
        int choice;
        char ch;
        Overload o=new Overload();
        System.out.println("Menu:\n1.Circle\n2.Rectangle\n3.Square\n4.Exit\n");
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Enter the choice");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the radius");
                    double radius=sc.nextDouble();
                    System.out.println("Area of the Circle is"+o.area(radius));

                    break;
                case 2:
                    System.out.println("Enter the length and breadth of rectangle");
                    int l=sc.nextInt();
                    int b=sc.nextInt();

                    System.out.println("Area of the Rectangle is"+o.area(l,b));

                    break;
                case 3:
                    System.out.println("Enter the side of square");
                    int side=sc.nextInt();
                    System.out.println("Area of the Square is"+o.area(side));
                    break;

                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");            }
            System.out.println("Do you want to continue?");
            ch=sc.next().charAt(0);

        }while (ch=='Y');
    }

}
