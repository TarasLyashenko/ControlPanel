package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.ata283.House;

@Repository
public interface HouseDao extends CrudRepository<House, Long>
{
    House findByTitle(String title);
}
