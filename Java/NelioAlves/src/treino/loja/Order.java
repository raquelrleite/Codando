/*
package treino.loja;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date date;
    private OrderStatus status;
    private List<OrderItem> item = new ArrayList<>();


    public Order(Date date, OrderStatus status, List<OrderItem> items) {
        this.date = date;
        this.status = OrderStatus.PENDING_PAYMENT;
        this.item = item;
    }

    public void addItem(OrderItem item) {
        item.add(item);
    }

    public double total() {
        double sum = 0;
        for (OrderItem item : item) {
            sum += item.subTotal();
        }
        return sum;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
*/
