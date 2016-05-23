package scratch;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import java.util.TreeMap;

/**
 * Created by prasad223 on 3/27/16.
 */
public class strsplit {
  static TreeMap<String, String> nodesMap = new TreeMap<>();

  public static void main(String[] args) {
    String[] nodes = new String[]{"5554"};//,"5556","5558","5560","5562"};

    for (String node : nodes) {
      nodesMap.put(genHash(node), node);
    }
    String smallKey = nodesMap.firstKey();
    String highKey = nodesMap.lastKey();
    System.out.println(nodesMap);
    System.out.println("small key: " + nodesMap.firstEntry());
    System.out.println("high key: " + nodesMap.lastEntry() + "\n\n");

    String[] messages = new String[]{"hey", "hi", "jdsfskhds", "kjhfdsd"};
    for (String msg : messages) {
      String hash = genHash(msg);
      System.out.println("msg : " + msg + ", hash: " + hash + " , compare: " + hash.compareTo(highKey));
      System.out.println("key for msg: " + getHashforKey(msg));
    }
  }

  private static String getHashforKey(String key) {
    String keyHash = genHash(key);
    String highKey = nodesMap.lastKey();
    if (keyHash.compareTo(highKey) > 0) {
      return nodesMap.firstKey();
    } else {
      return nodesMap.ceilingKey(keyHash);
    }
  }

  private static String genHash(String input) {
    try {
      MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
      byte[] sha1Hash = sha1.digest(input.getBytes());
      Formatter formatter = new Formatter();
      for (byte b : sha1Hash) {
        formatter.format("%02x", b);
      }
      //System.out.println("genHash:Input: "+ input +", output: " + formatter.toString());
      return formatter.toString();
    } catch (NoSuchAlgorithmException e) {
      System.out.println("Exception: " + e);
      e.printStackTrace();
    }
    return "";
  }
}
