package test.StreamTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Data 16:53 2021/11/18
 * @Author ZhangJR
 * @Description stream的Filter测试
 */
public class FilterTest {
    public static void main(String[] args) {
        // test1
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("adden");
        stringList.add("banna");
        stringList.add("bununu");
        stringList.add("hasaki");
        //过滤是a开头的字符串
        Stream<String> a = stringList.stream().filter(s -> s.startsWith("a"));//入参是一个Predicate
        a.forEach(System.out::println);

        // test2
        List<Integer> integerList = new LinkedList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        //过滤所有小于3的数字
        Stream<Integer> integerStream = integerList.stream().filter(integer -> integer > 3);
        integerStream.forEach(System.out::println);
    }
}
