package com.atjiangrongxin.collectiontest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {

    public static void main(String[] args) {
        List list= new ArrayList();
        //集合中添加元素
        list.add(1);
        list.add(5);
        list.add(2);

        list.add(4);
        //有序输出
        System.out.println(list);
        //工具类对list排序
        Collections.sort(list);
        //排序后输出
        System.out.println(list);
        //将集合内的元素反转输出
        Collections.reverse(list);
        System.out.println(list);

    }
}
