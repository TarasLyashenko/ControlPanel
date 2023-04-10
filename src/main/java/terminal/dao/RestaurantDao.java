package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.ata285.Restaurant;

@Repository
public interface RestaurantDao extends CrudRepository<Restaurant, Long>
{
    Restaurant findByTitle(String title);
}
