package one.dio;

import one.dio.facade.Facade;
import one.dio.singleton.SingletonEager;
import one.dio.singleton.SingletonLazy;
import one.dio.singleton.SingletonLazyHolder;
import one.dio.strategy.Comportamento;
import one.dio.strategy.ComportamentoAgressivo;
import one.dio.strategy.ComportamentoDefensivo;
import one.dio.strategy.ComportamentoNormal;
import one.dio.strategy.Robo;

public class Main {
  // testes de desing patern Singleton
  public static void main(String[] args) {
    // SingletonLazy lazy = SingletonLazy.getInstancia();
    // System.out.println(lazy);
    // lazy = SingletonLazy.getInstancia();
    // System.out.println(lazy);
    //
    // SingletonEager eager = new SingletonEager().getInstancia();
    // System.out.println(eager);
    // eager = new SingletonEager().getInstancia();
    // System.out.println(eager);
    //
    // SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
    // System.out.println(holder);
    // holder = SingletonLazyHolder.getInstancia();
    // System.out.println(holder);
    //
    //
    // Comportamento defensivo = new ComportamentoDefensivo();
    // Comportamento normal = new ComportamentoNormal();
    // Comportamento agressivo = new ComportamentoAgressivo();
    //
    // Robo robo = new Robo();
    // robo.setComportamento(normal);
    // robo.mover();
    // robo.mover();
    // robo.setComportamento(agressivo);
    // robo.mover();
    // robo.mover();
    // robo.setComportamento(defensivo);
    // robo.mover();
    // robo.mover();

    // Facade
    //

    Facade facade = new Facade();
    facade.migrarCliente("Evan", "08748000");
  }
}
