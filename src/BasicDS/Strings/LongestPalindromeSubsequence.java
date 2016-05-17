package BasicDS.Strings;

import java.util.Arrays;
import java.util.regex.Matcher;

/**
 * Created by prasad223 on 2/6/16.
 */
public class LongestPalindromeSubsequence {

    public int longPalindromeSubsequence(String text){
        int n = text.length();
        int[][] data = new int[n][n];
        int i;
        int j;
        int max = 1;
        char[] input = text.toCharArray();
        for(i=0; i <n;i++){
            data[i][i]=1;
        }
        for(i=0;i<n-1;i++){
            j = i+1;
            if(input[i] == input[j]){
                data[i][j] =2;
                max = 2;
            }else{
                data[i][j] = Math.max(data[i][j-1],data[i+1][j]);
            }
        }
        for(int inc = 2;inc < n;inc++){
            for(i = 0; i < n-inc;i++){
                j= i+inc;
                if(input[i] == input[j]){
                    data[i][j] = 2+ data[i+1][j-1];
                    max = Math.max(max, data[i][j]);
                }else{
                    data[i][j] = Math.max(data[i][j-1],data[i+1][j]);
                }
            }
        }
        return max;
    }

    public static void main(String[] args)throws Exception{

    }
}
