package functional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Driver {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Mobile",5));
        products.add(new Product("Laptop",4));
        products.add(new Product("Cup",7));
        products.add(new Product("Door",2));
        products.add(new Product("Table",8));
        String s = "pakistan";


        Collections.sort(products, Comparator.comparing(Product::getName));
        products.stream().forEach((product -> System.out.println(product.getName())));
    }
}


class Product{
    private String name;
    private int id;

    Product(){

    }
    Product(String name,int id){
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
