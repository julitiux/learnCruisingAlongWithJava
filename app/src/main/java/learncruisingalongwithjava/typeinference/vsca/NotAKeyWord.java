package learncruisingalongwithjava.typeinference.vsca;

public class NotAKeyWord {

  public void notAKeyWord(){
    var PI = Math.PI;
    String var = "please don't"; // Possible, but not a good idea
    // var var = "please don't"; // Also possible, but avoid

    System.out.println(var); //print: please don't
  }

}
