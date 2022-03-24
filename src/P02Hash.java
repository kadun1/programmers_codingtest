import java.util.Arrays;

public class P02Hash {

    public static void main(String[] args) {
        String[] pb = {"1211","97674223","111", "1195524421"};
        boolean answer = solution(pb);
        System.out.println(answer);
    }

    static boolean solution(String[] phone_book){

        Arrays.sort(phone_book);
        for (int i = 1; i < phone_book.length; i++) {
            if(phone_book[i].startsWith(phone_book[i-1])){
                return false;
            }
        }
        return true;
    }
}
