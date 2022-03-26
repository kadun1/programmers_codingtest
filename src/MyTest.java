import java.util.*;

public class MyTest {
    public static void main(String[] args) {

        String[][] rounds = {{"b","a","a","d"},{"b","c","a","c"},{"b","a","d","c"}};

        int sol = solution(rounds);
        System.out.println(sol);
    }

    static int solution(String[][] rounds){
        int answer = 0;
        boolean[] couple = {true, true, true, true};
        String[] member = {"a", "b", "c", "d"};

        for (int i = 0; i < rounds.length; i++) {
            for (int j = 0; j < rounds[i].length; j++) {
                if(rounds[i][j].equals(member[j])){
                    couple[j] = false;
                }
            }

            for (boolean b: couple) {
                System.out.println("b = " + b);
                if (b == false) answer++;
            }
        }
        return answer;
    }
}
