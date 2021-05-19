package atuendo;

import prenda.Prenda;
import asesorImagen.AsesorImagen;
import uniforme.Uniforme;

public class Atuendo {

  Prenda accesorio;
  Prenda parteSuperior;
  Prenda parteInferior;
  Prenda calzado;

  public Atuendo(Prenda accesorio, Prenda parteSuperior, Prenda parteInferior, Prenda calzado) {
    this.accesorio = accesorio;
    this.parteSuperior = parteSuperior;
    this.parteInferior = parteInferior;
    this.calzado = calzado;
  }

  public boolean esAptaParaTemperatura(int temperatura) {
    return accesorio.esApta(temperatura) && parteInferior.esApta(temperatura) && parteSuperior.esApta(temperatura) && calzado.esApta(temperatura);
  }
}
