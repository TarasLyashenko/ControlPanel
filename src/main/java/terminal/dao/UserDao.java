package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.ata272.User;

@Repository
public interface UserDao extends CrudRepository<User, Long>
{

}
