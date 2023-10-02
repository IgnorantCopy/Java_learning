package initialize;

/**
 * ClassName: initialize.ClassArrays
 * Description: 5.1.1.3
 *
 * @author Ignorant
 * @create 2023/10/2 13:19
 */
public class ClassArrays {
    public static void main(String[] args) {
        Student[] students = new Student[20];

        for(int i = 0;i < students.length;i++) {
            students[i] = new Student();
            students[i].num = i + 1;
            students[i].grade = (int)(Math.random() * 6 + 1);
            students[i].score = (int)(Math.random() * 101);
        }


        //打印3年级学生的信息
        for(int i = 0;i < students.length;i++) {
            if (students[i].grade == 3) {
                students[i].show();
            }
        }
        System.out.println("---------------------");
        //按学生成绩排序，并遍历学生信息
        Student t;
        for(int i = 0;i < students.length - 1;i++) {
            for(int j = 0;j < students.length - i - 1;j++) {
                if(students[j].score > students[j + 1].score) {
                    t = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = t;
                }
            }
        }
        for(int i = 0;i < students.length;i++) {
            students[i].show();
        }
    }
}
