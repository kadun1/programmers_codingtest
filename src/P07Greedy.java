public class P07Greedy {

    public static void main(String[] args) {
        solution("JEROEN");
    }

    public static int solution(String name){
        int answer = 0;

        char[] charArr = name.toCharArray();

        for (char c: charArr
             ) {
            System.out.println(Character.getNumericValue(c));
        }

        System.out.println('z'-'b');

        return answer;
    }
}
