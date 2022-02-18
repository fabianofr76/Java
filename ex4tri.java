public class Triangulo{
public static void main(String[] args){
double A,B,C;
System.out.print("Escreva o valor do lado A : ");
A = Double.parseDouble(System.console().readLine());
System.out.print("Escreva o valor do lado B : ");
B = Double.parseDouble(System.console().readLine());
System.out.print("Escreva o valor do lado C : ");
C = Double.parseDouble(System.console().readLine());

if(A==0||B==0||C==0)
System.out.print("Nem um dos valores informados pode ser ZERO!!!");

else if(A+B <= C)
System.out.print("Os valores informados NÂO pode formar um triângulo!!!");

else
System.out.print("Os valores informados formar um triângulo !!!");
}
}
