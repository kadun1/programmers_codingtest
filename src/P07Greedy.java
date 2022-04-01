public class P07Greedy {

    public static void main(String[] args) {
        int answer = solution("JEROENZA");
        System.out.println("answer = " + answer);
    }

    public static int solution(String name){
        int answer = 0;
        int len = name.length();

        for (int i = 0; i < name.length(); i++) {
            answer += Math.min(name.charAt(i)-'A', 'Z'-name.charAt(i)+1);

//            A의 갯수에 따라.. 되돌아가는 것이 빠를수 있음을 구현해야함
        }
        return answer;
    }
}
