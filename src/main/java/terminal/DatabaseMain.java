package terminal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import terminal.dao.WeaponDao;
import terminal.model.Weapon;

import javax.annotation.Resource;
import java.util.Optional;

@SpringBootApplication
public class DatabaseMain implements CommandLineRunner
{
    @Resource
    private WeaponDao weaponDao;

    public static void main(String[] args)
    {
        SpringApplication.run(DatabaseMain.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {
        Optional<Weapon> weaponDaoById = weaponDao.findById(28L);
        Weapon weapon = weaponDaoById.get();
        weapon.setTittle("Катана");
        weaponDao.save(weapon);

        for (Weapon weapon1 : weaponDao.findAll())
        {
            System.out.println(weapon1);
        }

    }
}
