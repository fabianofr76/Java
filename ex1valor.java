public class LendoDoisvalores {
public static void main(String[] args){
double N1,N2,VAL;
System.out.print("Digite o valor 1: ");
N1 = Double.parseDouble(System.console().readLine());
System.out.print("Digite o valor 2: ");
N2 = Double.parseDouble(System.console().readLine());
VAL = N2-N1;
if(N1 == N2)
System.out.print("O Valor e Zero");
else
System.out.print("Valor: " +VAL);
}
}
