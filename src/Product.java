import java.util.ArrayList;
import java.util.List;

/**
 * Created by Flop Coder on 7/6/14.
 */
public class Product {

    private String serialNumber;
    private String name;
    private String unitPrice;
    private String about;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }


    public static List<Product> creatShortList() {
        List<Product> products = new ArrayList<Product>();
        for (int i = 9; i >= 1; i--) {
            Product product = new Product();
            product.setName("Samsung_"+i);
            product.setSerialNumber("Serial_"+i);
            product.setUnitPrice("price_"+i);
            product.setAbout("about_"+i);
            products.add(product);
        }
        return products;
    }
}
