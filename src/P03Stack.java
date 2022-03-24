import java.util.*;

public class P03Stack {
    public static void main(String[] args) {
        int[] pro = {20, 99, 93, 30, 55, 10};
        int[] spe = {5, 10, 1, 1, 30, 5};
        solution(pro, spe);

    }

    static int[] solution(int[] progresses, int[] speeds){

        int[] test = new int[progresses.length];

        for (int i = 0; i < progresses.length; i++) {
            test[i] = (100 - progresses[i]) / speeds[i];
        }

        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < test.length;) {
            for (int j = i+1; j < test.length; j++) {
                int sum = 0;
                sum += test[j];
                if(test[i]>=sum){
                    list.add(index, 1);
                } else {
                    index++;
                    i = j;
                    continue;
                }
            }
        }

        for (Integer a: list
             ) {
            System.out.println("a = " + a);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
