package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.spiderClan.Ninja;

@Repository
public interface NinjaDao extends CrudRepository<Ninja, Long>
{

}
