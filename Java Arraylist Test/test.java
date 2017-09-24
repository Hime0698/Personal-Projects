import java.io.*;
import java.util.ArrayList;

class test
{
    public static ArrayList<String> test = new ArrayList<String>();

    public static void main(String [] args)
    {
        test.add("0");

        printTest();
    }

    public static void printTest()
    {
        System.out.println(test.size());
        System.out.println(test.get(0));
        System.out.println((Integer.parseInt(test.get(0)));
    }

}
