package terminal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import terminal.MainProject.dao.RescuePodDao;
import terminal.MainProject.dao.StationDao;
import terminal.MainProject.dao.StationDepartmentDao;
import terminal.MainProject.dao.WorkerDao;
import terminal.MainProject.enumStation.TypeStation;
import terminal.MainProject.model.Station;

import javax.annotation.Resource;

@SpringBootApplication
public class DatabaseMain implements CommandLineRunner
{
    @Resource
    private StationDao stationDao;
    @Resource
    private StationDepartmentDao stationDepartmentsDao;
    @Resource
    private WorkerDao workerDao;
    @Resource
    private RescuePodDao rescuePodDao;

    public static void main(String[] args)
    {
        SpringApplication.run(DatabaseMain.class, args);
    }

    @Override
    public void run(String... args)
    {
        Station station = stationDao.findByTypeStation(TypeStation.BOX_STATION);
        System.out.println(station);
    }
}
