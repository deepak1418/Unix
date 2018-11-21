import java.net.*;
import java.util.*;
import java.io.*;

class DClient
{
    public static void main(String args[]) throws IOException
    {
        int n, t;
        Socket s = new Socket("127.0.0.1", 5000);
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(s.getInputStream());

        System.out.println("Enter any number");
        n = sc.nextInt();
        PrintStream p = new PrintStream(s.getOutputStream());

        p.println(n);
        t = sc1.nextInt();
        System.out.println(t);
        //n = sc.nextInt();

        s.close();
        sc.close();
        sc1.close();
    }
}