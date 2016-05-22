package InterviewBit.Arrays;

import junit.framework.TestCase;

import java.util.ArrayList;

/**
 * Created by prasad on 5/21/16.
 */
public class MergeIntervalsTest extends TestCase {

  MergeIntervals mergeIntervals = null;
  ArrayList<Interval> numbers = null;

  public void setUp() throws Exception {
    super.setUp();
    mergeIntervals = new MergeIntervals();
    numbers = new ArrayList<>();
    numbers.add(new Interval(1,5));
  }

  public void tearDown() throws Exception {
    numbers = null;
    mergeIntervals = null;
  }

  public void testMergeOverlapIntervals()throws Exception{
    numbers.add(new Interval(7,10));
    System.out.println("num: " + numbers + " ,result: " + mergeIntervals.mergeOverlapIntervals(numbers));
    numbers.add(new Interval(8,10));
    System.out.println("num: " + numbers + " ,result: " + mergeIntervals.mergeOverlapIntervals(numbers));
    numbers.add(new Interval(9,15));
    System.out.println("num: " + numbers + " ,result: " + mergeIntervals.mergeOverlapIntervals(numbers));
  }

  public void testisPointsOverlap()throws Exception{
    Interval o1 = new Interval(1,2);
    Interval o2 = new Interval(3,4);
    assertEquals(false, mergeIntervals.isPointsOverlap(o1,o2));
    o1.start = 1;   o1.end = 4;
    o2.start = 3;   o2.end = 5;
    assertEquals(true, mergeIntervals.isPointsOverlap(o1,o2));
    o1.start = 1;   o1.end = 5;
    o2.start = 2;   o2.end = 4;
    assertEquals(true, mergeIntervals.isPointsOverlap(o1,o2));
    o1.start = 2;   o1.end = 5;
    o2.start = 1;   o2.end = 3;
    assertEquals(true, mergeIntervals.isPointsOverlap(o1,o2));
    o1.start = 5;   o1.end = 8;
    o2.start = 1;   o2.end = 2;
    assertEquals(false, mergeIntervals.isPointsOverlap(o1,o2));
  }

  public void testMergeIntervals() throws Exception {
    Interval temp = new Interval(5,8);
    System.out.println("num: " + numbers + " ,temp:  " + temp + " ,result: " + mergeIntervals.mergeIntervals(numbers , temp));
    numbers.add(new Interval(4,5));
    System.out.println("num: " + numbers + " ,temp:  " + temp + " ,result: " + mergeIntervals.mergeIntervals(numbers , temp));
    numbers.add(new Interval(6,8));
    numbers.add(new Interval(11,12));
    System.out.println("num: " + numbers + " ,temp:  " + temp + " ,result: " + mergeIntervals.mergeIntervals(numbers , temp));
    temp = new Interval(2,15);
    System.out.println("num: " + numbers + " ,temp:  " + temp + " ,result: " + mergeIntervals.mergeIntervals(numbers , temp));
    temp = new Interval(3,15);
    System.out.println("num: " + numbers + " ,temp:  " + temp + " ,result: " + mergeIntervals.mergeIntervals(numbers , temp));
    temp = new Interval(2,9);
    System.out.println("num: " + numbers + " ,temp:  " + temp + " ,result: " + mergeIntervals.mergeIntervals(numbers , temp));
    temp = new Interval(-2,-1);
    System.out.println("num: " + numbers + " ,temp:  " + temp + " ,result: " + mergeIntervals.mergeIntervals(numbers , temp));
    temp = new Interval(-2,10);
    System.out.println("num: " + numbers + " ,temp:  " + temp + " ,result: " + mergeIntervals.mergeIntervals(numbers , temp));
    numbers.add(new Interval(29823256, 32060921));
    numbers.add(new Interval(33950165, 61984119));
    numbers.add(new Interval(61984218, 64859907));
    numbers.add(new Interval(65277782, 65296274));
    temp = new Interval(36210193, 61984219);
    System.out.println("num: " + numbers + " ,temp:  " + temp + " ,result: " + mergeIntervals.mergeIntervals(numbers , temp));

  }

}