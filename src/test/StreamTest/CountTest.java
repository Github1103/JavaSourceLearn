package test.StreamTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @Data 17:28 2021/11/18
 * @Author ZhangJR
 * @Description
 */
public class CountTest {
    public static void main(String[] args) {
        // test1
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("adden");
        stringList.add("banna");
        stringList.add("bununu");
        stringList.add("hasaki");
        //计数
        long count = stringList.stream().count();
        System.out.println("StringList包含元素个数："+count);
    }
}
