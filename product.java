class Product
{
    int pcode;
    String pname;
    double price;
    Product(int code,String name,double p)
    {
        pcode=code;
        pname=name;
        price=p;
    }
    Product()
    {
        pcode=0;
        pname="";
        price=0.0;
    }
    void display()
    {
        System.out.println("Product code:"+pcode);
        System.out.println("Product name:"+pname);
        System.out.println("Product price:"+price);
    }
   public static void main (String[] args)
    {

        Product p1=new Product(123,"Fruity",25);
        Product p2=new Product(128,"Amul Tru",23);
        Product p3=new Product(250,"Maaza",20);
        Product min=new Product();
        min=p1;
        double min1= p1.price;
        if(p2.price<min1) 
        {
            min1 = p2.price;
            min=p2;
        }
        if (p3.price<min1)
        {
            min1= p3.price;
            min=p3;
        }
        System.out.println("Product with lowest price:");
        min.display();
    }
}
