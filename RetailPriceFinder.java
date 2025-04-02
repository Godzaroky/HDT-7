import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RetailPriceFinder {
    public static void main(String[] args) {
        String file = "C:\\UVG\\HDT-7\\home appliance skus lowes.csv";
        List<Product> productList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            boolean firstLine = true; // Para omitir la cabecera
            
            while ((line = br.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }

                String[] data = line.split(",");
                if (data.length < 20) continue; // Verifica que haya suficientes columnas

                String sku = data[0];
                double priceRetail = Double.parseDouble(data[1]);
                double priceCurrent = Double.parseDouble(data[2]);
                String productName = data[3];
                String category = data[4];

                productList.add(new Product(sku, priceRetail, priceCurrent, productName, category));
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        for(Product product : productList){
            System.out.println(product);
        }
    }
}