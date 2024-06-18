package task3.Quest08;

//Concrete Products
// a long distance Virgin flight with meal options for
// Here we will consider the meal options [Appetizer, Main, Salad, Dessert
// and Drink] for Virgin on long distance flights

public class VirginLongDistance implements Flight
{
    String FlightNo = "";
    String AirlineName = "";
    String FlightDistance = "";
    String MealAppetizer = "";
    String MealMain = "";
    String MealDessert = "";
    String mealDrink= "";


    @Override
    public void setFlightNo()
    {
        this.FlightNo 	="VIR023";

    }

    @Override
    public void setAirlineName()
    {
        this.AirlineName   	="VIRGIN";
    }

    public void setFlightDistance()
    {
        this.FlightDistance   	="LONG";
    }

    public void setMealAppetizer()
    {
        this.MealAppetizer   	="Biscuit";
    }

    public void setMealMain()
    {
        this.MealMain   		="Chicken";
    }

    public void setMealDessert()
    {
        this.MealDessert   		="Ice Cream";
    }

    public void setmealDrink()
    {
        this.mealDrink   		="Coke";
    }

    public void display()
    {
        System.out.println("This is the Virgin Long Distance Flight Option");

    }


}

