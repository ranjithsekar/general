package jbr;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class CityUtil {

  public static void main(String[] args) throws Exception {
    getCityObjList();
  }

  public static List<City> getCityObjList() throws IOException {
    List<City> cities = Files.readAllLines(Paths.get("city-simple1/city.data")).stream().map(line -> {
      String[] val = line.split("\\|");
      return new City(val[0], val[1], val[2], val[3], val[4], val[5]);
    }).collect(Collectors.toList());
    System.out.println(cities.stream().map(e -> e.getName()).collect(Collectors.joining(",")));

    return cities;
  }

}
