package terminal.model.ata283;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Apartment
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int numberOfSquares;
    private int price;

    @ManyToOne
    @JoinColumn(name = "house_id")
    private House house;

    @Override
    public String toString()
    {
        return "Apartment{" +
                "id=" + id +
                ", numberOfSquares=" + numberOfSquares +
                ", price=" + price +
                ", house=" + house.getTitle() +
                '}';
    }
}
