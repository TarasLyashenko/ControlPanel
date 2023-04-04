package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.test.Address;

@Repository
public interface AddressDao extends CrudRepository<Address, Long>
{

}
