package test.StreamTest;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * @Data 9:33 2021/11/19
 * @Author ZhangJR
 * @Description
 */
public class ParallelStreamTest {
    public static List<String> getList(){
        int max = 1000000;
        List<String> values = new ArrayList<>(max);
        for (int i =0 ; i< max;i++){
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }
        return values;
    }

    public static void main(String[] args) {
        List<String> values = getList();
        System.out.println("顺序流用时为："+stream(values.stream())+"ms");
        System.out.println("并行流用时为："+stream(values.parallelStream())+"ms");
    }

    public static long stream(Stream<String> stream) {
        long t0 = System.nanoTime();
        long count = stream.sorted().count();
        System.out.println(count);
        long t1 = System.nanoTime();
        long  millis = TimeUnit.NANOSECONDS.toMillis(t1 -t0);
        return millis;
    }
}
