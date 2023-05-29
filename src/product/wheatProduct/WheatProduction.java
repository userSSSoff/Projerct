package product.wheatProduct;

import product.Product;

import java.time.LocalDate;

public abstract class WheatProduction extends Product {
    public WheatProduction(int id , String name, String companyName, LocalDate date){
        super(id, name, companyName, date);
    }
}
