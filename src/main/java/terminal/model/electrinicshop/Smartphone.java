package terminal.model.electrinicshop;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Smartphone
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;
    private int price;
    private int quantity;

    @Override
    public String toString()
    {
        return  id + " | " +
                title + " | " +
                price + " | " +
                quantity;
    }
}
