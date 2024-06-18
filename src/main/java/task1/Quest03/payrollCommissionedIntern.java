package task1.Quest03;

//--////////////////////////////////////////////////////////////////////////////////////////
//-=========================================================================================
/*

	// Concrete Creator class

*/
class payrollCommissionedIntern extends Creator
{
    @Override
    public wageSataryPayroll factoryMethod()
    {
        return new commissionedInternPayroll();
    }

}


//-=========================================================================================
