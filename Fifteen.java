import java.util.*;
class UserException extends Exception
{
    UserException(String s)
    {
        super(s);
    }

}
public class Fifteen
{
    public static void main(String[] args)
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        int k,sum=0;
        for(int i=0;i<n;i++) {
            System.out.println("Enter " + (i+1) + " th positive number");
            k = sc.nextInt();
            try {
                if (k < 0) {
                    throw new UserException("Oops...It's a negative number!");

                } else
                    sum += k;
            } catch (UserException e) {
                System.out.println(e);
                i--;

            }

        }
        System.out.println("Average is "+(sum/n));
    }
}
