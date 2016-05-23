package InterviewBit.Arrays;

import java.util.ArrayList;

/**
 * Created by prasad on 5/20/16.
 */
public class AddPlusOne {

  public static void main(String[] args) {
    ArrayList<Integer> a = new ArrayList<>();
    a.add(9);
    a.add(9);
    AddPlusOne addPlusOne = new AddPlusOne();
    System.out.println(addPlusOne.plusOne(a));
  }

  public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
    int carry = 1;
    int num;
    for (int i = a.size() - 1; i >= 0; i--) {
      num = (a.get(i) + carry) % 10;
      carry = (a.get(i) + carry) / 10;
      a.set(i, num);
      if (carry == 0) {
        break;
      }
    }
    if (carry > 0) {
      a.add(0, carry);
    }
    while (a.get(0) == 0) {
      a.remove(0);
    }
    return a;
  }
}
