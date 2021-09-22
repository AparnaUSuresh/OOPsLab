import java.util.*;
public class LLoperations
{
    public static void main(String[] args)
    {
        LinkedList<Integer> a=new LinkedList<Integer>();
        Scanner sc=new Scanner(System.in);

        System.out.println("Menu:1.Add Element\n2.Remove Element\n3." +
                "Add Element at Beginning\n4.Add Element at End\n5." +
                "Remove Element at Beginning\n6.Remove Element at End\n7." +
                "Remove all Elements\n8.Exit\n");

        char choice;
        int i,ch;
        int s;
        do {
            System.out.println("Enter choice:");
            ch=sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter number to be inserted:");
                    s = sc.nextInt();
                    a.add(s);
                    System.out.println(a);
                    break;
                case 2:
                    System.out.println("Enter position of number to be removed:");
                    s = sc.nextInt();
                    a.remove(s);
                    System.out.println(a);
                    break;
                case 3:
                    System.out.println("Enter number:");
                    s = sc.nextInt();
                    a.addFirst(s);
                    System.out.println(a);
                    break;
                case 4:

                    a.removeFirst();
                    System.out.println(a);
                    break;
                case 5:
                    System.out.println("Enter number:");
                    s = sc.nextInt();
                    a.addLast(s);
                    System.out.println(a);
                    break;
                case 6:
                    a.removeLast();
                    System.out.println(a);
                    break;
                case 7:
                    a.clear();
                    System.out.println(a);
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Choice");
                    break;
            }
            System.out.println("Do you want to continue?");
            choice=sc.next().charAt(0);
        }while (choice=='Y');


    }
}