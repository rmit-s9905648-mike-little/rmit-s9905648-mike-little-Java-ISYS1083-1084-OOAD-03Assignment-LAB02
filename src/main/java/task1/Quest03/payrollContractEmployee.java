package task1.Quest03;

//--////////////////////////////////////////////////////////////////////////////////////////
//-=========================================================================================
/*

	// Concrete Creator class

*/
class payrollContractEmployee extends Creator
{
    @Override
    public wageSataryPayroll factoryMethod()
    {
        return new contractEmployeePayroll();
    }

}


//-=========================================================================================
