package learncruisingalongwithjava.typeinference.vsca;

import java.util.HashMap;
import java.util.List;

public class Variable {

  public static void greet() {
    var message = "hello there";
    System.out.println(message);

    // consider the following
    HashMap<String, List<Integer>> scores = new HashMap<String, List<Integer>>();

    // we can us type inference and make that line crisp
    var score = new HashMap<String, List<Integer>>();
  }

}
