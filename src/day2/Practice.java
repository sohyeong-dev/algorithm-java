package day2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Practice {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
        stack.push(500);
        System.out.println(stack);

        int top = stack.pop();
        System.out.println(top);
        System.out.println(stack);

        System.out.println(stack.peek());

        while (!stack.isEmpty()) {
            stack.pop();
            System.out.println(stack);
        }

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(100);
        queue.offer(200);
        queue.offer(300);
        queue.offer(400);
        queue.offer(500);
        System.out.println(queue);

        int front = queue.poll();
        System.out.println(front);
        System.out.println(queue);

        System.out.println(queue.peek());

        while (!queue.isEmpty()) {
            queue.poll();
            System.out.println(queue);
        }
    }
}
