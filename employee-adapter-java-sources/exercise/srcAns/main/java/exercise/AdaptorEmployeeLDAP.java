import exercise.Employee;
import exercise.EmployeeLDAP;

public class AdaptorEmployeeLDAP implements Employee{
    EmployeeLDAP employeeLDAP;

    public AdaptorEmployeeLDAP(EmployeeLDAP employeeLDAP){
        this.employeeLDAP = employeeLDAP;
    }

    public String getId(){
        return this.employeeLDAP.get("uid");
    }
    public String getFirstName(){
        return this.employeeLDAP.get("givenName");
    }
    public String getLastName(){
        return this.employeeLDAP.get("sn");
    }
    public String getEmail(){
        return this.employeeLDAP.get("mail");
    }
}
