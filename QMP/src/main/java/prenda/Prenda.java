package prenda;

public class Prenda {
  TipoDePrenda tipoDePrenda;
  TipoMaterial material;
  Color colorPrimario;
  Color colorSecundario;
  Trama trama;
  Integer temperaturaMaxima;

  public Prenda(TipoDePrenda tipoDePrenda, TipoMaterial material, Color colorPrimario, Trama trama, Integer temperaturaMaxima) {
    this.tipoDePrenda = tipoDePrenda;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.trama = trama;
    this.temperaturaMaxima = temperaturaMaxima;
  }

  public Prenda(TipoDePrenda tipoDePrenda, TipoMaterial material, Color colorPrimario, Color colorSecundario, Trama trama, Integer temperaturaMaxima) {
    this.tipoDePrenda = tipoDePrenda;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
    this.trama = trama;
    this.temperaturaMaxima = temperaturaMaxima;
  }

  public boolean esApta(int temperatura) {
    return temperatura < temperaturaMaxima;
  }
}
