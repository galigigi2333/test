package com.atjiangrongxin.collectiontest;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueTest {

    public static void main(String[] args) {
        //创建一个容量得为4得队列
        Queue<String> queue = new ArrayBlockingQueue<>(4);
        //添加元素
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("1");
        for (String str:queue) {
            System.out.println(str);
        }
    }

}
