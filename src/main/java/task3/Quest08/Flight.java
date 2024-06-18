package task3.Quest08;

interface Flight
{
    // this is the product in the Factory Pattern
    String FlightNo = "";

    String AirlineName = "";
    String FlightDistance = "";
    String MealAppetizer = "";
    String MealMain = "";
    String MealDessert = "";
    String mealDrink= "";

    void setFlightNo();
    void setAirlineName();
    void setFlightDistance();
    void setMealAppetizer();
    void setMealMain();
    void setMealDessert();
    void setmealDrink();

    public void display();

}
