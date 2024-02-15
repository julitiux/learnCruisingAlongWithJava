package learncruisingalongwithjava.typeinference.vsca;

import java.util.Collections;
import java.util.List;

public class GenericsTypeInference {

  /**
   * In the call to the singletonList() of the JDK Collections utility class, the compiler
   * determinaed the return type, based on the type of the argument. The part of the left-hand-side
   * of the assignment did nothing to influence the inference in this case.
   */
  List<String> justOne = Collections.singletonList("howdy");

  /**
   * in the call to the emptyList() method, the right-hand-side does not provide enough context
   * for the compiler walked an extra mile and looked at where the result is being assigned to and
   * inferred the type based on that.
   */
  List<String> nothingHere = Collections.emptyList();

  /**
   * you may specify a type witness, a hint, to the compiler, as in the next code snippet, and
   * the compiler will againnot use the left-hand-side to decide the type
   */
  List<Integer> nothingHereToo = Collections.<Integer>emptyList();

}
