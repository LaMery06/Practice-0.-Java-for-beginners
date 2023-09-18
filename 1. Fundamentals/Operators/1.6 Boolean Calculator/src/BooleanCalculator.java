public class BooleanCalculator
{
   public static void main(String[] args)
   {
      int a = 3, b = -4, c = 1;
      boolean t = true, f = false;

      System.out.println((a >= b));
      System.out.println(-b/a == c);
      System.out.println((t || !f) == (2*c <= c));
      System.out.println((!t == f) != (b+c/a > a-b*c));
   }
}