package terminal.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.Animal;
import terminal.model.Product;

import java.util.List;

@Repository
public interface AnimalDao extends CrudRepository<Animal, Long>
{
    List<Animal> findByLive(Boolean live);
}
