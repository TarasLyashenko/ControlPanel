package terminal.model.ata282;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class Post
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDateTime timePost;
    private String title;
    private int price;

    @OneToMany(mappedBy = "post", fetch = FetchType.EAGER)
    List<Comment> comments;

    @Override
    public String toString()
    {
        return "Post{" + "id=" + id + ", timePost=" + timePost + ", price=" + price + '}';
    }
}
