import java.io.*;
import java.util.ArrayList;

class test
{
    public static void main(String [] args)
    {
        ArrayList<String> a = new ArrayList<String>();
        a.add("0");
        int t = 0;
        String cheese = "10";
        System.out.println(a.get(0));
        System.out.println(cheese);
        t = Integer.parseInt(a.get(0));
        System.out.println(t);
    }
}
