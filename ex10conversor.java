public class conversor{
public static void main(String[] arg){
double pe,jarda,milhas,pol;
System.out.print("Escreva quantos pes: ");
pe = Double.parseDouble(System.console().readLine());
pol = pe*12;
jarda = pe*3;
milhas = jarda*1760;
System.out.printf("Conversão em polegadas: %.2f\n", pol);
System.out.printf("Conversão em jarda: %.2f\n", jarda);
System.out.printf("Conversão em milhas: %.2f\n", milhas);
}
} 
