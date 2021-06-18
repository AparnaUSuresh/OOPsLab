class Student
{
    String name;
    int roll_no;
    int m1,m2,m3;
    int total;
    void read(String a,int b,int c,int d,int e)
    {
        name=a;
        roll_no=b;
        m1=c;
        m2=d;
        m3=e;
    }
    void calcTotal()
    {
        total=m1+m2+m3;
    }
    void display()
    {
        System.out.println("Roll no:"+roll_no);
        System.out.println("Name:"+name);
        System.out.println("Mark1"+m1);
        System.out.println("Mark2:"+m2);
        System.out.println("Mark3:"+m3);
        System.out.println("Total:"+total);
    }

    public static void main(String[] args)
    {

        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        Student max=new Student();
        s1.read("Anirudh",1,30,50,41);
        s2.read("Anu",2,47,34,29);
        s3.read("Sid",10,42,26,42);
        s1.calcTotal();
        s2.calcTotal();
        s3.calcTotal();
        max=s1;
        int maxMarks= s1.total;
        if(s2.total>maxMarks)
        {
            maxMarks= s2.total;
            max=s2;
        }
        if(s3.total>maxMarks)
        {
            maxMarks= s3.total;
            max=s3;
        }
        System.out.println("Student with highest marks is:");
        max.display();


    }
}
