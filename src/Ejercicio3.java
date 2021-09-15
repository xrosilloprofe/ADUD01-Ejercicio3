import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio3 {

  public static void main(String[] args) {
    
    String nomFich = "C:\\Users\\xrosi\\OneDrive - Conselleria d'Educació\\2021-22 IES La Vereda\\hola.txt";
    String busca = "crea";
    int conta=0;
    int j= 0;
    int i = 0;

    try (BufferedReader fbr = new BufferedReader(new FileReader(nomFich))) {
      String linea = fbr.readLine();
      while (linea != null) {
    	  i++;
    	  conta = linea.indexOf(busca);
    	  while (conta != -1) {
      		System.out.format("[Linea %5d] [Columna %5d] [Posición %5d]", i, ++j, conta);
            System.out.println();
            conta = linea.indexOf(busca, ++conta);
    	  }
        linea = fbr.readLine();
      }
    } catch (FileNotFoundException e) {
      System.out.println("No existe fichero " + nomFich);
    } catch (IOException e) {
      System.out.println("Error de E/S: " + e.getMessage());
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}