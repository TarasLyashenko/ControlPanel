package terminal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import terminal.dao.*;
import terminal.model.Employee;
import terminal.model.airport.Plane;

import javax.annotation.Resource;
import java.util.List;


@SpringBootApplication
public class DatabaseMain implements CommandLineRunner
{
    @Resource
    private DispatcherDao dispatcherDao;
    @Resource
    private PlaneDao planeDao;
    @Resource
    private NinjaDao ninjaDao;
    @Resource
    private EmployeeDao employeeDao;
    @Resource
    private ProductDao productDao;
    @Resource
    private AnimalDao animalDao;

    public static void main(String[] args)
    {
        SpringApplication.run(DatabaseMain.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {
        Employee byFingerprint = employeeDao.findByFingerprint("8424sfd3");
        System.out.println(byFingerprint);
    }

}
