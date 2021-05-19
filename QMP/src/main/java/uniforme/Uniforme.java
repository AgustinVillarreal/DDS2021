package uniforme;

import prenda.Prenda;

public class Uniforme {

  Prenda parteSuperior;
  Prenda parteInferior;
  Prenda calzado;

  public Uniforme(Prenda parteSuperior, Prenda parteInferior, Prenda calzado) {
    this.parteSuperior = parteSuperior;
    this.parteInferior = parteInferior;
    this.calzado = calzado;
  }

  public static Uniforme fabricar(Sastre sastre){
    return new Uniforme(sastre.fabricarParteSuperior(), sastre.fabricarParteInferior(), sastre.fabricarCalzado());
  }
}
