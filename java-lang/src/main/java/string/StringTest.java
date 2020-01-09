package string;

import cn.hutool.core.lang.Assert;

import java.time.Duration;
import java.time.Instant;

/**
 * @author rockychen
 * @version 1.0
 * @date 2019-12-20 15:42
 */
public class StringTest {

    public static void main(String[] args) {
        String string = "rockychenrockychenrockychenrockychenroc" +
                "kychenrockychenrockychenrockychenrockychenrockychenroc" +
                "kychenrockychenrockychenrockychenrockychenrockychenrockyc" +
                "henrockychenrockychenrockychenrockychenrockychenrockychenrockyc" +
                "henrockychenrockychenrockychenrockychenrockychenrockychenrockychenrock" +
                "ychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockyche" +
                "nrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrocky" +
                "chenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenro" +
                "ckychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockych" +
                "enrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenroc" +
                "kychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockych" +
                "enrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenro" +
                "ckychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrocky" +
                "chenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockyche" +
                "nrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockyche" +
                "nrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychen" +
                "rockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychen" +
                "rockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenroc" +
                "kychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychenrockychen";

        String str = "rockychen";

        Instant start = Instant.now();

        //System.out.println(initials2UpperCaseByAscii(string));
        //System.out.println(initials2UpperCaseByUpperCase(string));
        initials2UpperCaseByAscii(string);//6
        //initials2UpperCaseByUpperCase(string);//11
        Instant end = Instant.now();
        System.out.println(Duration.between(start, end).toMillis());
    }

    /**
     * 首字母大写性能测试
     * ascii编码
     */
    private static String initials2UpperCaseByAscii(String str){
        Assert.notEmpty(str);
        // 进行字母的ascii编码前移，效率要高于截取字符串进行转换的操作
        char[] cs=str.toCharArray();

        if (97 <= cs[0] && cs[0] <= 122) {
            cs[0] ^= 32;
        }
        //cs[0]-=32;
        return String.valueOf(cs);
    }

    /**
     * 首字母大写性能测试
     * str.toUpperCase
     * @param str
     * @return
     */
    private static String initials2UpperCaseByUpperCase(String str){
        Assert.notEmpty(str);
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    private static void string(){
        String str = new String();

        StringBuffer buffer = new StringBuffer();

        StringBuilder builder = new StringBuilder();
    }

}
