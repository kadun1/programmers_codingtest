// 다음과 같이 import를 사용할 수 있습니다.

import java.util.ArrayList;
import java.util.List;

class Solution8 {

    class Flower {
        int x;
        int y;

        public Flower(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int solution(int[][] garden) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
        int x = 0;
        int y = 0;

        List<Flower> list = new ArrayList<>();
        for (int i = 0; i < garden.length; i++) {
            for (int j = 0; j < garden[0].length; j++) {
                Flower flower = new Flower(i, j);
                list.add(flower);
            }
        }


        for (int i = 0; i < list.size(); i++) {

        }




        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution8 sol = new Solution8();
        int[][] garden1 = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        int ret1 = sol.solution(garden1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int[][] garden2 = {{1, 1}, {1, 1}};
        int ret2 = sol.solution(garden2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");

    }
}