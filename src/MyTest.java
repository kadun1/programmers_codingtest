import java.util.*;

public class MyTest {
    public static void main(String[] args) {

        String s = new String("123");
        System.out.println("s = " + s);

        Optional<String[]> opt = Optional.ofNullable(new String[]{"a","b","c"});
        Arrays.stream(opt.get()).map(String::toUpperCase);
//        solution(rounds);

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
