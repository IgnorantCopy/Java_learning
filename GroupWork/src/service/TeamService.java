package service;

import domain.Architect;
import domain.Designer;
import domain.Employee;
import domain.Programmer;

/**
 * ClassName: TeamService
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/30 20:45
 */
public class TeamService {
    private static int counter = 1;
    private final int MAX_MEMBER = 5;
    private final Programmer[] team = new Programmer[MAX_MEMBER];
    private int total = 0;
    private int architectNum = 0;
    private int designerNum = 0;
    private int programmerNum = 0;

    public Programmer[] getTeam() {

        Programmer[] programmers = new Programmer[total];
        for (int i = 0; i < total; i++) {
            programmers[i] = team[i];
        }
        return programmers;

    }

    public void addMember(Employee employee) throws TeamException{
        if (total>=MAX_MEMBER) {
            throw new TeamException("成员已满，无法添加");
        }
        if (!(employee instanceof Programmer)) {
            throw new TeamException("该成员不是开发人员，无法添加");
        }
        Programmer programmer = (Programmer)employee;
        if (isExist(programmer)) {
            throw new TeamException("该员工已在本开发团队中");
        }else if (programmer.getStatus() == Status.BUSY) {
            throw new TeamException("该员工已是某团队成员");
        }else if (programmer.getStatus() == Status.VOCATION) {
            throw new TeamException("该员工正在休假，无法添加");
        }
        if (employee instanceof Architect) {
            this.architectNum++;
            if (architectNum > 1) {
                throw new TeamException("团队中至多只能有一名架构师");
            }
            team[total++] = programmer;
            programmer.setMemberId(counter++);
            programmer.setStatus(Status.BUSY);
            return;
        }
        if (employee instanceof Designer) {
            this.designerNum++;
            if (designerNum > 2) {
                throw new TeamException("团队中至多只能有两名设计师");
            }
            team[total++] = programmer;
            programmer.setMemberId(counter++);
            programmer.setStatus(Status.BUSY);
            return;
        }
        if (employee instanceof Programmer) {
            this.programmerNum++;
            if (programmerNum > 3) {
                throw new TeamException("团队中至多只能有三名程序员");
            }
            team[total++] = programmer;
            programmer.setMemberId(counter++);
            programmer.setStatus(Status.BUSY);
        }
    }

    private boolean isExist(Programmer programmer) {
        for (int i = 0; i < total; i++) {
            if (programmer.getId() == team[i].getId()) {
                return true;
            }
        }
        return false;
    }

    public void removeMember(int memberId) throws TeamException{
        int i = 0;
        for (; i < total; i++) {
            if (team[i].getMemberId() == memberId) {
                team[i].setStatus(Status.FREE);
                for (int j = i; j < total - 1; j++) {
                    team[j] = team[j + 1];
                }
                team[--total] = null;
                break;
            }
        }
        if (i == total) {
            throw new TeamException("找不到指定memberId的员工，删除失败");
        }
    }
}
