package JUnit;

import domain.Employee;
import org.junit.jupiter.api.Test;
import service.NameListService;
import service.TeamException;

/**
 * ClassName: NameListServiceTest
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/30 21:01
 */
public class NameListServiceTest {
    @Test
    public void test1(){
        NameListService nameListService = new NameListService();
        Employee[] employees = nameListService.getAllEmployees();
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    @Test
    public void test2(){
        try {
            NameListService nameListService = new NameListService();
            int id = 3;
            Employee employee = nameListService.getEmployee(id);
            System.out.println(employee);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
    }
}
