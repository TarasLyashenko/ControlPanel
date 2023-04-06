package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.ata282.Post;

@Repository
public interface PostDao extends CrudRepository<Post, Long>
{
    Post findByTitle(String title);
}
