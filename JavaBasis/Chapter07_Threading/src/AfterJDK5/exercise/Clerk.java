package AfterJDK5.exercise;

/**
 * ClassName: Clerk
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/4 21:18
 */
public class Clerk implements Runnable{
    private int quantity = 0;

    @Override
    public void run() {}

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public synchronized void addQuantity() {

        if (quantity>=20) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            quantity++;
            System.out.println(Thread.currentThread().getName()+"生产了第"+quantity+"个产品");
            notifyAll();
        }

    }
    public synchronized void minusQuantity() {

        if (quantity<=0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println(Thread.currentThread().getName()+"消费了第"+quantity+"个产品");
            quantity--;
            notifyAll();
        }

    }
}
