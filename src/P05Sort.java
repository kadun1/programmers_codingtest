import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class P05Sort {
    public static void main(String[] args) {
        int[] numbers = {6,10,2};
        solution(numbers);
    }

    static String solution(int[] numbers){
        String answer = "";
        List<String> list = new ArrayList<>();

        Comparator<String> stringComparator = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        };

        stringComparator.compare(answer, answer);

        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]+"");
        }
        for (String s: list) {
            answer += s;
        }
        return answer;
    }
}
