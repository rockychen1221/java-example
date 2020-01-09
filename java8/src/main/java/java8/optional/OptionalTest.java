package java8.optional;

import cn.hutool.core.lang.Assert;
import cn.hutool.core.util.StrUtil;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {

        Optional<String> a = Optional.of("a");
        Assert.isTrue(StrUtil.equals("a",a.get()));

        /**
         * 判断optional中是否有值
         */
        Optional<String> b = Optional.empty();
        Assert.isFalse(b.isPresent());

        Optional<Boolean> flag = Optional.ofNullable(null);
        Assert.isFalse(flag.orElse(false));
        Assert.isTrue(flag.orElseGet(()-> true ));


    }

}
