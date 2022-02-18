public class somaDez {
     public static void main(String[] args) {
          int numero, valor, somaDez;
          System.out.print("Informe um número inteiro: ");
          numero = Integer.parseInt(System.console().readLine());
          valor = 2;
          somaDez = 1;
          while(valor <= numero) {
                somaDez = somaDez * valor;
                valor = valor + 1;
          }
          System.out.printf("O somaDez de %d é %d.\n",
numero, somaDez);
     }
}
