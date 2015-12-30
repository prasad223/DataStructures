package LinkedinIntern;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by prasad223 on 12/29/15.
 */
public class PascalTriangle {

    public static void main(String[] args)throws IOException{
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int[] pascalTri = new int[k];
        System.out.println("1");
        System.out.println("1 1");
        pascalTri[0] = 1;
        pascalTri[1] = 1;
        int a ,b ;
        for(int index = 2; index < k;index++){
            a = 1;
            for(int numIndex = 1; numIndex < index; numIndex++){
                b = pascalTri[numIndex];
                pascalTri[numIndex ] = a + b;
                a = b;
            }
            pascalTri[index] = 1;
            for(int printIndex = 0; printIndex <= index; printIndex++){
                System.out.print(pascalTri[printIndex] + " ");
            }
            System.out.println();
        }

    }
}
