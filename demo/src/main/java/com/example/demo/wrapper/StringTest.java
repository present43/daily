package com.example.demo.wrapper;

/**
 * String 类详解
 * 1. String 对象用与保存字符串 也就是一组字符系列
 * 2. Unicode 字符编码 一个字符（不区分字母和汉字） 占两个字节 比较废内存 相较于基本类型
 * 3. String 实现了 Serializable 序列化 用于网络传输  Comparable 用于比较
 * 4. String 是 final 类 不可被继承
 * 5. 在底层是 char 数组   private final char value[] 这里存的值
 *      并且因为是 final 实现的所以一旦被赋值则不可修改（value 的地址不可修改、长度不可修改 但是单个字符的内容还是可以变化的）
 * */
public class StringTest {
}
