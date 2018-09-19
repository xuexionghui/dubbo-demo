package com.imooc.springboot.dubbo.demo;

public interface DemoService {
	/*
	 * 这是一个接口
	 * 作用：
	 *   供consumer在远程消费provider的时候，调用这个接口，从而调用实现类
	 */
    //String sayHello(String name);
	 String  sayHello(String name);
}