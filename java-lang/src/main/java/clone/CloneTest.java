package clone;

import lombok.Builder;
import lombok.Data;

/**
 * 深拷贝与浅拷贝
 * @author rockychen
 * @version 1.0
 * @date 2020-01-03 10:38
 */
public class CloneTest {



    public static void main(String[] args) {
        Student deepCopyNotAttrStu1 = Student.builder().name("rockychen").age(23).build();
        try {
            Student deepCopyNotAttrStu2= (Student) deepCopyNotAttrStu1.clone();
            deepCopyNotAttrStu1.setAge(24);
            System.out.println("深拷贝快速入门例子(不带对象属性)\n，内存分配成为两个对象");
            System.out.println(deepCopyNotAttrStu1.toString());
            System.out.println(deepCopyNotAttrStu1.toString());
            System.out.println(deepCopyNotAttrStu1 == deepCopyNotAttrStu2);


        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        System.out.println("======================");

        Student shallowCopyAttrStu1 = Student.builder().name("rockychen").age(23).address(Address.builder().address("湖南").build()).build();
        try {
            Student shallowCopyAttrStu2= (Student) shallowCopyAttrStu1.clone();
            //shallowCopyAttrStu1.setAge(24);
            shallowCopyAttrStu1.getAddress().setAddress("湘潭");
            System.out.println("浅拷贝快速入门例子(带对象属性)\n，内存分配成为两个对象");
            System.out.println(shallowCopyAttrStu1.toString());
            System.out.println(shallowCopyAttrStu2.toString());
            System.out.println(shallowCopyAttrStu1.getAddress() == shallowCopyAttrStu2.getAddress());
            System.out.println(shallowCopyAttrStu1 == shallowCopyAttrStu2);

        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

    }
}


@Data
@Builder
class Student implements Cloneable{
    private String name;
    private int age;
    private Address address;

    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}

@Data
@Builder
class Address {
    private String address;

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}