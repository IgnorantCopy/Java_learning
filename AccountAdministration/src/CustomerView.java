/**
 * ClassName: CustomerView
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/30 20:17
 */
public class CustomerView {
    CustomerList customerlist = new CustomerList(10);

    public void enterMianMenu() {
        boolean flag = true;
        while (flag) {
            System.out.println("-----------------拼电商客户管理系统-----------------");
            System.out.println("                 1 添 加 客 户");
            System.out.println("                 2 修 改 客 户");
            System.out.println("                 3 删 除 客 户");
            System.out.println("                 4 客 户 列 表");
            System.out.println("                 5 退     出\n");
            System.out.print("                 请选择(1-5)：");
            char key = CMUtility.readMenuSelection();

            switch(key) {
                case '1':
                    this.addNewCustomer();
                    break;
                case '2':
                    this.modifyCustomer();
                    break;
                case '3':
                    this.deleteCustomer();
                    break;
                case '4':
                    this.listAllCustomers();
                    break;
                case '5':
                    boolean flag_5 = true;
                    while(flag_5) {
                        System.out.print("确认是否退出(Y/N)：");
                        char isExit = CMUtility.readConfirmSelection();
                        if (isExit == 'Y') {
                            flag_5 = false;
                            flag = false;
                        }else if (isExit == 'N') {
                            flag_5 = false;
                        }else {
                            System.out.println("输入非法，请重新输入！");
                        }
                    }
                    break;
            }

        }
    }

    public void addNewCustomer() {
        System.out.println("---------------------添加客户---------------------");
        System.out.print("姓名：");
        String name = CMUtility.readString(4);
        System.out.print("性别：");
        char gender = CMUtility.readChar();
        System.out.print("年龄：");
        int age = CMUtility.readInt();
        System.out.print("电话：");
        String phone = CMUtility.readString(12);
        System.out.print("邮箱：");
        String email = CMUtility.readString(20);
        Customer cust = new Customer(name,gender,age,phone,email);
        if(customerlist.addCustomer(cust)) {
            System.out.println("---------------------添加完成---------------------");
        }else {
            System.out.println("人数已满，无法添加！");
        }
    }

    public void modifyCustomer() {
        boolean flag_2 = true;
        while(flag_2) {
            System.out.println("---------------------修改客户---------------------");
            System.out.print("请选择待修改客户编号(-1退出)：");
            int index = CMUtility.readInt();
            if (index == -1) {
                flag_2 = false;
            }else {
                Customer cust = customerlist.getCustomer(index - 1);
                if (cust == null) {
                    System.out.println("未找到该客户！");
                }else {
                    System.out.print("姓名(" + cust.getName() + ")：");
                    String name = CMUtility.readString(4, cust.getName());
                    System.out.print("性别(" + cust.getGender() + ")：");
                    char gender = CMUtility.readChar(cust.getGender());
                    System.out.print("年龄(" + cust.getAge() + ")：");
                    int age = CMUtility.readInt(cust.getAge());
                    System.out.print("电话(" + cust.getPhone() + ")：");
                    String phone = CMUtility.readString(12, cust.getPhone());
                    System.out.print("邮箱(" + cust.getEmail() + ")：");
                    String email = CMUtility.readString(20 ,cust.getEmail());
                    cust = new Customer(name, gender, age, phone, email);

                    if(customerlist.replaceCustomer(index - 1, cust)) {
                        System.out.println("---------------------修改完成---------------------");
                        flag_2 = false;
                    }else {
                        System.out.println("未找到该客户！");
                    }
                }
            }
        }
    }

    public void deleteCustomer() {
        boolean flag_3 = true;
        while(flag_3) {
            System.out.println("---------------------修改客户---------------------");
            System.out.print("请选择待修改客户编号(-1退出)：");
            int index = CMUtility.readInt();
            if (index == -1) {
                flag_3 = false;
            }else{
                Customer cust = customerlist.getCustomer(index - 1);
                if (cust == null) {
                    System.out.println("未找到该客户！");
                }else {
                    System.out.print("确认是否删除(Y/N)：");
                    char isDelete = CMUtility.readConfirmSelection();
                    if(isDelete == 'Y') {
                        if(customerlist.deleteCustomer(index - 1)) {
                            System.out.println("---------------------删除完成---------------------");
                            flag_3 = false;
                        }else {
                            System.out.println("未找到该客户！");
                        }
                    }else if(isDelete == 'N') {
                        flag_3 = false;
                    }else {
                        System.out.println("输入非法，请重新输入！");
                    }
                }
            }
        }
    }

    public void listAllCustomers() {
        System.out.println("---------------------------客户列表---------------------------\n");
        Customer[] custs = customerlist.getAllCustomers();
        if(custs.length == 0) {
            System.out.println("没有客户记录！");
        }else {
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t\t邮箱");
            for(int i = 0; i < custs.length; i++) {
                System.out.println("" + (i + 1) + "\t" + custs[i].getName() + "\t" + custs[i].getGender() + "\t"
                        + custs[i].getAge() + "\t" + custs[i].getPhone() + "\t\t" + custs[i].getEmail());
            }
            System.out.println("\n-------------------------客户列表完成-------------------------");
        }

    }

    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMianMenu();
    }
}
