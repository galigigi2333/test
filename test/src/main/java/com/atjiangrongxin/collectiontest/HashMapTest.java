package com.atjiangrongxin.collectiontest;

import java.util.*;

public class HashMapTest {

    public static void main(String[] args) {

       Map<String, Integer> map = new HashMap<>();
       //存储元素，key为姓名，value为年龄
       map.put("张三",21);
       map.put("张三",22);
       map.put("李四",18);
        map.put("王五",25);
        //获取张三的年龄
        Integer age = map.get("张三");
        System.out.println(age);
        TreeMap treeMap=new TreeMap();

        treeMap.put("b",23);
        treeMap.put("c",43);
        treeMap.put("a",1);


    }


}
