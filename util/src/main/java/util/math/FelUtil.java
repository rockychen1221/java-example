/*
 * All rights Reserved, Designed By DataDriver
 * Copyright:    DataDriver.Inc
 * Company:      Zhuo Wo Infomation Technology (ShangHai) CO.LTD
 */
package util.math;

import cn.hutool.core.collection.CollectionUtil;
import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.exception.ParseException;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Optional;

/**
 * @Author: rockychen
 * @Description: fel工具
 */
public class FelUtil {

    private static FelEngine fel = FelEngine.instance;

    /**
     * 计算
     * @param formula
     * @param param
     * @return
     */
    public static String evaluate(String formula, HashMap<String, String> param){
        if (!checkFormula(formula)|| CollectionUtil.isEmpty(param)) {
            return null;
        }
        FelContext ctx = fel.getContext();
        param.forEach((k,v)->{
            ctx.set(k, NumberUtils.createBigDecimal(v));
        });
        return Optional.ofNullable(fel.eval(formula, ctx)).orElse("").toString();
    }

    /**
     * 检查计算公式是否正确
     * @param formula
     * @return
     */
    public static boolean checkFormula(String formula) {
        if (StringUtils.isBlank(formula)){
            return false;
        }
        try {
            fel.eval(formula);
        } catch (ParseException e) {
            return false;
        } catch (Exception e) {}
        return true;
    }

    /**
     * <p>
     *     把科学计数法显示出全部数字带格式输出，适合页面展示
     *     1.23E10==>12,300,000,000
     * </p>
     *
     * @param d
     */
    public static String scientificNotation2Str(Object d) {
        if (d == null) {
            return "";
        }
        NumberFormat nf = NumberFormat.getInstance();
        return nf.format(d);
    }
}
