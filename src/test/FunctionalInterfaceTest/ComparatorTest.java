package test.FunctionalInterfaceTest;

import java.util.Comparator;

/**
 * @Data 9:00 2021/11/19
 * @Author ZhangJR
 * @Description
 */
public class ComparatorTest {
    public static void main(String[] args) {
        Comparator<Human> comparator = (h1,h2) -> h1.getName().compareTo(h2.getName());

        Human h1 = new Human("zhangjr");
        Human h2 = new Human("zhangsan");

        int compare = comparator.compare(h1, h2);

        System.out.println(compare);
    }
}

class Human{
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
