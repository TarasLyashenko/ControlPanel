package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.ata281.Quest;

@Repository
public interface QuestDao extends CrudRepository<Quest, Long>
{
    Quest findByTitle(String title);
}
