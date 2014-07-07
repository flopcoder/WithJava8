import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Flop Coder on 7/6/14.
 */
public class Main {

    public static void main(String[] args) {
        /********************Runable class***************************/
        /*Without lamda expression*/
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("With Runnable -1");
            }
        };

        /*With Lamda Expression*/
        Runnable r2 = () -> System.out.println("With Runnable -2");

        r1.run();
        r2.run();

        /*********************Comparator Lamda**************************/

        /*Sorting products without lamda*/
        List<Product> products = Product.creatShortList();
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getSerialNumber().compareTo(o2.getSerialNumber());
            }
        });

        System.out.println("Sorted Products");

        /*Normally*/
        for (Product product : products) {
            System.out.println(product.getSerialNumber());
        }
        /* In lamda expression*/
        products.forEach((Product product) -> System.out.println(product.getSerialNumber()));

        /*Sorted desc order according to name and with lamda expression*/
        Collections.sort(products, (Product p1, Product p2) -> p2.getName().compareTo(p1.getName()));

        System.out.println("Sorted Products");
        products.forEach((Product product) -> System.out.println(product.getName()));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        /*Eta expression in functional programming*/
        numbers.forEach(System.out::println);

        System.out.println("Sum of Numbers :: " + sum(numbers, n -> n < 4 && n % 2 == 0));

        //With custom functional interfaces
        printRole(()-> System.out.println("Here is Role"));

    }

    public static void printRole(Role role)
    {
        role.printRole();
    }
    public static int sum(List<Integer> numbers, Predicate<Integer> p) {
        int total = 0;
        for (int number : numbers) {
            if (p.test(number)) {
                total += number;
            }
        }
        return total;
    }
}
