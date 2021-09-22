import java.io.*;
interface Student
{
void academicScore();
}
interface Sports
{
void sportsScore();
}
class Result implements Student,Sports
{
    int roll_no;
    String name;
    int acadScore;
    int sportsScore;
    Result(int a,String b,int c,int d)
    {
        roll_no=a;
        name=b;
        acadScore=c;
        sportsScore=d;
    }
public void academicScore()
{
    System.out.println("Academic Score:"+acadScore);
}
   public void sportsScore()
    {
        System.out.println("Sports Score:"+sportsScore);
    }
    void display()
    {
        System.out.println("Student Details\nName:"+name);
        System.out.println("Roll no:"+roll_no);
    }
    public static void main(String[] args)throws IOException
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter Student Details\nName:");
    String a= br.readLine();
    System.out.print("Roll number:");
    int b= Integer.parseInt(br.readLine());
    System.out.print("Academic Score:");
    int c= Integer.parseInt(br.readLine());
    System.out.print("Sports Score:");
    int d= Integer.parseInt(br.readLine());
    Result r=new Result(b,a,c,d);
    r.display();
    r.academicScore();
    r.sportsScore();


}
}