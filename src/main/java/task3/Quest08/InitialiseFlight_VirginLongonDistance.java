package task3.Quest08;


// client code
public class InitialiseFlight_VirginLongonDistance
{
    public static void main(String[] args)
    {
        Creator VirginLongonDistanceFlight = new ConcreteCreatorVirginLongDistance();
        Flight VirginLongDistance =  VirginLongonDistanceFlight.factoryMethod();
        VirginLongDistance.display();

    }

}
