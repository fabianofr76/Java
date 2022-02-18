public class NaFaixa{
public static void main(String[] args){
int val;
System.out.print("Digite um valor:");
val = Integer.parseInt(System.console().readLine());
if(val >= 1 && val <= 9)
System.out.print("O valor esta na Faixa permitida!!!");
else
System.out.print("O Valor esta FORA da Faixa permitida");
}
}
