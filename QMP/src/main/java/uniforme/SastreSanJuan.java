package uniforme;

import prenda.*;

public class SastreSanJuan {

  public Prenda fabricarParteSuperior(){
    PrendaBorrador borrador = new PrendaBorrador(CHOMBA);
    borrador.especificarColorPrimario(new Color(255, 255, 255));
    borrador.especificarTipoMaterial(TipoMaterial.PIQUE);
    return borrador.crearPrenda();
  }
  public Prenda fabricarParteInferior(){
    PrendaBorrador borrador = new PrendaBorrador(PANTALONJEAN);
    borrador.especificarColorPrimario(new Color(255, 255, 255));
    borrador.especificarTipoMaterial(TipoMaterial.JEAN);
    return borrador.crearPrenda();
  }
  public Prenda fabricarCalzado(){
    PrendaBorrador borrador = new PrendaBorrador(TOPPER);
    borrador.especificarColorPrimario(new Color(130, 130 , 130));
    borrador.especificarTipoMaterial(TipoMaterial.CUERO);
    return borrador.crearPrenda();
  }

  TipoDePrenda CHOMBA = new TipoDePrenda("Chomba",Categoria.PARTE_SUPERIOR);
  TipoDePrenda PANTALONJEAN = new TipoDePrenda("Jean Azul",Categoria.PARTE_INFERIOR);
  TipoDePrenda TOPPER = new TipoDePrenda("Topper Negras",Categoria.CALZADO);
}
