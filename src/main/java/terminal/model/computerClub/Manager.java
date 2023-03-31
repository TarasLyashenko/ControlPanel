package terminal.model.computerClub;

import lombok.Data;
import terminal.model.enums.ManagerState;

import javax.persistence.*;

@Data
@Entity
public class Manager
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private int age;
    private double workExperience;
    @Enumerated(EnumType.STRING)
    private ManagerState currentState;

    @Override
    public String toString()
    {
        return  id + " | " +
                name + " | " +
                age  + " | " +
                workExperience + " | " +
                currentState;
    }
}
