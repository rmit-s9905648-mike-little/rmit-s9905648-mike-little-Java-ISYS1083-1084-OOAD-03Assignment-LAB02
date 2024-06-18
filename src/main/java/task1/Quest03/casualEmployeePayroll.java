package task1.Quest03;

//--////////////////////////////////////////////////////////////////////////////////////////
//-=========================================================================================
/*

	//Concreate Product

	This Interface class is a template for calculating either the wage of an employee if they
	are on a contract, Commission, or a casual employee, or permanent employee.

*/
public class casualEmployeePayroll implements wageSataryPayroll
{
//------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------
//Class Properties

    private Integer wageSalary;



//------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------
//Class Methods


    //------------------------------------------------------------------------------------------
    public Integer calculateWageSataryPayroll()
    {

		/*
			//TODO:Calculated on a flat monthly salary which is calculated on a fixed per
			   mensem rate regardless of the hours that they may have worked,
			   Plus a 25% commission of the total sales for that month
		*/
        return wageSalary;

    } //close public


//------------------------------------------------------------------------------------------
public void payPayroll()
{
		/*
			//TODO:
		*/

} //close public

//------------------------------------------------------------------------------------------
public void generatePaySlip()
{
		/*
			//TODO:
		*/

} //close public



}// close public class casualEmployee implement wageSataryPayroll
//-=========================================================================================
