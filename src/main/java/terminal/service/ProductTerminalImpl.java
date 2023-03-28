package terminal.service;

import terminal.dao.ProductDao;
import org.springframework.stereotype.Component;
import terminal.model.Product;

import javax.annotation.Resource;
import java.util.Scanner;

@Component
public class ProductTerminalImpl implements ProductTerminal
{

    @Resource
    private ProductDao productDao;

    @Override
    public void addProduct()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название продукта");
        String name = scanner.nextLine();
        System.out.println("Оно свежее?");
        boolean fresh = scanner.hasNextBoolean();

        Product product = new Product();
        product.setName(name);
        product.setFresh(fresh);

        productDao.save(product);

    }


    @Override
    public void showAllProduct()
    {

        for (Product product : productDao.findAll())
        {
            System.out.println(product);
        }
    }

}
