public class Areatri{
   public static void main(String[] args){
           double base,alt,area;
System.out.print("Escreva a base do triangulo: ");
base = Double.parseDouble(System.console().readLine());
System.out.print("Escreva a altura do triangulo: ");
alt = Double.parseDouble(System.console().readLine());
area=(base*alt)/2;
System.out.printf("A area do triangulo sera: %.2f", area); 
}
}
