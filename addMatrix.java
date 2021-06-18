import java.io.*;
class addMatrix
{
    public static void main(String[] args)throws IOException
    {
        int m,n,p,q;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter rows and columns of first matrix");
        m=Integer.parseInt(br.readLine());
        n=Integer.parseInt(br.readLine());
        System.out.println("Enter rows and columns of second matrix");
        p=Integer.parseInt(br.readLine());
        q=Integer.parseInt(br.readLine());
        if(m!=p||n!=q) {
            System.out.println("Not compatible for addition");

        }
        else {
            System.out.println("Enter elements of first matrix");
            int a[][] = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++)
                    a[i][j] = Integer.parseInt(br.readLine());
            }
            System.out.println("Enter elements of second matrix");

            int b[][] = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++)
                    b[i][j] = Integer.parseInt(br.readLine());
            }
            System.out.println("Sum Matrix is");
            int c[][] = new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    c[i][j] = a[i][j] + b[i][j];
                    System.out.print(c[i][j] + " ");

                }
                System.out.println();

            }
        }
  }
}
