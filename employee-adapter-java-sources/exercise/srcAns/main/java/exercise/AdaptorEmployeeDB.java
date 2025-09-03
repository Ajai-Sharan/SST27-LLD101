import exercise.Employee;
import exercise.EmployeeDB;

public class AdaptorEmployeeDB implements Employee{
    EmployeeDB employeeDB;

    public AdaptorEmployeeCSV(EmployeeDB employeeDB){
        this.employeeDB = employeeDB;
    }

    public String getId(){

        return String(this.employeeDB.getId());

    }

    public String getFirstName(){

        return this.employeeDB.getFirstName();
    }

    public String getLastName(){
        return this.employeeDB.getFirstName();
    }

    public String getEmail(){
        return this.employeeDB.getEmailAddress();
    }
}
