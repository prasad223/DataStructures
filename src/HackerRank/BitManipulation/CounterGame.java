package HackerRank.BitManipulation;

/**
 * Created by prasad223 on 1/17/16.
 */
public class CounterGame {

    static int countBits(long n){
        int count = 0;
        while(n != 0){
            n &= (n-1);
            count++;
        }
        return count;
    }

    public static void main(String[] args){
        long n = 6;
        int c = countBits(n);
        String name;
        if(c % 2 == 0){
            name = "Louise";
        }else{
            name = "Richard";
        }
        System.out.println(name);
    }
}

