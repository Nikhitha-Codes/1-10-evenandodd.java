import java.util.*;

class EvenOrOdd
{
    void printNumbers()
    {
        for(int i = 1; i <= 10; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println(i + " is Even");
            }
            else
            {
                System.out.println(i + " is Odd");
            }
        }
    }
}

class Main
{
    public static void main(String args[])
    {
        EvenOrOdd obj = new EvenOrOdd();
        obj.printNumbers();
    }
}
