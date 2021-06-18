import java.io.*;
class StringMani
{
    static void count(String s)
    {
        String[] w=s.split(" ");
        String[] words=new String[w.length];
        int count[]=new int[w.length];
        int flag,k=0,i,j;
        for (i=0;i< w.length;i++)
        {flag=0;
            for(j=k-1;j>=0;j--)
            {
                if(words[j].equals(w[i])) {
                    count[j]=count[j]+1;
                    flag=1;
                    break;
                }
            }
            if(flag==0) {
                words[k]=w[i];
                count[k] =1;
                k++;
            }
        }
        System.out.println("Word Count is");
        i=0;
        while (words[i]!=null)
        {
            System.out.println(words[i]+":"+count[i++]);

        }
    }
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a sentence");
        String s=br.readLine();
        System.out.println("Menu\n1.count words in the sentence\n2.Replace" +
                "\n3.Reverse Words\n4.Exit");
        int ch;
        do {
            System.out.println("Enter your choice");
ch=Integer.parseInt(br.readLine());
            if(ch==1)
           {
count(s);
           }
           else if(ch==2)
           {

               System.out.println("Enter the word to be replaced");
               String old=br.readLine();
               System.out.println("Enter the new word");
               String new1=br.readLine();
               String[] w=s.split(" ");
               System.out.println("The sentence after replacement is\n");

               for(int i=0;i<w.length;i++)
               {
                   if(w[i].equals(old))
                       System.out.print(new1+" ");
                   else
                       System.out.print(w[i]+" ");
               }

               System.out.println();


           }
           else if(ch==3)
           {
               String[] w=s.split(" ");
for(int i=0;i<w.length;i++)
{ char a[]=w[i].toCharArray();
for(int j=a.length-1;j>=0;j--)
    System.out.print(a[j]);
    System.out.print(" ");
}System.out.println();
           }
           else if(ch==4) break;
           else System.out.println("Wrong Choice\n");
        }
        while(true);
    }
}
