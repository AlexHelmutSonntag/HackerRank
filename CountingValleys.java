//Problem description : https://www.hackerrank.com/challenges/counting-valleys/problem


class CountingValleys {

    /*
     * Complete the 'countingValleysFun' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleysFun(int steps, String path) {
    // Write your code here
        int valleys=0;
        int level=0;
        
        for (char c : path.toCharArray())
        {
            if(c == 'D') level--;
            if(c == 'U') level++;
            
            if(level==0&& c=='U')
                valleys++;
        }
        return valleys;
    }

}
