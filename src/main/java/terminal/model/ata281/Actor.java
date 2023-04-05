package terminal.model.ata281;

import lombok.Data;
import terminal.model.lesson.Squad;

import javax.persistence.*;

@Entity
@Data
public class Actor
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private int age;
    private double workExperience;
    @ManyToOne
    @JoinColumn(name = "quest_id")
    private Quest quest;

    @Override
    public String toString()
    {
        return "Actor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", workExperience=" + workExperience +
                ", quest=" + quest.getTitle() +
                '}';
    }
}
