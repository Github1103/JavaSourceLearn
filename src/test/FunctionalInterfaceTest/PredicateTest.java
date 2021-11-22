package test.FunctionalInterfaceTest;

import java.util.function.Predicate;

/**
 * @Data 15:18 2021/11/18
 * @Author ZhangJR
 * @Description 函数式接口断言测试
 */
public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> lengthgtZero = (str) -> str.length() > 0;
        Predicate<String> lengthltTen = (str) -> str.length() < 10;
        String str = "Hello_World_My_Dear";
        // str的长度是不是大于0且小于10
        boolean test = lengthgtZero.and(lengthltTen).test(str);
        System.out.println("str的长度是不是大于0且小于10"+test);
        // str的长度是不是大于0或者小于10
        boolean test1 = lengthgtZero.or(lengthltTen).test(str);
        System.out.println("str的长度是不是大于0或者小于10"+test1);
        // str长度是不是小于0
        boolean test2 = lengthgtZero.negate().test(str);
        System.out.println("str长度是不是小于0"+test2);
    }
}
