package test.StreamTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @Data 17:25 2021/11/18
 * @Author ZhangJR
 * @Description
 */
public class MatchTest {
    public static void main(String[] args) {// test1
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("adden");
        stringList.add("banna");
        stringList.add("bununu");
        stringList.add("hasaki");
        // 验证 list 中 string 是否有以 a 开头的, 匹配到第一个，即返回 true
        boolean anyStartsWithA =
                stringList
                        .stream()
                        .anyMatch((s) -> s.startsWith("a"));

        System.out.println("验证 list 中 string 是否有以 a 开头的, 匹配到第一个，即返回 true:"+anyStartsWithA);      // true

// 验证 list 中 string 是否都是以 a 开头的
        boolean allStartsWithA =
                stringList
                        .stream()
                        .allMatch((s) -> s.startsWith("a"));

        System.out.println("验证 list 中 string 是否都是以 a 开头的:"+allStartsWithA);      // false

// 验证 list 中 string 是否都不是以 z 开头的,
        boolean noneStartsWithZ =
                stringList
                        .stream()
                        .noneMatch((s) -> s.startsWith("z"));

        System.out.println("验证 list 中 string 是否都不是以 z 开头的:"+noneStartsWithZ);
    }
}
