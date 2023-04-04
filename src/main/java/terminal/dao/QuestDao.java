package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import terminal.model.ata278.Quest;

public  interface QuestDao extends CrudRepository<Quest, Long>
{

}
