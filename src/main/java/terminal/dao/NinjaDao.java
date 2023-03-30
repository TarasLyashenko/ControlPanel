package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.spiderClan.Ninja;

import java.util.List;

@Repository
public interface NinjaDao extends CrudRepository<Ninja, Long>
{

    List<Ninja> findByName(String name);
}
