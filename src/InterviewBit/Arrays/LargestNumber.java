package InterviewBit.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by prasad on 5/22/16.
 */
public class LargestNumber {

  public String formLargeNumber(ArrayList<Integer> a) {
    ArrayList<String> numbers = new ArrayList<>();
    for (int i : a) {
      if (i > 0) {
        numbers.add(String.valueOf(i));
      }
    }
    Collections.sort(numbers, new StringComparator());
    StringBuilder builder = new StringBuilder();
    for (String s : numbers) {
      builder.append(s);
    }
    if (builder.length() == 0) {
      builder.append("0");
    }
    return builder.toString();
  }

  class StringComparator implements Comparator<String> {
    @Override
    public int compare(String t1, String t2) {
      return (t2 + t1).compareTo(t1 + t2);
    }
  }

}
