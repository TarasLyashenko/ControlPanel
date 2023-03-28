package terminal.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.Animal;

@Repository
public interface AnimalDao extends CrudRepository<Animal, Long>
{

}
