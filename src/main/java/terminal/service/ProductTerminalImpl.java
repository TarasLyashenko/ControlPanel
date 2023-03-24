package terminal.service;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import terminal.model.Animal;
import terminal.model.Product;
import terminal.rowmappers.AnimalRowMapper;
import terminal.rowmappers.ProductRowMapper;

import javax.annotation.Resource;
import java.util.List;
import java.util.Scanner;

@Component
public class ProductTerminalImpl implements ProductTerminal
{
    @Resource
    private JdbcTemplate jdbcTemplate;
    @Resource
    private ProductRowMapper productRowMapper;
    @Resource
    private AnimalRowMapper animalRowMapper;

    @Override
    public void addProduct()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название продукта");
        String name = scanner.nextLine();
        System.out.println("Оно свежее?");
        boolean fresh = scanner.hasNextBoolean();

        jdbcTemplate.update("INSERT INTO product " +
                        "(name,fresh)" +
                        " VALUES (?, ?)",
                name, fresh);
    }


    @Override
    public void showAllProduct()
    {
        List<Product> listProduct = jdbcTemplate.query("SELECT * FROM product", productRowMapper);

        for (Product product : listProduct)
        {
            System.out.println(product);
        }
    }

    @Override
    public void addAnimal()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название животного");
        String name = scanner.nextLine();
        System.out.println("Оно свежее?");
        boolean live = scanner.hasNextBoolean();

        jdbcTemplate.update("INSERT INTO animal " +
                        "(name,live)" +
                        " VALUES (?, ?)",
                name, live);
    }

    @Override
    public void showAllAnimal()
    {
        List<Animal> listAnimal = jdbcTemplate.query("SELECT * FROM animal", animalRowMapper);

        for (Animal animal : listAnimal)
        {
            System.out.println(animal);
        }
    }
}
