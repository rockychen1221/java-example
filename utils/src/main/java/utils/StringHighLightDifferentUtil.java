package utils;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

/**
 * 传入2个字符串进行相比高亮显示
 * 例如
 * 原数据一:王五张三
 * 原数据二:张三李四
 * <span style='color:blue'>王五</span>张三
 * 张三<span style='color:blue'>李四</span>
 */
public class StringHighLightDifferentUtil {

    public static String[] getHighLightDifferent(String a,String b){
        if (StringUtils.isBlank(a)||StringUtils.isBlank(b)){
            return new String[2];
        }

        String[] temp=getDiff(a, b);
        String[] result={getHighLight(a, temp[0]),getHighLight(b, temp[1])};
        return result;
    }

    private static String getHighLight(String source,String temp){
        StringBuffer sb=new StringBuffer();
        char[] sourceChars=source.toCharArray();
        char[] tempChars=temp.toCharArray();
        boolean flag=false;
        for(int i=0;i<sourceChars.length;i++){
            if(tempChars[i]!=' '){
                if(i==0) sb.append("<span style='color:red'>").append(sourceChars[i]);
                else if(flag) sb.append(sourceChars[i]);
                else sb.append("<span style='color:red'>").append(sourceChars[i]);
                flag=true;
                if(i==sourceChars.length-1) sb.append("</span>");
            }
            else if(flag==true){
                sb.append("</span>").append(sourceChars[i]);
                flag=false;
            }else sb.append(sourceChars[i]);
        }
        return sb.toString();
    }
    public static String[] getDiff(String a, String b) {
        String[] result = null;
        //选取长度较小的字符串用来穷举子串
        if (a.length() < b.length()) {
            result = getDiff(a, b, 0, a.length());
        } else {
            result = getDiff(b, a, 0, b.length());
            result = new String[]{result[1],result[0]};
        }
        return result;
    }

    //将a的指定部分与b进行比较生成比对结果
    private static String[] getDiff(String a, String b, int start, int end){
        String[] result = new String[]{a, b};
        int len = result[0].length();
        while (len > 0) {
            for (int i = start; i < end - len + 1; i++) {
                String sub = result[0].substring(i, i + len);
                int idx = -1;
                if ((idx = result[1].indexOf(sub)) != -1) {
                    result[0] = setEmpty(result[0], i, i + len);
                    result[1] = setEmpty(result[1], idx, idx + len);
                    if (i > 0) {
                        //递归获取空白区域左边差异
                        result = getDiff(result[0], result[1], 0, i);
                    }
                    if (i + len < end) {
                        //递归获取空白区域右边差异
                        result = getDiff(result[0], result[1], i + len, end);
                    }
                    len=0;//退出while循环
                    break;
                }
            }
            len = len / 2;
        }
        return result;
    }

    //将字符串s指定的区域设置成空格
    public static String setEmpty(String s, int start, int end) {
        char[] array = s.toCharArray();
        for (int i = start; i < end; i++) {
            array[i] = ' ';
        }
        return new String(array);
    }

    public static void main(String[] args) {
        String a="金属新材料、非金属新材料的技术开发与销售；国内贸易；无线影音传输产品、电子产品、拍摄装备、摄像机产品、安防产品的技术开发与销售，无人飞行器系统、飞行器、有人驾驶飞机、卫星、直升机、自转旋翼飞机、航空电子设备及设备、手机的技术开发与销售（不含限制项目），计算机软件的技术开发、购销（不含专营、专控、专卖商品）；芯片设计、生产、销售；经营进出口业务（均不含限制项目及专营、专控、专卖商品）；信息咨询（不含人才中介服务及其他限制项目）；兴办实业（具体项目另行申报）；自有房屋租赁。（法律、行政法规、国务院决定禁止的项目除外，限制的项目须取得许可后方可经营）";
        String b="金属新材料、非金属新材料的技术开发与销售；国内贸易；无线影音传输产品、电子产品、拍摄装备、摄像机产品、安防产品的技术开发与销售，无人飞行器系统、飞行器、有人驾驶飞机、卫星、直升机、自转旋翼飞机、航空电子设备及设备、手机的技术开发与销售（不含限制项目），计算机软件的技术开发、购销（不含专营、专控、专卖商品）；无人机技术服务、技术咨询；芯片设计、生产、销售；经营进出口业务（均不含限制项目及专营、专控、专卖商品）；信息咨询（不含人才中介服务及其他限制项目）；兴办实业（具体项目另行申报）；自有房屋租赁。（法律、行政法规、国务院决定禁止的项目除外，限制的项目须取得许可后方可经营）";

        a="2018-12-19";
        b="2019-05-17";

        Arrays.stream(StringHighLightDifferentUtil.getHighLightDifferent(a, b)).forEach(s->{
            System.out.println(s);
        });
    }

}