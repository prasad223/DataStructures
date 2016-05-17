import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by prasad223 on 2/4/16.
 *
 * Class to write all simple classes to be used for testing
 */
public class Solution {


    public static boolean anyTwo(int[] array, int target){
        Set<Integer> map = new HashSet<>();
        int n = array.length;
        for(int i =0 ; i < array.length;i++){
            if(map.contains(array[i] * 100)){
                return true;
            }else{
                map.add(target - (array[i]*100));
            }
        }
        return false;
    }
    public static int solution(int[] A, int X, int D){

        int n = A.length;
        int currentPosition = 0;
        TreeSet<Integer> positionSet = new TreeSet<>();

        if( X < D || (A[0] <= D && A[0] >= (X-D))){
            return 0;
        }

        for(int i=0; i < n; i++){
            positionSet.add(A[i]);
            if(A[i] <= D){
                currentPosition = A[i];
            }
            try{
                currentPosition = Math.max(currentPosition, positionSet.floor(currentPosition+D));
            }catch (NullPointerException e){
            }

            if(currentPosition + D >= X){
                return i;
            }
        }

        return -1;
    }

    public static int MaximumProduct(int[] input){
        int n = input.length;
        int max = input[n-1];
        int product = 0;
        int tProd= 0;
        for(int i = n-2;i>=0;i--){
            if(input[i] < max){
                tProd = max * input[i];
                product = Math.max(tProd, product);
            }
            max = Math.max(max, input[i]);
        }
        return product;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(arr, low, j);

        if (high > i)
            quickSort(arr, i, high);
    }

    static int[] removeDups(int[] arr){
        int n = arr.length;
        quickSort(arr,0,n-1);
        int i;
        int newLength =1;
        int temp = arr[0];
        for(i =1; i< n;i++ ){
            if(arr[i] != temp){
                temp = arr[i];
                newLength++;
            }
        }
        int[] result = new int[newLength];
        int j =0;
        result[0] = arr[n-1];
        for(i = n-2; i >= 0; i--){
            if(arr[i] != result[j]){
                result[++j] = arr[i];
            }
        }
        return result;
    }

    static String IntersectionStrings(String first, String second){
        TreeMap<Character, Integer> map = new TreeMap<>();
        Integer num = new Integer(45);
        num += 1;
        for(char c: first.toCharArray()){
            if(map.containsKey(c)){
                num = map.get(c);
                num += 1;
                map.put(c,num);
            }else{
                map.put(c,1);
            }
        }
        char[] result = new char[Math.max(first.length(), second.length())];
        int i =0;
        for(char c: second.toCharArray()){
            if(map.containsKey(c)){
                result[i++] = c;
                num = map.get(c);
                num -= 1;
                if(num == 0){
                    map.remove(c);
                }else{
                    map.put(c,num);
                }
            }
        }
        Arrays.sort(result);
        String ans = new String(result).trim();
        return ans;
    }

    public static void main(String[] args)throws Exception {
        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
     /*   System.out.println(solution(new int[]{4,1,1,4,2,5},7,3));
        System.out.println(solution(new int[]{2,5},4,3));
        System.out.println(solution(new int[]{2,2},4,1));
        System.out.println(anyTwo(new int[]{1,2,3,4,5,6,7},500));
        System.out.println(MaximumProduct(new int[]{4,2,3,7}));
        System.out.println(MaximumProduct(new int[]{2,8,9,9}));
*/
//        System.out.println(Arrays.toString(removeDups(new int[]{1,2,3,4,5,3,4,5})));
        System.out.println(IntersectionStrings("abcdeee","abcodueeend"));
    }

}
