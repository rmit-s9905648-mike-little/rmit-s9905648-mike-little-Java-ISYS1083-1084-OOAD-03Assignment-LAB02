package task1.Quest03;

//-->////////////////////////////////////////////////////////////////////////////////////////
//-=========================================================================================
/*
	This class managers the access to the payroll system

*/
public class AppAccess
{
//------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------
//Class Properties

		/*
			//TODO: relevant class properties will be defined later

		*/


//------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------
//Class Methods


    //------------------------------------------------------------------------------------------
    public String Login()
    {

		/*
			//TODO: This authenticate whether the nominated employee ID can access the
			Payroll application, by returning a string 	as either "authenticated","not authenticated"



		*/
        return "authenticated";

    }
//------------------------------------------------------------------------------------------


    //------------------------------------------------------------------------------------------
    public String Logout()
    {
		/*
			//TODO: this closes the Application session, and returns a string as "logged out"
		*/

        return "notAuthenticated";
    }


} // close Public class Login()

//-=========================================================================================

