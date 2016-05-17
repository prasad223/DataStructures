package BasicDS.Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by prasad223 on 1/28/16.
 * Class to create test cases for minimum number of students required to start a class
 */
public class STExample {

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        Random rand = new Random();
        int n;
        int k, nc, pc;
        boolean isCancel = true;
        int t = 5;
        String negArray;
        String posArray;
        System.out.println(t);
        for(int i = 0; i < t; i++){
            n = rand.nextInt(20);
            n = Math.max(3,n);
            k = Math.max(rand.nextInt(n),2);
            if(isCancel){
                nc = k-Math.max(1,rand.nextInt(k-1));
            }else{
                nc = k-Math.max(1,rand.nextInt(k));
            }
            negArray = getNegElements(nc);
            str.append(negArray);
            str.append("0 ");
            posArray = getPosElements(n-nc-1);
            str.append(posArray);
            System.out.println(n +" " + k);
            System.out.println(str);
            str = new StringBuffer();
        }
    }

    public static String getNegElements(int count){
        return "";
    }

    public static String getPosElements(int count){
        return "";
    }

    public static String canClass(String times, int n, int k){
        String isOk = "YES";
        int count = 0;
        String[] time = times.split("\\s+");
        for(int i=0; i < n;i++){
            if(Integer.parseInt(time[i]) <= 0){
                count++;
                if(count == k){
                    isOk = "NO";
                    break;
                }
            }
        }
        return isOk;
    }
}
