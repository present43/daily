package com.example.demo.exception;

/**
 * 异常相关
 * 顶级父类 Throwable
 * Error : 系统错误
 * Exception : 大体分为 运行时异常 、编译时异常
 * 处理方式： 自己捕获 或者 抛给调用者 如果一直向上抛则会中断程序 即异常后面的代码不会运行
 * 使用场景： 当不想后面的代码中断 则向上抛，当想继续运行则 自己捕获处理
 */
public class ExceptionTest {
}
