package terminal.model.ata282;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Comment
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String text;
    private String userName;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    @Override
    public String toString()
    {
        return "Comment{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", userName='" + userName + '\'' +
                ", post=" + post.getTitle() +
                '}';
    }
}
