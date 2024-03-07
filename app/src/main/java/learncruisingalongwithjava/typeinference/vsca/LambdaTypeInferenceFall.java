package learncruisingalongwithjava.typeinference.vsca;

import java.util.List;

import static java.util.Comparator.comparing;

public class LambdaTypeInferenceFall {

  List<String> languages = List.of("Java", "Kotlin", "Scala", "Groovy", "Clojure", "JRuby");

  public void lambdaTypeInferenceFall() {

    /**
     * we used type inference for the parameter of the lambda expression passer to the comparing() method
     */
    languages.stream()
      .sorted(comparing(name -> name.length()))
      .forEach(System.out::println);

    /**
     * ERROR: cannot find the symbol length() on variable name of type Object
     */
    languages.stream()
      .sorted(comparing(name -> name.length()).reversed());

    /**
     * it looks to where the result of comparing() goes to, and it finds Stream<String>.sorted(Comparator<T>)
     * and determines that T should be String in this situation
     */
    languages.stream()
      .sorted(comparing(name -> name.length()));

    /**
     * this is a reasonable approach if the lambda cannot be replaced by a method reference.
     * If the lambda does not to much with the paramter and merely passes it through to another
     * function
     */
    languages.stream()
      .sorted(comparing((String name) -> name.length()).reversed());

    /**
     * the method reference gives enough context to the compiler to realize that we are talking about a String and
     * not a Object, and it rides forward with that information
     */
    languages.stream()
      .sorted(comparing(String::length).reversed());
  }

}
