class Euler1
{
  public static void main(String[] args)
  {
    int count = 0;
    int a = 0;
    while (a < 999)
    {
      a++;
      if (a % 3 == 0 || a % 5 == 0)
      {
        count += a;
      }
      System.out.println(count);
    }
  }
}
