package terminal.model.test;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Theater
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;
    private String description;
    private int yearOfCreation;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

}
