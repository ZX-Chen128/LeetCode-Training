package Algorithms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author: Chen Zixin
 * @Date: 2020/9/7 1:34 下午
 */
public class LRUCache extends LinkedHashMap<Integer, Integer> {

        private int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    // 这个可不写
    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }
//    Integer capacity;
//
//    DoubleListNode head = new DoubleListNode(0, 0);
//    DoubleListNode tail = new DoubleListNode(0, 0);
//
//    Map<Integer, DoubleListNode> map = new HashMap<>();
//
//    public LRUCache(int capacity) {
//        this.capacity = capacity;
//        head.next = tail;
//        tail.front = head;
//    }
//
//    public int get(int key) {
//        if (map.containsKey(key)) {
//            DoubleListNode node = map.get(key);
//            moveNodeToTop(node);
//            return node.val;
//        } else {
//            return -1;
//        }
//    }
//
//    public void put(int key, int value) {
//        if (!map.containsKey(key)) {
//            if (map.size() == capacity) deleteLastNode();
//            DoubleListNode tmp = head.next;
//            DoubleListNode newNode = new DoubleListNode(key, value);
//            head.next = newNode;
//            newNode.front = head;
//            newNode.next = tmp;
//            tmp.front = newNode;
//            map.put(key, newNode);
//        } else {
//            DoubleListNode node = map.get(key);
//            node.val = value;
//            moveNodeToTop(node);
//        }
//    }
//
//    public void deleteLastNode() {
//        DoubleListNode lastNode = tail.front;
//        lastNode.front.next = tail;
//        tail.front = lastNode.front;
//        map.remove(lastNode.key);
//    }
//
//    public void moveNodeToTop(DoubleListNode node) {
//        node.next.front = node.front;
//        node.front.next = node.next;
//        DoubleListNode tmp = head.next;
//        head.next = node;
//        tmp.front = node;
//        node.front = head;
//        node.next = tmp;
//    }

}

class DoubleListNode {
    int key;
    int val;
    DoubleListNode front;
    DoubleListNode next;

    DoubleListNode(int key, int val) {
        this.key = key;
        this.val = val;
    }

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */