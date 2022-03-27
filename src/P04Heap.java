import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class P04Heap {
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;
        solution(scoville, k);
    }

    static int solution(int[] scoville, int k){
        int answer = 0;
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

//        list.forEach(i-> System.out.println("리스트 = " + i));

        return answer;
    }
}
