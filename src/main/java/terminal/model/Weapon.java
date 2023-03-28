package terminal.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Weapon
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String tittle;
    private int quantity;

    @Override
    public String toString()
    {
        return tittle + " | " +
                quantity + " | " +
                id;
    }
}
