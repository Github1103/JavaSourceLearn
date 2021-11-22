package test.FunctionalInterfaceTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

/**
 * @Data 11:52 2021/11/22
 * @Author ZhangJR
 * @Description
 */
public class BiPredicateTest {
    public static void main(String[] args) {
        List<Domain> DomainList = Arrays.asList(new Domain("zhangjr",22),new Domain("sdaf",18),new Domain("zhangjr",23),new Domain("youpeng",22));
        BiPredicate<String,Integer> biPredicate = (name,age) -> name.startsWith("z") && age >= 10;
        List<Domain> domains = BiPredicateTest.testPerson(DomainList, biPredicate);
        System.out.println(domains);
    }

    public static <T extends Domain> List<T> testPerson(List<T> list, BiPredicate<String, Integer> bi){
        List<T> result = list.stream()
                .filter(x -> bi.test(x.getName(), x.getAge()))
                .collect(Collectors.toList());
        return result;
    }


}
class Domain {
    private String name;
    private Integer age;

    public Domain(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Domain{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

