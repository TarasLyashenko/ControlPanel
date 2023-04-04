package terminal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import terminal.dao.*;
import terminal.model.ata279.Cult;
import terminal.model.ata279.Cultist;
import terminal.model.ata279.God;
import terminal.model.enums.CultistMethodConvert;
import terminal.model.enums.TypeOfBloodGod;
import terminal.model.enums.TypeofCult;

import javax.annotation.Resource;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;
import java.util.Optional;

@SpringBootApplication
public class DatabaseMain implements CommandLineRunner
{
    @Resource
    private CultistDao cultistDao;
    @Resource
    private CultDao cultDao;
    @Resource
    private GodDao godDao;

    public static void main(String[] args)
    {
        SpringApplication.run(DatabaseMain.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {
        Optional<Cultist> cultistDaoById = cultistDao.findById(212L);
        Cultist cultist = cultistDaoById.get();
        System.out.println(cultist);

    }
}
