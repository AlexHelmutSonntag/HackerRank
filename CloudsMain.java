//Problem description : https://www.hackerrank.com/challenges/counting-valleys/problem


public class CloudsMain {
    static int jumpingOnClouds(int[] c) {
        int n = c.length;
        int count = -1;
        for (int i = 0; i < n; i++, count++) {
            if (i < n - 2 && c[i + 2] == 0)
                i++;
        }
        return count;
    }
}
