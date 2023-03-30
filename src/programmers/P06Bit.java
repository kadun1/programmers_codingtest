package programmers;

public class P06Bit {

    public static void main(String[] args) {
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] arrStr = new String[5];

        for (int i = 0; i < arr1.length; i++) {
            arrStr[i] = Integer.toBinaryString(arr1[i]|arr2[i]).replace("1", "#").replace("0", " ");
        }

        for (String s: arrStr
             ) {
            System.out.println(s);
        }
    }
}
