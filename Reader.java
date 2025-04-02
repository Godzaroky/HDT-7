
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Reader {
    public static void main (String[] args) {
        String file = "C:\\UVG\\HDT-7\\home appliance skus lowes.csv";
        String line;
        String separator = ",";

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            while((line = br.readLine()) != null){
                String [] values = line.split(separator);
                for(String value : values) {
                    System.out.print(value + "|");
                }
                System.out.println();
            }
        }catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}