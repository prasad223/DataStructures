package LeetCode;

import java.util.ArrayList;

/**
 * Created by prasad223 on 2/10/16.
 */
public class UnixSimplifyPath {

  public String simplifyPath(String path) {
    String[] folders = path.split("/");
    StringBuilder stringBuilder = new StringBuilder();
    ArrayList<String> list = new ArrayList<>();
    for (int i = 0; i < folders.length; i++) {
      if (!folders[i].isEmpty()) {
        switch (folders[i]) {
          case "..":
            if (!list.isEmpty()) {
              list.remove(list.size() - 1);
            }
            break;
          case ".":
            break;
          default:
            list.add(folders[i]);
            break;
        }
      }
    }

    for (String string : list) {
      stringBuilder.append("/");
      stringBuilder.append(string);
    }
    if (stringBuilder.length() == 0) {
      return "/";
    }
    return stringBuilder.toString();
  }
}
