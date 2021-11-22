package test.FunctionalInterfaceTest;

import java.util.function.Function;

/**
 * @Data 15:33 2021/11/18
 * @Author ZhangJR
 * @Description 函数式接口测试
 */
public class FunctionTest {
    public static void main(String[] args) {
        // 字符串转数字
        Function<String,Integer> stringToInteger = Integer::valueOf;
        // 数转字符串
        Integer num = stringToInteger.apply("123");
        System.out.println("字符串转数字"+num.getClass()+num);
        // 数字转字符串
        Function<Integer,String> integerToString = String::valueOf;
        String str = integerToString.apply(111);
        System.out.println("数字转字符串"+str.getClass()+str);
        // 字符串转字再转字符串
        Function<String,String> StringUseless = stringToInteger.andThen(integerToString);
        System.out.println("字符串转数字再转字符串："+StringUseless.apply("10086").getClass());
        // 数字转字符串再转数字
        Function<Integer,Integer> IntegerUselses = stringToInteger.compose(integerToString);
        System.out.println("数字转字符串再转数字"+IntegerUselses.apply(12306).getClass());
        // 输入是什么，输出是什么
        System.out.println("输入是什么，输出是什么"+Function.identity().apply("hello").getClass());
    }
}
