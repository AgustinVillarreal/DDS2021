package asesorImagen;

import Clima.AsesorClima;
import atuendo.Atuendo;
import prenda.Prenda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AsesorImagen {

  AsesorClima asesorClima;

  public AsesorImagen(AsesorClima asesorClima) {
    this.asesorClima = asesorClima;
  }

  public List<Atuendo> sugerirAtuendos(List<Prenda> armario, String ciudad){
    List<Map<String, Object>> estadoClima = asesorClima.obtenerCondicionesClimaticas(ciudad);

    HashMap<String, Object> temp = (HashMap<String, Object>) estadoClima.get(0).get("Temperature");
    int temperatura = (int) temp.get("Value");
    /* Otras medidas climaticas a evaluar*/

    List<Atuendo> combinatoriaDeAtuendos = armarAtuendos(armario);

    return combinatoriaDeAtuendos
        .stream()
        .filter( combinatoria ->  combinatoria.esAptaParaTemperatura(temperatura))
        /*Demas filtros*/
        .collect(Collectors.toList());

  }

  private List<Atuendo> armarAtuendos(List<Prenda> armario) {
    return hacerCombinatoria(armario);
  }

  private List<Atuendo> hacerCombinatoria(List<Prenda> prendasSugeridas) {
    //TODO /* Retorna todos los posibles atuendos segun las prendas*/
    return null;
  }

  private List<Prenda> prendasSugeridas(List<Prenda> armario, int temperatura) {
    return armario.stream().filter(prenda -> prenda.esApta(temperatura)).collect(Collectors.toList());
  }
}
