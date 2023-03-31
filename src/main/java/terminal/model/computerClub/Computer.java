package terminal.model.computerClub;

import lombok.Data;
import terminal.model.enums.ComputerGameStatus;

import javax.persistence.*;

@Data
@Entity
public class Computer
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private double timeLeft;

    private int number;

    private boolean power;

    @Enumerated(EnumType.STRING)
    private ComputerGameStatus whatGameStart;

    @Override
    public String toString()
    {
        return "Computer{" +
                "id=" + id +
                ", timeLeft=" + timeLeft +
                ", number=" + number +
                ", power=" + power +
                ", whatGameStart=" + whatGameStart +
                '}';
    }
}
