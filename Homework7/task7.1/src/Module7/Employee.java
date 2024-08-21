package Module7;

import java.util.Objects;

public abstract class Employee implements Payment {
   private final String employeeId;
   private final String name;




    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;


    }

    public String report(){
        return "";
    }




    public String getName() {
        return name;
    }





    @Override
    public int hashCode() {
        return Objects.hash(employeeId, name);
    }


}

