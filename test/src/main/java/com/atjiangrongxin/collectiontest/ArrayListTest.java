package com.atjiangrongxin.collectiontest;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();//new 一个集合类  以ArrayList为例
        list.add("a");//往集合中添加数据
        list.add("b");
        list.add("c");

        //遍历集合中的数据
        list.stream().forEach(System.out::println);

//        for (int i = 0; i <10 ; i++) {
//            new Thread(()->{
//                list.add(UUID.randomUUID().toString().substring(0,6));
//                System.out.println(list);
//                },"A").start();
//        }
    }
}
