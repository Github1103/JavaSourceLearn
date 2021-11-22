package test.StreamTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @Data 17:04 2021/11/18
 * @Author ZhangJR
 * @Description
 */
public class SortedTest {
    public static void main(String[] args) {
        // test1
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("akanha");
        stringList.add("sakula");
        stringList.add("hasaki");
        // 对StringList进行排序 正序
        stringList.stream().sorted(String::compareTo).forEach(System.out::println);
        // 倒序
        Comparator<String> comparator = (s1,s2) -> s2.compareTo(s1);
        stringList.stream().sorted(comparator).forEach(System.out::println);
    }
}
