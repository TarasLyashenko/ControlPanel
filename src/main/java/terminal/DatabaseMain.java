package terminal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import terminal.dao.ApartmentDao;
import terminal.dao.HouseDao;
import terminal.model.ata283.Apartment;
import terminal.model.ata283.House;

import javax.annotation.Resource;

@SpringBootApplication
public class DatabaseMain implements CommandLineRunner
{
    @Resource
    private HouseDao houseDao;
    @Resource
    private ApartmentDao apartmentDao;

    public static void main(String[] args)
    {
        SpringApplication.run(DatabaseMain.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {
        House house = houseDao.findByTitle("Питерский дворик");
        for (Apartment apartment : house.getApartments())
        {
            System.out.println(apartment.getPrice());
        }
    }

}
