package ru.job4j.pojo;

public class Shop {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        Shop shop = new Shop();
        shop.delete(products, 0);
        shop.print(products);

    }

    public Product[] delete(Product[] products, int index) {
        products[index] = null;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                for (int j = i; j < products.length - 1; j++) {
                    products[j] = products[j + 1];
                }
                products[products.length - 1] = null;
            }
        }
        return products;
    }

    public void print(Product[] products) {
        for (Product product : products) {
            if (product == null) {
                System.out.println((Object) null);
                continue;
            }
            System.out.println(product.getName());
        }
    }
}