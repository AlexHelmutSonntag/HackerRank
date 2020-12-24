//Problem description : https://www.hackerrank.com/challenges/2d-array/problem
import java.util.ArrayList;
import java.util.Collections;

public class HourGlass {
    static int hourglassSum(int[][] arr) {
        ArrayList<Integer> sumList = new ArrayList<Integer>();
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr.length - 2; j++) {
                int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
                        + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                sumList.add(sum);

            }
        }
        int max = Collections.max(sumList);
        return max;
    }
}
