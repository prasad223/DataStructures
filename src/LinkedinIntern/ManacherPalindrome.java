package LinkedinIntern;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by prasad223 on 12/29/15.
 */
public class ManacherPalindrome {

  static boolean isPalindrome(String input) {
    boolean ispalin = true;
    int i = 0, j = input.length() - 1;
    while (i > j) {
      if (input.charAt(i) != input.charAt(j)) {
        ispalin = false;
        break;
      }
      i++;
      j--;
    }
    return ispalin;
  }

  static int distinctPalindromeCount(String str) {
    Set<String> distpalindrome = new HashSet<>();
    String temp;
    boolean isRightIncrement;
    int startIndex, endIndex;
    for (int i = 0; i < str.length(); i++) {
      distpalindrome.add(Character.toString(str.charAt(i)));
      isRightIncrement = true;
      startIndex = i;
      for (int j = i + 1; j < str.length() - 1; j++) {
        endIndex = Math.max(j, str.length() - 1);
        if (isRightIncrement) {
          startIndex = Math.max(0, startIndex - 1);
          isRightIncrement ^= isRightIncrement;
        }
        temp = str.substring(startIndex, endIndex);
        if (!distpalindrome.contains(temp)) {
          if (isPalindrome(temp)) {
            distpalindrome.add(temp);
          } else {
            break;
          }
        }
      }
    }
    return distpalindrome.size();
  }

  static int distinctPalindromeCount2(String str) {
    int strSize = str.length();
    Set<String> distinctPalindromes = new HashSet<>();
    int[][] R = new int[2][strSize + 1];
    str = "@" + str + "#";
    int palRad;
    for (int numIndex = 0; numIndex <= 1; numIndex++) {
      palRad = 0;
      R[numIndex][0] = 0;
      int index = 1;
      while (index <= strSize) {
        while (str.charAt(index - palRad - 1) == str.charAt(index + numIndex + palRad)) {
          palRad++;
        }

        R[numIndex][index] = palRad;
        int k = 1;
        while ((R[numIndex][index - k] != palRad - k) && (k < palRad)) {
          R[numIndex][index + k] = Math.min(R[numIndex][index - k], palRad - k);
          k++;
        }
        palRad = Math.max(palRad - k, 0);
        index += k;
      }
    }
    str = str.substring(1, str.length() - 1);
    distinctPalindromes.add(str.substring(0, 1));
    for (int i = 1; i <= strSize; i++) {
      for (int j = 0; j <= 1; j++) {
        for (int palrad = R[j][i]; palrad > 0; palrad--) {
          distinctPalindromes.add(str.substring(i - palrad - 1, i - palrad - 1 + 2 * palrad + j));
        }
      }
      if (i < strSize) {
        distinctPalindromes.add(Character.toString(str.charAt(i)));
      }
    }
    return distinctPalindromes.size();
  }

  public static void main(String[] args) {
    String input = "aabaa";
    System.out.println(distinctPalindromeCount(input));
    System.out.println(distinctPalindromeCount2(input));
  }
}
