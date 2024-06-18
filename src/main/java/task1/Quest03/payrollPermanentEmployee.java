package task1.Quest03;

//--////////////////////////////////////////////////////////////////////////////////////////
//-=========================================================================================
/*

	// Concrete Creator class

*/
class payrollPermanentEmployee extends Creator
{
    @Override
    public wageSataryPayroll factoryMethod()
    {
        return new permanentEmployeePayroll();
    }

}


//-=========================================================================================