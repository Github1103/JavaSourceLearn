package test.StreamTest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * @Data 17:11 2021/11/18
 * @Author ZhangJR
 * @Description
 */
public class MapTest {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("adden");
        stringList.add("banna");
        stringList.add("bununu");
        stringList.add("hasaki");
        // map接收一个Function入参，接收一个数，然后处理之后，再输出.
        Function<String,String> function = String::toUpperCase;
        stringList.stream().map(function).forEach(System.out::println);
    }
}
