package product.meatProduct;

import product.Product;

import java.time.LocalDate;

public abstract class meatProduct extends Product {
    public meatProduct (int id , String name , String companyName, LocalDate date){
        super(id, name, companyName, date);
    }
}
