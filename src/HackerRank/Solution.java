package HackerRank;

import java.io.IOException;
import java.util.*;

/**
 * Created by prasad223 on 1/6/16.
 */
public class Solution {

    static String closestNumbers(int len, String s) {
        int[] array = new int[len];
        List<Integer> n1 = new ArrayList<>();
        List<Integer> n2 = new ArrayList<>();
        StringTokenizer str = new StringTokenizer(s);
        int i =0, j =0;
        while(str.hasMoreTokens()){
            array[i++] = Integer.parseInt(str.nextToken());
        }
        Arrays.sort(array);

        int diff =0 , minDiff = Integer.MAX_VALUE;
        for(i = 1; i < len; i++){
            diff = array[i-1] - array[i];
            if(diff < minDiff){
                minDiff = diff;
                n1.clear();
                n2.clear();
                n1.add(array[i-1]);
                n2.add(array[i]);
            }else if(diff == minDiff){
                n1.add(array[i-1]);
                n2.add(array[i]);
            }
        }
        StringBuilder result = new StringBuilder();
        for(i =0 ; i < n1.size(); i++){
            result.append(n1.get(i).intValue() + " " + n2.get(i).intValue() + " ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String res;
        int _len;
        //_len = Integer.parseInt(in.nextLine());

        String _s;
        /*try {
            _s = in.nextLine();
        } catch (Exception e) {
            _s = null;
        }*/
        _s = "-30 20 104 -45843754 -34554 ";
        _len = 5;
        res = closestNumbers(_len, _s);
        System.out.println(res);

    }
}
