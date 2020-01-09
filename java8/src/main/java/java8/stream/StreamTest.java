package java8.stream;

import cn.hutool.core.lang.Assert;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

    private static List<String> list= Arrays.asList("a","b","a","b","a");

    private static String keyword = "a";

    private static int testForEach(List<String> list){
        int count = 0;
        for(String s : list){
            if (s.contains(keyword)){
                count++;
            }
        }
        return count;
    }

    private static int testIterator(List<String> list){
        int count = 0;
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            if (s.contains(keyword)){
                count++;
            }
        }
        return count;
    }

    private static int testStream(List<String> list){
        return (int)list.stream().filter(s -> s.contains(keyword)).count();
    }

    public static void main(String[] args) {
        //常用方式语法对比
        System.out.println(testForEach(list)+"="+testIterator(list)+"="+testStream(list));

        // stream 特性
        // 1 惰性求值方法
        list.stream().filter(s -> {
            //不输出
            System.out.println(s);
            return s.contains(keyword);
        });

        // 2 及早求值方法
        list.stream().filter(s -> {
            //会输出
            System.out.println("count=="+s);
            return s.contains(keyword);
        }).count();

        /**
         * 判断一个方法是惰性爱是及早求值 如果返回值是Stream，就是惰性，否则就是及早求值
         * 整体过程与建造者模式相似
         */

        // collect 把Stream里的值生成一个列表 ，是一个及早求值操作
        System.out.println("test collect:");
        List<Integer> collected = Stream.of(1,2,3).collect(Collectors.toList());
        Assert.notEmpty(collected);

        // map 将一个流中的值转换成一个新的流
        System.out.println("test map:");
        List<String> newList = Stream.of("a","b","c").map(s -> s.toUpperCase()).collect(Collectors.toList());
        newList.forEach(s -> System.out.print(s));
        System.out.println();
        // filter
        testStream(list);

        // flatMap 可用Stream替换值，然后将多个Stream连接成一个Stream  ababade
        System.out.println("test flatMap:");
        List<String> stream = Stream.of(list,Arrays.asList("d","e")).flatMap(s -> s.stream()).collect(Collectors.toList());
        stream.forEach(s -> System.out.print(s));
        System.out.println();

        // max min
        System.out.println("test max:");
        System.out.println(collected.stream().max(Comparator.comparing(s-> s)).get());
        System.out.println("test min:");
        System.out.println(collected.stream().min(Comparator.comparing(s-> s)).get());

        System.out.println(Stream.of().max(Comparator.comparing(s->s.toString())).get());


        // reduce 该操作可以实现从一组值中生成一个值，比如 count 、 max 、min 这些都是reduce操作


    }
}
