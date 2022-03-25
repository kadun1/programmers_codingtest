import java.util.*;

public class P03Stack {
    public static void main(String[] args) {
        int[] pro = {20, 99, 93, 30, 55, 10};
        int[] spe = {5, 10, 1, 1, 30, 5};
        solution(pro, spe);

    }

    static int[] solution(int[] progresses, int[] speeds){

        ArrayList<Integer> list = new ArrayList<>();
        int tmpInt = returnInt(progresses[0], speeds[0]);
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        for (int i = 1; i < progresses.length; i++) {
            int remain = returnInt(progresses[i], speeds[i]);
            if(tmpInt>remain){
                while (!stack.isEmpty()) {
                    count++;
                    stack.pop();
                }

            }
        }




        for (Integer a: list
             ) {
            System.out.println("a = " + a);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

    static int returnInt(int progress, int speed){
        return (int)Math.ceil((100D - progress) / speed);
    }
}
