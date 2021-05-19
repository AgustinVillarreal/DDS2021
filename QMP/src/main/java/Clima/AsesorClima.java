package Clima;

import java.util.List;
import java.util.Map;

public class AsesorClima {
  /* Pensar como ser mas eficiente para que no nos cobren tanta plata*/
  Api api;

  public AsesorClima(Api api) {
    this.api = api;
  }

  public List<Map<String, Object>> obtenerCondicionesClimaticas(String ciudad){
    return api.getWeather(ciudad);
  }
}
