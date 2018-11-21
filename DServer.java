import java.net.*;
import java.util.*;
import java.io.*;

class DServer
{
    public static void main(String args[]) throws IOException
    {
        int n, t;
        ServerSocket s1 = new ServerSocket(5000);
        System.out.println("Server is Ready");
        Socket ss = s1.accept();
        Scanner sc = new Scanner(ss.getInputStream());

        n = sc.nextInt();
        t = 2 * n;

        PrintStream p = new PrintStream(ss.getOutputStream());

        p.println(t);

        s1.close();
        sc.close();
        ss.close();
        p.close();
    }
}