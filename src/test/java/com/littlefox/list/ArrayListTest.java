package com.littlefox.list;

import org.junit.Test;

import java.util.ArrayList;


public class ArrayListTest {

    @Test
    public void testAdd(){
        ArrayList<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add(1,"list");
        list.add(2,"wangwu");
        list.forEach(System.out::println);
    }



}
