package programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;


public class P05Sort {
    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};
        solution(numbers);
    }

    static String solution(int[] numbers){
        String answer = "";

        String[] strArr = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            strArr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s2+s1).compareTo(s1+s2);
            }
        });

        for (String s : strArr) {
            answer += s;
        }

        if(answer.startsWith("0")) return "0";

        System.out.println("answer = " + answer);

        return answer;
    }
}
