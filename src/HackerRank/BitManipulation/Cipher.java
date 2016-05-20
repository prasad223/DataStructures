package HackerRank.BitManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by prasad223 on 1/17/16.
 */
public class Cipher {

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n,k;
        String[] input;
        input = br.readLine().split("\\s+");
        n = Integer.parseInt(input[0]);
        k = Integer.parseInt(input[1]);
        int s = n+k-1;
        byte[] bytes = new byte[s];
        long start  = System.currentTimeMillis();
        String t = br.readLine();
        for(int i=0;i< t.length();i++ ){
            bytes[i] =(byte) Character.getNumericValue(t.charAt(i));
        }
        System.out.println(System.currentTimeMillis() - start);
        byte[] result = new byte[n];
        result[0] = bytes[0];
        byte tempResult = 0;
        System.out.print(result[0]);
        int end;
        start = System.currentTimeMillis();
        for(int i = 1; i < n;i++){
            end = Math.max(i-k+1,0);
            tempResult ^= result[i - 1];
            if(end > 0){
                tempResult ^= result[end-1];
            }
            result[i] = (byte) (tempResult ^ bytes[i]);
             System.out.print(result[i]);
        }
        System.out.println();
        System.out.println(System.currentTimeMillis() - start);
    }

}
