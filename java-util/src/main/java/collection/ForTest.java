package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rockychen
 * @version 1.0
 * @date 2020-01-03 10:42
 */
public class ForTest {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>(){{
            add("1");
            add("2");
            add("3");
        }};

        for (int i=0 ; i < list.size() ; i++){
            if ("2".equals(list.get(i))) {
                list.remove(i);
            }
        }

        list.forEach(System.out::println);

        System.out.println("==========");

        for (String item : list) {
            if ("1".equals(item)) {
                list.remove(item);
            }
        }

        list.forEach(System.out::println);

    }
}
