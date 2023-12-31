package domain;

import service.Status;

/**
 * ClassName: Programmer
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/30 20:37
 */
public class Programmer extends Employee{
    private int memberId;  //TID
    private Status status = Status.FREE;
    private Equipment equipment;

    public Programmer() {}
    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }
    public int getMemberId() {
        return memberId;
    }
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public Equipment getEquipment() {
        return equipment;
    }
    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }
    @Override
    public String toString() {
        return getDetails() + "\t程序员\t" + status + "\t\t\t" + equipment.getDescription();
    }

    public String getDetailsForTeam() {
        return memberId + "/" + getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary();
    }

    public String toStringForTeam() {
        return getDetailsForTeam() + "\t程序员";
    }
}
