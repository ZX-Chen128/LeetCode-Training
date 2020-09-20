package Algorithms;

import java.util.Stack;

/**
 * @Author: Chen Zixin
 * @Date: 2020/9/6 10:11 下午
 */
public class MinStack {

    // 数据栈
    private Stack<Integer> data;
    // 辅助栈
    private Stack<Integer> helper;

    /** initialize your data structure here. */
    public MinStack() {
        data = new Stack<>();
        helper = new Stack<>();
    }

    // 同步

    public void push(int x) {
        data.add(x);
        if(helper.isEmpty() || helper.peek() >= x){
            helper.add(x);
        } else {
            helper.add(helper.peek());
        }
    }

    public void pop() {
        if(!data.isEmpty()) {
            data.pop();
            helper.pop();
        }
    }

    public int top() {
        if(!data.isEmpty()) {
            return data.peek();
        }
        throw new RuntimeException("栈中元素为空，此操作非法");
    }

    public int getMin() {
        if(!data.isEmpty()) {
            return helper.peek();
        }
        throw new RuntimeException("栈中元素为空，此操作非法");
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */