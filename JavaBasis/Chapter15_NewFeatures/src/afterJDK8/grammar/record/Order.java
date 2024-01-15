package afterJDK8.grammar.record;

import java.util.Objects;

/**
 * ClassName: Order
 * Description:
 *
 * @author Ignorant
 * @create 2024/1/14 11:13
 */
public class Order {
    // 属性: 用 private final 修饰
    private final int orderId;
    private final String orderName;

    // 构造器中初始化属性
    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    // 提供舒总的getter方法
    public int getOrderId() {
        return orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    //equals()和hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;
        return getOrderId() == order.getOrderId() && Objects.equals(getOrderName(), order.getOrderName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrderId(), getOrderName());
    }

    // toString()
    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderName='" + orderName + '\'' +
                '}';
    }
}
