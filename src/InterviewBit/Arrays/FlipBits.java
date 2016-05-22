package InterviewBit.Arrays;

import java.util.ArrayList;

/**
 * Created by prasad on 5/21/16.
 */
public class FlipBits {

  public ArrayList<Integer> flipBits(String A){
    ArrayList<Integer> result = new ArrayList<>();
    if(A == null || A.length() ==0){
      return result;
    }
    int startIndex = -1 ;
    int numBits = 0;
    int num0s = 0;
    int maxNum0s = 0;
    int maxStartIndex = -1;
    int maxBits = 0;
    int actual1s = 0;
    int maxNew1s = 0;
    for(int i = 0; i < A.length(); i++){
      if(A.charAt(i) == '1'){
        actual1s++;
      }
    }
    for(int i = 0; i < A.length(); i++){
      if(startIndex == -1 && A.charAt(i) == '0'){
        startIndex = i;
      }
      if(startIndex == -1){
        continue;
      }
      numBits++;
      if(A.charAt(i) == '0'){
        num0s++;
      }
      if(num0s >= maxNum0s){
        int new1s = actual1s - (numBits - num0s) + num0s;
        if(new1s > actual1s && new1s > maxNew1s){
          if(maxStartIndex == -1){
            maxNew1s = new1s;
            maxBits = numBits;
            maxNum0s = num0s;
            maxStartIndex = startIndex;
          }else if( new1s > maxNew1s || startIndex <= maxStartIndex || (startIndex == maxStartIndex && (startIndex+numBits) < (maxStartIndex + maxBits))){
            maxNew1s = new1s;
            maxBits = numBits;
            maxNum0s = num0s;
            maxStartIndex = startIndex;
          }
        }
      }
      if(numBits > num0s*2){
        startIndex = -1;
        num0s = 0;
        numBits = 0;
      }
    }
    if(maxBits >= maxNum0s * 2){
      return result;
    }
    result.add(maxStartIndex+1);
    result.add(maxStartIndex + maxBits);
    return result;
  }
}