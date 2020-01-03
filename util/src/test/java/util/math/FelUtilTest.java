package util.math;


import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

/**
* FelUtil Tester. 
* 
* @author <Authors name> 
* @since <pre>1月 3, 2020</pre> 
* @version 1.0 
*/ 
public class FelUtilTest { 

    /**
    *
    * Method: evaluate(String formula, HashMap<String, String> param)
    *
    */
    @Test
    public void testEvaluate() throws Exception {
    //TODO: Test goes here...

        String formula = "a-b+(c/d)+8";

        HashMap<String ,String> param = new HashMap<String, String>(){{
            put("a","100");
            put("b","50");
            put("c","9");
            put("d","3");
            put("8","50");//8 数字不能代表为公式的计算变量
            put("e","50");// 参数可以多，不能少
        }};

        Assert.assertEquals("61",FelUtil.evaluate(formula, param));
    }

    /**
    *
    * Method: checkFormula(String formula)
    *
    */
    @Test
    public void testCheckFormula() throws Exception {
    //TODO: Test goes here...
        Assert.assertEquals(true,FelUtil.checkFormula("a*8"));
        Assert.assertEquals(false,FelUtil.checkFormula("a*8)"));
    }

    @Test
    public void scientificNotation2Str() {
        double firstNumber = 1.23E10;
        double secondNumber = 50123.12E25;
        float number= 4334434.7343F;

        Assert.assertEquals("12,300,000,000" ,FelUtil.scientificNotation2Str(firstNumber));
        Assert.assertEquals("501,231,200,000,000,000,000,000,000,000" ,FelUtil.scientificNotation2Str(secondNumber));
        Assert.assertEquals("4,334,434.5" ,FelUtil.scientificNotation2Str(number));
    }
} 
