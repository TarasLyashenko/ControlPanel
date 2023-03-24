package terminal.rowmappers;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import terminal.model.Animal;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class AnimalRowMapper implements RowMapper<Animal>
{
    @Override
    public Animal mapRow(ResultSet rs, int rowNum) throws SQLException
    {
        Animal animal = new Animal();
        String name = rs.getString("name");
        Boolean live = rs.getBoolean("live");

        animal.setName(name);
        animal.setLive(live);

        return animal;
    }
}
