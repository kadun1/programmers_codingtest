package programmers;

import java.util.*;

public class P04Heap {
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;
        solution(scoville, k);
    }

    static int solution(int[] scoville, int k){
        int answer = 0;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i : scoville) {
            priorityQueue.add(i);
        }

        while (priorityQueue.size() > 1 && priorityQueue.peek() < k) {
            int sum =  priorityQueue.poll() + priorityQueue.poll() * 2;
            priorityQueue.add(sum);
            answer++;
        }

        if (priorityQueue.size() <= 1 && priorityQueue.peek() < k) {
            answer = -1;
        }

/*
        Arrays.sort(scoville);
        List<Integer> list = new ArrayList<>();
        list = Arrays.stream(scoville).boxed().collect(Collectors.toList());


        while (list.get(0)<k){
            if(list.get(1)<k){
                int newsco = list.get(0) + list.get(1) * 2;
                list.remove(1);
                list.set(0, newsco);
                Collections.sort(list);
                answer++;
            }
        }
*/
        return answer;
    }
}
