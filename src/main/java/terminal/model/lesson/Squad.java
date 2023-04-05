package terminal.model.lesson;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Squad
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "squad", fetch = FetchType.EAGER)
    List<Solder> solders;

    @Override
    public String toString()
    {
        return "Squad{" +
                "id=" + id +
                ", name='" + name;
    }
}
