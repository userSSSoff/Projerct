package product.dairyProduct;

import product.Product;

import java.time.LocalDate;

public abstract class dairyProduct extends Product {
    public dairyProduct (int id, String name, String companyName, LocalDate date){
        super(id,name,companyName,date);
    }
}
