package terminal.model.ata277;

import lombok.Data;
import terminal.model.enums.RestaurantKitchen;

import javax.persistence.*;

@Data
@Entity
public class Restaurant
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;
    private String shortDescription;
    private String openingDate;
    private String address;
    @Enumerated(EnumType.STRING)
    private RestaurantKitchen restaurantKitchen;
    @OneToOne
    @JoinColumn(name = "director_id")
    private Director director;

}
