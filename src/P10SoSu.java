public class P10SoSu {

    public static void main(String[] args) {
        int n = 5;
        int answer = solution(n);
        System.out.println(answer);
    }

    public static int solution(int n){
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 2; j <= Math.sqrt(i) ; j++) {
                if (i % j == 0) {
                    continue;
                } else {
                    count++;
                }
            }
            if(count==1) answer++;
        }

        return answer + 1;
    }
}
