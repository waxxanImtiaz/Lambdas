package functional;

import java.util.Set;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.List;  
import java.util.ArrayList;  
class ProductP{
    int id;
    String name;
    float price;

    public ProductP(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class CollectorsExample {  
    public static void main(String[] args) {  
        List<ProductP> productsList = new ArrayList<ProductP>();
        //Adding Products  
        productsList.add(new ProductP(1,"HP Laptop",25000f));
        productsList.add(new ProductP(2,"Dell Laptop",30000f));
        productsList.add(new ProductP(3,"Lenevo Laptop",28000f));
        productsList.add(new ProductP(4,"Sony Laptop",28000f));
        productsList.add(new ProductP(5,"Apple Laptop",90000f));

        List<ProductP> integer = productsList.stream().filter((p)-> p.price>30000F).collect(Collectors.toList());
        integer.forEach(productP -> System.out.println(productP.name));
    }  
}  
