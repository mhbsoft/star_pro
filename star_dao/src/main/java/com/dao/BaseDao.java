package com.dao;

public interface BaseDao {

    /**
     * public abstract
     */
    void getUser();

    /**
     * 在jdk1.8中，接口里可以有静态方法，接口里的静态方法 必须要有body。
     * 静态方法不需要实现。
     */
    static void getCommonUser(){
        System.out.println("name");
    }

}
