[10:22 AM, 9/21/2021] Anju CET: import java.io.*;
public class CopyFiles
{
    public static void main(String[] args)
    {
        try
        {
            FileReader fr = new FileReader("file.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("copy.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            String s;
            while ((s = br.readLine()) != null) {
                bw.write(s);
                bw.newLine();
            }
            bw.flush();

            br.close();
            fr.close();
            bw.close();
            fw.close();
        }
        catch(Exception e)
        {

        }

    }
}
