package jbr;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductUtil {

  public static void main(String[] args) throws IOException {
    generateProductObjectList();
    generateInsertScript();
  }

  public static List<Product> generateProductObjectList() throws IOException {

    String objects = Files.readAllLines(Paths.get("product-simple1/products.data")).stream().map(line -> {
      String val = "\"" + String.join("\",\"", Arrays.asList(line.split("\\|"))) + "\"";
      return "new Product(" + val + ")";
    }).collect(Collectors.joining(","));
    System.out.println(objects);

    // copy paste output
    List<Product> products = Arrays.asList(new Product("101", "Samsung J7", "Mobile", "Samsung smart phone", "7000"),
        new Product("102", "Realme J10", "Mobile", "Redmi smart phone", "9000"),
        new Product("201", "Acer T43", "Laptop", "Acer gaming laptop", "41000"),
        new Product("202", "Dell 300", "Laptop", "Dell Vostro laptop", "71000"),
        new Product("301", "Samsung Tab 10", "Tablet", "Samsung multimedia Tablet PC", "21000"),
        new Product("302", "Levono Tab 4D", "Tablet", "Lenovo Tablet PC", "33000"),
        new Product("401", "LG Television", "Television", "LG Smart TV 32", "15000"),
        new Product("402", "Samsung Television", "Television", "Samsung Smart TV 41", "35000"), new Product("501",
            "Simens Washing Machine", "Washing machine", "Simens heavy load washing machine 6.5kg", "25000"),
        new Product("502", "LG Washing Machine", "Washing machine", "LG washing machine 5.5kg", "15000"));
    System.out.println(products.size());
    return products;
  }

  public static void generateInsertScript() throws IOException {
    List<String> insert = Files.readAllLines(Paths.get("product-simple1/products.data")).stream().map(line -> {
      String val = "'" + String.join("','", Arrays.asList(line.split("\\|"))) + "'";
      return "INSERT INTO product VALUES(" + val + ");";
    }).collect(Collectors.toList());
    Files.write(Paths.get("product-simple1/products-insert.sql"), insert);
  }

}
