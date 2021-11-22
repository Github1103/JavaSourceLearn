package test.forVSforeach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Data 10:19 2021/11/22
 * @Author ZhangJR
 * @Description
 */
public class forVsforeach {
    public static void main(String[] args) {
        forVsforeach forVsforeach = new forVsforeach();
        List<Integer> integerArrayList  = new ArrayList<>();
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        for (int i = 0; i< 100000;i++){
            integerArrayList.add(i);
            integerLinkedList.add(i);
        }
        System.out.printf("for循环针对ArrayList:%dms\n",forVsforeach.forList(integerArrayList));
        System.out.printf("for循环针对LinkedList:%dms\n",forVsforeach.forList(integerLinkedList));
        System.out.printf("foreach循环针对ArrayList:%dms\n",forVsforeach.foreachList(integerArrayList));
        System.out.printf("foreach循环针对LinkedList:%dms\n",forVsforeach.foreachList(integerLinkedList));
    }

    public long forList(List<Integer> list){
        long startTime = System.nanoTime();
        Integer n;
        for (int i = 0; i<list.size();i++){
            n = list.get(i);
        }
        long endTime = System.nanoTime();
        return TimeUnit.NANOSECONDS.toMillis(endTime-startTime);
    }

    public long foreachList(List<Integer> list){
        long startTime = System.nanoTime();
        Integer n;
        for (Integer i : list){
            n = i;
        }
        long endTime = System.nanoTime();
        return TimeUnit.NANOSECONDS.toMillis(endTime-startTime);
    }

}
