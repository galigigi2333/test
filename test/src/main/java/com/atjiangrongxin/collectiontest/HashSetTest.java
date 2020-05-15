package com.atjiangrongxin.collectiontest;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTest {


    public static void main(String[] args) {
        Set <Integer>set=new HashSet();
        set.add(1);//往set集合中添加数据
        set.add(1);
        set.add(2);
        set.add(3);
//        //foreach遍历集合
//        for (Integer integer:set) {
//            System.out.println(integer);
//        }

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(2);
        for (Integer integer:treeSet) {
            System.out.println(integer);
        }

        
    }
}
