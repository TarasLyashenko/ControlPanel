package terminal;

import java.util.Scanner;
import javax.annotation.Resource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import terminal.rowmappers.EmployeeRowMapper;
import terminal.service.CriminalRecordsTerminalImpl;

@SpringBootApplication
public class CriminalRecordsMain implements CommandLineRunner
{
    private final Scanner scanner = new Scanner(System.in);

    @Resource
    private CriminalRecordsTerminalImpl criminalRecordsTerminal;

    public static void main(String[] args)
    {
        SpringApplication.run(CriminalRecordsMain.class, args);
    }

    @Override
    public void run(String... args)
    {
        while (true)
        {
            {
                System.out.println("Терминал охраны v2.3.5\n" +
                    "1 - Разблокировать доступ\n" +
                    "2 - Добавить нового сотрудника\n" +
                    "3 - Показать всех сотрудников");

                String userText = scanner.nextLine();
                if (userText.equals("1"))
                {
                    System.out.println("Введите код доступа");
                    String checkCard = scanner.nextLine();
                    criminalRecordsTerminal.setAccessCard(checkCard);
                }
                else if (userText.equals("2"))
                {
                    if (!criminalRecordsTerminal.isAccess())
                    {
                        System.out.println("Ошибка, консоль заблокирована");
                    }
                    else
                    {
                        criminalRecordsTerminal.addEmployee();
                    }

                }
                else if (userText.equals("3"))
                {
                    if (!criminalRecordsTerminal.isAccess())
                    {
                        System.out.println("Ошибка, консоль заблокирована");
                    }
                    else
                    {
                        criminalRecordsTerminal.showAllEmployeeOnDisplay();
                    }
                }
            }
        }
    }
}
