package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.electrinicshop.Laptop;

@Repository
public interface LaptopDao extends CrudRepository<Laptop, Long>
{
}
