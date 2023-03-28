package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.Weapon;

@Repository
public interface WeaponDao extends CrudRepository<Weapon, Long>
{

}
