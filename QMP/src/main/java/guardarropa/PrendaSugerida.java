package guardarropa;

import prenda.Prenda;

public class PrendaSugerida {
  Prenda prenda;
  boolean aceptada;

  public Prenda getPrenda() {
    return prenda;
  }


  public PrendaSugerida(Prenda prenda) {
    this.prenda = prenda;
  }

  public void setAceptada(boolean aceptada) {
    this.aceptada = aceptada;
  }

  public boolean isAceptada() {
    return aceptada;
  }
}
