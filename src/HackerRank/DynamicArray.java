package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by prasad223 on 12/24/15.
 */
public class DynamicArray {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    final long N = in.nextLong();
    final long Q = in.nextLong();
    int opType, seqNum = 0, position = 0;
    long x, y, lastans = 0L;

    ArrayList<ArrayList<Long>> sequences = new ArrayList<ArrayList<Long>>((int) N);
    for (int i = 0; i < (int) N; i++) {
      sequences.add(new ArrayList<Long>());
    }
    for (int k = 0; k < Q; k++) {
      opType = in.nextInt();
      x = in.nextLong();
      y = in.nextLong();
      if (opType == 1) {
        seqNum = (int) ((x ^ lastans) % N);
        sequences.get(seqNum).add(y);
        System.out.println(sequences.get(seqNum));
      } else if (opType == 2) {
        seqNum = (int) ((x ^ lastans) % N);
        position = (int) (y % (long) sequences.get(seqNum).size());
        lastans = sequences.get(seqNum).get(position);
        System.out.println(lastans);
      }
    }
  }

}
