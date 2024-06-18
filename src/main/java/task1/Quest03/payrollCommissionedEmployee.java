package task1.Quest03;

//--////////////////////////////////////////////////////////////////////////////////////////
//-=========================================================================================
/*

	// Concrete Creator class

*/
class payrollCommissionedEmployee extends Creator
{
    @Override
    public wageSataryPayroll factoryMethod()
    {
        return new commissionedEmployeePayroll();
    }

}


//-=========================================================================================
