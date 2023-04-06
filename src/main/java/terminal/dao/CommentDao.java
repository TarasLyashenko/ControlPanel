package terminal.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import terminal.model.ata282.Comment;

@Repository
public interface CommentDao extends CrudRepository<Comment, Long>
{
    Comment findByText(String text);
}
