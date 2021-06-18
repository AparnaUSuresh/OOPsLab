import java.io.*;
class Symmetric
{
    public static void main(String[] args)throws IOException
    {
        int m,n,flag=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter rows and columns of the matrix");
        m=Integer.parseInt(br.readLine());
        n=Integer.parseInt(br.readLine());
        if(m!=n)
        {
            System.out.println("Not a square matrix");
        }
        else {
            System.out.println("Enter elements of the matrix");
            int a[][] = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++)
                    a[i][j] = Integer.parseInt(br.readLine());
            }


            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {

                    if (a[i][j]!=a[j][i]) {
                        flag=1;

                        break;
                    }

                }


            }
            if(flag==1)
                System.out.print("Not symmetric");
            else
                System.out.print("Symmetric");
        }
    }
}
