package LinkedinIntern;

/**
 * Created by prasad223 on 12/29/15.
 */

import java.io.*;
import java.util.*;

public class Solution {

    static String braceString(String input){
        Stack<Character> stack = new Stack<>();
        String response = "YES";
        if(input.length() == 1 || input.length() % 2 == 1 ){
            response = "NO";
            return  response;
        }
        stack.push(input.charAt(0));
        for(int index = 1, len = input.length() ; index < len; index++){
            switch (input.charAt(index)){
                case '}':
                    if(!stack.empty() && stack.peek() == '{'){
                        stack.pop();
                    }break;
                case ')':
                    if(!stack.empty() && stack.peek() == '('){
                        stack.pop();
                    }break;
                case ']':
                    if( !stack.empty() && stack.peek() == '['){
                        stack.pop();
                    }break;
                default:
                    stack.push(input.charAt(index));
                    break;
            }
        }
        if(!stack.empty()){
            response = "NO";
        }
        return response;
    }

    static String[] Braces(String[] values) {
        String[] result = new String[values.length];

        for(int index = 0; index < values.length; index++){
            result[index] = braceString(values[index]);
        }
        return result;
    }

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        String[] res;

        int valuesSize = Integer.parseInt(in.nextLine());
        String[] values = new String[valuesSize];
        String valuesItem;
        for(int i = 0; i < valuesSize; i++) {
            try {
                valuesItem = in.nextLine();
            } catch (Exception e) {
                valuesItem = null;
            }
            values[i] = valuesItem;
        }
        res = Braces(values);
        for(String item: res) {
            System.out.println(item);

        }
    }
}