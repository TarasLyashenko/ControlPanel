package terminal.model.lesson;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Solder
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private int age;

    @ManyToOne
    @JoinColumn(name = "squad_id")
    private Squad squad;

    @Override
    public String toString()
    {
        return "Solder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", squad=" + squad.getName() +
                '}';
    }
}
