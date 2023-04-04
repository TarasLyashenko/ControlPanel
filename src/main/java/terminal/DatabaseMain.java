package terminal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import terminal.dao.*;
import terminal.model.ata272.Smartphone;
import terminal.model.ata272.User;
import terminal.model.ata273.Passport;
import terminal.model.ata274.AccessCard;
import terminal.model.ata275.MedicalCard;
import terminal.model.enums.AccessCardAccessLevel;
import terminal.model.enums.EmployeePhysicalStatus;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.Optional;


@SpringBootApplication
public class DatabaseMain implements CommandLineRunner
{
    @Resource
    private SmartphoneDao smartphoneDao;
    @Resource
    private UserDao userDao;
    @Resource
    private PassportDao passportDao;
    @Resource
    private AccessCardDao accessCardDao;
    @Resource
    private MedicalCardDao medicalCardDao;

    public static void main(String[] args)
    {
        SpringApplication.run(DatabaseMain.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {
        Optional<User> userDaoById = userDao.findById(194L);
        User user = userDaoById.get();
        System.out.println(user);
    }

}
