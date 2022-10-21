package Odd2;

public class program3
{
  public static void main(String[] args)
   {
     int a=10;
     for (int i=1; i<a*2; i++)
      {
        if ((i%2!=0))
         {
            System.out.println(i);
          }
        }
      else
    {
      --a;
      for (int i=1; i<=a*2; i++)
    {
        if ((i%2!=0))
      {
         System.out.println(i);
      }
    }
  