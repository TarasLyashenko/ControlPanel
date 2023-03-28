package terminal.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String gender;
    private int age;
    private String assignment;
    private String fingerprint;
    private String physicalStatus;
    private String mentalStatus;

    @Override
    public String toString()
    {
        return id + " | " +
                name + " | " +
                gender + " | " +
                age + " | " +
                assignment + " | " +
                fingerprint + " | " +
                physicalStatus + " | " +
                mentalStatus;
    }
}
