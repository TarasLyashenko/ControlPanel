import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CriminalRecordsTerminalImpl implements CriminalRecordsTerminal
{
    private static final String CORRECT_CODE = "выавыар";
    private boolean power;
    private boolean access;
    private List<Employee> employees = new ArrayList<>();

    public List<Employee> getEmployees()
    {
        return employees;
    }

    public void setEmployees(List<Employee> employees)
    {
        this.employees = employees;
    }

    @Override
    public void showAllEmployeeOnDisplay()
    {
        for (Employee showEmployee : employees)
        {
            System.out.println(showEmployee);
        }
    }

    @Override
    public void setAccessCard(String card)
    {
        if (card.equals(CORRECT_CODE))
        {
            access = true;
            System.out.println("Доступ разрешен");
        }
        else
        {
            System.out.println("Неправильный код");
            access = false;
        }
    }

    @Override
    public void addEmployee()
    {
        Scanner scanner = new Scanner(System.in);

        if (!access)
        {
            System.out.println("Доступ запрещен");
        }
        else
        {
            System.out.println("Введите имя сотрудника");
            String nameEmployee = scanner.nextLine();
            System.out.println("Введите уникальный номер сотрудника");
            int idEmployee = Integer.parseInt(scanner.nextLine());
            System.out.println("Введите пол сотрудника");
            String genderEmployee = scanner.nextLine();
            System.out.println("Введите возраст сотрудника");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Введите должность сотрудника");
            String assignmentEmployee = scanner.nextLine();
            System.out.println("Введите уникальный код отпечатков пальцев");
            String fingerprintEmployee = scanner.nextLine();
            System.out.println("Введите психический статус сотрудника");
            String physicalStatusEmployee = scanner.nextLine();
            System.out.println("Введите ментальный статус");
            String mentalStatusEmployee = scanner.nextLine();

            Employee employee = new Employee(nameEmployee, idEmployee, genderEmployee, age,
                    assignmentEmployee, fingerprintEmployee, physicalStatusEmployee,
                    mentalStatusEmployee);
            employees.add(employee);
        }
    }


    public boolean isPower()
    {
        return power;
    }

    public void setPower(boolean power)
    {
        this.power = power;
    }

    public boolean isAccess()
    {
        return access;
    }

    public void setAccess(boolean access)
    {
        this.access = access;
    }
}
