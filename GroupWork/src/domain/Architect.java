package domain;

/**
 * ClassName: Architect
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/30 20:36
 */
public class Architect extends Designer{
    private int stock;

    public Architect() {}
    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    @Override
    public String toString() {
        return getDetails() + "\t架构师\t" + getStatus() + "\t" + getBonus()
                + "\t" + getStock() + "\t" + getEquipment().getDescription();
    }

    public String toStringForTeam() {
        return getDetailsForTeam() + "\t架构师\t" + getBonus() + "\t" + getStock();
    }
}
