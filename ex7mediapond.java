public class Mediapond{
   public static void main(String[] args){
           double N1,N2,N3,RES;
           double P1,P2,P3,MP,SP;
System.out.print("Escreva a primeira nota1: ");
N1 = Double.parseDouble(System.console().readLine());
System.out.print("Escreva a segunda nota2: ");
N2 = Double.parseDouble(System.console().readLine());
System.out.print("Escreva a terceira nota3: ");
N3 = Double.parseDouble(System.console().readLine());
System.out.print("Escreva o peso da nota1: ");
P1 = Double.parseDouble(System.console().readLine());
System.out.print("Escreva o peso da  nota2: ");
P2 = Double.parseDouble(System.console().readLine());
System.out.print("Escreva o peso da  nota3: ");
P3 = Double.parseDouble(System.console().readLine());
SP = (P1+P2+P3);
MP = (N1*P1+N2*P2+N3*P3);
RES = MP/SP;
System.out.printf("A media ponderada sera: %.1f", RES); 

}
}