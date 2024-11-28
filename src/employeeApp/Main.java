package employeeApp;

public class Main
{

    private static void workWithData ()
    {
        Employee employee = new Employee(5,"Eray","erayinci99@gmail.com","asd123", new String[5]);
        employee.addHealthPlan(2,"a");
        employee.addHealthPlan(2,"b");
        employee.addHealthPlan(6,"c");
        System.out.println(employee);


    }

    public static void main(String[] args) {
        workWithData();
    }
}
