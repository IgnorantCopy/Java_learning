package AfterJDK5.exercise;

/**
 * ClassName: Test
 * Description:
 *  生产者(Producer)将产品交给店员(Clerk)，而消费者(Customer)从店员处取走产品，
 *  店员一次只能持有固定数量的产品(比如:20），如果生产者试图生产更多的产品，店员会叫生产者停一下，
 *  如果店中有空位放产品了再通知生产者继续生产；如果店中没有产品了，店员会告诉消费者等一下，如果店中有产品了再通知消费者来取走产品。
 * @author Ignorant
 * @create 2023/10/4 21:17
 */
public class Test {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer producer1 = new Producer(clerk);
        Producer producer2 = new Producer(clerk);
        Customer customer1 = new Customer(clerk);
        Customer customer2 = new Customer(clerk);
        Thread thread1 = new Thread(producer1);
        Thread thread2 = new Thread(producer2);
        Thread thread3 = new Thread(customer1);
        Thread thread4 = new Thread(customer2);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
