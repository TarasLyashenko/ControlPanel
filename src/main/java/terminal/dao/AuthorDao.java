package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import terminal.model.ata278.Author;

import javax.annotation.Resource;

@Resource
public interface AuthorDao extends CrudRepository<Author, Long>
{

}
