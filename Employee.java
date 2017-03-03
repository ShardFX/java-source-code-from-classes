import java.util.Date;

public class Employee
{
    private static final double BASE_SALARY = 15000.00;
    private String name;
    private double salary;
    private String birthDate;

    public Employee()
    {
        name = null;
    }

    public Employee(String name, double salary, String DoB)
    {
        this.name = name;
        this.salary = salary;
        this.birthDate = DoB;
    }

    public Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name, String DoB)
    {
        this.name = name;
        birthDate = DoB;
    }

    public String toString()
    {
        return ("Name is: " + name + "\nsalary is: " + salary + "\nbirth date is: " + birthDate + "\n");
    }

}
