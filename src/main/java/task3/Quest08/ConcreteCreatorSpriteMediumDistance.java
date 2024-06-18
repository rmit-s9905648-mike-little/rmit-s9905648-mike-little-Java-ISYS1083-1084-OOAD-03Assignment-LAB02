package task3.Quest08;


//=///////////////////////////////////////////////////////////////////////////

class ConcreteCreatorSpriteMediumDistance extends Creator
{
    @Override
    public Flight factoryMethod()
    {
        return new SpriteMediumDistance();
    }

}
