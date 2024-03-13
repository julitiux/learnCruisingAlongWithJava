package learncruisingalongwithjava.typeinference.vsca;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;

import static java.util.stream.Collectors.*;

public class Variable {

  public static void greet() {
    var message = "hello there";
    System.out.println(message);

    // consider the following
    HashMap<String, List<Integer>> scores = new HashMap<String, List<Integer>>();

    // we can us type inference and make that line crisp
    var score = new HashMap<String, List<Integer>>();

    // the type variable numberCores is inferred as int based return type of the
    // availableProcessors() methods return type.
    var numberOfCores = Runtime.getRuntime().availableProcessors();
  }

  public static void refactoring() {
    List<String> languages = List.of("C++", "C", "Erlang", "Elm", "Haskell", "Ruby", "Python");
    List<String> jvmLanguages = List.of("Java", "Kotlin", "Scala", "Groovy", "Clojure", "JRuby");

    Map<Integer, List<String>> namesByLength = languages.stream()
      .collect(
        groupingBy((String name) -> name.length(),
          mapping((String name) -> name.toUpperCase(),
            toList())));

    Map<Integer, List<String>> jvmNamesByLength = jvmLanguages.stream()
      .collect(
        groupingBy((String name) -> name.length(),
          mapping((String name) -> name.toUpperCase(),
            toList())));

    /**
     * MAKING REFACTOR
     */

    Collector<String, ?, Map<Integer, List<String>>> groupingCriteria =
      groupingBy((String name) -> name.length(),
        mapping((String name) -> name.toUpperCase(), toList()));

    Map<Integer, List<String>> namesByLengthRefactor = languages.stream()
      .collect(groupingCriteria);

    Map<Integer, List<String>> jvmNamesByLengthRefactor = jvmLanguages.stream()
      .collect(groupingCriteria);

    var groupingCriteriaVar =
      groupingBy((String name) -> name.length(),
        mapping((String name) -> name.toUpperCase(), toList()));

    var namesByLengthRefactorVar = languages.stream()
      .collect(groupingCriteria);

    var jvmNamesByLengthRefactorVar = jvmLanguages.stream()
      .collect(groupingCriteria);

  }

}
