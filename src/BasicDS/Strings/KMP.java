package BasicDS.Strings;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by prasad223 on 1/19/16.
 */
public class KMP {

    public static void main(String[] args) throws IOException{

        String pattern = "aabxaayaab";//"abcdabca";
        String text = "..abcdabca";
        int[] preproc = computerPreTable(pattern);
        for(int i=0; i < preproc.length; i++){
            System.out.print(preproc[i] +" ");
        }
        System.out.println();
        pattern = "aabaabaaa";
        preproc = computerPreTable(pattern);
        for(int i=0; i < preproc.length; i++){
            System.out.print(preproc[i] +" ");
        }
        System.out.println();
        pattern = "abcaby";
        preproc = computerPreTable(pattern);
        System.out.println(Arrays.toString(preproc));
        text = "abxabcabcaby";
        int pos = findPattern(text, pattern, preproc);
        System.out.println(" pos: " + pos);
        pattern = "acacabacacabacacac";
        preproc = computerPreTable(pattern);
        System.out.println(Arrays.toString(preproc));

    }

    static int findPattern(String text, String pattern,int[] preProc){
        int j =0, i =0, n = text.length();
        while (i < n){
            if(text.charAt(i) == pattern.charAt(j)){
                i++;
                j++;
                if(j == pattern.length()){
                    return i-pattern.length();
                }
            }else{
                if(j==0){
                    i++;
                }
                j = preProc[Math.max(0, j-1)];

            }
        }
        return -1;
    }

    static int[] computerPreTable(String pattern){
        int j =0, i = 1, n = pattern.length();
        int[] preInfo = new int[n];
        preInfo[j] = 0;
        while(i <n){
            if(pattern.charAt(j) == pattern.charAt(i)){
                preInfo[i++] = ++j;
            }else{
                if(j == 0){
                    i++;
                }
                j = preInfo[Math.max(0,j-1)];
            }
        }
        return preInfo;
    }
}
