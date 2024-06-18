package task1.Quest03;

//--////////////////////////////////////////////////////////////////////////////////////////
//-=========================================================================================
/*
	This class manages the details of the employees, including either their way received
	or monthly salary as payroll
*/

public class Employee
{
//------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------
//Class Properties

    private String name;
    private String EmployeeID;

    private enum role
    {
		Adminstrator,
        PermanentEmployee,
        ContractEmployee,
        CommissionedEmployee,
        CommissionedIntern
    }
    private enum test
    {

    }

    private enum AccessStatus
    {
		authenticated,
        notAuthenticated
    }

    private String AccessPriveledge;
    private Integer wageSalary;

//------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------
//Class Methods



//------------------------------------------------------------------------------------------
public void createEmployeeRecord()
{

	/*
		//TODO: create a  employee record with record detail,
		inc payroll [wage or salary]
		Make connection to underlying data database using JDBC class
	*/

}

//------------------------------------------------------------------------------------------
public void updateEmployeeRecord()
{
	/*
		//TODO: update indicated employee record with record detail,
		inc payroll [wage or salary]
		Make connection to underlying data database using JDBC class
	*/

}

//------------------------------------------------------------------------------------------
public void deleteEmployeeRecord()
{
	/*
		//TODO: delete indicated employee record
		Make connection to underlying data database using JDBC class
	*/

}

//------------------------------------------------------------------------------------------
public void  searchEmployeeRecord()
{
	/*
		//TODO: search employee record inc payroll [wage or salary]
		Make connection to underlying data database using JDBC class
	*/

}

//------------------------------------------------------------------------------------------
public void reviewEmployeeRecord()
{
	/*
		//TODO: review employee record inc payroll [wage or salary]
		Make connection to underlying data database using JDBC class
	*/

}
//------------------------------------------------------------------------------------------

}// close Public void Employee

