package collection.list;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.LinkedList;


public class LinkedListTest {

    public static void main(String[] args) {

        Instant start = Instant.now();

        LinkedList<String> list = new LinkedList<String>();

        list.add("zhangsan");
        list.addFirst("lisi");
        list.add(2,"wangwu");
        list.add(2,"zhouzheng");
        list.addLast("rockychen");

        /**
         * element 和 peekFirst 检索但不删除此列表的头（第一个元素）。 peekLast 同理
         * pollFirst 检索并删除第一个元素 pollLast 同理
         */
        System.out.println(list.element());
        System.out.println(list.peekFirst());
        //System.out.println(list.pollFirst());

        /**
         * pop 删除list第一个元素
         * push 添加元素到list的第一个位置
         */
        System.out.println(list.pop());
        list.push("234");


        /**
         * set 替换
         * zhangsanfeng 替换 下标为1的zhangsan
         */
        list.set(1,"zhangsanfeng");

        list.addAll(Arrays.asList("zhaoliu","qianba"));

        Instant end = Instant.now();

        System.out.println(Duration.between(start, end).toMillis()/1000);
        /**
         * <p>
         *     输出结果顺序如下
         *     lisi
         *     zhangsan
         *     zhouzheng
         *     wangwu
         *     zhaoliu
         *     qianba
         *     可以看出来LinkedList是有序的，根据添加顺序以及添加时指定位置的顺序存储，而且还能自动扩容
         * </p>
         *
         */
        list.forEach(System.out::println);
    }

}
