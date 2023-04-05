package terminal.model.ata281;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Quest
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private int price;
    private int numberGame;
    @OneToMany(mappedBy = "quest", fetch = FetchType.EAGER)
    List<Actor> actors;

    @Override
    public String toString()
    {
        return "Quest{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", numberGame=" + numberGame +
                '}';
    }
}
