package product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class ServiceProductImpl implements Service {
    private final List<Product> listProduct = new ArrayList<>();
    Manager manager = new Manager();
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";

    @Override
    public void addProduct(List<Product> products) {
        products.stream().forEach(new Consumer<Product>() {
            @Override
            public void accept(Product product) {
                products.stream().filter(r -> r.getCompanyName().equals("TOIBOSS")
                                || r.getCompanyName().equals("MILKA")
                                || r.getCompanyName().equals("NUR"))
                        .filter(s -> s.getDate().minusMonths(1).isAfter(LocalDate.now())).forEach(System.out::println);
                listProduct.addAll(products);
            }
        });
    }

    @Override
    public void uppDateProducts(List<Product> productList) {
        List<Product> products = productList.stream().filter(r -> r.getDate().isBefore(LocalDate.now())).toList();
        System.out.println(ANSI_RED + "Продукты с истекшим сроком годности " + ANSI_RED);
        productList.forEach(System.out::println);
        productList.removeIf(p -> p.getDate().isBefore(LocalDate.now()));
        List<Product> productList1 = listProduct.stream().filter(x -> x.getCompanyName()
                .equals("TOIBOSS") || x.getCompanyName().equals("NUR") || x.getCompanyName().equals("MILKA")
        ).filter(o -> !o.getDate().isAfter(LocalDate.now().plusDays(7))).toList();
        System.err.println(ANSI_GREEN + " Красная цена! скидка) "
                + ANSI_GREEN);
        productList1.forEach(System.out::println);
    }

    @Override
    public void chceckToManager(List<Product> list) {
        boolean orFalse = false;
        for (;true;){
        Scanner scanner = new Scanner(System.in);
        System.out.println(ANSI_YELLOW + "login :" + ANSI_YELLOW);
        String login = scanner.nextLine();
        System.out.println(ANSI_YELLOW + "password : " + ANSI_YELLOW);
        String password = scanner.nextLine();
        orFalse = true;
        if (login.equals(Manager.getLogin()) && password.equals(Manager.getPassword())) {
            System.out.println(ANSI_GREEN + "Welcome : " + login + ANSI_GREEN);
            addProduct(list);
            uppDateProducts(list);
        } else {
            orFalse = false;
            System.out.println("Неправильный логин и пароль! ");
        }
        if (orFalse){
            break;
            }
        }
}}



