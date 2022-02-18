public class energiaeletrica{
public static void main(String[] args){
double quilowatts,horasconsumo,salmin,valres,valdesc,calc;
System.out.print("Escreva o valor do salario minimo;");
salmin=Double.parseDouble(System.console().readLine());
System.out.print("Escreva quantas horas de consumo: ");
horasconsumo=Double.parseDouble(System.console().readLine());
quilowatts=salmin*1/15;
valres = quilowatts*horasconsumo;
calc = valres*15/100;
valdesc = valres-calc;
System.out.println("Quilo watts de energia: "+ quilowatts);
System.out.println("Valor resisdencial de energia: "+ valres);
System.out.println("Valor resisdencial de energia com desconto: "+ valdesc);
}
}
