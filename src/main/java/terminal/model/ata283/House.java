package terminal.model.ata283;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class House
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int yearOfConstruction;
    private String title;
    private int numberOfEntrance;

    @OneToMany(mappedBy = "house", fetch = FetchType.EAGER)
    List<Apartment> apartments;

    @Override
    public String toString()
    {
        return "House{" +
                "id=" + id +
                ", yearOfConstruction=" + yearOfConstruction +
                ", title='" + title + '\'' +
                ", numberOfEntrance=" + numberOfEntrance +
                '}';
    }
}
