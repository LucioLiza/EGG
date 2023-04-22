
import java.util.Scanner;

public class Main {

    public static Scanner s = new Scanner(System.in)
    public static void main(String[] args) {
      ej01();
    }
    
    public static void ej01()
    {
      int precioInicial = 0:
      int precioFinal = 0;
      System.out.println("ingrese precio");
      precioInicial = -Integer.parcseInt(s.nextLine());
      if (precioInicial >= 50000)
      {
         precioFinal = (precioInicial * 70) / 100;
      } else{
             precioFinal = (precioInicial * 80) / 100;
            }
      System.out.println("el precio con descunto es l siguiete" + precioFinal);
    }
    
}
