package collection.set;

import java.util.LinkedList;


public class LinkedHashSetTest {

    public void testAdd(){
        LinkedList<String> list = new LinkedList<>();
        list.add("zhangsan");
        list.add(1,"list");
        list.add(2,"wangwu");
        list.forEach(System.out::println);
    }


    public static void main(String[] args) {

    }

}
