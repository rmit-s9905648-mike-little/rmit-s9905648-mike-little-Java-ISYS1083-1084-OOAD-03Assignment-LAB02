package task3.Quest08;

//=///////////////////////////////////////////////////////////////////////////

// Concrete Product
// show how you will extend this…by creating an extension for the new “Sprite” airline,
// for Medium distance, and the meal options…
// Appetiser= "sandwiches"; MealMain = "Spagetti" ;
// MealDessert ="Peaches"; mealDrink ="OrangeJuice"
// FlightNo = "SPR021"

//

public class SpriteMediumDistance implements Flight
{
    String FlightNo = "";
    String AirlineName = "";
    String FlightDistance = "";
    String MealAppetizer = "";
    String MealMain = "";
    String MealDessert = "";
    String mealDrink= "";




    public void setFlightNo()
    {
        this.FlightNo 		="SPR021";

    }

    public void setAirlineName()
    {
        this.AirlineName   	="SPRITE";
    }

    public void setFlightDistance()
    {
        this.FlightDistance   	="MEDIUM";
    }

    public void setMealAppetizer()
    {
        this.MealAppetizer   	="sandwiches";
    }

    public void setMealMain()
    {
        this.MealMain   		="Spagetti";
    }

    public void setMealDessert()
    {
        this.MealDessert   		="Peaches";
    }

    public void setmealDrink()
    {
        this.mealDrink   		="Orange Juice";
    }

    public void display()
    {
        System.out.println("This is the Virgin Long Distance Flight Option");

    }


}


//=///////////////////////////////////////////////////////////////////////////
