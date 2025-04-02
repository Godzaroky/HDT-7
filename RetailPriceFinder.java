import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RetailPriceFinder {
    public static void main(String[] args) {
        String file = "C:\\UVG\\HDT-7\\home appliance skus lowes.csv";
        List<Product> productList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean firstLine = true; // Para omitir la cabecera
            
            while ((line = br.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }
    }
}