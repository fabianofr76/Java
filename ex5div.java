public class Divisor{
public static void main(String[] args){
int A,B,C,D,cal,res,tri,val;
System.out.print("Escreva o numero inteiro para A: ");
A = Integer.parseInt(System.console().readLine());

if(A==0)
System.out.print("O valor informado para A NÂO pode ser ZERO!!!\n");


System.out.print("Escreva o numero inteiro para B: ");
B = Integer.parseInt(System.console().readLine());
if(B==0)
System.out.print("O valor informado para B NÂO pode ser ZERO!!!\n");

System.out.print("Escreva o numero inteiro para C: ");
C = Integer.parseInt(System.console().readLine());
if(C==0)
System.out.print("O valor informado para C NÂO pode ser ZERO!!!\n");


System.out.print("Escreva o numero inteiro para D: ");
D = Integer.parseInt(System.console().readLine());
if(D == 0)
System.out.print("O valor informado para D NÂO pode ser ZERO!!!\n");

cal = (A)/2;
res = (A) % 2;
if(res == 0)
System.out.print(cal + "  O numero A e divisor de 2 !!!\n");
else
System.out.print(cal + "  O numero A NÂO e divisor de 2 !!!\n");

tri = (A)/3;
val = (A)%3;
if(val == 0)
System.out.print(tri + "  O numero A e divisor de 3 !!!\n");
else
System.out.print(tri + "  O numero A NÂO e divisor de 3 !!!\n");

cal = (B)/2;
res = (B) % 2;
if(res == 0)
System.out.print(cal+" O numero B e divisor de 2 !!!\n");
else
System.out.print(cal+" O numero B NÂO e divisor de 2 !!!\n");

tri = (B)/3;
val = (B)%3;
if(val == 0)
System.out.print(tri+" O numero B e divisor de 3 !!!\n");
else
System.out.print(tri+" O numero B NÂO e divisor de 3 !!!\n");


cal = (C)/2;
res = (C) % 2;
if(res == 0)
System.out.print(cal+" O numero C e divisor de 2 !!!\n");
else
System.out.print(cal+" O numero C NÂO e divisor de 2 !!!\n");

tri = (C)/3;
val = (C)%3;
if(val == 0)
System.out.print(tri+" O numero C e divisor de 3 !!!\n");
else
System.out.print(tri+" O numero C NÂO e divisor de 3 !!!\n");

cal = (D)/2;
res = (D) % 2;
if(res == 0)
System.out.print(cal+" O numero D e divisor de 2 !!!\n");
else
System.out.print(cal+" O numero D NÂO e divisor de 2 !!!\n");

tri = (D)/3;
val = (D)%3;
if(val == 0)
System.out.print(tri+" O numero D e divisor de 3 !!!\n");
else
System.out.print(tri+" O numero D NÂO e divisor de 3 !!!\n");

}
}
