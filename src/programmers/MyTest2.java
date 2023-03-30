package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

public class MyTest2 {
    public static void main(String[] args) {

        int[][] beds = {{4,1,200000}};
        int[][] tables = {{2,3,100000}};
        int cost = 10000;

        long sol = solution(beds,tables,cost);
        System.out.println(sol);
    }

    static long solution(int[][] beds, int[][] tables, int cost){
        long answer = 0;

        List<Integer> widths = new ArrayList<>();
        List<Integer> heights = new ArrayList<>();
        List<Integer> total = new ArrayList<>();

        for (int i = 0; i < beds.length; i++) {
            widths.add(beds[i][0]);
            heights.add(beds[i][1]);
        }
        for (int i = 0; i < tables.length; i++) {
            widths.add(tables[i][0]);
            heights.add(tables[i][1]);
        }

        int maxwidth = Collections.max(widths);
        int maxheight = Collections.max(heights);

        System.out.println(maxheight * maxwidth);



//        System.out.println(beds[0][2]+tables[0][2]+cost*size);

        return answer;
    }
}