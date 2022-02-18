public class novopreco {
   public static void main(String[] args){
           double produto,aumento;
           double novopreco;
System.out.print("Informe o preço do produto: ");
produto = Double.parseDouble(System.console().readLine());
aumento = produto * 10/100;
System.out.printf("O aumento e de:R$ %.2f\n", aumento);
novopreco = produto + aumento;
System.out.printf("O novo preço sera:R$ %.2f", novopreco); 
}
}
