package treino.loja;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        OrderItem order = new OrderItem();


        product.setName("Chocolate");
        product.setPrice(4);

        order.setQuantity(7);

        System.out.println(order.subtotal(4,7));







    }
}
