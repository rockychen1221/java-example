package exception;

/**
 * @author rockychen
 * @version 1.0
 * @date 2020-01-06 09:27
 */
public class Exception {
    /**
     * Throwable: 它是所有错误与异常的超类（祖宗类）
     *         |- Error 错误
     *         |- Exception 编译期异常,进行编译JAVA程序时出现的问题
     *             |- RuntimeException 运行期异常, JAVA程序运行过程中出现的问题
     */
    private static void testTryCatch(){
        try {
            System.out.println("try");
        }catch (java.lang.Exception e){
            System.out.println("catch");
        }finally {
            System.out.println("finally");
        }
    }

    /**
     * <p>
     *     1.try 或 catch 中都有 return语句，并且有 finally 的话，最终先执行 finally，再执行 try 或 catch中的 return语句
     *     2.try 或 catch 中都有 return语句，并且有 finally，而且 finally中 有return语句 的话，最终先执行 finally，
     *       然后执行 finally中 有return语句，并不会执行 try 或 catch 中return语句
     *     3.try 或 catch 中都有 return语句，并且有 finally，而且 finally中 对try 或 catch 中的 return语句所返回的基本类型变量/引用类型变量 进行了重新赋值，
     *       即使如此，也只会返回 try 或 catch 中的return语句所返回的基本类型变量/引用类型变量的值，finally中的修改try 或 catch 中的返回值操作并不会生效
     *
     *     ————————————————
     *     版权声明：本文为CSDN博主「日萌社」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
     *     原文链接：https://blog.csdn.net/zimiao552147572/article/details/90272092
     * </p>
     * @param args
     */
    public static void main(String[] args) {
        testTryCatch();
    }

}
