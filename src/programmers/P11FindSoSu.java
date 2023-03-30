package programmers;

import java.util.HashSet;
import java.util.Set;

public class P11FindSoSu {

    public static boolean[] bool;
    public static HashSet<Integer> set;
    static int a =0;

    public static void main(String[] args) {


        String n = "011";
        solution(n);
    }

    public static int solution(String numbers) {
        int answer = 0;

        for (int i = 0; i < numbers.length(); i++) {
            dfs();
        }

        //깊이우선탐색(DFS)를 활용해서 모든 경우의 수를 찾아야함..


        return answer;
    }

    static void isPrime(int x) {
        if (x == 0) return;
        if (x == 1) return;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) return;
        }
        a++;
    }

    public static void dfs(){

    }
}
