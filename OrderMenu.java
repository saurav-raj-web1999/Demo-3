import java.io.*;
public class OrderMenu
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader xyz=new InputStreamReader(System.in);
        BufferedReader ins = new BufferedReader(xyz);
        System.out.println("Order Menu");
        System.out.println("1. Food");
        System.out.println("2. Drinks");
        System.out.println("3. Clothes");
        System.out.println("4. Grosery");
        int n=Integer.parseInt(ins.readLine());
        System.out.println("Your Order number is "+n);
    }
}
