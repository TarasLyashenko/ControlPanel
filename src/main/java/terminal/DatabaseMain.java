package terminal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import terminal.dao.LaptopDao;
import terminal.dao.SmartphoneDao;
import terminal.model.electrinicshop.Laptop;
import terminal.model.electrinicshop.Smartphone;

import javax.annotation.Resource;
import java.util.Optional;


@SpringBootApplication
public class DatabaseMain implements CommandLineRunner
{
    @Resource
    private LaptopDao laptopDao;
    @Resource
    private SmartphoneDao smartphoneDao;

    public static void main(String[] args)
    {
        SpringApplication.run(DatabaseMain.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {
        for (Laptop laptop : laptopDao.findAll())
        {
            System.out.println(laptop);
        }

        for (Smartphone smartphone : smartphoneDao.findAll())
        {
            System.out.println(smartphone);
        }

    }
}
