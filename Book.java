import java.util.*;
class Book
{
    int ISBN;
    String title;
    String author;
    double price;
    String publisher;
    Book(int a,String b,String c,double d,String e)
    {
        ISBN=a;
        title=b;
        author=c;
        price=d;
        publisher=e;
    }
    public static void main(String[] args)
    {
        int u,i,j;
        String v,w,y;
        double x;
        Scanner sc=new Scanner(System.in);

        Book b[]=new Book[5];
        Book tmp=new Book(0,"","",0,"");
for (i=0;i<5;i++)
{System.out.println("Enter ISBN,title,author,price,publisher of Book 1");
     u=sc.nextInt();
     v=sc.next();
     w=sc.next();
     x=sc.nextDouble();
     y=sc.next();

    b[i]=new Book(u,v,w,x,y);
}
        System.out.println("Books sorted based on Book Title");
for(i=0;i<5;i++)
    for(j=0;j<5-i-1;j++)
    {
        if(b[j].title.compareTo(b[j+1].title)>0)
        {
            tmp=b[j];
            b[j]=b[j+1];
            b[j+1]=tmp;
        }
    }

        for(i=0;i<b.length;i++)
        {

                System.out.println("ISBN:"+b[i].ISBN);
            System.out.println("Title:"+b[i].title);
            System.out.println("Author:"+b[i].author);
            System.out.println("Price:"+b[i].price);
            System.out.println("Publisher:"+b[i].publisher);

        }



    }
}
