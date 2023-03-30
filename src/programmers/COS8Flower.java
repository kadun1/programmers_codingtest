package programmers;// 다음과 같이 import를 사용할 수 있습니다.

class Solution8 {

    public int solution(int[][] garden) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
        int[][] nGarden = new int[garden.length][garden[0].length];
        boolean loop = true;

        while (loop) {
            loop = false;
            for (int i = 0; i < garden.length; i++) {
                for (int j = 0; j < garden[0].length; j++) {
                    if(garden[i][j]==1){
                        nGarden[i][j] = 1;
                        if(i-1 >= 0 && garden[i-1][j]==0) nGarden[i-1][j] = 1;
                        if(i+1 < garden.length && garden[i+1][j]==0) nGarden[i+1][j] = 1;
                        if(j-1 >= 0 && garden[i][j-1]==0) nGarden[i][j-1] = 1;
                        if(j+1 < garden.length && garden[i][j+1]==0) nGarden[i][j+1] = 1;
                    } else {
                        loop = true;
                    }
                }
            }

            if(loop){
                answer++;
                for (int i = 0; i < garden.length; i++) {
                    System.arraycopy(nGarden[i],0 ,garden[i], 0, garden.length);
                }
            }
        }
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution8 sol = new Solution8();
        int[][] garden1 = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        int ret1 = sol.solution(garden1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution1 메소드의 반환 값은 " + ret1 + " 입니다.");

        int[][] garden2 = {{1, 1}, {1, 1}};
        int ret2 = sol.solution(garden2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution2 메소드의 반환 값은 " + ret2 + " 입니다.");

    }
}