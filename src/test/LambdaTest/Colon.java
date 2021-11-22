package test.LambdaTest;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @Data 13:37 2021/11/18
 * @Author ZhangJR
 * @Description
 */
public class Colon extends Parent{
    private String name;
    public Colon(){

    }

    public Colon(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Function<Integer,Colon[]> function = Colon[]::new;
        Colon[] c = function.apply(5);
    }


    public void test(String[] args) {
        List<String> list =  Arrays.asList("a","b","c");
        BiConsumer<Test, String> print = Test::print;
        Consumer<String> print1 = super::print;
        Consumer<String> stringConsumer = new Colon()::print;
        list.forEach(super::print);
    }

    public void print(String s){
        System.out.println(s);
    }
}

final class Test{
    public void print(String s){
        System.out.println();
    }
}

class Parent{
    public void print(String s){
        System.out.println(s);
    }
}

interface ColonNoParam{
    Colon createColon();
}

interface ColonWithParam{
    Colon createColon(String s);
}


