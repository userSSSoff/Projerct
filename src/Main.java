import product.MyRuntimeException;
import product.Product;
import product.ServiceProductImpl;
import product.dairyProduct.kefir;
import product.dairyProduct.milk;
import product.dairyProduct.yogurt;
import product.meatProduct.fish;
import product.meatProduct.meatBeef;
import product.meatProduct.sausages;
import product.wheatProduct.bread;
import product.wheatProduct.flour;
import product.wheatProduct.pasta;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ServiceProductImpl serviceProduct = new ServiceProductImpl();
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        list.add(new fish(1, "FISH", "TOIBOSS", LocalDate.of(2023, 3, 10)));
        list.add(new fish(2, "FISH2", "TOISS", LocalDate.of(2023, 4, 20)));
        list.add(new fish(3, "FISH3", "TOIBOSS", LocalDate.of(2023, 4, 13)));
        list.add(new meatBeef(9, "MEAT.BEEf", "TOIBOSS", LocalDate.of(2023, 3, 7)));
        list.add(new meatBeef(4, "MEAT.BEEF2", "TOIBOSS", LocalDate.of(2023, 7, 2)));
        list.add(new meatBeef(5, "MEAT.BEEF3", "TOIBOSS", LocalDate.of(2023, 4, 3)));
        list.add(new sausages(3, "SAUSAGE", "TOIBOSS", LocalDate.of(2022, 3, 2)));
        list.add(new sausages(3, "SAUSAGE2", "TOIBOSS", LocalDate.of(2023, 4, 1)));
        list.add(new sausages(3, "SAUSAGE3", "TOIBOSS", LocalDate.of(2023, 5, 2)));

        list.add(new kefir(9, "KEFIR", "MILKA", LocalDate.of(2020, 2, 1)));
        list.add(new kefir(99, "KEFIR2", "MILKA", LocalDate.of(2023, 2, 3)));
        list.add(new kefir(3, "MILK", ",MILKA", LocalDate.of(2023, 1, 1)));
        list.add(new milk(1, "MILK2", "MILKA", LocalDate.of(2023, 1, 1)));
        list.add(new yogurt(23, "SOURCREAM", "MILKA", LocalDate.of(2022, 3, 4)));

        list.add(new bread(8, "BREAD", "NUR", LocalDate.of(2023, 6, 7)));
        list.add(new bread(8, "BREAD2", "NUR", LocalDate.of(2023, 6, 7)));
        list.add(new pasta(4, "PASTA", "NUR", LocalDate.of(2021, 2, 2)));
        list.add(new pasta(4, "PASTA", "NUR", LocalDate.of(2021, 3, 2)));
        list.add(new flour(2, "FLOUR", "NUR", LocalDate.of(2023, 5, 5)));

        try {
            serviceProduct.chceckToManager(list);
        } catch (MyRuntimeException e){
            System.out.println(e.getMessage());
        }




}}