package test.FunctionalInterfaceTest;

import java.util.Random;
import java.util.function.Supplier;

/**
 * @Data 16:30 2021/11/18
 * @Author ZhangJR
 * @Description 生产者函数式接口
 */
public class SupplierTest {
    public static void main(String[] args) {
        // 女娲造人
        Supplier<Person> nvwa = Person::new;
        // 女娲随机造人，男女不知
        System.out.println(nvwa.get().getSex());
        System.out.println(nvwa.get().getSex());
        System.out.println(nvwa.get().getSex());
        System.out.println(nvwa.get().getSex());
    }
}


class Person{
    private String sex;

    public Person() {
        Random random = new Random();
        if (random.nextInt(2)!= 0){ //[0,2)的整数，只有0&1
            this.sex = "female";
        }else {
            this.sex = "male";
        }
    }

    public String getSex() {
        return sex;
    }
}
