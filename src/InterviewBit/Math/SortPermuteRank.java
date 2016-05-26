package InterviewBit.Math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by prasad on 5/25/16.
 */
public class SortPermuteRank {


  public int findFactorial(int n, int mod) {
    int fact = 1;
    for (int i = 2; i <= n; i++) {
      fact = (fact % mod) * (i % mod);
    }
    return fact % mod;
  }

  public int findSortPermuteRank(String a) {
    int curRank = 0;
    int n = a.length();
    ArrayList<Character> letters = new ArrayList<>(n);
    for (int i = 0; i < n; i++) {
      letters.add(a.charAt(i));
    }
    Collections.sort(letters);
    for (int i = 0; i < n; i++) {
      int charIndex = Collections.binarySearch(letters, a.charAt(i));
      curRank += charIndex * findFactorial(n - 1 - i, 1000003);
      letters.remove(charIndex);
    }
    curRank++;
    return curRank % 1000003;
  }

  public TreeMap<Character, Integer> getCharCounts(String a) {
    TreeMap<Character, Integer> letters = new TreeMap<>();
    char ch;
    for (int i = 0; i < a.length(); i++) {
      ch = a.charAt(i);
      if (letters.containsKey(ch)) {
        letters.put(ch, letters.get(ch) + 1);
      } else {
        letters.put(ch, 1);
      }
    }
    return letters;
  }

  public int getRepeatedCharCount(char ch, TreeMap<Character, Integer> letters, int mod) {
    int repFact = 1;
    for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
      if (entry.getKey() <= ch && entry.getValue() > 1) {
        repFact = (repFact % mod) * (findFactorial(entry.getValue(), 1000003) / mod);
      }
      if (entry.getKey() == ch) {
        break;
      }
    }
    return repFact;
  }

  public int findSortPermuteRankRepeat(String a) {
    int mod = 1000003;
    int curRank = 0;
    int n = a.length();
    TreeMap<Character, Integer> letters = getCharCounts(a);
    char ch;
    int charIndex;
    ArrayList<Character> letter = new ArrayList<>(letters.keySet());
    for (int i = 0; i < n; i++) {
      ch = a.charAt(i);
      charIndex = Collections.binarySearch(letter, ch);
      int count = letters.get(ch);
      int denom = getRepeatedCharCount(ch, letters, mod);
      if (denom > 0) {
        curRank += charIndex * (findFactorial(n - 1 - i, mod) / denom);
      }
      if (count == 1) {
        letters.remove(ch);
        letter.remove(charIndex);
      } else {
        letters.put(ch, count - 1);
      }
    }
    curRank++;
    return curRank % mod;
  }

}
