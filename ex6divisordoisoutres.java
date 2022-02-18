public class divisordoisoutres{
public static void main(String[] args){
int A,B,C,D,du,tri;
System.out.print("Digite um numero para A: \n");
A=Integer.parseInt(System.console().readLine());
System.out.print("Digite um numero para B: \n");
B=Integer.parseInt(System.console().readLine());
System.out.print("Digite um numero para C: \n");
C=Integer.parseInt(System.console().readLine());
System.out.print("Digite um numero para D: \n");
D=Integer.parseInt(System.console().readLine());

du = (A) % 2;
tri = (A)%3;

du = (B) % 2;
tri = (B)%3;

du = (C) % 2;
tri = (C)%3;

du = (D) % 2;
tri = (D)%3;

if(du == 0 && tri==0){
System.out.print(A+" O numero e divisor \n");
System.out.print(B+" O numero e divisor \n");
System.out.print(C+" O numero e divisor \n");
System.out.print(D+" O numero e divisor\n");
}else{
System.out.print("Um dos numeros NÃO e divisor\n");
}
}
}
