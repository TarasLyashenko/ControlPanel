package terminal.model;

import lombok.Data;
import terminal.model.enums.ProductStatus;

import javax.persistence.*;

@Data
@Entity
public class Product
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    @Enumerated(EnumType.STRING)
    private ProductStatus status;

    @Override
    public String toString()
    {
        return name + " | " +
                status + " | " +
                id;
    }
}
