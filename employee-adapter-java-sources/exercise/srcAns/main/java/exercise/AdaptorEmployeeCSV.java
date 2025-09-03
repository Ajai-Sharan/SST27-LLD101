import exercise.Employee;
import exercise.EmployeeCSV;

public class AdaptorEmployeeCSV implements Employee{
    EmployeeCSV employeeCSV;

    public AdaptorEmployeeCSV(EmployeeCSV employeeCSV){
        this.employeeCSV = employeeCSV;
    }

    public String getId(){

        String[] parts = this.employeeCSV.tokens();
        
        String id = parts[0];

        return id;

    }

    public String getFirstName(){

        String[] parts = this.employeeCSV.tokens();
        
        String firstName = parts[1];

        return firstName;
    }

    public String getLastName(){
        String[] parts = this.employeeCSV.tokens();
        
        String lastName = parts[2];

        return lastName;
    }

    public String getEmail(){
        String[] parts = this.employeeCSV.tokens();
        
        String email = parts[3];

        return email;
    }
}
