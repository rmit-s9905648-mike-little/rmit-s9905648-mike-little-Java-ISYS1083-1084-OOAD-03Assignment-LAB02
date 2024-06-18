package task1.Quest03;

//--////////////////////////////////////////////////////////////////////////////////////////
//-=========================================================================================
/*
	This Interface class is a template for calculating either the wage of an employee if they
	are on a contract, Commission, or a casual employee, or permanent employee.

*/
interface wageSataryPayroll
{
//------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------
//Class Properties

    Integer wageSalary =0;

//------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------
//Class Methods

    public Integer calculateWageSataryPayroll();

    public void payPayroll();

    public void generatePaySlip();

}// close interface class wageSataryPayroll
//-=========================================================================================
