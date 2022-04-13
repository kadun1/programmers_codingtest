public class P10SoSu {

    public static void main(String[] args) {
        int n = 50000;
        int answer = solution(n);
        System.out.println(answer);
    }

    public static int solution(int n){
        int answer = 0;

        for (int i = 3; i <= n; i++) {
            int count = 0;
            if(i%2!=0){
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
            } else {
                count++;
            }
            if(count==0) answer++;
        }
        return answer + 1;
    }
}
