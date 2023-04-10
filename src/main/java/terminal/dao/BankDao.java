package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.ata287.Bank;

@Repository
public interface BankDao extends CrudRepository<Bank, Long>
{
    Bank findByTitle(String title);
}
