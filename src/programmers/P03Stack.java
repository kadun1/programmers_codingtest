package programmers;

import java.util.*;

public class P03Stack {
    public static void main(String[] args) {
        int[] pro = {95, 90, 99, 99, 80, 99};
        int[] spe = {1, 1, 1, 1, 1, 1};
        solution(pro, spe);

    }

    static int[] solution(int[] progresses, int[] speeds){

        ArrayList<Integer> list = new ArrayList<>();
        int product = returnInt(progresses[0], speeds[0]);
        Stack<Integer> stack = new Stack<>();
        stack.push(product);
        int count = 0;
        for (int i = 1; i < progresses.length; i++) {
            int remain = returnInt(progresses[i], speeds[i]);
            if(product<remain){
                count = 0;
                while (!stack.isEmpty()) {
                    count++;
                    stack.pop();
                }
                product = remain;
                list.add(count);
            }
            stack.push(remain);
        }

        if (!stack.isEmpty()) {
            count = 0;
            while (!stack.isEmpty()) {
                count++;
                stack.pop();
            }
            list.add(count);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

    static int returnInt(int progress, int speed){
        return (int)Math.ceil((100D - progress) / speed);
    }
}
