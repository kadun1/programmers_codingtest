package programmers;

import java.util.*;
import java.util.stream.Collectors;

public class P08Queue {

    public static void main(String[] args) {

        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        int answer = solution(priorities, location);
        System.out.println(answer);

    }

    //위치와 값을 담는 클래스
    public static class MyTest {
        int location;
        int priority;
        public MyTest(int location, int priority) {
            this.location = location;
            this.priority = priority;
        }
    }

    static int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<MyTest> queue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.add(new MyTest(i, priorities[i]));
        }

        int index = 0;
        while (!queue.isEmpty()) {
            boolean flag = false;
            MyTest pq = queue.poll();
            for (MyTest t : queue) {
                if (t.priority > pq.priority) {
                    flag = true;
                }
            }
            if(flag){
                queue.add(pq);
            } else {
                index++;
                if (pq.location == location) {
                    answer = index;
                    break;
                }
            }
        }

        return answer;
    }

}
