package task1.Quest03;

//--////////////////////////////////////////////////////////////////////////////////////////
//-=========================================================================================
/*

	// Concrete Creator class

*/
class payrollCasualEmployee extends Creator
{
    @Override
    public wageSataryPayroll factoryMethod()
    {
        return new casualEmployeePayroll();
    }

}


//-=========================================================================================
