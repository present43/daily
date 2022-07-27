package com.example.demo.polymorphic;

/**
 * 多态 相关代码测试
 * 1.
 */
public class PolymorphicTest {

    public static void main(String[] args) {
        Test(new Dog("小黄", "2"));

    }

    /**
     * 类之间的 继承 子类重写父类的方法 不用加 @Override注解，这个注解 是 接口实现才会加的
     * 只要能继承 的方法就可以被重写，只要方法名称 入参和返回值一致就可以了
     */
    private static void Test(Animal animal) {
        animal.eat();
        animal.sleep();
//        String age = animal.getAge();
//        String name = animal.getName();
//        System.out.println(age + " " + name);
    }


}
