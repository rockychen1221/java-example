package java8.datetime;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class DateTimeTest {

    public static void main(String[] args) {

        //LocalDate.now == new Date()
        LocalDate localDate = LocalDate.now();
        //LocalDate.now 实际调用了这个方法
        localDate = LocalDate.now(Clock.systemDefaultZone());
        //指定时间
        localDate = LocalDate.of(2020, 02, 18);
        //判断是不是闰年
        boolean isLeapYear =  localDate.isLeapYear();
        System.out.printf("%d是不是闰年？，%s\n", localDate.getYear(), isLeapYear ? "是" : "否");
        //两天后
        LocalDate twoDaysLate = localDate.plusDays(2);
        System.out.println("两天后:" + twoDaysLate);
        //两周后
        LocalDate twoWeeksLate = localDate.plusMonths(2);
        System.out.println("两周后:" + twoDaysLate);
        //两月后
        LocalDate twoMonthsLate = localDate.plusMonths(2);
        System.out.println("两月后:" + twoMonthsLate);
        //两年后
        LocalDate twoYearsLate = localDate.plusYears(2);
        System.out.println("两年后:" + twoYearsLate);
        //两天前
        LocalDate twoDaysBefore = localDate.minusDays(2);
        System.out.println("两天前:" + twoDaysBefore);
        //两周前
        LocalDate twoWeeksBefore = localDate.minusWeeks(2);
        System.out.println("两周前:" + twoWeeksLate);
        //两月前
        LocalDate twoMonthsBefore = localDate.minusMonths(2);
        System.out.println("两月前" + twoMonthsBefore);
        //两年前
        LocalDate twoYearsBefore = localDate.minusYears(2);
        System.out.println("两年前" + twoYearsBefore);
        LocalDate anyTime = LocalDate.now().withMonth(10).withDayOfMonth(1);
        System.out.println("指定日期：" + anyTime);
        //今年的第一天
        LocalDate firstDayOfYear = localDate.with(TemporalAdjusters.firstDayOfYear());
        System.out.println("今年的第一天：" + firstDayOfYear);
        //本月的最后一天, 类似的API还有很多
        LocalDate lastDayOfMonth = localDate.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("本月的最后一天:" + lastDayOfMonth);
        //获取两个LocalDate的时间间隔
        Period period = localDate.until(lastDayOfMonth);
        System.out.println("离本月最后一天还有多少天？" + period.getDays());

        //通过Period 设置时间，增减时间, localdate 其实也是加减的Period
        LocalDate minus = localDate.minus(Period.parse("P1Y2M3D"));
        System.out.println(minus);
        //判断当前时间是否在某个时间之前
        boolean isBefore = localDate.isBefore(minus);
        System.out.println(localDate + "是否在" + minus + "之前");

        //获取一天最开始的时间
        LocalDateTime localDateTime = localDate.atStartOfDay();
        System.out.println("一天的初始时间" + localDateTime);

        //指定某天的具体时间
        LocalDateTime atTime = localDate.atTime(5,6,7);
        System.out.println("指定一天的某个时间"  + atTime);


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


        /**
         * 1.Period
         * 2.Duration
         * 3.ChronoUnit
         */
        // 1
        LocalDate today = LocalDate.now();
        System.out.println("Today : " + today);
        LocalDate birthDate = LocalDate.of(1993, Month.OCTOBER, 19);
        System.out.println("BirthDate : " + birthDate);
        Period p = Period.between(birthDate, today);
        System.out.printf("年龄 : %d 年 %d 月 %d 日", p.getYears(), p.getMonths(), p.getDays());

        // 2
        Instant inst1 = Instant.now();
        System.out.println("Inst1 : " + inst1);
        Instant inst2 = inst1.plus(Duration.ofSeconds(10));
        System.out.println("Inst2 : " + inst2);

        System.out.println("Difference in milliseconds : " + Duration.between(inst1, inst2).toMillis());

        System.out.println("Difference in seconds : " + Duration.between(inst1, inst2).getSeconds());


        // 3 比较时间差
        DateTimeFormatter formatDataTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime time1 = LocalDateTime.parse("2020-02-18 14:30:30", formatDataTime);
        System.out.println(ChronoUnit.MINUTES.between(time1, LocalDateTime.now()));

    }
}
