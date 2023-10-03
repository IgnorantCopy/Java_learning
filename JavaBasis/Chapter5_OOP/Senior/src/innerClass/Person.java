package innerClass;

/**
 * ClassName: Person
 * Description: 5.3.4
 *
 * @author Ignorant
 * @create 2023/10/3 14:20
 */
public class Person {  //外部类
    String name = "Tom";
    int age;

    public void eat() {
        System.out.println("人吃饭");
    }

    //静态成员内部类
    static class Dog{
        public void eat() {
            System.out.println("狗吃骨头");
        }
    }

    //非静态成员内部类
    class Bird{

        String name = "啄木鸟";

        public void eat() {
            System.out.println("鸟吃虫子");
        }

        public void show1(String name) {
            System.out.println("age = " + age);  //省略了Person.this.
            System.out.println("name = " + name);
            System.out.println("name = " + this.name);
            System.out.println("name = " + Person.this.name);

        }

        public void show2() {
            eat();
            this.eat();
            Person.this.eat();
        }

    }

    //提供接口的实现类的匿名对象
    @SuppressWarnings("rawtypes")
    public Comparable getInstance() {
//		//局部内部类
//		class MyComparable implements Comparable{
//
//			@Override
//			public int compareTo(Object o) {
//				return 0;
//			}
//
//			return new MyComparable();
//
//		}

        //提供接口的匿名实现类的匿名对象
        return new Comparable(){
            @Override
            public int compareTo(Object o) {
                return 0;
            }

        };
    }

    {
        @SuppressWarnings({ "hiding", "unused" })
        //局部内部类
        class InnerClass{

        }
    }
}
