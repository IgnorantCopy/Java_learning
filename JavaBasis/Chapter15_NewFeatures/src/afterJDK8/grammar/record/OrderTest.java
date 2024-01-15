package afterJDK8.grammar.record;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

/**
 * ClassName: OrderTest
 * Description:
 *
 * @author Ignorant
 * @create 2024/1/14 11:22
 */
public class OrderTest {
    // Order
    @Test
    public void test1(){
        Order order1 = new Order(1001, "orderAA");
        // toString()
        System.out.println(order1);
        // getter()
        System.out.println(order1.getOrderId());
        System.out.println(order1.getOrderName());

        Order order2 = new Order(1001, "orderAA");
        // equals()
        System.out.println(order1.equals(order2));
        // hashCode()和equals()
        HashSet<Order> set = new HashSet<>();
        set.add(order1);
        set.add(order2);
        System.out.println(set);
    }

    // OrderRecord
    @Test
    public void test2(){
        OrderRecord order1 = new OrderRecord(1001, "orderAA");
        // toString()
        System.out.println(order1);
        // getter()
        System.out.println(order1.orderId());
        System.out.println(order1.orderName());

        OrderRecord order2 = new OrderRecord(1001, "orderAA");
        // equals()
        System.out.println(order1.equals(order2));
        // hashCode()和equals()
        HashSet<OrderRecord> set = new HashSet<>();
        set.add(order1);
        set.add(order2);
        System.out.println(set);
    }

    @Test
    public void test3(){
        Class<Person> clazz = Person.class;
        System.out.println(clazz.getSuperclass());
    }
}
