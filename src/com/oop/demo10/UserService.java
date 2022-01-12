package com.oop.demo10;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/12 16:27
 * @Description: 手握日月摘星辰，世间无我这般人
 */
//接口 关键字interface 接口都需要有实现类
public interface UserService {

    //接口中定义的都是常量public static final
    int age = 99;
    //接口中的所有东西都是抽象的 public abstract
    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);

}
