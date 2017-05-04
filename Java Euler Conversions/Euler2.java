class Euler2
{
  public static int fib(int n)
  {
    if (n == 1 || n == 2)
    {
      return 1;
    }
    else
    {
    return fib(n-1) + fib(n-2);
    }
  }
  public static void main (String [] args)
  {
    int x = 1;
    int y = 0;
    int total = 0;
    while (y < 4000000)
    {
      x += 1;
      y = fib(x);
      if (y % 2 == 0)
      {
        total += y;
      }

    }
    System.out.println(total);
  }
}
