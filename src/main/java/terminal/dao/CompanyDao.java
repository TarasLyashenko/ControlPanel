package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.ata276.Company;

@Repository
public interface CompanyDao extends CrudRepository<Company, Long>
{
}
