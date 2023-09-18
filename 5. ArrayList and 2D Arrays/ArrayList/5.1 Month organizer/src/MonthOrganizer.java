import java.util.ArrayList;

public class MonthOrganizer
{
   public static void main(String[] args)
   {
      ArrayList<String> months = new ArrayList<>(12);
      months.add("January");
      months.add("February");
      months.add("May");
      months.add("June");
      months.add("July");
      months.add("October");
      months.add("November");
      months.add("December");


      months.add(2, "March");
      months.add(5, "September");
      months.add(6, "August");
      months.add(2, "April");

      System.out.println(months);
   }
}