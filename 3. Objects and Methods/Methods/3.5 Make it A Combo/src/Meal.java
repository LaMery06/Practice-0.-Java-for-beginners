public class Meal
{
    //Instance attributes//
    private String name;
    private double cost;

    //Class constructor//
    public Meal(String food, double price)
    {
        name = food;
        cost = price;
    }

    //Instance methods//
    public void makeItACombo() {
        cost += 3;
        name += " with fries and soda";
    }

   public String getBill(){
        String result = name + ", $" + cost;
        return result;
    }

}