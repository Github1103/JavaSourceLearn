package test.FunctionalInterfaceTest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Data 16:12 2021/11/18
 * @Author ZhangJR
 * @Description 消费者函数式接口测试
 */
public class ConsumerTest {
    public static void main(String[] args) {
        // 只进不出是消费者,消费者购买商品
        Consumer<Product> consumer = product -> System.out.println("消费者购买了"+product.toString());
        Product product = new Product("奥利奥",10.1);
        consumer.accept(product);

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("巧克力",5.11));
        productList.add(new Product("蛋糕",2.11));
        productList.add(new Product("冰淇淋",3.11));
        // 消费者去消费一堆商品，每个商品遍历，依次消费掉
        Consumer<List<Product>> consumers = products -> products.forEach(consumer);
        consumers.accept(productList);
    }
}

class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
