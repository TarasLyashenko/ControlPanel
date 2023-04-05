package terminal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import terminal.dao.ActorDao;
import terminal.dao.QuestDao;
import terminal.model.ata281.Actor;
import terminal.model.ata281.Quest;

import javax.annotation.Resource;

@SpringBootApplication
public class DatabaseMain implements CommandLineRunner
{
    @Resource
    private QuestDao questDao;
    @Resource
    private ActorDao actorDao;

    public static void main(String[] args)
    {
        SpringApplication.run(DatabaseMain.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {

    }

}
