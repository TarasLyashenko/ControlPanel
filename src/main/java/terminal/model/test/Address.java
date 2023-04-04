package terminal.model.test;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Address
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String street;
    private String city;
}
