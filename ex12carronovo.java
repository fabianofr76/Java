public class Carronovo{
public static void main (String[] args){
double precofabrica,percentuallucrodist,percentualimposto,precofinalprod;
System.out.print("Escreva o preco de fabrica:");
precofabrica = Double.parseDouble(System.console().readLine());
System.out.print("Escreva o percentual lucro do distribuidor:");
percentuallucrodist=Double.parseDouble(System.console().readLine());
System.out.print("Escreva o percentual de imposto:");
percentualimposto=Double.parseDouble(System.console().readLine());
precofinalprod = precofabrica+percentuallucrodist+percentualimposto;
System.out.printf("O lucro do distribuidor: %.2f\n", percentuallucrodist);
System.out.printf("o Percentual de imposto: %.2f\n", percentualimposto);
System.out.printf("o preço final do carro: %.2f\n", precofinalprod);
}
} 
