import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    System.out.println("palavra chave");
    // atribuiçao palavra
    String palavra = sc.nextLine();

    char letras[] = new char[palavra.length()]; // quebrando palavra em array de char ovo = 3
    letras = palavra.toCharArray();
    // letra[0] = o
    // letra[1] = v
    // letra[2] = o
    char resultado[] = new char[palavra.length()];

    // alimentando/inicializando resultado com _________
    for (int i = 0; i < palavra.length(); i++) {
      resultado[i] = '_';
    }
    // string que pega o valor da array letras e converte em palavra pra pritna
    String palavraAtualizada = String.valueOf(resultado);
    System.out.printf("A palavra tem %d letras: %s\t\n", palavra.length(), palavraAtualizada);

    char input = ' ';

    for (int tent = 5; tent > 0; tent--) {

      System.out.printf("Voce tem %d tentativas\n", tent);
      System.out.println("Digita a letra:");
      input = sc.nextLine().charAt(0);

      if (palavra.indexOf(input) >= 0) {
        tent++;
        for (int i = 0; i < palavra.length(); i++) {
          if (input == letras[i]) {
            resultado[i] = input;
          }
        }
      }

      palavraAtualizada = String.valueOf(resultado);

      if (palavraAtualizada.equals(palavra)){
        System.out.println("Voce venceu");
        System.out.println(palavraAtualizada+"\n");
        break;
      }
      System.out.println(palavraAtualizada+"\n");
    }
  }
}
