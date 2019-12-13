package com.littlefox.java8.datetime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeTest {

    public static void main(String[] args) {
        //解析日期
        String dateStr = "2018年12月18日";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        LocalDate date = LocalDate.parse(dateStr, formatter);
        System.out.println(date);


        //解析日期
        String dateStr1 = "1/12/2011";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate date1 = LocalDate.parse(dateStr1, formatter1);
        System.out.println(date1);

        //解析日期
        String dateStr2 = "2019-10-21";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date2 = LocalDate.parse(dateStr2, formatter2);
        System.out.println(date2);

        //日期转换为字符串
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh:mm a");
        String nowStr = now.format(format);
        System.out.println(nowStr);

        String timestamp = "2003-07-16";
        Date date3 = new Date(timestamp);
        SimpleDateFormat fomat2 = new SimpleDateFormat("yyyy-MM-dd");
        String mydate = fomat2.format(date3);
    }
}
