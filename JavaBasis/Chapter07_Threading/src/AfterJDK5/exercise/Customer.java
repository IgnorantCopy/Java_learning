package AfterJDK5.exercise;

/**
 * ClassName: Customer
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/4 21:19
 */
public class Customer implements Runnable{
    private Clerk clerk;

    public Customer() {}
    public Customer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("消费者消费产品...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.minusQuantity();
        }
    }
}
