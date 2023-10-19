package one.dio.singleton;

/**
 *
 * SingletonEager "apressado".
 *
 * @author Evan
 *
 **/

public class SingletonEager {

  private static SingletonEager instancia = new SingletonEager();

  public SingletonEager() {
    super();
  }

  public static SingletonEager getInstancia() {
    return instancia;
  }
}
