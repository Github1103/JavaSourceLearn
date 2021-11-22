package test.FunctionalInterfaceTest;

import java.util.Optional;

/**
 * @Data 9:11 2021/11/19
 * @Author ZhangJR
 * @Description
 */
public class OptionalTest {
    public static void main(String[] args) {
        String str =  "boom";
        Optional<String> optional = Optional.of(str); // Optional的初始化方法
        boolean isNull = optional.isPresent();//判断是否为空
        String str1 = optional.get();//获取数据，如果为空，抛出NoSuchElementException("No value present");
        optional.ifPresent(s -> System.out.println(s.toUpperCase()));//传入数据，然后输出
    }
}
