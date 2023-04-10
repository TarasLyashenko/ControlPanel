package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import terminal.model.ata284.Quest;

public interface QuestDao extends CrudRepository<Quest, Long>
{
    Quest findByTitle(String title);
}
