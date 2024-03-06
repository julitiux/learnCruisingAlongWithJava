package learncruisingalongwithjava.typeinference.vsca;

import java.util.List;

public class Lambda {

  final List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 19);

  public void lambda() {

    /**
     * in the lambda expression, we specified the type of the parameter as Integer,
     * but in your wildest imagination.
     */
    numbers.forEach((Integer number) -> System.out.println(number * 2));

    /**
     * the compiler clearly knows the type in this context so do we. We can
     * drop the type information from in front of the parameter name like so:
     */
    numbers.forEach((number) -> System.out.println(number * 2));

  }

}
