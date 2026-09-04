import java.util.Scanner;

class Employee
{
    private String employeeName;
    private String department;
    private String designation;
    private String email;
    private long employeeId;
    private double salary;

    Employee()
    {
        System.out.println("A new default object is created");
    }

    // Copy Constructor
    Employee(Employee other)
    {
        System.out.println("A new copy object is created");

        this.employeeName = other.employeeName;
        this.employeeId = other.employeeId;
        this.email = other.email;
        this.designation = other.designation;
        this.salary = other.salary;
        this.department = other.department;
    }

    Employee(long employeeId, String employeeName, String department,
             String designation, String email, double salary)
    {
        System.out.println("A new employee object is created with values");

        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.email = email;
        this.designation = designation;
        this.salary = salary;
        this.department = department;
    }

    void getData(Scanner s)
    {
        s.nextLine(); // Clear buffer

        System.out.println("Enter Employee Name:");
        employeeName = s.nextLine();

        System.out.println("Enter Department:");
        department = s.nextLine();

        System.out.println("Enter Designation:");
        designation = s.nextLine();

        System.out.println("Enter Email:");
        email = s.nextLine();

        System.out.println("Enter Employee Id:");
        employeeId = s.nextLong();

        System.out.println("Enter Salary:");
        salary = s.nextDouble();
    }

    
    public String getEmployeeName()
    {
        return employeeName;
    }

    public String getDepartment()
    {
        return department;
    }

    public String getDesignation()
    {
        return designation;
    }

    public String getEmail()
    {
        return email;
    }

    public long getEmployeeId()
    {
        return employeeId;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setEmployeeName(String employeeName)
    {
        this.employeeName = employeeName;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    public void setDesignation(String designation)
    {
        this.designation = designation;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setEmployeeId(long employeeId)
    {
        this.employeeId = employeeId;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return "\nEmployee Id : " + employeeId
             + "\nEmployee Name : " + employeeName
             + "\nDesignation : " + designation
             + "\nDepartment : " + department
             + "\nSalary : " + salary
             + "\nEmail : " + email;
    }
}


public class EmployeeDemo
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        // Default Constructor
        Employee e1 = new Employee();

        // Taking data from user
        e1.getData(s);

        System.out.println("\nEmployee 1 Details:");
        System.out.println(e1);

        Employee e2 = new Employee(
                102,
                "Deep",
                "IT",
                "Web Developer",
                "deepjaiswal330@gmail.com",
                50000
        );

        System.out.println("\nEmployee 2 Details:");
        System.out.println(e2);

        
        Employee e3 = new Employee(e2);

        System.out.println("\nEmployee 3 Details (Copied from Employee 2):");
        System.out.println(e3);

        s.close();
    }
}
