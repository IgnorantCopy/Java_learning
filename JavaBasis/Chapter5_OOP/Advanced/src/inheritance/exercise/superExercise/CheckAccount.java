package inheritance.exercise.superExercise;

/**
 * ClassName: CheckAccount
 * Description:
 *  2、创建Account类的一个子类CheckAccount代表可透支的账户，该账户中定义一个属性overdraft代表可透支限额。
 *    在CheckAccount类中重写withdraw方法，其算法如下：
 *    如果（取款金额 < 账户余额），
 *   	 可直接取款
 *    如果（取款金额 > 账户余额），
 *   	 计算需要透支的额度
 *   	 判断可透支额overdraft是否足够支付本次透支需要，如果可以
 *   		将账户余额修改为0，冲减可透支金额
 *   	 如果不可以
 *   		提示用户超过可透支额的限额
 * @author Ignorant
 * @create 2023/10/2 21:03
 */
public class CheckAccount extends Account{
    private double overdraft;

    public CheckAccount(int id, double balance, double annualInterestRate,double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdarft() {
        return overdraft;
    }

    public void setOverdarft(double overdarft) {
        this.overdraft = overdarft;
    }

    public void withdraw(double out){
        if(out < getBalance()) {
            super.withdraw(out);
        }else {
            if(out - getBalance() < overdraft) {
                overdraft -= out - getBalance();
                super.withdraw(getBalance());
            }else {
                System.out.println("超过可透支额！");
            }
        }
    }

    public void show() {
        System.out.println("您的账户余额：" + getBalance());
        System.out.println("您的可透支额：" + overdraft);
    }
}
