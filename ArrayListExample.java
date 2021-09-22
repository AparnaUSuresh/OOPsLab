import java.util.*;
class ArrayListExample
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> a=new ArrayList<String>();
        System.out.println("Menu:1.Add Element\n2.Remove Element\n3.Set Element at Index\n" +
                "4.Size of the array\n5.Get element at index\n6.Traverse List\n" +
                "7.Add Element at Position\n8.Sort\n9.Exit\n");

        char choice;
        int i,ch;
        String s;
        do {
            System.out.println("Enter choice:");
           ch=sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter string:");
                    s = sc.next();
                    a.add(s);
                    System.out.println(a);
                    break;
                case 2:
                    System.out.println("Enter string:");
                    s = sc.next();
                    a.remove(s);
                    System.out.println(a);
                    break;
                case 3:
                    System.out.println("Enter string:");
                    s = sc.next();
                    System.out.println("Enter index:");
                    i = sc.nextInt();
                    a.set(i, s);
                    System.out.println(a);
                    break;
                case 4:
                    System.out.println("Size of the ArrayList is "+a.size());
                    break;
                case 5:
                    System.out.println("Enter index:");
                    i = sc.nextInt();
                    System.out.println(a.get(i));
                    break;
                case 6:
                    System.out.println("The ArrayList is:");
                    for (String k : a)
                        System.out.println(k);
                    break;
                case 7:
                    System.out.println("Enter string:");
                    s = sc.next();
                    System.out.println("Enter index:");
                    i = sc.nextInt();
                    a.add(i, s);
                    System.out.println(a);
                    break;
                case 8:
                    System.out.println("The Sorted ArrayList is:");
                    Collections.sort(a);
                    System.out.println(a);
                    break;
                case 9:
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