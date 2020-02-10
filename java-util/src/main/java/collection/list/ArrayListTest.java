package collection.list;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author rockychen
 * @version 1.0
 * @date 2020-01-03 15:22
 */
public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(3);
        list.add("zhangsan");
        list.add(0,"lisi");
        list.add(2,"wangwu");
        list.add(2,"zhouzheng");
        list.addAll(Arrays.asList("zhaoliu","qianba"));

        /**
         * <p>
         *     输出结果顺序如下
         *     lisi
         *     zhangsan
         *     zhouzheng
         *     wangwu
         *     zhaoliu
         *     qianba
         *     可以看出来list是有序的，根据添加顺序以及添加时指定位置的顺序存储，而且还能自动扩容
         * </p>
         *
         */
        list.forEach(System.out::println);
    }

}
