package terminal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import terminal.dao.*;
import terminal.model.ata277.Bio;
import terminal.model.ata277.Director;
import terminal.model.ata277.Restaurant;
import terminal.model.ata278.Author;
import terminal.model.ata278.Quest;
import terminal.model.ata278.Scenario;
import terminal.model.enums.*;

import javax.annotation.Resource;
import java.util.Optional;

@SpringBootApplication
public class DatabaseMain implements CommandLineRunner
{
    @Resource
    private QuestDao questDao;
    @Resource
    private ScenarioDao scenarioDao;
    @Resource
    private AuthorDao authorDao;

    public static void main(String[] args)
    {
        SpringApplication.run(DatabaseMain.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {
        Optional<Quest> questDaoById = questDao.findById(209L);
        Quest quest = questDaoById.get();
        System.out.println(quest);
    }
}
