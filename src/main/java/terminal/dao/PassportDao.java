package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import terminal.model.ata273.Passport;

public interface PassportDao extends CrudRepository<Passport, Long>
{
}
