package HackerRank;

/**
 * Created by prasad223 on 1/9/16.
 */

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Pal1 {

  static String[] getSuspiciousList(String[] transactions) {
    final int FRAUD_THRESHOLD_AMOUNT = 3000;
    final int FRAUD_TIME_DURATION = 60;

    Map<String, Map<Integer, Transaction>> personTransactions = new HashMap<>();
    Map<Integer, String> result = new TreeMap<Integer, String>();
    Transaction transaction = null;
    Map<Integer, Transaction> temp = null;
    boolean isFraud;
    int fraudTime, tempTime;
    for (String s : transactions) {
      transaction = new Transaction(s);
      if (personTransactions.containsKey(transaction.name)) {
        personTransactions.get(transaction.name).put(transaction.time, transaction);
      } else {
        temp = new TreeMap<>();
        temp.put(transaction.time, transaction);
        personTransactions.put(transaction.name, temp);
      }
    }
    for (Map.Entry<String, Map<Integer, Transaction>> entry : personTransactions.entrySet()) {
      isFraud = false;
      fraudTime = Integer.MAX_VALUE;
      int previousTime = -1, currentTime = 0;
      String previousLocation = null, currentLocation = null;
      for (Map.Entry<Integer, Transaction> pTransaction : entry.getValue().entrySet()) {


        if (pTransaction.getValue().amount > FRAUD_THRESHOLD_AMOUNT) {
          isFraud = true;
          if (pTransaction.getValue().time < fraudTime) {
            fraudTime = pTransaction.getKey();
          }
        }

        if (previousTime > 0 && previousLocation != null) {

          currentTime = pTransaction.getKey();
          currentLocation = pTransaction.getValue().place;
          if (currentTime - previousTime < FRAUD_TIME_DURATION && !previousLocation.equals(currentLocation)) {
            isFraud = true;
            if (previousTime < fraudTime) {
              fraudTime = previousTime;
            }
          }
        }
        previousTime = pTransaction.getValue().time;
        previousLocation = pTransaction.getValue().place;
      }

      if (isFraud) {
        result.put(fraudTime, entry.getKey());
      }
    }
    for (Map.Entry<Integer, String> entry : result.entrySet()) {
      System.out.println(entry.getKey() + ", " + entry.getValue());
    }
    return result.values().toArray(new String[0]);
  }

  public static void main(String[] args) throws IOException {
    String[] times = new String[]{"Shilpa|500|California|63",
            "Tom|25|New York|615",
            "Krasi|9000|California|1230",
            "Tom|25|New York|1235",
            "Tom|25|New York|1238",
            "Shilpa|50|Michigan|1300",
            "Matt|90000|Georgia|1305",
            "Jay|100000|Virginia|1310",
            "Krasi|49|Florida|1320",
            "Krasi|83|California|1325",
            "Shilpa|50|California|1350"};
    System.out.println(getSuspiciousList(times));
  }

  private static class Transaction {
    String name, place;
    int amount, time;

    Transaction(String trans) {
      String[] values = trans.split("\\|");
      this.name = values[0];
      this.place = values[2];
      this.amount = Integer.parseInt(values[1]);
      this.time = Integer.parseInt(values[3]);
    }
  }

}