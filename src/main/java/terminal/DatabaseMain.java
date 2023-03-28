package terminal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import terminal.dao.NinjaDao;
import terminal.dao.ShipDao;
import terminal.model.spiderClan.Ninja;
import terminal.model.spiderClan.Ship;

import javax.annotation.Resource;
import java.util.Optional;


@SpringBootApplication
public class DatabaseMain implements CommandLineRunner
{
    @Resource
    private NinjaDao ninjaDao;
    @Resource
    private ShipDao shipDao;

    public static void main(String[] args)
    {
        SpringApplication.run(DatabaseMain.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {
        for (Ninja ninja : ninjaDao.findAll())
        {
            System.out.println(ninja);
        }

        for (Ship ship : shipDao.findAll())
        {
            System.out.println(ship);
        }


    }
}
