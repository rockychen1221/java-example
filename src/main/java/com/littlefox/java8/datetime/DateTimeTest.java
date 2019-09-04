package com.littlefox.java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeTest {

    public static void main(String[] args) {
        //解析日期
        String dateStr= "2018年12月18日";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        LocalDate date= LocalDate.parse(dateStr, formatter);
        System.out.println(date);


        //解析日期
        String dateStr1= "1/12/2011";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate date1= LocalDate.parse(dateStr1, formatter1);
        System.out.println(date1);

        //日期转换为字符串
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh:mm a");
        String nowStr = now.format(format);
        System.out.println(nowStr);
    }
}
