package test.StreamTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Data 17:33 2021/11/18
 * @Author ZhangJR
 * @Description
 */
public class ReduceTest {
    public static void main(String[] args) {
        // test1
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("adden");
        stringList.add("banna");
        stringList.add("bununu");
        stringList.add("hasaki");
        Optional<String> reduce = stringList.stream().reduce((s1, s2) -> s1 + "," + s2);
        reduce.ifPresent(System.out::println);
    }
}
