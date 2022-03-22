public class P01Greedy {

    public static void main(String[] args) {
        int n = 3;
        int[] lost = {3};
        int[] reserve = {1};
        int solution = solution(n, lost, reserve);
        System.out.println(solution);
    }

    static int solution(int n, int[] lost, int[] reserve){
        int answer = 0;

        int[] members = new int[n];

        for (int i = 0; i < members.length; i++) {
            members[i] = 1;
        }

        for (int i = 0; i < reserve.length; i++) {
            members[reserve[i]-1] += 1;
        }

        for (int i = 0; i < lost.length; i++) {
            members[lost[i]-1] -= 1;
        }

        for (int i = 0; i < members.length; i++) {
            if(i==0){
                if(members[i]==0&&members[i+1]==2){
                    members[i]+=1;
                    members[i+1]-=1;
                }
            } else if(i!=members.length-1){
                if(members[i]==0&&members[i-1]==2) {
                    members[i] += 1;
                    members[i - 1] -= 1;
                } else if(members[i]==0&&members[i+1]==2){
                    members[i]+=1;
                    members[i+1]-=1;
                } else if(members[i]==0&&members[i-1]==2){
                    members[i]+=1;
                    members[i-1]-=1;
                }
            } else {
                if(members[i]==0&&members[i-1]==2){
                    members[i]+=1;
                    members[i-1]-=1;
                }
            }
        }

        for (int i = 0; i < members.length; i++) {
            if(members[i]>0){
                answer++;
            }
        }
        return answer;
    }
}
