public class Ex11anos{
public static void main(String[]arg){
double anonasc,anoatual,idade,mes,dias,semanas;
System.out.print("Escreva o ano atual:");
anoatual = Double.parseDouble(System.console().readLine());
System.out.print("Escreva o ano de nascimento:");
anonasc = Double.parseDouble(System.console().readLine());
idade = anoatual-anonasc;
mes = idade*12;
dias = idade*365;
semanas=idade*52;
System.out.println("sua idade = "+idade);
System.out.println("seus meses = "+mes);
System.out.println("Seus dias = "+dias);
System.out.println("suas semanas = "+semanas);
}
}
