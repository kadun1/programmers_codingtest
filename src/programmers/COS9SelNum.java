package programmers;// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution9 {
    public int solution(int[] arr, int K) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
        int minus = 0;
        int min = 10001;

        Arrays.sort(arr);

        for (int i = 0; i <= arr.length-K; i++) {
            minus = arr[K-1+i] - arr[i];
            min = Math.min(min, minus);
        }
        answer = min;
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution9 sol = new Solution9();
        int[] arr = {9, 11, 9, 6, 4, 19};
        int K = 4;
        int ret = sol.solution(arr, K);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + "입니다.");
    }
}