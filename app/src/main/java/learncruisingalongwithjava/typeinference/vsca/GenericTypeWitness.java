package learncruisingalongwithjava.typeinference.vsca;

import java.util.function.Consumer;

public class GenericTypeWitness {

  public <T> void process(Consumer<T> consumer) {
  }

  public static void display(int value) {
  }

  public static void main(String[] args) {
    GenericTypeWitness instance = new GenericTypeWitness();
    instance.process(input -> display(input)); //ERROR
  }

}
