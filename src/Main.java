import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random gerador = new Random();
        Scanner numeroUsuario = new Scanner(System.in);
        int numeroGerado = gerador.nextInt(50);
        int numeroDigitado = 0;


      while (numeroDigitado != numeroGerado){
          System.out.println("Digite um número entre 1 e 50!");
          numeroDigitado = numeroUsuario.nextInt();

          if (numeroDigitado == numeroGerado){
              System.out.println("Você acertou!");
          }else if(numeroDigitado <1 || numeroDigitado > 50){
              System.out.println("Digite um número válido");
          }else{

              System.out.println("Tente outra vez!");
          }


          }
      }



        }

