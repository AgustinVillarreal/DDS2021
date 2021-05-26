public class Prenda {
  TipoDePrenda tipoDePrenda;
  Material material;
  Color colorPrimario;
  Color colorSecundario;
  Trama trama;

  public void Prenda(TipoDePrenda tipoDePrenda,  Material material, Color colorPrimario){
  this.tipoDePrenda = tipoDePrenda
  this.material = material
  this.colorPrimario = colorPrimario
  }

  public void Prenda(TipoDePrenda tipoDePrenda,  Material material, Color colorPrimario, Color colorSecundario){
  this.Prenda(tipoPrenda, material, colorPrimario);
  this.colorSecundario = colorSecundario
}

public class PrendaBorrador{
  TipoDePrenda tipoDePrenda;
  Material material;
  Color colorPrimario;
  Color colorSecundario;
  Trama trama;

  public void PrendaBorrador(TipoDePrenda tipoDePrenda){
    this.tipoDePrenda = requireNonNull(tipoDePrenda, "tipo de prenda es obligatorio")
  }
  public void setColorPrimario(Color colorPrimario){
    this.colorPrimario = requireNonNull(colorPrimario, "color es obligatorio")
  }
  public void setColorSecundario(Color colorSecundario){
    this.colorSecundario = requireNonNull(colorSecundario, "color es obligatorio")
  }
  public void setMaterial(Material material){
      validateNonNull(material)
      this.validarConsistencia(material)
      this.material = material
  }
  public void crearPrenda(){
    if(colorPrimario == null || material == null){
      throw new Exception(message="El color primario y el material son obligatorios")
    }
    if(colorSecundario == null){
      return new Prenda(tipo, material, colorPrincipal)
    }else{
      return new Prenda(tipo, material, colorPrincipal, colorSecundario)
    }

  }
}

class Uniforme {
  Prenda parteSuperior;
  Prenda parteInferior;
  Prenda calzado;

  public void Uniforme(Prenda parteSuperior,Prenda parteInferior, Prenda calzado){
    parteSuperior.validarParteSuperior()
    parteInferior.validarParteInferior()
    calzado.validarCalzado()
    this.parteSuperior = parteSuperior
    this.parteInferior = parteInferior
    this.calzado = calzado
  }
}

Uniforme uniformeSanJuan = new Uniforme(...)
Uniforme uniformeJohnson = new Uniforme(...)

enum Trama {
  LISA, RAYADA, CON_LUNARES, A_CUADROS, ESTAMPADA
}

enum TipoMaterial{
  ALGODON, LANA
}

enum Color{
  ROJO, VERDE, GRIS...
}

Class Material{
  Trama trama = Trama.LISA
  TipoMaterial tipoMaterial

  public void Material(TipoMaterial tipoMaterial){
    this.tipoMaterial = tipoMaterial
  }

  public void Material(Trama trama, TipoMaterial tipoMaterial){
    this.trama = trama
    this.tipoMaterial = tipoMaterial
  }
}

class TipoDePrenda{
  Categoria categoria
  String nombre
}

Enum Categorias{
  SUPERIOR, CALZADO, INFERIOR, ACCESORIOS
}
