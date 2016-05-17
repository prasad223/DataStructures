package LeetCode;

/**
 * Created by prasad223 on 2/10/16.
 */
public class CountAndSay {

    public String countSay(int n){
        String response = "";
        if(n==0){
            return response;
        }


        response = "b";
        int count = 0;
        int ct = 'a' - response.charAt(0);
        char ch2 = 'a' + 2;
        char ch = ' ';
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=1; i < n;i++){
            ch = response.charAt(0);
            count = 1;
            for(int k=1; k < response.length();k++){
                if(response.charAt(k) == ch){
                    count++;
                }else{
                    stringBuilder.append(count);
                    stringBuilder.append(ch);
                    ch = response.charAt(k);
                    count = 1;
                }
            }
            stringBuilder.append(count);
            stringBuilder.append(ch);
            response = stringBuilder.toString();
            stringBuilder = new StringBuilder();
        }
        return response;
    }

    public static void main(String... args){
        CountAndSay countAndSay = new CountAndSay();
        for(int i =0; i<8;i++){
            System.out.println(countAndSay.countSay(i));
        }
        System.out.println(countAndSay.countSay(1));
        System.out.println(countAndSay.countSay(2));
        System.out.println(countAndSay.countSay(5));
    }
}
