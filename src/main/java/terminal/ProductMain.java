package terminal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import terminal.service.ProductTerminalImpl;

import javax.annotation.Resource;
import java.util.Scanner;

@SpringBootApplication
public class ProductMain implements CommandLineRunner
{
    private static Scanner scanner = new Scanner(System.in);
    @Resource
    private ProductTerminalImpl productTerminal;


    @Override
    public void run(String... args) throws Exception
    {

        while (true)
        {
            System.out.println("Приветствую в менеджере продуктов \n" +
                    "1 - Добавить продукт\n" +
                    "2 - Показать продукты\n" +
                    "3 - Добавить животное\n" +
                    "4 - Показать животное ");
            String userText = scanner.nextLine();
            if (userText.equals("1"))
            {
                productTerminal.addProduct();
            }
            else if (userText.equals("2"))
            {
                productTerminal.showAllProduct();
            }
            else if (userText.equals("3"))
            {
                productTerminal.addAnimal();
            }
            else if (userText.equals("4"))
            {
                productTerminal.showAllAnimal();
            }
        }
    }
}
