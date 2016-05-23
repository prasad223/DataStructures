package InterviewBit.Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prasad on 5/21/16.
 */
public class FindMissingAndRepeatedNumber {

  public ArrayList<Integer> repeatedNumber(final List<Integer> a) {
    ArrayList<Integer> result = new ArrayList<>();
    ArrayList<Boolean> nums = new ArrayList<>(a.size());
    int repeatedNum = 0;
    long sum = 0;
    long actualSum = (a.size() * (a.size() + 1)) / 2;
    for (int i = 0; i < a.size(); i++) {
      nums.add(false);
      sum += a.get(i);
    }
    nums.add(false);
    for (int i : a) {
      if (nums.get(i)) {
        repeatedNum = i;
        break;
      }
      nums.set(i, true);
    }
    result.add(repeatedNum);
    result.add((int) (actualSum - (sum - repeatedNum)));
    return result;
  }

  /*public ArrayList<Integer> repeatedNumber(final List<Integer> a){
    ArrayList<Integer> result = new ArrayList<>();
    long sum = 0;
    int size = a.size();
    int xNum = 0;
    for(int n : a){
      sum += n;
      xNum ^= n;
    }
    long actualSum = (size * (size+1))/2;
    int repeatedNum;
    int missingNum;
    if(actualSum - sum > 0 ){
      repeatedNum = size - (int)(actualSum - sum);
    }else{
      if(size % 2 == 1){
        size++;
      }
      repeatedNum = (size/2) + (int)(sum - actualSum);
    }
    missingNum = (int)(actualSum - (sum - repeatedNum));
    result.add(repeatedNum);
    result.add(missingNum);
    return result;
  }*/

}
