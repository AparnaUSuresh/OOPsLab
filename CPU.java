class CPU
{
    double price;
    CPU(double p)
    {
        price=p;
    }
    class Processor
    {
        int num_of_cores=2;
        String manufacturer="Intel";

        void disp()
        {
            System.out.println("Processor-Number of cores:"+num_of_cores);
            System.out.println("Processor manufacturer:"+manufacturer);
        }

    }
    static class RAM
    {
        String memory="8GB";
        String manufacturer="Kingston";

        void display()
        {
            System.out.println("RAM memory:"+memory);
            System.out.println("RAM manufacturer:"+manufacturer);
        }
    }
}
class eight
{
    public static void main(String[] args)
    {
        CPU c=new CPU(3790);
        CPU.Processor p=c.new Processor();
        CPU.RAM r=new CPU.RAM();
        System.out.println("CPU price:"+c.price);

        p.disp();
        r.display();
    }
}
