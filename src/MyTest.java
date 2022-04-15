import java.util.*;

public class MyTest {
    public static void main(String[] args) {

        int[] a = new int[8];
        int i=0, n=10;

        while (i < 8) {
            a[i++] = n%2;
            n /= 2;
        }

        for (int j = 7; j >= 0; j--) {
            System.out.println(a[j]);
        }
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
