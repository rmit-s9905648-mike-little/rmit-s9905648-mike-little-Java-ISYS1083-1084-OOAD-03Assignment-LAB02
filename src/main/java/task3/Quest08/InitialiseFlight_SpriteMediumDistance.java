package task3.Quest08;


// client code
public class InitialiseFlight_SpriteMediumDistance
{
    public static void main(String[] args)
    {
        Creator SpriteMediumDistanceFlight = new ConcreteCreatorSpriteMediumDistance();
        Flight SpriteMediumDistance =  SpriteMediumDistanceFlight.factoryMethod();
        SpriteMediumDistance.display();

    }

}
