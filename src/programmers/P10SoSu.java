package programmers;

import java.util.ArrayList;
import java.util.List;

public class P10SoSu {

    public static void main(String[] args) {
        int n = 50000;
        int answer = solution(n);
        System.out.println(answer);
    }

    public static int solution(int n){
        int answer = 0;

        int[] arr = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            arr[i]=i;
        }

        arr[1] = 0;

        for (int i = 2; i <= n; i++) {
            if (arr[i]==0) continue;

            //에라토스테네스의 체를 로직화함...
            for (int j = i*2; j < arr.length; j+=i) {
                arr[j]=0;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                answer++;
            }
        }

        return answer;
    }
}
