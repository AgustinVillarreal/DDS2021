package guardarropa;

import prenda.Prenda;
import user.User;

import java.util.List;
import java.util.stream.Collectors;

public class Guardarropa {

  List<Prenda> prendas;
  List<User> duenios;
  List<PrendaSugerida> prendasParaAgregar;
  List<PrendaSugerida> prendasParaEliminar;

  public Guardarropa(List<Prenda> prendas, List<User> duenios) {
    this.prendas = prendas;
    this.duenios = duenios;
  }

  public void sugerirPrenda(PrendaSugerida unaPrenda) {
    prendasParaAgregar.add(unaPrenda);
  }

  public void quitarPrenda(PrendaSugerida unaPrenda) {
    prendasParaEliminar.add(unaPrenda);
  }

  public List<PrendaSugerida> getPrendasParaAgregar() {
    return prendasParaAgregar;
  }

  public List<PrendaSugerida> getPrendasParaEliminar() {
    return prendasParaEliminar;
  }

  public void confirmarPropuesta(PrendaSugerida unaPrenda) {
    unaPrenda.setAceptada(true);
  }

  public void incorporarModificaciones(){
    prendas.addAll(prendasAgregadas());
    prendas.removeAll(prendasEliminadas());
  }

  public void deshacerModificaciones() {
    prendas.removeAll(prendasAgregadas());
    prendas.addAll(prendasEliminadas());
  }

  public List<Prenda> prendasAgregadas() {
    return prendasModificadas(prendasParaAgregar);
  }

  public List<Prenda> prendasEliminadas() {
    return prendasModificadas(prendasParaEliminar);
  }

  public List<Prenda> prendasModificadas(List<PrendaSugerida> unasPrendas) {
    List<PrendaSugerida> prendasSugeridasParaEliminar = unasPrendas.stream().filter(unaPrenda -> unaPrenda.isAceptada()).collect(Collectors.toList());
    return prendasSugeridasParaEliminar.stream().map(sugerencia -> sugerencia.getPrenda()).collect(Collectors.toList());
  }

}
