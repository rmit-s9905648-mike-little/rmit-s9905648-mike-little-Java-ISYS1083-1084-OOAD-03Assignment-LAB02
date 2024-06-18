package task3.Quest08;



// Concrete Creator, ConcreteCreatorVirginLongDistance
class ConcreteCreatorVirginLongDistance extends Creator
{
    @Override
    public Flight factoryMethod()
    {
        return new VirginLongDistance();
    }

}
