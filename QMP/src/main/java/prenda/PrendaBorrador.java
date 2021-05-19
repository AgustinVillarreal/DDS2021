package prenda;

import java.util.Objects;

public class PrendaBorrador {
  TipoDePrenda tipoDePrenda;
  TipoMaterial material;
  Color colorPrimario;
  Color colorSecundario;
  Integer temperaturaMaxima;
  Trama trama = Trama.LISA;

  public PrendaBorrador(TipoDePrenda tipoDePrenda) {
    this.tipoDePrenda = tipoDePrenda;
  }

  public PrendaBorrador especificarColorPrimario(Color colorPrimario){
    this.colorPrimario = Objects.requireNonNull(colorPrimario);
    return this;
  }
  public PrendaBorrador especificarTipoMaterial(TipoMaterial material){
    //TODO: validar tipo de material compatible con tipo de prenda
    this.material = Objects.requireNonNull(material);
    return this;
  }
  public PrendaBorrador especificarColorSecundario(Color colorSecundario){
    this.colorSecundario = Objects.requireNonNull(colorSecundario);
    return this;
  }
  public PrendaBorrador especificarTrama(Trama trama){
    if(trama != null) { this.trama = trama; }
    return this;
  }
  public PrendaBorrador especificarTemperaturaMaxima(Integer temperaturaMaxima){
    this.temperaturaMaxima = Objects.requireNonNull(temperaturaMaxima);
    return this;
  }

  public Prenda crearPrenda(){
    if(colorPrimario == null || material == null || temperaturaMaxima == null){
      //TODO
      //throw new Exception(message = "El color primario y el material son obligatorios");
    }
    if(colorSecundario == null){
      return new Prenda(tipoDePrenda, material, colorPrimario, trama, temperaturaMaxima);
    }else{
      return new Prenda(tipoDePrenda, material, colorPrimario, colorSecundario, trama, temperaturaMaxima);
    }
  }

}

