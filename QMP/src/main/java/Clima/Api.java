package Clima;

import java.util.List;
import java.util.Map;

public interface Api {
  public List<Map<String, Object>> getWeather(String ciudad);
}
