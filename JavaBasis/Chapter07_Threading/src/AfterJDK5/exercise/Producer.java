package AfterJDK5.exercise;

/**
 * ClassName: Producer
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/4 21:19
 */
public class Producer implements Runnable{
    private Clerk clerk;

    public Producer() {}
    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("生产者生产产品...");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.addQuantity();
        }
    }
}
