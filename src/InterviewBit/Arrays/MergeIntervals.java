package InterviewBit.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by prasad on 5/21/16.
 */

/**
 * Definition for an interval.
 * public class Interval {
 * int start;
 * int end;
 * Interval() { start = 0; end = 0; }
 * Interval(int s, int e) { start = s; end = e; }
 * }
 */

class Interval {
  int start;
  int end;

  Interval() {
    start = 0;
    end = 0;
  }

  Interval(int s, int e) {
    start = s;
    end = e;
  }

  @Override
  public String toString() {
    return "(" + start +
            ", " + end +
            ')';
  }
}

public class MergeIntervals {

  public ArrayList<Interval> mergeIntervals(ArrayList<Interval> intervals, Interval newInterval) {
    intervals.add(newInterval);
    return mergeOverlapIntervals(intervals);
  }

  public boolean isPointsOverlap(Interval o1, Interval o2) {
    return (o1.start <= o2.start && o2.start <= o1.end) || (o1.start <= o2.end && o2.end <= o1.end);
  }

  public Interval mergePoints(Interval o1, Interval o2) {
    Interval temp = new Interval();
    temp.start = Math.min(o1.start, o2.start);
    temp.end = Math.max(o1.end, o2.end);
    return temp;
  }

  public ArrayList<Interval> mergeOverlapIntervals(ArrayList<Interval> intervals) {
    ArrayList<Interval> result = new ArrayList<>();
    Interval prev = null;
    Collections.sort(intervals, new IntervalComparator());
    for (Interval cur : intervals) {
      if (prev == null) {
        prev = cur;
        continue;
      }
      if (isPointsOverlap(prev, cur)) {
        cur = mergePoints(prev, cur);
      } else {
        result.add(prev);
      }
      prev = cur;
    }
    result.add(prev);
    return result;
  }

  class IntervalComparator implements Comparator<Interval> {
    @Override
    public int compare(Interval t1, Interval t2) {
      int res = Integer.compare(t1.start, t2.start);
      if (res == 0) {
        res = Integer.compare(t1.end, t2.end);
      }
      return res;
    }
  }

}
