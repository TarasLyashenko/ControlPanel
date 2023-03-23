import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        CriminalRecordsTerminalImpl criminalRecordsTerminal = new CriminalRecordsTerminalImpl();

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

