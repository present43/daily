package com.example.demo.wrapper;

/**
 * 1.可变的字符系列 可对字符 进行 增删
 * 2. StringBuffer 的直接父类 是 AbstractStringBuilder
 * 3. 其父类内有 个 char[] value 数组 不是final 类型的 所以可变  因此是存放在堆中 而不在是常量池
 * 4. StringBuffer 是一个 final 类不可被继承
 * 5. 线程安全 适用于多线程的情况，但是效率没有 StringBuilder 快，在单线程的情况下 首选 StringBuilder
 */
public class StringBufferTest {

//    StringBuffer

}
