package view;

import domain.Employee;
import domain.Programmer;
import service.NameListService;
import service.TeamException;
import service.TeamService;

/**
 * ClassName: TeamView
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/30 20:55
 */
public class TeamView {
    private final NameListService listService = new NameListService();
    private final TeamService teamService = new TeamService();

    public void enterMainMenu() {
        boolean flag = true;
        while(flag) {
            listAllEmployees();
            char key = TSUtility.readMenuSelection();
            System.out.println();
            switch (key) {
                case '1':
                    getTeam();
                    break;
                case '2':
                    addMember();
                    break;
                case '3':
                    removeMember();
                    break;
                case '4':
                    System.out.println("确认是否退出(Y/N)：");
                    char confirm = TSUtility.readConfirmSelection();
                    if (confirm == 'Y') {
                        flag = false;
                    }
                    break;
            }
        }
    }

    private void listAllEmployees() {
        System.out.println("-----------------------------------优尚开发团队调度系统------------------------------------\n");
        System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
        Employee[] employees = listService.getAllEmployees();
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.print("1-团队列表  2-添加团队成员  3-删除团队成员 4-退出   请选择(1-4)：");
    }

    private void getTeam() {
        System.out.println("--------------------团队成员列表---------------------\n");
        System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票");
        Programmer[] team = teamService.getTeam();
        for (Programmer programmer : team) {
            System.out.println(programmer.toStringForTeam());
        }
        System.out.println("-----------------------------------------------------");
        TSUtility.readReturn();
    }

    private void addMember() {
        System.out.println("---------------------添加成员---------------------");
        System.out.println("请输入要添加的员工ID：");
        int id = TSUtility.readInt();
        try {
            Employee employee = listService.getEmployee(id);
            teamService.addMember(employee);
            System.out.println("添加成功");
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
        TSUtility.readReturn();
    }

    private void removeMember() {
        System.out.println("---------------------删除成员---------------------");
        System.out.println("请输入要删除员工的TID：");
        int id = TSUtility.readInt();
        System.out.println("确认是否删除(Y/N)：");
        char confirm = TSUtility.readConfirmSelection();
        if (confirm == 'N') {
            return;
        }
        try {
            teamService.removeMember(id);
            System.out.println("删除成功");
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
        TSUtility.readReturn();
    }

    public static void main(String[] args) {
        TeamView myTeamView = new TeamView();
        myTeamView.enterMainMenu();
    }
}
