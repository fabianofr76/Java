public class DetresValores{
public static void main(String[] args){
double A,B,C,D;
System.out.print("Digite o valor do lado A: ");
A = Double.parseDouble(System.console().readLine());
System.out.print("Digite o valor do lado B: ");
B = Double.parseDouble(System.console().readLine());
System.out.print("Digite o valor do lado C: ");
C = Double.parseDouble(System.console().readLine());
D = (B*B) - (4*A*C);
if(D<0)
System.out.print("A Equação não possue raizes reais !!!");
if(D>0)
System.out.print("A Equação possue duas raizes reais !!!");
if(D == 0)
System.out.print("A Equação possue uma unica raiz real !!!");
}
}
