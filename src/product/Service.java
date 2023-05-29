package product;

import java.util.List;

public interface Service {
    void addProduct(List<Product> products);
    void uppDateProducts(List<Product>productList);

    void chceckToManager(List<Product> list);


}
