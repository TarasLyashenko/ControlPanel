package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.ata283.Apartment;

@Repository
public interface ApartmentDao extends CrudRepository<Apartment, Long>
{
    Apartment findByPrice(int price);
}
