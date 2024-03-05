package learncruisingalongwithjava.typeinference.vsca;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Diamond {

  /**
   * Java 7 added a useful nugget, th diamond operator. We had to specify
   * type information redundantly on both sides when instantiating an object
   */
  Map<String, List<Integer>> scores = new HashMap<String, List<Integer>>();

}
