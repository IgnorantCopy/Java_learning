public class Account {
    public static void main(String[] args) {
        boolean flag = true;
        int in;
        int out;
        int money = 10000;
        java.lang.String addDescription;
        java.lang.String information = "";

        while(flag) {
            boolean flag_2 = true;
            boolean flag_3 = true;
            boolean flag_4 = true;
            System.out.println("-----------------谷粒记账软件-----------------\n");
            System.out.println("                 1.收支明细");
            System.out.println("                 2.登记收入");
            System.out.println("                 3.登记支出");
            System.out.println("                 4.退    出\n");
            System.out.println("请选择(1-4)：");
            char choice = Utility.readMenuSelection();
            switch(choice) {
                case '1':
                    System.out.println("-----------------当前收支明细记录-----------------");
                    System.out.println("收支\t账户金额\t收支金额\t说    明\n");
                    System.out.println(information);
                    break;

                case '2':
                    while(flag_2) {
                        flag_2 = true;
                        System.out.println("本次收入金额：");
                        in = Utility.readNumber();
                        if(in>=0) {
                            money+=in;
                        }else {
                            System.out.println("输入有误");
                            continue;
                        }
                        System.out.println("本次收入说明：");
                        addDescription = Utility.readString();
                        information += "收入\t"+money+"\t"+in+"\t"+addDescription+"\n";
                        flag_2 = false;
                    }
                    break;
                case '3':
                    while(flag_3) {
                        flag_3 = true;
                        System.out.println("本次支出金额：");
                        out = Utility.readNumber();
                        if(out>money) {
                            System.out.println("支出金额过大");
                            continue;
                        }else if(out>=0) {
                            money-=out;
                        }else {
                            System.out.println("输入有误");
                            continue;
                        }
                        System.out.println("本次支出说明：");
                        addDescription = Utility.readString();
                        information += "支出\t"+money+"\t"+out+"\t"+addDescription+"\n";
                        flag_3 = false;
                    }
                    break;
                case '4':
                    while(flag_4) {
                        flag_4 = true;
                        System.out.println("\n确认是否退出(Y/N)：");
                        char isExit = Utility.readConfirmSelection();
                        if(isExit=='Y') {
                            flag_4 = false;
                            flag = false;
                        }else if(isExit=='N') {
                            flag_4 = false;
                        }else {
                            System.out.println("输入有误");
                            continue;
                        }
                    }
                    break;

            }


        }
    }
}