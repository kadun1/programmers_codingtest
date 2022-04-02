public class P07Greedy {

    public static void main(String[] args) {
        int answer = solution("AAABBBA");
        System.out.println("answer = " + answer);
    }

    public static int solution(String name){
        int answer = 0;
        int len = name.length();
        int move = len - 1;

        for (int i = 0; i < name.length(); i++) {
            //이 부분이 결국 이동의 핵심로직
            answer += Math.min(name.charAt(i)-'A', 'Z'-name.charAt(i)+1);

            //이 아래가...
            int nextint = i + 1;
            while(nextint < len && name.charAt(nextint)=='A'){
                nextint++;
            }

            //이해가 안가네...
            move = Math.min(move, i * 2 + len - nextint);

            move = Math.min(move, (len - nextint) * 2 + i);
        }
        return answer + move;
    }
}
