public class Porcento{

public static void main(String[] args){

double N1,N2,porcentagem;

System.out.print("Escreva o numero inteiro da porcentagem: \n");

N1=Double.parseDouble(System.console().readLine());

System.out.print("Escreva o numero porcento para o calculo:  \n");
System.out.print("%");

N2=Double.parseDouble(System.console().readLine());

porcentagem=(N1*N2/100);

System.out.println("Porcentagem:   "+porcentagem);

}
}






