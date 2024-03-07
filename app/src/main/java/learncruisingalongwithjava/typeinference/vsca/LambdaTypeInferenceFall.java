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
  }

}
